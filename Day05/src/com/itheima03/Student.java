package com.itheima03;

public class Student {
	String name;
//	��������˽�б���
	private int age;
	public void SetAge(int a) {
		if(a<0||a>200) {
			System.out.println("�������������");
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
