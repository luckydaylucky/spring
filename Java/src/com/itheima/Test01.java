package com.itheima;
//��Ŀ��������������飬{24��36,90,75,81}���ѻ�ȡ��������ֵ�Ľ�Ϊ����ʵ�֣������÷���
public class Test01 {
	public static void main(String[] args) {
	int[] arr = {24,36,90,75,81};
	max(arr);
		
	}
	public static int max(int[] arr) {
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println(max);
		return max;
	}
	

}