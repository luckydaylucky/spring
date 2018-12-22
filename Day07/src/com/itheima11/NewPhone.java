package com.itheima11;



public class NewPhone extends Phone{
	public void newphone() {
		System.out.println("开启视屏功能");

//		System.out.println("给"+name+"打电话");
//		方法重写中子类用super关键字调用父类中的共有方法
//		为了实现子类父类中全部功能
//		所以采用方法重写
		super.phone("林青霞");
		
		
	}


}
