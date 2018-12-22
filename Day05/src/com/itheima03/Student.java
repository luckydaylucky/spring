package com.itheima03;

public class Student {
	String name;
//	创建年龄私有变量
	private int age;
	public void SetAge(int a) {
		if(a<0||a>200) {
			System.out.println("你给的年龄有误");
		}else {
			age = a;
		}
		
	}
	public int getAge() {
		return age;
	}
	public void show() {
		System.out.println(name+"****"+age);
	}

}
