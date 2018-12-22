package com.itheima02;

public class PingTouGe {
	String name;
	private int age;
	String color;
	public void SetAge(int a) {
		if(a<0||a>200) {
			System.out.println("你输入的年龄有误");
		}else {
			age = a;
		}
		
	}
	public void fight() {
		System.out.println("生死看淡，不服就干");
	}
	public void run() {
		System.out.println("不是在打仗的路上，就是在打仗");
	}
	public void speak() {
		System.out.println("我只想干死各位，或者被各位干死");
	}

}
