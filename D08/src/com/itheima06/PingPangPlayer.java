package com.itheima06;

public class PingPangPlayer extends Player implements SpeakEnglish {
	

	public PingPangPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PingPangPlayer(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void speak() {
		System.out.println("˵Ӣ��");
		
	}
	public void eat() {
		System.out.println("��ƹ�����˶�Ա�ײ�");
		
	}
	

}
