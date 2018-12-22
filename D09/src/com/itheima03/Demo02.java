package com.itheima03;

import java.util.Scanner;

public class Demo02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ÇëÊäÈë×Ö·û´®");
		String s = sc.nextLine();
		
		String s1 = toString(s);
		System.out.println(s1);
		
		
		
	}
	
	public static String toString(String s) {
		String ss = "";
		
		for (int i = s.length(); i >= 0; i++) {
			ss += s.charAt(i);
			
		}
		
		return ss;
	}

}
