package com.itheima;
/*������һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�
 * С���ӳ����������º�ÿ��������һ�����ӣ�
* �������Ӷ��������ʵڶ�ʮ���µ����Ӷ���Ϊ���٣� 
* 
* ���ɣ�
* 		��һ���£�1
* 		�ڶ����£�1
* 		�������£�2
* 		���ĸ��£�3
* 		������£�5
* 		...
* 
* 		�ӵ������¿�ʼ��ÿ���µ����Ӷ�����ǰ�����µ����Ӷ���֮��
* 		��һ���º͵ڶ����µ����Ӷ�������1*/

import java.util.Scanner;

public class ArrTest2 {
	public static void main(String[] args) {
//		����һ������
		int[] arr = new int[20];
//		��������¼�����
//		Scanner sc = new Scanner(System.in);
//		������ʾ
//		System.out.println("��������Ҫ֪���������ӵ�����:");
//		int sum = sc.nextInt();
		arr[0] = 1;
		arr[1] = 2;
		for(int x=2; x<arr.length; x++) {
			arr[x] = arr[x-1] + arr[x-2];
		}
		System.out.println("�ڶ�ʮ���µ������ǣ�"+arr[19]);
		
		
	}

}
