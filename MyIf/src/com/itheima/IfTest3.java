package com.itheima;

import java.util.Scanner;

public class IfTest3 {
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		//������ʾ
		System.out.println("������ѧ��������");
		int score = sc.nextInt();
		//ʹ��If������ж�
		if(score>100 || score<0) {
			System.out.println("������ĳɼ�����");
		}
		else if(score>=90 && score<=100) {
			System.out.println("����");
		}else if(score>=60 && score<=90) {
			System.out.println("����");
		}
		else {
			System.out.println("��");
		}
		
	}

}
