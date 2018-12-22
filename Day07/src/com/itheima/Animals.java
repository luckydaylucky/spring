package com.itheima;

public class Animals {
	private String name;
	private int age;
//	创建无参构造方法
	public Animals() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//	创建setget方法
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
	
	public void eat() {
		System.out.println("动物要吃东西");
	}

	

	

}
