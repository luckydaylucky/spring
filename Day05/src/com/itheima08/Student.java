package com.itheima08;

public class Student {
//	定义成员变量
	private String num;
	private String name;
	private String gender;
	private int age;
	private String subject;
//	定义空构造方法
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
//	定义构造方法
	public Student(String num, String name, String gender, int age, String subject) {
		super();
		this.num = num;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.subject = subject;
	}
//	定义成员方法
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	
}
