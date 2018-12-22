package com.itheima02;

import java.util.HashMap;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		HashMap<String, Student> hm = new HashMap<>();
		
		Student s1 = new Student("林青霞",30);
		Student s2 = new Student("张曼玉",33);
		Student s3 = new Student("林丹",35);
		
		hm.put("德艺双馨", s1);
		hm.put("长得好看", s2);
		hm.put("高大帅气", s3);
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


