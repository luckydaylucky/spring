package com.itheima10;

public class ExtendTest {
	public static void main(String[] args) {
//		java继承中访问成员方法的特点子类中有就在子类中用
//		子类中没有就在父类中用,父类中没有就报错
		Som s = new Som();
		s.method();
		s.show();
	}

}
