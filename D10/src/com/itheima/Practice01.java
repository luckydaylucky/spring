package com.itheima;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice01 {
	public static void main(String[] args) throws ParseException {
		
		Date d = new Date();
		
		String s = DateUtill.dateToString(d, "yyyy-MM-dd HH:mm:ss");
		System.out.println(s);
		
		
//		Date d = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		System.out.println(sdf);
//		String s = sdf.format(d);
//		System.out.println(s);
//		String str = "2008-08-8 12:23:45";
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		Date d = sdf.parse(str);
//		System.out.println(d);
		
		
//		Date d = new Date();
		
//		System.out.println(d);
//		
//		long date = 1000*60*60;
//		Date dd = new Date(date);
//		System.out.println(dd);
		
//		System.out.println(d.getTime());
//		d.setTime(1000*60*60);
//		System.out.println(d.getTime());
	
		
	}

}
