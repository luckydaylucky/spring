package com.itheima;

import java.util.Random;
import java.util.Scanner;

public class ForTest {
	public static void main(String[] args) {
//		��ӡ��������
//		for(int i=1; i<=5; i++) {
//			for(int a=1; a<=i; a++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		��ӡ�žų˷���
//		for(int x=1; x<=9; x++) {
//			for(int y=1; y<=x; y++) {
//				ƴ��
//				System.out.print(y+"*"+x+"="+y*x+"\t");
//			}
//			System.out.println();
//		}
		
//		for(int i=1; i<=5; i++) {
//			for(int a=1; a<=4; a++) {
//				if(a==2) {
//					break;
//				}
//				System.out.print("*");
//				
//			}
//			System.out.println();
//		}
		
//		for(int i=1; i<=10; i++) {
//			if(i%3==0) {
//				break;
//			}
//			System.out.println(i);
//		}
		
//		��ȡ�����
//		Random r = new Random();
		
//		�������ͱ���
//		for(int x=1; x<=10; x++) {
//			int num = r.nextInt(10);
//			System.out.println(num);
//		}
		
//		������С��Ϸ
//		�������������
		Random r = new Random();
		
//		���������
		int num = r.nextInt(100)+1;
		
//		��������¼�����
		Scanner sc = new Scanner(System.in);
		while (true) {
			
//		��������Ҫ�µ�����
		System.out.println("��������Ҫ�µ�����:");
		int gussNumber = sc.nextInt();
		
//		����ѭ��
		
//			����if�ж����ֽ��
		if(gussNumber>num) {
			System.out.println("��µ�����"+gussNumber+"����");
		}else if (gussNumber<num) {
			System.out.println("��µ�����"+gussNumber+"С��");
		}else {
			System.out.println("��ϲ�������");
			break;
		}
		
		}
			
		
			
		}
		
		
		
		
		
	
}


