package com.itheima;

import java.util.Scanner;

/*����¼��һ��int���͵�����,ʹ����Ԫ������ж����������������ż��*/
public class HomeWork {
	public static void main(String[] args) {
		// ��������¼�����
//		Scanner sc = new Scanner(System.in);
		// ������ʾ
//		System.out.println("������һ������:");
//		int c = sc.nextInt();
//		String x = c % 2 == 0 ? "ż��" : "����";
//		System.out.println("x"+x);
		/*����¼��һ��ѧ���ɼ�(int����),
		����ɼ����ڵ���60���������,
		����ɼ�С��60�����������*/
//		��������¼�����
//		Scanner sc = new Scanner(System.in);
//		������ʾ
//		System.out.println("������ɼ�");
//		int score = sc.nextInt();
//		int score 
//		����¼��һ�������εĳ��Ϳ�(���Ϳ�Ϊint����),
//		���㳤���ε�������ܳ�
//		��������¼�����
//		Scanner sc = new Scanner(System.in);
//		������ʾ
//		System.out.println("�����볤");
//		int a = sc.nextInt();
//		System.out.println("�������");
//		int b = sc.nextInt();
//		int sum = (a+b)*2;
//		System.out.println("�����ε��ܳ�Ϊ��"+sum);
//		int sum1 = a*b;
//		System.out.println("�����ε������:"+sum1);
		
//		����int���͵ı���a,����int���͵ı���b,
//		ʹ����Ԫ������ж����a����b����a��b�ĺ�,
//		���򷵻�a��b�ĳ˻�,��ӡ���
//		int a = 20;
//		int b = 10;
//		int result = a>b?(a+b):(a*b);
//		System.out.println("result"+result);
		
//		����¼��ѧ�����Գɼ����ж�ѧ���ȼ�:
//			90-100	����
//			80-90	��
//			70-80	��
//			60-70	����
//						60����	������
//		��������¼�����
//		Scanner sc = new Scanner(System.in);
//		������ʾ
//		System.out.println("������ɼ�");
//		int score = sc.nextInt();
//		
//		if(score>100||score<0) {
//			System.out.println("����������ݷǷ�");
//		}else if(score>=90&&score<=100) {
//			System.out.println("����");
//		}else if (score>80&&score<=90) {
//			System.out.println("����");
//		}else if (score>70&&score<90) {
//			System.out.println("��");
//		}else if (score>60&&score<70) {
//			System.out.println("����");
//		}else {
//			System.out.println("��");
//		}
		/*1.С���������зֱ�������ֽ�ƣ����磺����10��
		 * ����8��
		 * ����10��8��ͨ������¼�룩��
		 * Ҫ���д���뽻��С�����е���
		2.�������еĽ�����£�

		������С�������е�ֽ�ƣ�10
		������С�������е�ֽ�ƣ�8

		����ǰС�����е�ֽ�ƣ�
		�����е�ֽ�ƣ�10
		�����е�ֽ�ƣ�8

		������С�����е�ֽ�ƣ�
		�����е�ֽ�ƣ�8
		�����е�ֽ�ƣ�10*/
		Scanner sc = new Scanner(System.in);
		System.out.println("���������ֵ�ֽ��");
		int left = sc.nextInt();
		System.out.println("�����������ĵ�ֽ��");
		int right = sc.nextInt();

		System.out.println("���ֵ�����"+left);
		System.out.println("���ֵ�����"+right);
		System.out.println();
		
		
//		����һ�������������ֽ���
		int temp = left;
//		��ӡ���ֵĵ�ֽ������
		left = right;
		right = temp;
		System.out.println("�������е�ֽ���ǣ�");
		System.out.println("���ֵ�ֽ���ǣ�"+left);
		System.out.println("���ֵ�ֽ���ǣ�"+right);
		
//		�������
//		Scanner sc = new Scanner(System.in);
//		System.out.println("�����뱾��:");
//		double money = sc.nextDouble();
//		double year1 = money *(1+2.25/100);
//		double year2 = money*(1+2.7/100);
//		double year3 = money*(1+3.24/100);
//		double year5 = money*(1+3.6/100);
//		��������¼�����
		
//		System.out.println("��ϢΪ"+year1);
//		System.out.println("��ϢΪ"+year2);
//		System.out.println("��ϢΪ"+year3);
//		System.out.println("��ϢΪ"+year5);
	}

}
