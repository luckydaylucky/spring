package com.itheima06;

public abstract class Coach extends Person{
	
	
	public Coach() {
		super();
		
	}
	public Coach(String name, int age) {
		super(name, age);
		
	}
	public void eat() {
		System.out.println("教练吃教练餐");
	}
	public void teach() {
		System.out.println("教练教如何打球接球");
	}
	

}
