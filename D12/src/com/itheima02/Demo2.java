package com.itheima02;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Demo2 {
	public static void main(String[] args) {
		
		HashMap<String, Student> ha = new HashMap<>();
		Student s1 = new Student("林青霞",30);
		Student s2 = new Student("张曼玉",33);
		Student s3 = new Student("张学友",35);
		
		ha.put("it001", s1);
		ha.put("it002", s2);
		ha.put("it003", s3);
		
//		Set<String> keySet = ha.keySet();
//		for (String key : keySet) {
//			Student value = ha.get(key);
//			System.out.println(key+"   "+value.getName()+"  "+value.getAge());
//		}
		
		Set<Entry<String, Student>> entrySet = ha.entrySet();
		for (Entry<String, Student> entry : entrySet) {
			String s = entry.getKey();
			Student student = entry.getValue();
			System.out.println(s+"  "+student.getName()+"   "+student.getAge());
		}
		
		
		
		
//		HashSet<Student> ha = new HashSet<>();
//		Student s1 = new Student("林青霞",30);
//		Student s2 = new Student("张曼玉",33);
//		Student s3 = new Student("张学友",35);
//		
//		
//		ha.add(s1);
//		ha.add(s2);
//		ha.add(s3);
		
		
		
		
		
		
		
		
		
//		for(Student s : ha ) {
//			System.out.println(s.getName()+"----"+s.getAge());
//		}
		
		
		
//		Iterator<Student> it = ha.iterator();
//		while (it.hasNext()) {
//			Student s = it.next();
//			System.out.println(s.getName()+"--------"+s.getAge());
//			
//		}
		
		
		
		
		
		
//		Set<String> set = new HashSet<>();
//		set.add("林青霞");
//		set.add("张曼玉");
//		set.add("张学友");
//		
//		for (String s : set) {
//			System.out.println(s);
//		}
	}

}
