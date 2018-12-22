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
		System.out.println("运动员套餐");
		
	}
	
	public void study() {
		System.out.println("运动员要练习发球接球");
	}
	
	

}
