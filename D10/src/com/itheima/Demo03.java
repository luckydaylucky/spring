package com.itheima;

import java.util.Arrays;

public class Demo03 {
	public static void main(String[] args) {
		String s = "11 44 33 55 66 11 22";
		
		
		String[] strArr = s.split("");
		int[] arr = new int[strArr.length];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(strArr[i]);
		}
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			if(i==arr.length-1) {
				sb.append(arr[i]);
			}else {
				sb.append(arr[i]).append(" ");
			}
		}
		String result = sb.toString();
		
		System.out.println("result:"+result);
		
	}

}
