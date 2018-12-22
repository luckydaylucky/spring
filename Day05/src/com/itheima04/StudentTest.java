package com.itheima04;

public class StudentTest {
	public static void main(String[] args) {
		Student s = new Student();
		
		System.out.println(s.getName()+"*****"+s.getAge());
		s.setName("¡÷«‡œº");
		s.setAge(30);
		System.out.println(s.getName()+"*****"+s.getAge());
	}

}
