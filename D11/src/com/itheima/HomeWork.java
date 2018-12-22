package com.itheima;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class HomeWork {
	public static void main(String[] args) {
		List<Student> lis = new ArrayList<Student>();
		
		
		Student s = new Student("林青霞",30);
		Student s1 = new Student("林丹",33);
		Student s2 = new Student("拉拉",36);
		
		
		lis.add(s);
		lis.add(s1);
		lis.add(s2);
		
//		ListIterator<Student> it = lis.listIterator();
	
//			while (it.hasNext()) {
//				Student stu = it.next();
//				System.out.println(stu);

		
//		for (int i = 0; i < lis.size(); i++) {
//			Student sss = lis.get(i);
//			System.out.println(sss.getName()+"    "+sss.getAge());
//			
//		}
		
		for (Student student : lis) {
			System.out.println(student);
		}
		
		
			
		}
		
		
		
	}


