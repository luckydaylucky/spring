package com.day;
// 测试类
public class StudentText {
	public static void main(String[] args) {
		Student s = new Student();
//		成员变量赋值
		s.setAge(18);
		s.setName("李三");
		System.out.println(s.getAge()+ s.getName());
//	带参构造方法	
		Student s2 = new Student(19,"lisan");
		System.out.println(s2.getAge()+"---"+s2.getName());
	}
}
