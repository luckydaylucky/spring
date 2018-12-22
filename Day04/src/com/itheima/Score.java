package com.itheima;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
//		定义一个长度为六的数组
		int[] arr = new int[6];
//		创建键盘录入对象；
		Scanner sc = new Scanner(System.in);
//		给出提示
		for(int x=0; x<arr.length; x++) {
		System.out.println("请输入第"+(x+1)+"评委");
		 int score = sc.nextInt();
		 arr[x] = score;
		}
//		定义参照物
		int max = arr[0];
//		for循环求输出数组元素
		for(int x=1; x<arr.length; x++) {
			if(arr[x]>max) {
				max = arr[x];
			}
		}
//		求出最小值
//		定义参照物
		int min = arr[0];
//		使用for循环输出数组元素
		for(int x=1; x<arr.length; x++) {
			if(arr[x]<min) {
				min = arr[x];
			}
		}
//		定义求和变量
		int sum = 0;
		for(int x=0; x<arr.length; x++) {
			sum += arr[x];
		}
//		求选手的最终得分
		int avg = (sum - max - min)/(arr.length-2);
		System.out.println("该选手的最终得分是："+avg);
	}

}
