package com.itheima05;

public class CatTest {
	
	public static void main(String[] args) {
		
//		ʵ��������
		Cat a = new Cat();
		
		a.setName("�ӷ�è");
		a.setAge(66);
		
		System.out.println(a.getName()+"----------"+a.getAge());
		a.eat();
		a.jumping();
		
		System.out.println("--------------");
		
		Cat a2 = new Cat("�ӷ�è",3);
		
		System.out.println(a2.getName()+"--------------"+a2.getAge());
		
		a2.eat();
		a2.jumping();
		a2.age;
		
	
	}

}
