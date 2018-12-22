package com.itheima;

import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		DateDemo d = new DateDemo();
		
		System.out.prtln(d);
		
		long date = 1000*60*60;
		date dd = new Date(date);
		System.out.println(dd);
	}

}
