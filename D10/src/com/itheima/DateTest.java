package com.itheima;

import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		Date d = new Date();
		
		String s = DateUtil.dateToString(d, "yyyy��MM��dd�� HH:mm:ss");
		System.out.println(s);
		
		String s2 = DateUtil.dateToString(d, "yyyy��MM��dd��");
		System.out.println(s2);
	}

}
