package com.itheima;



public class Practice03 {
	public static void main(String[] args) {
		
//		��������
		int[] arr = {11,22,16,66,92};
//		�������ֵ�ķ���
		int max = getMax(arr);
//		������
		System.out.println("max"+max);
		
		
		
//		��������
//		int[] arr = {1,2,3,4,5};
//		���÷���
//		print(arr);
		
//		System.out.println(compare ((byte)(byte)10, (byte)20));

//		print(10);
//		int[] arr = {1,2,3,4,5,6};
//		int sum = sum(1.1F, arr);
//		System.out.println(sum);
	}
//	������ֵ����
	public static int getMax(int[] arr) {
//		��������wu
		int max = arr[0];
//		��������
		for (int i = 1; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			
		}
		return max;
	}
//	��������
//	public static void print(int[] arr) {
//		System.out.println("[");
//		��������д��
//		for (int i = 0; i < arr.length; i++) {
//			
//			if(i == arr.length-1) {
//				System.out.println(arr[i]);
//			}else {
//				System.out.println(arr[i]+", ");
//			}
//		}
//		System.out.println("]");
//	}
//	��������
//	public static boolean compare(int a,int b) {
//		System.out.println("int");
//		return a == b;
//		
//	}
//	public static boolean compare(byte a,byte b) {
//		System.out.println("byte");
//		return a == b;
//		
//	}
//	public static boolean compare(short a,short b) {
//		System.out.println("short");
//		return a == b;
//		
//	}
//	��������
//	public static int sum(float a,int...arr) {
//		int sum = 0;
//		for (int i = 0; i < arr.length; i++) {
//			sum += i;
//		}
//		return sum;
//	}
//	public static void print(int i) {
//		for (int j = 0; j < 10; j++) {
//			System.out.println(j);
//		}
//		
//	}

}
