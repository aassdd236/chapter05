package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Ex04 {

	public static void main(String[] args) throws IOException {
		//In
		InputStream in=new FileInputStream("C:\\javaStudy\\MS949.txt");
		InputStreamReader isr=new InputStreamReader(in, "MS949"); //한국어 지원
		BufferedReader br=new BufferedReader(isr);
		
		//Out
		OutputStream out=new FileOutputStream("C:\\javaStudy\\MS949.txt");
		OutputStreamWriter osw=new OutputStreamWriter(out, "MS949");
		BufferedWriter bw=new BufferedWriter(osw);
		
		while(true) {
			String str=br.readLine();
			if(str==null) {
				break;
			}
			
			System.out.println(str);
		}
		
		bw.close();
		br.close();
	}

}
