package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex04 {

	public static void main(String[] args) throws IOException {

		InputStream in=new FileInputStream("C:\\javaStudy\\MS949.txt");
		InputStreamReader isr=new InputStreamReader(in, "MS949"); //한국어 지원
		BufferedReader br=new BufferedReader(isr);
		
		while(true) {
			String str=br.readLine();
			if(str==null) {
				break;
			}
			
			System.out.println(str);
		}
		br.close();
	}

}
