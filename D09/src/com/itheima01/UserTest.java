package com.itheima01;

import java.util.Scanner;

public class UserTest {
	public static void main(String[] args) {
//		定义变量
		String name = "admin";
		String pass = "12345";
		
		
//		创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
//		给出提示
		System.out.println("请输入用户名：");
		String user = sc.nextLine();
		System.out.println("请输入密码：");
		String pas = sc.nextLine();
		
		
//		加入循环
		
			if(user.equals(user)&&pass.equals(pas)) {
				System.out.println("登陆成功");
				break;
			}
			else {
//				账户锁定在else中做
				if(2-i==0) {
					System.out.println("你的账户被锁定，请与管理员联系！！！");
				}else {
					System.out.println("你还有"+(2-i)+"次机会");
				}
				
			}
			
		}
	}

}
