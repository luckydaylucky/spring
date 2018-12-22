package com.itheim09;

import java.util.Scanner;

public class StudentTest {
	

	public static void main(String[] args) {
//		创建键盘录入对象
		Scanner sc = new Scanner(System.in);

		//String num, String name, String gender, double height, int age
		
		System.out.println("请输入学员编号");
		String num = sc.next();
		System.out.println("请输入学员姓名");
		String name = sc.next();
		System.out.println("请输入学员性别");
		String gender = sc.next();
		System.out.println("请输入学员身高");
		double height = sc.nextDouble();
		System.out.println("请输入学员年龄");
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
