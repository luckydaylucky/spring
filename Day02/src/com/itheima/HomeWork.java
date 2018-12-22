package com.itheima;

import java.util.Scanner;

/*键盘录入一个int类型的数据,使用三元运算符判断这个数是奇数还是偶数*/
public class HomeWork {
	public static void main(String[] args) {
		// 创建键盘录入对象
//		Scanner sc = new Scanner(System.in);
		// 给出提示
//		System.out.println("请输入一个数字:");
//		int c = sc.nextInt();
//		String x = c % 2 == 0 ? "偶数" : "奇数";
//		System.out.println("x"+x);
		/*键盘录入一个学生成绩(int类型),
		如果成绩大于等于60输出”及格”,
		如果成绩小于60输出”不及格”*/
//		创建键盘录入对象
//		Scanner sc = new Scanner(System.in);
//		给出提示
//		System.out.println("请输入成绩");
//		int score = sc.nextInt();
//		int score 
//		键盘录入一个长方形的长和宽(长和宽为int类型),
//		计算长方形的面积和周长
//		创建键盘录入对象
//		Scanner sc = new Scanner(System.in);
//		给出提示
//		System.out.println("请输入长");
//		int a = sc.nextInt();
//		System.out.println("请输入宽");
//		int b = sc.nextInt();
//		int sum = (a+b)*2;
//		System.out.println("长方形的周长为："+sum);
//		int sum1 = a*b;
//		System.out.println("长方形的面积是:"+sum1);
		
//		定义int类型的变量a,定义int类型的变量b,
//		使用三元运算符判断如果a大于b返回a与b的和,
//		否则返回a与b的乘积,打印结果
//		int a = 20;
//		int b = 10;
//		int result = a>b?(a+b):(a*b);
//		System.out.println("result"+result);
		
//		键盘录入学生考试成绩，判断学生等级:
//			90-100	优秀
//			80-90	好
//			70-80	良
//			60-70	及格
//						60以下	不及格
//		创建键盘录入对象
//		Scanner sc = new Scanner(System.in);
//		给出提示
//		System.out.println("请输入成绩");
//		int score = sc.nextInt();
//		
//		if(score>100||score<0) {
//			System.out.println("你输入的数据非法");
//		}else if(score>=90&&score<=100) {
//			System.out.println("优秀");
//		}else if (score>80&&score<=90) {
//			System.out.println("良好");
//		}else if (score>70&&score<90) {
//			System.out.println("良");
//		}else if (score>60&&score<70) {
//			System.out.println("及格");
//		}else {
//			System.out.println("两");
//		}
		/*1.小明左、右手中分别拿两张纸牌（比如：黑桃10和
		 * 红桃8，
		 * 数字10和8可通过键盘录入），
		 * 要求编写代码交换小明手中的牌
		2.程序运行的结果如下：

		请输入小明左手中的纸牌：10
		请输入小明右手中的纸牌：8

		互换前小明手中的纸牌：
		左手中的纸牌：10
		右手中的纸牌：8

		互换后小明手中的纸牌：
		左手中的纸牌：8
		右手中的纸牌：10*/
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入左手的纸牌");
		int left = sc.nextInt();
		System.out.println("请输入右手哪的纸牌");
		int right = sc.nextInt();

		System.out.println("左手的牌是"+left);
		System.out.println("右手的牌是"+right);
		System.out.println();
		
		
//		定义一个变量做左右手交换
		int temp = left;
//		打印左手的的纸牌数字
		left = right;
		right = temp;
		System.out.println("互换手中的纸牌是：");
		System.out.println("左手的纸牌是："+left);
		System.out.println("右手的纸牌是："+right);
		
//		定义变量
//		Scanner sc = new Scanner(System.in);
//		System.out.println("请输入本金:");
//		double money = sc.nextDouble();
//		double year1 = money *(1+2.25/100);
//		double year2 = money*(1+2.7/100);
//		double year3 = money*(1+3.24/100);
//		double year5 = money*(1+3.6/100);
//		创建键盘录入对象
		
//		System.out.println("本息为"+year1);
//		System.out.println("本息为"+year2);
//		System.out.println("本息为"+year3);
//		System.out.println("本息为"+year5);
	}

}
