package com.itheima;


import java.util.Random;
import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
		
		
		
		
		/*������1-10���浽һ������Ϊ10��һά������
		����һ��������,����Ϊ3,ȡ��ԭ���������������Ԫ��(�������Ƿ��ظ�)
		���������Ԫ�ظ�ֵ
		������������Ԫ�صĺ�*/
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int[] arrs = new int[3];
//		���������
		Random r = new Random();
		int num = r.nextInt(10);
		
	
		
		
		
		
		
		
		
		
//		��������
//		int[] arr = new int[20];
//		arr[0] = 1;
//		arr[1] = 1;
//		for (int i = 2; i < arr.length; i++) {
//			arr[i] = arr[i-1] +arr[i-2];
//		}
//		System.out.println(arr[19]);
		
		
		
		
		/*�ڱ�̾����У���6����ίΪ������ѡ�ִ�֣�����Ϊ0-100�������֡�
		ѡ�ֵ����÷�Ϊ��ȥ��һ����߷ֺ�һ����ͷֺ� ��4����ίƽ��ֵ��
		��д����ʵ�֡�(������С������)*/
//		��������
//		int[] arr = new int[6];
//		��������¼�����
//		Scanner sc = new Scanner(System.in);
//		for (int i = 0; i < arr.length; i++) {
//			������ʾ
//			System.out.println("�������"+(i+1)+"��ί���");
//			int num = sc.nextInt();
//			arr[i] = num;
//		}
//		�������ն���
//		int max = arr[0];
//		int min = arr[0];
//		�����ֵ
//		for (int i = 1; i < arr.length; i++) {
//			if(max > arr[i]) {
//				max = arr[i];
//			}
//		}
//		����Сֵ
//		for (int i = 0; i < arr.length; i++) {
//			if(min < arr[i]) {
//				min = arr[i];
//			}
//		}
		
//		������ͱ���
//		int sum = 0;
//		for (int i = 0; i < arr.length; i++) {
//			sum += arr[i];
//		}
//		����ƽ���ֱ���
//		int avg = 0;
//		 
//		for (int i = 0; i < arr.length; i++) {
//			avg = (sum - max - min)/(arr.length-2);
//		}
//		System.out.println("��ѡ�ֵ����յ÷���"+avg);	
		
		
		
		
		
		
		/*����¼��һ������������һ���ó��ȵ����飬
		Ϊÿһ��Ԫ�ظ�ֵΪ1-10�����������
		����ӡ����������ֵ����5��Ϊż����Ԫ��.*/
//		��������
//		int[] arr = new int[10];
//		�������������
//		Random r = new Random();
//		��ȡ�����������
//		for (int i = 0; i < arr.length; i++) {
//			����һ��10���ڵ������
//			int num = r.nextInt(10);
//			arr[i] = num;
//			����if�ж�
//			if(arr[i]>5 && arr[i]%2==0) {
//				System.out.println(num);
//			}
//		}
		
		
		
		
		
		/*��֪����int[] nums = {5,10,15},,Ҫ�󴴽�һ��������
				1.������ĳ��Ⱥ���֪������ͬ
				2.������ÿ��Ԫ�ص�ֵ ����֪�����Ӧλ��Ԫ�ص�2��
				3.�ڿ���̨�д�ӡ�����������Ԫ��*/
//		������Ԫ�ظ��������鳤��-1
//		int[] nums = {5,10,15};
//		int[] arr = new int[3];
//		arr[0] = nums[0]*2;
//		arr[1] = nums[1]*2;
//		arr[2] = nums[2]*2;
//		System.out.println("arr[0]"+arr[0]);
//		System.out.println("arr[1]"+arr[1]);
//		System.out.println("arr[2]"+arr[2]);
		
		

		
		
		
		
//		��������
//		int[] arr = new int[3];
//		�������������
//		Random r = new Random();
//		��ȡ�����������
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("��ȡ�����������");
//			int num = r.nextInt(9);
//			
//			arr[i] = num;
//			System.out.println(arr[i]);
//		}
		
		
		
		
		
		
		
//		����һ������
//		int[] arr = {19,95,65,45,89};
//		int min = arr[0];
//		���ñ�����������е�Ԫ��
//		for (int i = 1; i < arr.length; i++) {
//			���������
			
//			if(min > arr[i]) {
//				min = arr[i];
//				
//				
//			}	
//		}
//		System.out.println(min);
		
		
		
		
		
		
		
//		ģ����ί��ֳ���
//		��������
//		int[] arr = new int[6];
//		��������¼�����
//		Scanner sc = new Scanner(System.in);
		
//		������ʾ
//		��ȡ�����еķ���
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("�������"+(i+1)+"��ί�ķ���");
//			int score = sc.nextInt();
//			arr[i] = score;
//		}
//		�������ֲ�����
//		int max = arr[0];
//		int min = arr[0];
//		������е����ֵ
//		for (int i = 0; i < arr.length; i++) {
//			if(max < arr[i]) {
//				max = arr[i];
//			}
//		}
		
//		������е���Сֵ
//		for (int i = 0; i < arr.length; i++) {
//			if(min > arr[i]) {
//				min = arr[i];
//			}
			
//			������ͱ���
			
			
//		}
//		int sum = 0;
//		for (int i = 0; i < arr.length; i++) {
//			sum += arr[i];
//		}
//		����ƽ���ֱ���
//		int avg = (sum - max - min)/(arr.length-2);
//		������
//		System.out.println("��ѡ�ֵ����յ÷���:"+avg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		��������
//		int[] arr = new int[20];
//		�����鸳ֵ
//		arr[0] = 1;
//		arr[1] = 1;
//		����forѭ����������ϰ
//		�����ɴӵ������¿�ʼ
//		for (int i = 2; i < arr.length; i++) {
//			arr[i] = arr[i-1] + arr[i-2];
//		}
//		System.out.println("�ڶ�ʮ���µ����Ӹ�����"+arr[19]);
	}

}
