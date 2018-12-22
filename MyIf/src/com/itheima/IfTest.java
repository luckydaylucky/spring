package com.itheima;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入第一个整数:");
		int a = sc.nextInt();
		
		System.out.println("请输入第二个整数：");
		int b = sc.nextInt();
		
		//定义变量
		int max;
		if (a>b) {
			max = a;
		}else {
			max = b;
		}
		max += 20;
		System.out.println("最大值是："+max);
	}

}
