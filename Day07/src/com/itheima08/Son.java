package com.itheima08;

public class Son extends Father {
	public int age = 16;
//	public int height = 170;
	
	public void print() {
		int age = 10;
//		访问局部变量
		System.out.println("输出的是局部成员变量"+age);
//		访问成员变量
		System.out.println("输出的是类中成员变量"+this.age);
//		访问父类成员变量
		System.out.println("输出的是父类成员变量"+super.age);
	}

}
