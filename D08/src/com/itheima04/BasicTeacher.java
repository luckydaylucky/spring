package com.itheima04;

public class BasicTeacher extends Person {
	private String name;
	private int age;
	public BasicTeacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BasicTeacher(String name, int age) {
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
	@Override
	public void teach() {
		System.out.println("基础班老师讲解javase课程");
		
	}
	
	
	

}
