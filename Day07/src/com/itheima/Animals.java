package com.itheima;

public class Animals {
	private String name;
	private int age;
//	�����޲ι��췽��
	public Animals() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//	����setget����
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
		System.out.println("����Ҫ�Զ���");
	}

	

	

}
