package com.itheima12;

public class DuoTaiDemo {
	public static void main(String[] args) {
		AnimalsOperator ao = new AnimalsOperator();
		Cat c = new Cat();
		ao.useanimale(c);
		
		Dog d = new Dog();
		ao.useanimale(d);
		
		Pig p = new Pig();
		ao.useanimale(p);
		
		System.out.println("---------------");
		
		Animals a = new Dog();
		
		
		Dog d1 = (Dog)a;
		d1.eat();
		d1.lookdoor();
		
	}

}
