package com.itheima08;

public class StaticDemo {
	public static void main(String[] args) {
		Student.graduateForm = "����ѧԺ";
		
		Student s1 = new Student();
		s1.name = "����ϼ";
		s1.age = 30;
		s1.show();
	}

}
