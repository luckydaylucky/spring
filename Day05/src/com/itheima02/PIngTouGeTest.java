package com.itheima02;

public class PIngTouGeTest {
	public static void main(String[] args) {
		PingTouGe p = new PingTouGe();
		
		
		
		System.out.println(p.color);
		System.out.println(p.name);
		System.out.println("--------");
		
		
		p.name = "���";
		p.SetAge(30);
		
		p.color = "��ɫ";
		
		
		System.out.println(p.color);
		System.out.println(p.name);
		
		p.speak();
		p.run();
		p.fight();
		
	}

}
