package com.itheima01;

import java.util.Scanner;

public class UserTest {
	public static void main(String[] args) {
//		�������
		String name = "admin";
		String pass = "12345";
		
		
//		��������¼�����
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
//		������ʾ
		System.out.println("�������û�����");
		String user = sc.nextLine();
		System.out.println("���������룺");
		String pas = sc.nextLine();
		
		
//		����ѭ��
		
			if(user.equals(user)&&pass.equals(pas)) {
				System.out.println("��½�ɹ�");
				break;
			}
			else {
//				�˻�������else����
				if(2-i==0) {
					System.out.println("����˻����������������Ա��ϵ������");
				}else {
					System.out.println("�㻹��"+(2-i)+"�λ���");
				}
				
			}
			
		}
	}

}
