package com.itheima05;

public class CatTest {
	
	public static void main(String[] args) {
		
//		实例化对象
		Cat a = new Cat();
		
		a.setName("加菲猫");
		a.setAge(66);
		
		System.out.println(a.getName()+"----------"+a.getAge());
		a.eat();
		a.jumping();
		
		System.out.println("--------------");
		
		Cat a2 = new Cat("加菲猫",3);
		
		System.out.println(a2.getName()+"--------------"+a2.getAge());
		
		a2.eat();
		a2.jumping();
		a2.age;
		
	
	}

}
