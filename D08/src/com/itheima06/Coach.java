package com.itheima06;

public abstract class Coach extends Person{
	
	
	public Coach() {
		super();
		
	}
	public Coach(String name, int age) {
		super(name, age);
		
	}
	public void eat() {
		System.out.println("�����Խ�����");
	}
	public void teach() {
		System.out.println("��������δ������");
	}
	

}
