package com.itheima;

public class StudentTest00 {
	public static void main(String[] args) {
		Student01 s = new Student01();
		System.out.println("����"+s.name);
		System.out.println("����"+s.age);
		
		System.out.println("---------");
		s.name = "����ϼ";
		s.age = 30;
		System.out.println("����"+s.name);
		System.out.println("����"+s.age);
		s.study();
		s.eat();
	}
	
	

}
