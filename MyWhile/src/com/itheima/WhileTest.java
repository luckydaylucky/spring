package com.itheima;

public class WhileTest {
	public static void main(String[] args) {
		
		int sum = 0;
		int x = 1;
		while(x<=100) {
			sum += x;
			x++;
		}
		System.out.println("sum:"+sum);
	}

}
