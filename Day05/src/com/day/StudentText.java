package com.day;
// ������
public class StudentText {
	public static void main(String[] args) {
		Student s = new Student();
//		��Ա������ֵ
		s.setAge(18);
		s.setName("����");
		System.out.println(s.getAge()+ s.getName());
//	���ι��췽��	
		Student s2 = new Student(19,"lisan");
		System.out.println(s2.getAge()+"---"+s2.getName());
	}
}
