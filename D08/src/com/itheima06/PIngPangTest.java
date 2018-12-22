package com.itheima06;

public class PIngPangTest {
	public static void main(String[] args) {
		PingPangPlayer ppp = new PingPangPlayer();
		
		ppp.setName("王皓");
		ppp.setAge(36);
		System.out.println(ppp.getName()+"---------"+ppp.getAge());
		ppp.eat();
		ppp.speak();
		ppp.study();
		
		System.out.println("----------------------------");
		
//		多态编译看左边运行看左边
		Person p = new PingPangPlayer();
		
		p.setName("六号");
		p.setAge(36);
		System.out.println(p.getName()+"---------"+p.getAge());
		p.eat();
		
		
		System.out.println("--------------------");
		
		
		
		
		
		
	}

}
