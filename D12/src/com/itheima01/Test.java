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
		
		
		Student s1 = new Student("����ʦ",30);
		Student s2 = new Student("����ʦ",33);
		Student s3 = new Student("����ʦ",35);
		
		map.put(s1, "����");
		map.put(s2,"����");
		map.put(s3,"��");
		
		Set<Student> keySet = map.keySet();
		for (Student student : keySet) {
			String str = map.get(keySet);
			System.out.println(student+"   "+str);
		}
		
		
//		map.put("������˫", s1);
//		map.put("���µ�һ", s2);
//		map.put("�������", s3);
		
		
		
		
		
		
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
		
		
		
		
		
		
		
		
		
		
		
//		map.put("�ֵ�", "��ë��");
//		map.put("����", "����");
//		map.put("�ż̿�", "ƹ����");
		
//		Set<Entry<String, String>> entrySet = map.entrySet();
//		for (Entry<String, String> entry : entrySet) {
//			System.out.println(entry.getKey()+"-----"+entry.getValue());
//		}
		
		
		
//		Set<String> keySet = map.keySet();
//		for(String s : keySet) {
//			String value = map.get(s);
//			System.out.println(s+"-------"+value);
//		}
		
		
		
		
//		String value = map.get("�ż̿�");
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
		
		
		
		
		
//		map.put("�Ա�ɽ", "�ε���");
//		map.put("����", "����");
//		map.put("����ΰ", "��ë��");
		
//		String r = map.remove("����");
//		System.out.println(r);
		
//		boolean containsKey = map.containsKey("����ΰ");
//		
//		System.out.println(containsKey);
		
		
//		boolean containsValue = map.containsValue("ë��ʦ");
//		System.out.println(containsValue);
		
//		boolean empty = map.isEmpty();
//		System.out.println(empty);
		
//		System.out.println(map);
		
		
		
		
		
//		Map<String,String> map = new HashMap<>();
//		
//		map.put("001", "����ϼ");
//		
//		map.put("002", "����");
//		
//		map.put(003", "����");
//		
//		System.out.println(map);
		
		
		
//		HashSet<Student> ha = new HashSet<>();
//		
//		Student s1 = new Student("����ϼ",30);
//		Student s4 = new Student("����ϼ",30);
//		Student s5 = new Student("����ϼ",30);
//		Student s6 = new Student("����ϼ",30);
//		Student s7 = new Student("����ϼ",30);
//		Student s9 = new Student("����ϼ",30);
//		Student s2 = new Student("������",35);
//		Student s3 = new Student("������",33);
//		Student s8 = new Student("������",33);
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
