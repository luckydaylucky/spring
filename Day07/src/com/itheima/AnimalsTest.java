
package com.itheima;

public class AnimalsTest {
	public static void main(String[] args) {
//		����ʵ����
		Dog d = new Dog();
//		�������
		d.setName("����");
		d.setAge(3);
		System.out.println(d.getName()+"-------"+d.getAge());
		d.eat();
		d.lookdog();
		System.out.println("-------------");
		Cat c = new Cat();
		c.setName("����");
		c.setAge(4);
		System.out.println(c.getName()+"-----------"+c.getAge());
		c.cat();
		c.cat();
		
		
	}

}
