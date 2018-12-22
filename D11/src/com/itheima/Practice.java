package com.itheima;

import java.util.ArrayList;
import java.util.List;

public class Practice {
	public static void main(String[] args) {
		List<String> stu = new ArrayList<String>();
		
		stu.add("蒋介石");
		stu.add("是非法上访");
		stu.add("就将计就计");
		stu.add("法网法网发");
		
//		stu.remove("蒋介石");
		
//		stu.get(1);
		
		stu.set(1, "javaee");
		
		System.out.println(stu);
		
		
////		for (String s : stu) {
//			System.out.println(s);
//		}
	}

}
