package com.itheim09;

import java.util.Scanner;

public class StudentTest {
	

	public static void main(String[] args) {
//		��������¼�����
		Scanner sc = new Scanner(System.in);

		//String num, String name, String gender, double height, int age
		
		System.out.println("������ѧԱ���");
		String num = sc.next();
		System.out.println("������ѧԱ����");
		String name = sc.next();
		System.out.println("������ѧԱ�Ա�");
		String gender = sc.next();
		System.out.println("������ѧԱ���");
		double height = sc.nextDouble();
		System.out.println("������ѧԱ����");
		int age = sc.nextInt();
		Student st = new Student(num,name,gender, height, age);
//		st.setNum("num");
//		st.setName("b");
//		st.setGender("c");
//		st.setHeight(height);
//		st.setName("e");
		System.out.println(st.getNum()+"   "+st.getName()+"   "+st.getGender()+"   "+st.getHeight()+"   "+st.getAge());
	}
	

}
