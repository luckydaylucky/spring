package com.itheima;

import java.util.Scanner;

/*创建键盘录入对象*/
public class OperaterDemo_04 {
	public static void main(String[] args) {
//		创建键盘录入对象
		Scanner sc = new Scanner(System.in);
//		给出提示
		System.out.println("请输入一个整数");
		int num = sc.nextInt();
//		输出结果
		System.out.println("你输入的数字是："+num);
	}

}
