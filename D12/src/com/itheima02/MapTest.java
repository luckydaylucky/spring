package com.itheima02;

import java.util.HashMap;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		HashMap<String, Student> hm = new HashMap<>();
		
		Student s1 = new Student("����ϼ",30);
		Student s2 = new Student("������",33);
		Student s3 = new Student("�ֵ�",35);
		
		hm.put("����˫ܰ", s1);
		hm.put("���úÿ�", s2);
		hm.put("�ߴ�˧��", s3);
		Set<String> keySet = hm.keySet();
//		for (String key : keySet) {
//			Student ss = hm.get(key);
////			System.out.println(ss.getAge()+"   "+ss.getName()+"   "+key);
//			System.out.println(ss.getName()+"    "+ss.getAge()+"   "+key);
//		}
		for (String string : keySet) {
			Student st = hm.get(string);
			System.out.println(st.getName()+"    "+st.getAge()+"     "+string);
		}
		
			
		}
		
	}


