package com.itheima01;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

import javax.net.ssl.SSLContext;

import java.util.Random;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
//		HashMap<String, Student> map = new HashMap<>();
		
		HashMap<Student,String> map = new HashMap<>();
		
		
		Student s1 = new Student("苍老师",30);
		Student s2 = new Student("武老师",33);
		Student s3 = new Student("林老师",35);
		
		map.put(s1, "优秀");
		map.put(s2,"良好");
		map.put(s3,"差");
		
		Set<Student> keySet = map.keySet();
		for (Student student : keySet) {
			String str = map.get(keySet);
			System.out.println(student+"   "+str);
		}
		
		
//		map.put("举世无双", s1);
//		map.put("天下第一", s2);
//		map.put("旷世奇才", s3);
		
		
		
		
		
		
//		Set<String> keySet = map.keySet();
//		for (String st : keySet) {
//			Student ss = map.get(st);
//			System.out.println(st+"   "+ss.getName()+"     "+ss.getAge());
//		}
		
//		Set<Entry<String, Student>> entrySet = map.entrySet();
//		for (Entry<String, Student> entry : entrySet) {
//			stu k = map.get(st);
//			System.out.println(st+"      "+ss);
//		}
		
		
		
		
		
		
		
		
		
		
		
//		map.put("林丹", "羽毛球");
//		map.put("刘翔", "跨栏");
//		map.put("张继科", "乒乓球");
		
//		Set<Entry<String, String>> entrySet = map.entrySet();
//		for (Entry<String, String> entry : entrySet) {
//			System.out.println(entry.getKey()+"-----"+entry.getValue());
//		}
		
		
		
//		Set<String> keySet = map.keySet();
//		for(String s : keySet) {
//			String value = map.get(s);
//			System.out.println(s+"-------"+value);
//		}
		
		
		
		
//		String value = map.get("张继科");
//		System.out.println(value);
		
//		Set<String> keySet = map.keySet();
//		for (String key : keySet) {
//			System.out.println(key);
//		}
		
		
//		Collection<String> values = map.values();
//		
//		for (String val : values) {
//			System.out.println(val);
//		}
		
		
		
		
		
//		for (int i = 0; i < map.size(); i++) {
//			Collection<String> values = map.values();
//			System.out.println(values);
//		}
		
		
		
		
		
//		HashSet<Integer> ha = new HashSet<>();
//		Random r = new Random();
//		while (ha.size()<10) {
//			int num = r.nextInt(10)+1;
//			ha.add(num);
//			
//		}
//			
//		}
//		System.out.println(ha);
		
		
		
		
		
		
		
		
//		HashMap<String, String> map = new HashMap<>();
		
		
		
		
		
//		map.put("赵本山", "宋丹丹");
//		map.put("刘翔", "跨栏");
//		map.put("李宗伟", "羽毛球");
		
//		String r = map.remove("刘翔");
//		System.out.println(r);
		
//		boolean containsKey = map.containsKey("李宗伟");
//		
//		System.out.println(containsKey);
		
		
//		boolean containsValue = map.containsValue("毛老师");
//		System.out.println(containsValue);
		
//		boolean empty = map.isEmpty();
//		System.out.println(empty);
		
//		System.out.println(map);
		
		
		
		
		
//		Map<String,String> map = new HashMap<>();
//		
//		map.put("001", "林青霞");
//		
//		map.put("002", "故事");
//		
//		map.put(003", "北极");
//		
//		System.out.println(map);
		
		
		
//		HashSet<Student> ha = new HashSet<>();
//		
//		Student s1 = new Student("林青霞",30);
//		Student s4 = new Student("林青霞",30);
//		Student s5 = new Student("林青霞",30);
//		Student s6 = new Student("林青霞",30);
//		Student s7 = new Student("林青霞",30);
//		Student s9 = new Student("林青霞",30);
//		Student s2 = new Student("张曼玉",35);
//		Student s3 = new Student("王祖贤",33);
//		Student s8 = new Student("王祖贤",33);
//		
//		
//		ha.add(s1);
//		ha.add(s2);
//		ha.add(s3);
//		ha.add(s4);
//		ha.add(s5);
//		ha.add(s6);
//		ha.add(s7);
//		ha.add(s8);
//		ha.add(s9);
//		
//		
//		for (Student ss : ha) {
//			System.out.println(ss.getName()+"------"+ss.getAge());
//		}
		
		
	}

}
