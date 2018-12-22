package com.itheima;

import javax.transaction.xa.Xid;

public class Practice01 {
	public static void main(String[] args) {
		
		int[] arr = {24,36,90,75,81};
		int max = getMax(arr);
		System.out.println("max"+max);
		
		
		
		
//		int[] arr = {11,22,33,44,55};
//		调用方法
//		printArray(arr);
		
		
		
		
		
		
//		int[] arr = {1,2,3,4,5};
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		change(arr);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		int a = 10;
//		int b = 20;
//		System.out.println("a:" + a + "b:" + b);
//		change(a,b);
//		System.out.println("a:" + a + "b:" + b);
		
		
		
		
		
//		System.out.println(compare(10L,20L));
		
		
		
		
//		int a = 10;
//		int b = 20;
//		int result = sum(a,b);
//		System.out.println("result"+result);
//		int c = 30;
//		int result2 = sum(a,b,c);
//		System.out.println("result2:"+result2);
	}
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
		
	}
//	定义方法
//	public static void printArray(int[] arr) {
//		System.out.println("[");
//		遍历数组格式
//		for (int i = 0; i < arr.length; i++) {
//			if(i == arr.length-1) {
//				System.out.println(arr[i]);
//			}else {
//				System.out.println(arr[i]+", ");
//			}
//		}
//		System.out.println("]");
//		
//	}
	
//	public static void change(int[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i] % 2 == 0) {
//				arr[i] *= 2;
//			}
//		}
//		
//	}
	
//	public static void change(int a,int b) {
//		System.out.println("a:" + a + "b:" + b);
//		a = b;
//		b = a + b;
//		System.out.println("a:" + a + "b:" + b);
//		
//	}
	
//	public static boolean compare(byte a,byte b) {
//		System.out.println("byte");
//		return a == b;
//		
//	}
//	public static boolean compare(short a, short b) {
//		System.out.println("short");
//		return a == b;
//		
//	}
//	
//	public static boolean compare(int a,int b) {
//		System.out.println("int");
//		return a == b;
//		
//	}
//	public static boolean compare(long a,long b) {
//		System.out.println("long");
//		return a == b;
//		
//	}
//	public static float sum(float a,float b) {
//		return a+b;
//		
//	}
//	public static int sum(int a,int b, int c) {
//		return a + b + c;
//		
//	}
//	public static int sum(int a,int b) {
//		return a + b;
//		
//	}
	
	

}
