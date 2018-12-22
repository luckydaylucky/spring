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
		System.out.println("猫吃鱼");
		
	}

	@Override
	public void jumping() {
		System.out.println("猫可以跳高了");
		
	}
	

}
