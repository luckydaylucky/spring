package com.itheima06;

public abstract class Player extends Person {
	

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		System.out.println("�˶�Ա�ײ�");
		
	}
	
	public void study() {
		System.out.println("�˶�ԱҪ��ϰ�������");
	}
	
	

}
