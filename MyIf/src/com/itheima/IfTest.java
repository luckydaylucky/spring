package com.itheima;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������һ������:");
		int a = sc.nextInt();
		
		System.out.println("������ڶ���������");
		int b = sc.nextInt();
		
		//�������
		int max;
		if (a>b) {
			max = a;
		}else {
			max = b;
		}
		max += 20;
		System.out.println("���ֵ�ǣ�"+max);
	}

}
