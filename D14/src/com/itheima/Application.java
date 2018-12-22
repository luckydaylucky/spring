package com.itheima;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Application {
	public static void main(String[] args) throws IOException {
		
	BufferedReader br = new BufferedReader(new FileReader("a.txt"));
	ArrayList<String> list = new ArrayList<>();
	
	String line;
	while ((line=br.readLine())!=null) {
		list.add(line);
		
	}
	for(String s:list) {
		
	}
		
		
		
		
		
//		ArrayList<String> list = new ArrayList<>();
//		list.add("我爱从囊老师");
//		list.add("我爱武老师");
//		list.add("我爱组老师");
//		
//		
//		BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
		
		
		
		
		
//		for (String string : list) {
//			bw.write(string);
//			bw.newLine();
//			bw.flush();
//		}
//		bw.close();
		
		
		
		
		
		
//		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
//		BufferedWriter bw = new BufferedWriter(new FileWriter("aaa.txt"));
		
		
//		String s;
//		while ((s=br.readLine())!=null) {
//			bw.write(s);
//			bw.newLine();
//			bw.flush();
//			
//		}
//		bw.close();
//		br.close();
		
		
		
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
//		bw.write("aflakfjlajfie");
//		bw.newLine();
//		bw.write("我爱波老师");
//		bw.flush();
//		bw.close();
		
//		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
//		
//		String line;
//		while ((line = br.readLine())!=null) {
//			System.out.println(line);
//			
//		}
//		br.close();
	
		
		
		
//		FileReader fr = new FileReader("a.txt");
//		FileWriter fw = new FileWriter("aa.txt");
//		
//		int len;
//		char[] ch = new char[1024];
//		while ((len=)) {
//			type type = (type) en.nextElement();
//			
//		}
		
		
		
		
//		int by;
//		while ((by=fr.read())!=-1) {
//			fw.write(by);
//			
//		}
		
//		fr.close();
//		fw.close();
		
		
		
		
		
		
		
		
		
		
//		InputStreamReader isr = InputStreamReader(new FileInputStream("a.txt"));
//		
//		OutputStreamWriter osr = new OutputStreamWriter(new FileOutputStream("aa.txt"));
//		
//		int ch;
//		while ((ch = isr.read())!= -1) {
//			System.out.println((char)ch);
//			
//		}
		
		
		
//		isr.close();
//		osr.close();
		
		
		
		
		
//		InputStreamReader isr = new InputStreamReader(new FileInputStream("b.txt"),"utf-8");
//		
//		char[] ch = new char[1024];
//		
//		int len;
//		while ((len = isr.read(ch))!=-1) {
//			System.out.println(new String(ch,0,len));
//			
//		}
//		isr.close();
		
		
		
//		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("c.txt"), "utf-8");
//		
//		osw.write("苍老师".toCharArray(),0,2);
		
		
		
		
		
//		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("b.txt"), "utf-8");
//		osw.write("苍老师");
//		osw.write("李老师宋老师".toCharArray(), 0, 3);
//		
//		osw.write("林老师",0,2);
//		
//		
//		
//		osw.close();
		
		
		
		
		
//	OutputStreamWriter ops = new OutputStreamWriter(new FileOutputStream("a.txt"), "utf-8");
//	ops.write("我爱中华");
//	ops.close();
//	
//	InputStreamReader isp = new InputStreamReader(new FileInputStream("a.txt"),"utf-8");
//	int by;
//	while ((by = isp.read())!=-1) {
//		System.out.println((char)by);
//		
//	}
//	ops.close();
//	isp.close();
		
		
		
		
//		byte[] b = "苍老师".getBytes("utf-8");
//		System.out.println(Arrays.toString(b));
//		
//		
//		
//		String s = new String(b, "utf-8");
//		System.out.println(s);
		
	}

//	private static InputStreamReader InputStreamReader(FileInputStream fileInputStream) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
