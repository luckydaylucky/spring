package com.itheima;
/*���󣺸�������Ԫ��{11,22,33,44,55}��
�������飬���÷����Ľ��������÷�����
Ҫ���ӡ��ʽΪ[11,22,33,44,55]*/

public class Test {
	public static void main(String[] args) {
		// ��������
		int[] arr = {11,22,33,44,55};
		 String result = arrayToString(arr);
		 System.out.println(result);
		
	}
	public  static String arrayToString(int[] arr) {
		String s = "";
		s+='[';
		for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1) {
				s+=arr[i];
			}else {
				s+=arr[i];
				s+=", ";
			}
			
		}
		s+=']';
		return s;
	}
	public static void 

	
	}

