package com.itheima;

public abstract class Student01 {
	public String name;
	public int age;
	public Student01() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student01(String name, int age) {
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
	
	public abstract void study();
	
	public abstract void score();

}
