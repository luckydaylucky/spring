package com.itheima;
/*
 * �����������Լ�����
 * 
 */
public class OperatorDemo_01 {
	public static void main(String[] args) {
//����һ������
		int a = 10;
//		����������
		int b = ++a;
//		������
		System.out.println("b:"+b);
		
//		����һ����������������
		int c = 10;
		int d = c++;
//		������
		System.out.println("d:"+d);
		
//		����������Լ�����
		int f = 10;
//		int g = --f;
		int g = f--;
//		������
		System.out.println("g:"+g);
	}

}
