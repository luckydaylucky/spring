package com.itheima;

import java.util.Scanner;

/*比较两个值是否相等*/
public class Method01 {
	public static void main(String[] args) {
//		创建键盘录入对象
		Scanner sc = new Scanner(System.in);
//		给出提示
		System.out.println("请输入第一个数字：");
		int a = sc.nextInt();
		System.out.println("请输入第二个数字：");
		int b = sc.nextInt();
//		调用方法
		String flag = compare(a,b);
//		输出结果
		System.out.println("两个值相等吗？"+flag);
	}
	public static String compare(int a,int b) {
		if(a==b) {
			return "相等";
		}else {
			return "不相等";
		}
	}

}
