package com.itheima02;

public class Test02 {
	public static void main(String[] args) {
		int[] arr  = {11,22,33,44,55,66,77,88};
		String result = arrToString(arr);
		System.out.println(result);
		
		
	}
	public static String arrToString(int[] arr) {
	StringBuilder sb = new StringBuilder();
	
	sb.append("[");
	
	for (int i = 0; i < arr.length; i++) {
		if(i==arr.length-1) {
			sb.append(arr[i]);
		}else {
			sb.append(arr[i]).append(", ");
		}
		
	}
	sb.append("]");
	
	String s = sb.toString();
	return s;
	
	}

}