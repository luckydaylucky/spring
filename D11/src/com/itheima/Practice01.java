package com.itheima;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Practice01 {
	public static void main(String[] args) {
		List<Student> lis = new ArrayList<Student>();
		
		
		Student stu = new Student("¡÷«‡œº",30);
		Student stu1 = new Student("¡÷µ§",33);
		Student stu2 = new Student("««µ§",36);
		
		
		lis.add(stu);
		lis.add(stu1);
		lis.add(stu2);
		
		Iterator<Student> it = lis.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s);
			
		}
		System.out.println("-----------------");
		for (int i = 0; i < lis.size(); i++) {
			Student s = lis.get(i);
			
			System.out.println(s);
		}
		
		
		
	}

}
