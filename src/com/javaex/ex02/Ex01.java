package com.javaex.ex02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class Ex01 {

	public static void main(String[] args) throws Exception {

		Writer fw=new FileWriter("C:\\javaStudy\\song.text");
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("학교종이 땡땡땡");
		bw.newLine();
		bw.write("어서 모이자");
		bw.newLine();
		bw.write("선생님이 우리를");
		bw.newLine();
		bw.write("기다리신다");
		
		bw.close();
		//fw.close(); bw 닫으면 자동 닫힘
	}

}
