package com.itheima;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
//		����һ������Ϊ��������
		int[] arr = new int[6];
//		��������¼�����
		Scanner sc = new Scanner(System.in);
//		������ʾ
		for(int x=0; x<arr.length; x++) {
		System.out.println("�������"+(x+1)+"��ί");
		 int score = sc.nextInt();
		 arr[x] = score;
		}
//		���������
		int max = arr[0];
//		forѭ�����������Ԫ��
		for(int x=1; x<arr.length; x++) {
			if(arr[x]>max) {
				max = arr[x];
			}
		}
//		�����Сֵ
//		���������
		int min = arr[0];
//		ʹ��forѭ���������Ԫ��
		for(int x=1; x<arr.length; x++) {
			if(arr[x]<min) {
				min = arr[x];
			}
		}
//		������ͱ���
		int sum = 0;
		for(int x=0; x<arr.length; x++) {
			sum += arr[x];
		}
//		��ѡ�ֵ����յ÷�
		int avg = (sum - max - min)/(arr.length-2);
		System.out.println("��ѡ�ֵ����յ÷��ǣ�"+avg);
	}

}
