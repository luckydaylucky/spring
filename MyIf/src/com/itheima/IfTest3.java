package com.itheima;

import java.util.Scanner;

public class IfTest3 {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		//给出提示
		System.out.println("请输入学生分数：");
		int score = sc.nextInt();
		//使用If语句做判断
		if(score>100 || score<0) {
			System.out.println("你输入的成绩有误");
		}
		else if(score>=90 && score<=100) {
			System.out.println("优秀");
		}else if(score>=60 && score<=90) {
			System.out.println("良好");
		}
		else {
			System.out.println("差");
		}
		
	}

}
