package com.itheima01;

public class PhoneTest {
	public static void main(String[] args) {
//		创建成员方法
		Phone p = new Phone();
//		调用成员方法
		System.out.println("价格"+p.price);
		System.out.println("品牌"+p.name);
		System.out.println("颜色"+p.color);
		System.out.println("-----------");
		
		
		p.color = "白色";
		p.name = "华为";
		p.price = 1111;
		
		
		System.out.println("价格"+p.price);
		System.out.println("品牌"+p.name);
		System.out.println("颜色"+p.color);
		System.out.println("-----------");
		
		
//		调用方法
		p.PhoneCall("本拉登");
		p.Message("奥巴马");
		
	}

}
