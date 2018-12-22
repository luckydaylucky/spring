package com.itheima;

import java.util.Scanner;

import javax.swing.text.ChangedCharSetException;

/*修饰符 返回值类型 方法名(参数类型 参数名1，参数类型 参数名2…) 
	函数体;
	return 返回值;
	有明确返回值类型的可以直接调用赋值调用
	没有明确返回值类型的单独调用
	*/

public class HomeWork {
	public static void main(String[] args) {
		
		int[] arr = {1,6,9,9,8,15};
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		change(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
//		int a = 10;
//		int b = 20;
//		System.out.println("a:" + a + "b:" + b);
//		sum(a, b);
//		System.out.println("a:" + a + "b:" + b);
		
		
		
		
		
		
//		int a = 10;
//		int b = 20;
//		int result = sum(a,b);
//		System.out.println(result);
//		int c = 30;
//		int result2 = sum(a, b,c);
		
//		print(60);
		
		
		
//		Flower();
//		定义变量；
//		boolean c = compare(20, 30);
		
//		System.out.println(c);
		
		
		
//		创建键盘录入对象
//		Scanner sc = new Scanner(System.in);
//		System.out.println("请输入第一个数据");
//		int a = sc.nextInt();
//		System.out.println("请输入第二个数据");
//		int b = sc.nextInt();
//		int max = GetMax(a, b);
//		System.out.println(max);
//		定义变量
//		int sum = sum(10, 20);
//		暑促和结果
//		System.out.println(sum);
		
	}
	public static void change(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2 == 0) {
				arr[i]*=2;
			}
			
		}
		
	}
//	public static  void sum(int a,int b) {
//		System.out.println("a:" + a + ",b:" + b);
//		a = b;
//		b = a + b;
//		System.out.println("a:" + a + ",b:" + b);
//		
//	}
	
//	public static int sum(int a,int b,int c) {
//		int d = a + b + c;
//		return d;
//		
//	}
//	public static byte sum(byte a,byte b) {
//		int c = a + b;
//		return (byte)(a+b);
//		
//	}
//	public static int sum(int a,int b) {
//		int c = a + b;
//		return c;
//		
//	}
	
//	public static void print(int n) {
//		for (int i = 0; i < n; i++) {
//			System.out.println(i);
//		}
//		
//	}
	
//	public static void Flower() {
//		定义变量
		
//		for (int i = 100; i < 1000; i++) {
//			int ge = i%10;
//			int shi = i/10%10;
//			int bai = i/100;
//			if(Math.pow(ge, 3)+Math.pow(shi, 3)+Math.pow(bai, 3)==i) {
//				System.out.println(i);
//			}
//		}
//		
//	}
//	public static void PrintHelloWorld() {
//		for (int i = 0; i < 10; i++) {
//			System.out.println("helloworld");
//		}
//		
//	}
//	public static boolean compare(int a,int b) {
//		if(a==b) {
//			return true;
//		}else {
//			return false;
//		}
//		
//	}
//	定义方法
//	public static int GetMax(int a,int b) {
//		int max = 0;
//		if(a > b) {
//			return a;
//		}else {
//			return b;
//		}
//		
//	}
//	定义方法
//	public static int sum(int a,int b) {
//		方法体
//		int c = a + b;
//		返回值类型
//		return c;
		
//	}

}
