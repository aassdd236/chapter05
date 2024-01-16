package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;

public class PhonebookApp {

	public static void main(String[] args) throws IOException {

		ArrayList pList=new ArrayList<>();
		//쓰기 빨대 쓰면 파일 다 지워짐
		Reader fr=new FileReader("C:\\javaStudy\\PhoneDB.txt");
		BufferedReader br=new BufferedReader(fr);
		
		//Out
		FileOutputStream out=new FileOutputStream("C:\\javaStudy\\PhoneDB.txt");
	//	BufferedWriter bw=new BufferedWriter(out);
		
		//파일에서 읽은 내용을 리스트로 관리
		//이름, 핸드폰, 회사 > Person
		while(true) {
			String str=br.readLine();
			
			if(str==null) {
				break;
			}
			Person p=new Person(str.split(","));
			pList.add(p);		
		}
		
		//자신의 정보 Person 리스트에 추가하고
		Person me=new Person("이예슬", "010-4526-9689", "031-8888-9999");
		pList.add(me);
		
		//리스트를 전체 내용을 PhoneDB.txt에 쓴다
	}

}
