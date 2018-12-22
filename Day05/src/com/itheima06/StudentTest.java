package com.itheima06;

import com.itheima.GetMax;

public class StudentTest {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setName("林青霞");
		stu.setAge(60);
		System.out.println(stu.getName()+"*****"+stu.getAge());
		Student stu2 = new Student("林青霞",30);
		System.out.println(stu.getName()+"*****"+stu.getAge());
	}

}
