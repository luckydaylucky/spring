package com.itheima;

import java.util.ArrayList;
import java.util.List;

public class Practice {
	public static void main(String[] args) {
		List<String> stu = new ArrayList<String>();
		
		stu.add("����ʯ");
		stu.add("�ǷǷ��Ϸ�");
		stu.add("�ͽ��ƾͼ�");
		stu.add("����������");
		
//		stu.remove("����ʯ");
		
//		stu.get(1);
		
		stu.set(1, "javaee");
		
		System.out.println(stu);
		
		
////		for (String s : stu) {
//			System.out.println(s);
//		}
	}

}
