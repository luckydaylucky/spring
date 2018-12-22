package com.itheima12;

public class TestDemo {
	public static void main(String[] args) {
		
//		有父类对象引用子类对象的条件叫多态
		Animals a = new Cat();
		
//		成员变量编译看左边运行看左边
		
		System.out.println(a.age);
		
//		成员方法编译看左边执行看右边
		a.eat();
		
		
	}
	
	
	

}
