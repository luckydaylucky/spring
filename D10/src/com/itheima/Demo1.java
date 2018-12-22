package com.itheima;

public class Demo1 {
	public static void main(String[] args) {
		int[] arr = {11,5,44,99,3};
		
		printArr(arr);
		System.out.println(arr);
		printArr(arr);
		
		
	}
	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j]+1) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}
			
		}
	}

}
