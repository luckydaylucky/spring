package com.itheima04;

public class WorkTeacher extends Person {
	public String name;
	public int age;
	public WorkTeacher() {
		super();
		
	}
	public WorkTeacher(String name, int age) {
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
		System.out.println("就业班老师讲解javaee课程");
	
	}
	
	
	

}
