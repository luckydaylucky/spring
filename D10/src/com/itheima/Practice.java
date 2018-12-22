package com.itheima;

import java.util.Arrays;

/*独立编写Integer之把字符串中的数据排序的案例*/
public class Practice {
	public static void main(String[] args) {
		String s = "11 25 66 22 44 33 55 11 26";
		String[] strArr = s.split(" ");
		int[] arr = new int[strArr.length];
		for (int i = 0; i < strArr.length; i++) {
			arr[i] = Integer.parseInt(strArr[i]);
		}
		
		Arrays.sort(arr);
		StringBuilder ss = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			if(i==arr.length-1) {
				ss.append(arr[i]);
			}else {
				ss.append(arr[i]).append("");
			}
		}
		
		
		
//		int a = 10;
//		
//		
//		
//		
//		String s = String.valueOf(a);
//		System.out.println(s);
//		int b = Integer.parseInt(s);
		
		
		
//		Integer i = new Integer(1230);
//		System.out.println(i);
//		
//		Integer ii = new Integer("1234");
//		System.out.println(ii);
	}
	
	
	
	
//	int[] arr = {11,66,55,1,33,22,12};
//	
//	Arrays.sort(arr);
//	System.out.println("排序后"+Arrays.toString(arr));
//	int[] arr = {11,554,32,2,355,11};
//	for (int i = 0; i < arr.length; i++) {
//		for (int j = 0; j < arr.length; j++) {
//			if(arr[j]>arr[j+1]) {
//				int temp = arr[j];
//				arr[j] = arr[j+1];
//				temp = arr[j+1];
//			}
//		}
//	}
//	
//}
	
	

}
