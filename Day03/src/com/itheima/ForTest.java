package com.itheima;

import java.util.Random;
import java.util.Scanner;

public class ForTest {
	public static void main(String[] args) {
//		打印正三角形
//		for(int i=1; i<=5; i++) {
//			for(int a=1; a<=i; a++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		打印九九乘法表
//		for(int x=1; x<=9; x++) {
//			for(int y=1; y<=x; y++) {
//				拼接
//				System.out.print(y+"*"+x+"="+y*x+"\t");
//			}
//			System.out.println();
//		}
		
//		for(int i=1; i<=5; i++) {
//			for(int a=1; a<=4; a++) {
//				if(a==2) {
//					break;
//				}
//				System.out.print("*");
//				
//			}
//			System.out.println();
//		}
		
//		for(int i=1; i<=10; i++) {
//			if(i%3==0) {
//				break;
//			}
//			System.out.println(i);
//		}
		
//		获取随机数
//		Random r = new Random();
		
//		定义整型变量
//		for(int x=1; x<=10; x++) {
//			int num = r.nextInt(10);
//			System.out.println(num);
//		}
		
//		猜数字小游戏
//		创建随机数对象
		Random r = new Random();
		
//		产生随机数
		int num = r.nextInt(100)+1;
		
//		创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		while (true) {
			
//		请输入你要猜的数字
		System.out.println("请输入你要猜的数字:");
		int gussNumber = sc.nextInt();
		
//		加入循环
		
//			采用if判断数字结果
		if(gussNumber>num) {
			System.out.println("你猜得数字"+gussNumber+"大了");
		}else if (gussNumber<num) {
			System.out.println("你猜得数字"+gussNumber+"小了");
		}else {
			System.out.println("恭喜你猜中了");
			break;
		}
		
		}
			
		
			
		}
		
		
		
		
		
	
}


