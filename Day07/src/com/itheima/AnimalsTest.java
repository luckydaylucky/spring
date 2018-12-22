
package com.itheima;

public class AnimalsTest {
	public static void main(String[] args) {
//		对象实例化
		Dog d = new Dog();
//		键入参数
		d.setName("旺财");
		d.setAge(3);
		System.out.println(d.getName()+"-------"+d.getAge());
		d.eat();
		d.lookdog();
		System.out.println("-------------");
		Cat c = new Cat();
		c.setName("咪咪");
		c.setAge(4);
		System.out.println(c.getName()+"-----------"+c.getAge());
		c.cat();
		c.cat();
		
		
	}

}
