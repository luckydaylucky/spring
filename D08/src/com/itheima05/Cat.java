package com.itheima05;

public class Cat extends Animal implements Jumpping {

	public Cat() {
		super();
		
	}
	
	public Cat(String name, int age) {
		super(name, age);
		
	}

	@Override
	public void eat() {
		System.out.println("è����");
		
	}

	@Override
	public void jumping() {
		System.out.println("è����������");
		
	}
	

}
