package com.itheima;

import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		Date d = new Date();
		
		String s = DateUtil.dateToString(d, "yyyy年MM月dd日 HH:mm:ss");
		System.out.println(s);
		
		String s2 = DateUtil.dateToString(d, "yyyy年MM月dd日");
		System.out.println(s2);
	}

}
