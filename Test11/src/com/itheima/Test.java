package com.itheima;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		Collection<Student> c = new ArrayList<>();
		
		Student st1 = new Student("ÁÖÇàÏ¼",30);
		Student st2 = new Student("ÕÅÂüÓñ",33);
		
		c.add(st1);
		c.add(st2);
		
		Iterator<Student> it = c.iterator();
		while (it.hasNext()) {
			Student stu = it.next();
			System.out.println(stu.getName()+"    "+stu.getAge());
			
		}
	}

}
