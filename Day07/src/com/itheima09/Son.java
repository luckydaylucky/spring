package com.itheima09;

public class Son extends Father {
//	访问父类无参构造方法用super
//	无参构造方法是括号中不带数据
	public Son() {
		super("林青霞");
		System.out.println("son的无参构造方法");
	}
//	带参构造方法
//	只能访问父类公有带参构造方法
	public Son(String name) {
		super("林青霞");
		System.out.println("son的带参构造方法");
		
	}

}
