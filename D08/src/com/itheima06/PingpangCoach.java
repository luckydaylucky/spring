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
		System.out.println("����˵Ӣ��");
		
	}
	public void teach() {
		System.out.println("�����̽ӷ���");
	}
	
	

}
