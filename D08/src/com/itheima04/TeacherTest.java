package com.itheima04;

public class TeacherTest {
	public static void main(String[] args) {
		BasicTeacher bt = new BasicTeacher();
		
		bt.setName("����");
		bt.setAge(30);
		System.out.println(bt.getName());
		System.out.println(bt.getAge());
		bt.teach();
		
		System.out.println("--------------");
//		��̬��������
		Person p = new BasicTeacher();
		
		p.setName("����");
		p.setAge(60);
		System.out.println(p.getName());
		System.out.println(p.getAge());
		p.teach();
	}

}
