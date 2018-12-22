package com.itheima04;

public class StudentTest extends Student {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("¡÷«‡œº");
		s.setAge(30);
		System.out.println(s.getName()+"--------"+s.getAge());
		s.study();
		System.out.println("----------------");
		Student ss = new Student();
		System.out.println(s.getName()+"---------"+s.getAge());
		s.study();
		
	}

}
