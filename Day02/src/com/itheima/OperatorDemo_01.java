package com.itheima;
/*
 * 需求：做自增自减运算
 * 
 */
public class OperatorDemo_01 {
	public static void main(String[] args) {
//定义一个变量
		int a = 10;
//		做自增运算
		int b = ++a;
//		输出结果
		System.out.println("b:"+b);
		
//		定义一个变量做自增运算
		int c = 10;
		int d = c++;
//		输出结果
		System.out.println("d:"+d);
		
//		定义变量做自减运算
		int f = 10;
//		int g = --f;
		int g = f--;
//		输出结果
		System.out.println("g:"+g);
	}

}
