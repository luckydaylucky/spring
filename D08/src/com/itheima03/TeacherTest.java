package com.itheima03;

public class TeacherTest {
	public static void main(String[] args) {
		
//		通过多态的形式实例化对象
//		接口实例化子类
		Smoke sm = new Teacher();
		
		sm.smoke();
		
		System.out.println();
	}

}
