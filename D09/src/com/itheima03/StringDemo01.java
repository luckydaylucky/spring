package com.itheima03;

public class StringDemo01 {
	public static void main(String[] args) {
//		创建带参构造
		String s = new String("hello");
		
		System.out.println(s);
		
		
		
		char[] ch = {'h','e','l','l','o'};
		String s1 = new String(ch);
		
		System.out.println(s1);
		
		String s2 = new String(ch, 0, 3);
		System.out.println(s2);
		
	}

}
