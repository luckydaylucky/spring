package com.itheima;

public class StudentTest00 {
	public static void main(String[] args) {
		Student01 s = new Student01();
		System.out.println("姓名"+s.name);
		System.out.println("年龄"+s.age);
		
		System.out.println("---------");
		s.name = "林青霞";
		s.age = 30;
		System.out.println("姓名"+s.name);
		System.out.println("年龄"+s.age);
		s.study();
		s.eat();
	}
	
	

}
