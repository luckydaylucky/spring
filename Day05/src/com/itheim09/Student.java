package com.itheim09;

public class Student {
	String num;
	String name;
	String gender;
	double height;
	int age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String num, String name, String gender, double height, int age) {
		super();
		this.num = num;
		this.name = name;
		this.gender = gender;
		this.height = height;
		this.age = age;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
