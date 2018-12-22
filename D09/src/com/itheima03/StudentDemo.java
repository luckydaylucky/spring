package com.itheima03;

import java.util.Scanner;

public class StudentDemo {
	public static void main(String[] args) {
//		定义变量
		String username = "admin";
		String password = "adming";
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("请输入用户名");
			String user = sc.nextLine();
			System.out.println("请输入密码");
			String pass = sc.nextLine();
			
			if(user.equals(user)&&user.equals(pass)) {
				System.out.println("操作成功");
				break;
			}else {
				if(2-i==0) {
					System.out.println("账户锁定请与管理员联系");
				}else {
					System.out.println("你还有"+(2-i)+"次机会");
				}
				
			}
			
			
		}
		
		
		
		
	}

}
