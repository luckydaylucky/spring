package com.itheima;

import java.util.Scanner;

/*
 * ����������Ӽ�����ϰ
 */

public class practice {
	public static void main(String[] args) {

//		// ������������
//		int a = 'a';
//		int b = 'A';
//		int d = '0';
//
//		// ������
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(d);
//
//		// ������ȡ������
//		int c = 8 / 4;
//
//		// ������
//		System.out.println(c);
//
//		int e = 5 % 4;
//		// ���ȡ����
//		System.out.println(e);
//		// ���˷�����
//		int h = 5 * 4;
//		// ������
//		System.out.println(h);
//
//		int f = 5 + 4;
//		System.out.println(f);
//
//		int g = 5 - 4;
//		System.out.println(g);
//
//		// ��������¼�����
//		Scanner sc = new Scanner(System.in);
//		// �������һ������
//		System.out.println("����������");
//		// �������
//		int weekday = sc.nextInt();
//		switch (weekday) {
//		case 1:
//			System.out.println("����һ");
//			break;
//		case 2:
//			System.out.println("���ڶ�");
//			break;
//		case 3:
//			System.out.println("������");
//			break;
//		case 4:
//			System.out.println("������");
//			break;
//		case 5:
//			System.out.println("������");
//			break;
//		case 6:
//			System.out.println("������");
//			break;
//		case 7:
//			System.out.println("������");
//			
//			System.out.println("���������ڣ�" + weekday);
//			break;
//
//		}
		/*����¼���������ݣ�ʹ��if�ж�����ֵ�е����ֵ*/
//		��������¼�����
//		Scanner sc = new Scanner(System.in);
////		������ʾ
//		System.out.println("�������һ��ֵ");
//		int a = sc.nextInt();
////		������ڶ���ֵ
//		System.out.println("������ڶ���ֵ");
//		int b = sc.nextInt();
////		�����������ֵ
//		System.out.println("�����������ֵ");
//		int c = sc.nextInt();
////		����if�ж�
//		int max = 0;
//		if (a>b&&a>c) {
//			System.out.println("max:"+max);
//		}else if(b>a&&b>c){
//			System.out.println("max:"+max);
//		}else if(c>a&&c>b){
//			System.out.println("max:"+max);
//		}
		Scanner sc = new Scanner(System.in);
		System.out.println("������ɼ�");
		int score = sc.nextInt();
		if(score>100||score<0) {
			System.out.println("����������ݲ��ڷ�����");
		}else if (score>75&&score<=100) {
			System.out.println("����");
		}else if (score>60&&score<=75) {
			System.out.println("����");
		}else if (score>0&&score<=60) {
			System.out.println("����");
		}
		else {
			System.out.println("����");
		}

	}

}
