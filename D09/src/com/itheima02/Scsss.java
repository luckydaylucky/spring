package com.itheima02;

public class Scsss {
	public static void main(String[] args) {
//		�ַ���ƴ��
//		��������
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		
		String sss = ssss(arr);
		
		System.out.println(sss);
	}
//	��������
	public static String ssss(int[] arr) {
		String s = "";
		s += "[";
		
		for (int j = 0; j < arr.length; j++) {
			if(j==arr.length-1) {
				s += arr[j];
			}else {
				s += arr[j];
				s += ", ";
			}
			
		}
		s += "]";
		return s;
		
	}

}
