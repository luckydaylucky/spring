package com.itheima03;

public class StringTest {
	public static void main(String[] args) {
//		�������
		StringDemo sd =  new StringDemo();
		
//		�������
		sd.setName("����ϼ");
		sd.setAge(19);
		
		
		StringDemo sd1 = new StringDemo();
		
		sd.setName("С��");
		sd.setAge(36);
		
		
//		
		System.out.println(sd.equals(sd1));
		
	}

	

}
