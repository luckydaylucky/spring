package com.itheima03;

import java.util.Scanner;

public class StudentDemo {
	public static void main(String[] args) {
//		�������
		String username = "admin";
		String password = "adming";
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("�������û���");
			String user = sc.nextLine();
			System.out.println("����������");
			String pass = sc.nextLine();
			
			if(user.equals(user)&&user.equals(pass)) {
				System.out.println("�����ɹ�");
				break;
			}else {
				if(2-i==0) {
					System.out.println("�˻������������Ա��ϵ");
				}else {
					System.out.println("�㻹��"+(2-i)+"�λ���");
				}
				
			}
			
			
		}
		
		
		
		
	}

}
