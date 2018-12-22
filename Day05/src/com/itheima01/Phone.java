package com.itheima01;

public class Phone {
	String name;
	int price;
	String color;
	public void PhoneCall(String name) {
		System.out.println("给"+name+"打电话");
		
	}
	public void Message(String name) {
		System.out.println("给"+name+"发短信");
	}

}
