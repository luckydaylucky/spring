package com.itheima;

import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 输入星期数字
		System.out.println("请输入星期数字");
		int weekday = sc.nextInt();
		// 用switch语句输出星期
		switch (weekday) {
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期日");
			break;
		default:
			System.out.println("你输入的数据有误");
			break;

		}
	}
}
