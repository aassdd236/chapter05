package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;

public class PhonebookApp {

	public static void main(String[] args) throws IOException {

		ArrayList<Person> pList=new ArrayList<>();
		//쓰기 빨대 쓰면 파일 다 지워짐
		Reader fr=new FileReader("C:\\javaStudy\\PhoneDB.txt");
		BufferedReader br=new BufferedReader(fr);

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

		//System.out.println(pList.toString());

		//리스트를 전체 내용을 PhoneDB.txt에 쓴다		
		Writer fw=new FileWriter("C:\\javaStudy\\PhoneDB.txt");
		BufferedWriter bw=new BufferedWriter(fw);

		for (int i=0; i<pList.size(); i++) {
			bw.write("이름: "+pList.get(i).getName());
			bw.newLine();
			bw.write("전화번호: "+pList.get(i).getHp());
			bw.newLine();
			bw.write("회사: "+pList.get(i).getCompany());
			bw.newLine();
			bw.write(" ");
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
}