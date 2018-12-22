package com.itheima06;

public class ExtendTest extends Student {
	public static void main(String[] args) {
//		java中继承只支持单继承,但可以多层继承
		Student st = new Student();
		
		
		st.setName("林青霞");
		st.setAge(30);
		System.out.println(st.getName()+"------------"+st.getAge());
		st.study();
		
	}

}
