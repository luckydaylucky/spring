package com.itheima;

import java.awt.print.Printable;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Practice02 {
	public static void main(String[] args) {
		
//		PrintFlower();
		
//		获取最值问题
//		Scanner sc = new Scanner(System.in);
//		System.out.println("请输入第一个数字");
//		int a = sc.nextInt();
//		System.out.println("请输入人第二个数字");
//		int b = sc.nextInt();
//		System.out.println("请输入第三个数字");
//		int c = sc.nextInt();
//		
//			int max = GetMax(a,b,c);
//			System.out.println("max:"+max);
		
//		创建键盘录入对象
		Scanner sc  = new Scanner(System.in);
		System.out.println("请输入一个数字");
		int a = sc.nextInt();
		System.out.println("请输入一个数字");
		int b = sc.nextInt();
		boolean rsult = compare(a, b);
		
		System.out.println(rsult);
		
		
//		赋值调用
//		输出调用
//		int d = sum(10,20);
//		System.out.println(d);
		
	}
	public static boolean compare(int a,int b) {
		if( a == b) {
			return true;
		}else {
			return false;
		}
		
	}
//	public static void  PrintFlower() {
//		for (int i = 100; i < 1000; i++) {
//			int ge = i%10;
//			int shi = i/10%10;
//			int bai = i/100;
//			
//			if(Math.pow(ge, 3)+Math.pow(shi, 3)+Math.pow(bai, 3) == i) {
//				System.out.println(i);
//			}
//			
//		}
		
//	}
//	 public static void helloworld() {
//		 for (int i = 0; i < 10; i++) {
//			System.out.println("HelloWorld");
//		}
//		
//	}
//	public static int sum(int a,int b) {
//		int c = a + b;
//		return c;
//		
//	}

//	public static int GetMax(int a, int b,int c) {
//		利用三元运算符获取最大值
//		return (a>b)?a:b;
		
//		int max = c;
		// TODO Auto-generated method stub
		
//			if(max < a) {
//				return max = a;
//			}else if(max < b){
//				return max = b;
//			}
//			return max;
		
		
		
//	}

}
