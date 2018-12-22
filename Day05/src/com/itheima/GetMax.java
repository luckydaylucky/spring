package com.itheima;

import java.util.Scanner;

public class GetMax {
	public static void main(String[] args) {
//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
//		给出提示
		System.out.println("请输入第一个数字：");
		int a = sc.nextInt();
		System.out.println("请输入第二个数字：");
		int b = sc.nextInt();
		
//		调用方法
		int max = GetMax(a,b);
//		输出结果
		System.out.println("最大值是"+max);
	}
//	创建方法
	public static int GetMax(int a,int b) {
//		采用if结构做最值判断
		if(a>b) {
			return a;
		}else {
			return b;
		}
		
	}

}
