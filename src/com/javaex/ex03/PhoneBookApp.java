package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class PhoneBookApp {

	public static void main(String[] args) throws IOException {
		
		//Reader 준비
			//리더 + 버퍼 -> 빨대 PhoneDB.txt UTF-8
		Reader fr=new FileReader("C:\\javaStudy\\PhoneDB.txt");
		BufferedReader br=new BufferedReader(fr);

		//반복
		while(true) {
			//파일을 1줄 읽는다
			String str=br.readLine();

			//null이면 반복문 나감(글자가 없다면)
			if(str==null) {
				break;
			}
			
			//,로 분리한다
			String[] personInfo=str.split(",");
			String name=personInfo[0];
			String hp=personInfo[1];
			String company=personInfo[2];
	
			//출력한다
			System.out.println("이름: "+name);
			System.out.println("핸드폰: "+hp);
			System.out.println("회사: "+company);
			System.out.println();
		}
		
		//null이면 반복 종료
		
		//종료
	}

}
