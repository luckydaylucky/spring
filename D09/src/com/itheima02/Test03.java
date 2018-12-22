package com.itheima02;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÒ»¸ö×Ö·û´®");
		String s = sc.nextLine();
		String result = myReverse(s);
		System.out.println(result);
		
	}
	public static String myReverse(String s) {
		return new StringBuilder(s).reverse().toString();
	}

}
