package com.itheima04;

public class TeacherTest {
	public static void main(String[] args) {
		BasicTeacher bt = new BasicTeacher();
		
		bt.setName("马云");
		bt.setAge(30);
		System.out.println(bt.getName());
		System.out.println(bt.getAge());
		bt.teach();
		
		System.out.println("--------------");
//		多态方法解释
		Person p = new BasicTeacher();
		
		p.setName("马云");
		p.setAge(60);
		System.out.println(p.getName());
		System.out.println(p.getAge());
		p.teach();
	}

}
