package com.itheima;

public class ForTest4 {
	public static void main(String[] args) {
		for(int x=100; x<=1000; x++) {
			int g = x%10;
			int s = x/10%10;
			int b = x/10/10%10;
		if((g*g*g+s*s*s+b*b*b)==x) {
			System.out.println("x:"+x);
		}
		}
	}

}
