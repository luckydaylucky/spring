package com.itheima;

import java.util.Scanner;

public class GetMax {
	public static void main(String[] args) {
//��������¼�����
		Scanner sc = new Scanner(System.in);
//		������ʾ
		System.out.println("�������һ�����֣�");
		int a = sc.nextInt();
		System.out.println("������ڶ������֣�");
		int b = sc.nextInt();
		
//		���÷���
		int max = GetMax(a,b);
//		������
		System.out.println("���ֵ��"+max);
	}
//	��������
	public static int GetMax(int a,int b) {
//		����if�ṹ����ֵ�ж�
		if(a>b) {
			return a;
		}else {
			return b;
		}
		
	}

}
