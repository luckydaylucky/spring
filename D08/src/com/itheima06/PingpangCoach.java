package com.itheima06;

public class PingpangCoach extends Coach implements SpeakEnglish {
	

	public PingpangCoach() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PingpangCoach(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void speak() {
		System.out.println("教练说英语");
		
	}
	public void teach() {
		System.out.println("教练教接发球");
	}
	
	

}
