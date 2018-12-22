package com.itheima;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//Don't forget, a person's greatest emotional need is to feel appreciated.
//莫忘记，人类情感上最大的需要是感恩。


public class Demo {
	public static void main(String[] args) {
//		List<sss> tea = new ArrayList<sss>();
		
		
		
		
		
		
		
		Collection<Student> col = new ArrayList<Student>();
		
//		List<String> l = new ArrayList<String>();
//		
//		l.add("奖励基金哦");
//		l.add("沙发沙发");
//		l.add("洛杉矶覅是否");
//		
//		for (int i = 0; i < l.size(); i++) {
//			l.get(0);
//			System.out.println(l);
//		}
		
		
		
		
//		l.add(1,"洛杉矶");
//		String remove = l.remove(1);
		
//		String string = l.get(2);
//		
//		System.out.println(string);
		
		
		
		
		
//		Iterator<String> it = l.iterator();
//		
//		while (it.hasNext()) {
//			String s = it.next();
//			System.out.println(s);
//			
//		}
		
		
		Student s3 = new Student("哈登",30);
		Student s1 = new Student("约基奇",32);
		Student s2 = new Student("汤普森",30);
		
		
		col.add(s3);
		col.add(s1);
		col.add(s2);
		
		for (Student sss : col) {
			System.out.println(sss);
		}
//		
//		Iterator<Student> it = col.iterator();
//		
//		while (it.hasNext()) {
//			
//			Student s = it.next();
//			
//			System.out.println(s);
//			
//			
//			
//		}
		
		
		
		
		
		
		
		
		
//		Iterator<String> it = col.iterator();
//		System.out.println(it);
//		while (it.hasNext()) {
//			String s = it.next();
//			System.out.println(s);
			
//		}
		
		
//		col.remove("都好");
		
//		col.clear();
//		boolean contains = col.contains("lll");
//		boolean empty = col.isEmpty();
//		
//		int size = col.size();
//		
//		System.out.println(col);
//		
//		System.out.println(size);
	}

}
