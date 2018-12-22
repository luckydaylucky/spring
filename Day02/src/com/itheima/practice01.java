package com.itheima;

import org.omg.CORBA.FloatSeqHelper;

/*
 * 常用的运算符：
 * 		算术运算符
 * 		自增自减运算符
 * 		赋值运算符
 * 		关系运算符
 * 		逻辑运算符
 * 		三元运算符
 * 
 * 算术运算符：
 * 		+,-,*,/,%
 * 
 * 		/和%的区别
 * 			/：获取两个数据相除的商
 * 			%：获取两个数据相除的余数
 * 
 * 注意：
 * 		整数相除只能得到整数。要想得到小数，就必须有浮点数参与运算。
 */

public class practice01 {
	public static void main(String[] args) {
//		int a = 10;
//		int b = 20;
//		System.out.println(a+b);
//		System.out.println(a-b);
//		System.out.println(a*b);
//		System.out.println(a/b);
//		System.out.println(a%b);
		/*‘a’	97
		‘A’	65
		‘0’	48*/
		
//		int a = 'a';
//		int b = 'A';
//		int c = '0';
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		int d = 'A'+12;
//		System.out.println(d);
		
		/*++,--运算符：对变量做加1或者减1的操作。*/
//		定义两个变量
//		int a = 10;
//		int b = 11;
//		int d = a+b;
//		int c = a++;
//		输出结果
		
//		System.out.println(d);
//		System.out.println(c);
		
		/*基本的赋值运算符：=
				扩展的赋值运算符：+=,-=,*=,/=,%=*/
		/*关系运算符包含以下内容:
			==,!=,>,>=,<,<=
			关系运算符的结果都是boolean型，也就是要么是true，要么是false。*/
//		int a = 10;
//		int b = 20;
//		if (a!=b) {
//			System.out.println("helloWorld");
//		}
		/*A:逻辑运算符有哪些
		&&,|| ！
	B:结论：
	 	&&:有false则false。
	 	||:有true则true。
		!:非false则true，非true则false。
		特点：偶数个不改变本身。*/
//		int a = 10;
//		int b = 20;
//		int c = 30;
//		if (a>b&&a>c) {
//			System.out.println("helloworld");
//		}else if (a<c&&a<b) {
//			System.out.println("hello");
//		}
//		
//		System.out.println(a>b||a>c);
//		System.out.println(b>a||b>c);
//		System.out.println(c>a||c>b);
//		System.out.println(b>a);
//		System.out.println(!(b>a));
//		System.out.println(!!(b>a));
		/*(关系表达式)?表达式1：表达式2；*/
		
//		三元运算符的练习
		
//		定义两个变量
//		关系表达式?表达式1:表达式2;
		int a = 10;
		int b = 20;
//		int c = a<b?a:b;
		boolean c = a==b?true:false;
		System.out.println(c);
		


		


	}

}
