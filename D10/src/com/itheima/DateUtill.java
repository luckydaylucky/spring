package com.itheima;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtill {
	

	private DateUtill() {}
	
	public static String dateToString(Date date,String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String s = sdf.format(date);
		return s;
	}
	
	public static Date stringToDate(String s,String format) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date d = sdf.parse(s);
		return d;
	}

}
