package com.itheima;

public class ArrayDemo {
	public static void main(String[] args) {
////		���������ʽ
//		int[] arr = new int[3];
////		��ȡ�������������е���
//		System.out.println("arr"+arr);
//		System.out.println("arr[0]"+arr[0]);
//		System.out.println("arr[1]"+arr[1]);
//		System.out.println("arr[2]"+arr[2]);
//		System.out.println("-------------");
//		
////		�������е�Ԫ�ظ�ֵ
//		arr[0] = 100;
////		������
//		System.out.println("arr[0]"+arr[0]);
//		������������
//		int[] arr = new int[3];
//		int[] rr = new int[6];
//		����������Լ������е�Ԫ��
//		System.out.println("arr1"+arr);
//		System.out.println("arr[0]"+arr[0]);
//		System.out.println("arr[1]"+arr[1]);
//		System.out.println("arr[2]"+arr[2]);
//		System.out.println("-------------");
//		System.out.println("arr2"+rr);
//		System.out.println("arr[0]"+arr[0]);
//		System.out.println("arr[1]"+arr[1]);
//		System.out.println("arr[2]"+arr[2]);
//		System.out.println("arr[3]"+arr[3]);
//		System.out.println("arr[4]"+arr[4]);
//		System.out.println("arr[5]"+arr[5]);
//		����һ������
//		int[] arr = {1,2,3,5,798,45,355,225};
//		��������е�Ԫ��
//		�û�ȡ��������� ������.length
//		for(int x=0; x<arr.length; x++) {
//			System.out.println("��������"+arr.length+"��Ԫ��");
//			System.out.println(arr[x]);
//		����һ������
		int[] arr = {12,63,52,44,100};
//		ȷ��������
		int max= arr[0];
//		����forѭ�����������
		
		for(int x=1; x<arr.length; x++) {
//			����if�ṹ����������ıȽ�
			if(arr[x] > max) {
//				���Ԫ�ر�max����ô������������������
				max = arr[x];
			}
			System.out.println("max:"+max);
		}
		
		
	}

}
