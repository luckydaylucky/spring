package com.itheima;

import java.util.Scanner;

/*�Ƚ�����ֵ�Ƿ����*/
public class Method01 {
	public static void main(String[] args) {
//		��������¼�����
		Scanner sc = new Scanner(System.in);
//		������ʾ
		System.out.println("�������һ�����֣�");
		int a = sc.nextInt();
		System.out.println("������ڶ������֣�");
		int b = sc.nextInt();
//		���÷���
		String flag = compare(a,b);
//		������
		System.out.println("����ֵ�����"+flag);
	}
	public static String compare(int a,int b) {
		if(a==b) {
			return "���";
		}else {
			return "�����";
		}
	}

}
