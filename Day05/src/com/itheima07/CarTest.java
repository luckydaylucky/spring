package com.itheima07;

public class CarTest {
	public static void main(String[] args) {
		Car c = new Car();
		c.setName("jjjjj");
		c.setColor("�����");
		c.setPrice(99999999);
		System.out.println("name"+c.getName());
		System.out.println("color"+c.getColor());
		System.out.println("price"+c.getPrice());
		
		System.out.println("-----------------");
//		�������ι��췽��
		Car c2 = new Car("���ƽ�",999999,"jjjjjj");
		System.out.println("name"+c.getName());
		System.out.println("color"+c.getColor());
		System.out.println("price"+c.getPrice());
	}

}
