package com.itheima;

import java.util.Scanner;

import javax.swing.text.ChangedCharSetException;

/*���η� ����ֵ���� ������(�������� ������1���������� ������2��) 
	������;
	return ����ֵ;
	����ȷ����ֵ���͵Ŀ���ֱ�ӵ��ø�ֵ����
	û����ȷ����ֵ���͵ĵ�������
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
//		���������
//		boolean c = compare(20, 30);
		
//		System.out.println(c);
		
		
		
//		��������¼�����
//		Scanner sc = new Scanner(System.in);
//		System.out.println("�������һ������");
//		int a = sc.nextInt();
//		System.out.println("������ڶ�������");
//		int b = sc.nextInt();
//		int max = GetMax(a, b);
//		System.out.println(max);
//		�������
//		int sum = sum(10, 20);
//		��ٺͽ��
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
//		�������
		
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
//	���巽��
//	public static int GetMax(int a,int b) {
//		int max = 0;
//		if(a > b) {
//			return a;
//		}else {
//			return b;
//		}
//		
//	}
//	���巽��
//	public static int sum(int a,int b) {
//		������
//		int c = a + b;
//		����ֵ����
//		return c;
		
//	}

}
