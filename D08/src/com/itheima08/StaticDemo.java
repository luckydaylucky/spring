package com.itheima08;

public class StaticDemo {
	public static void main(String[] args) {
		Student.graduateForm = "传智学院";
		
		Student s1 = new Student();
		s1.name = "林青霞";
		s1.age = 30;
		s1.show();
	}

}
