package com.itheima10;

public abstract class Animal {
	public String color;
	public int age;
	
	
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Animal(String color, int age) {
		super();
		this.color = color;
		this.age = age;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	public abstract void eat();
	

}
