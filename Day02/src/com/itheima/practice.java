package com.itheima;

import java.util.Scanner;

/*
 * 需求：运算符加减的练习
 */

public class practice {
	public static void main(String[] args) {

//		// 定义三个变量
//		int a = 'a';
//		int b = 'A';
//		int d = '0';
//
//		// 输出结果
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(d);
//
//		// 除法和取余运算
//		int c = 8 / 4;
//
//		// 输出结果
//		System.out.println(c);
//
//		int e = 5 % 4;
//		// 输出取余结果
//		System.out.println(e);
//		// 做乘法运算
//		int h = 5 * 4;
//		// 输出结果
//		System.out.println(h);
//
//		int f = 5 + 4;
//		System.out.println(f);
//
//		int g = 5 - 4;
//		System.out.println(g);
//
//		// 创建键盘录入对象
//		Scanner sc = new Scanner(System.in);
//		// 请输入第一个整数
//		System.out.println("请输入数字");
//		// 定义变量
//		int weekday = sc.nextInt();
//		switch (weekday) {
//		case 1:
//			System.out.println("星期一");
//			break;
//		case 2:
//			System.out.println("星期二");
//			break;
//		case 3:
//			System.out.println("星期三");
//			break;
//		case 4:
//			System.out.println("星期四");
//			break;
//		case 5:
//			System.out.println("星期五");
//			break;
//		case 6:
//			System.out.println("星期六");
//			break;
//		case 7:
//			System.out.println("星期日");
//			
//			System.out.println("今天是星期：" + weekday);
//			break;
//
//		}
		/*键盘录入三个数据，使用if判断三个值中的最大值*/
//		创建键盘录入对象
//		Scanner sc = new Scanner(System.in);
////		给出提示
//		System.out.println("请输入第一个值");
//		int a = sc.nextInt();
////		请输入第二个值
//		System.out.println("请输入第二个值");
//		int b = sc.nextInt();
////		请输入第三个值
//		System.out.println("请输入第三个值");
//		int c = sc.nextInt();
////		做出if判断
//		int max = 0;
//		if (a>b&&a>c) {
//			System.out.println("max:"+max);
//		}else if(b>a&&b>c){
//			System.out.println("max:"+max);
//		}else if(c>a&&c>b){
//			System.out.println("max:"+max);
//		}
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入成绩");
		int score = sc.nextInt();
		if(score>100||score<0) {
			System.out.println("你输入的数据不在服务区");
		}else if (score>75&&score<=100) {
			System.out.println("优秀");
		}else if (score>60&&score<=75) {
			System.out.println("良好");
		}else if (score>0&&score<=60) {
			System.out.println("及格");
		}
		else {
			System.out.println("凉了");
		}

	}

}
