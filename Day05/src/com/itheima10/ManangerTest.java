package com.itheima10;

public class ManangerTest {
	public static void main(String[] args) {
//		String name, float id, double salary, double bonus
		Manager m = new Manager("±¾À­µÇ",001, 255444, 84456);
		System.out.println(m.getBonus()+m.getId()+m.getName()+m.getSalary());
		
	}

}
