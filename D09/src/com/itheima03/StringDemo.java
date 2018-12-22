package com.itheima03;

public class StringDemo {
	private String name;
	private int age;
//	创建无参构造
	public StringDemo() {
		super();
		// TODO Auto-generated constructor stub
	}
//	创建带参构造
public StringDemo(String name, int age) {
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
public String toString() {
	return "StringDemo [name=" + name + ", age=" + age + "]";
}

	
	

}
