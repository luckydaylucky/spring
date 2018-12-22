package com.itheima03;

public class StringTest {
	public static void main(String[] args) {
//		定义变量
		StringDemo sd =  new StringDemo();
		
//		定义变量
		sd.setName("林青霞");
		sd.setAge(19);
		
		
		StringDemo sd1 = new StringDemo();
		
		sd.setName("小花");
		sd.setAge(36);
		
		
//		
		System.out.println(sd.equals(sd1));
		
	}

	

}
