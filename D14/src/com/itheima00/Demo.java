package com.itheima00;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		ArrayList<Student> list = new ArrayList<>();
		
		String line;
		while ((line=br.readLine())!=null) {
			String[] split = line.split(",");
			Student stu = new Student();
			stu.setName(split[0]);
			stu.setAge(Integer.parseInt(split[1]));
			stu.setSubject(split[2]);
			list.add(stu);
			
		}
		br.close();
		for (Student student : list) {
			System.out.println(student.getName()+"  "+student.getAge()+"  "+student.getSubject());
			
		}
		
		
		
//		ArrayList<Student> list = new ArrayList<>();
//
//		Student s1 = new Student("苍老师", 30, "php");
//		Student s2 = new Student("林老师", 33, "java");
//		Student s3 = new Student("李老师", 31, "html");
//		Student s4 = new Student("草老师", 36, ".net");
//
//		list.add(s1);
//		list.add(s2);
//		list.add(s3);
//		list.add(s4);
//
//		BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
//
//		for (Student s : list) {
//			StringBuilder sb = new StringBuilder();
//			sb.append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getSubject());
//			bw.write(sb.toString());
//
//			bw.close();
//		}
	}
}
