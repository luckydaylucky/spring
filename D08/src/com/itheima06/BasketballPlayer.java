package com.itheima06;

public class BasketballPlayer extends Player {
	

	public BasketballPlayer() {
		super();
		
	}

	public BasketballPlayer(String name, int age) {
		super(name, age);
		
	}

	@Override
	public void eat() {
		System.out.println("�������˶�Ա�ײ�");
	}

	@Override
	public void study() {
		System.out.println("��ϰͶ��");
	}
	
	

}
