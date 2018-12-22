package com.itheima;

import java.time.Year;

public class IfDemo3 {
	public static void main(String[] args) {
		System.out.println("开始");
		
		//根据给定x的值，计算y的值
		int x = 10;
		
		//定义变量
		int y;
		
		if (x >= 3) {
			y = 2*x+1;
		}else if (x>=1 && x<=3) {
			y = 2*x;
		}else if (x<1){
			y = 2*x-1;
		}else {
			y = 0;
			System.out.println("不存在这样的x的值");
		}
		System.out.println("x:"+x);
		System.out.println("结束");
	}

}
