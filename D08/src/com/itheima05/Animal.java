package com.itheima05;

public abstract class Animal {
	
//	抽象类
	
//	定义常量
	private String name;
	private int age;
	
	
	
	
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	




	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public int getAge() {
		return age;
	}





	public void setAge(int age) {
		this.age = age;
	}





	public abstract void eat();
}
