package com.itheima06;

public class PIngPangTest {
	public static void main(String[] args) {
		PingPangPlayer ppp = new PingPangPlayer();
		
		ppp.setName("���");
		ppp.setAge(36);
		System.out.println(ppp.getName()+"---------"+ppp.getAge());
		ppp.eat();
		ppp.speak();
		ppp.study();
		
		System.out.println("----------------------------");
		
//		��̬���뿴������п����
		Person p = new PingPangPlayer();
		
		p.setName("����");
		p.setAge(36);
		System.out.println(p.getName()+"---------"+p.getAge());
		p.eat();
		
		
		System.out.println("--------------------");
		
		
		
		
		
		
	}

}
