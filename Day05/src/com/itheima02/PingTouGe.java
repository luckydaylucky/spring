package com.itheima02;

public class PingTouGe {
	String name;
	private int age;
	String color;
	public void SetAge(int a) {
		if(a<0||a>200) {
			System.out.println("���������������");
		}else {
			age = a;
		}
		
	}
	public void fight() {
		System.out.println("���������������͸�");
	}
	public void run() {
		System.out.println("�����ڴ��̵�·�ϣ������ڴ���");
	}
	public void speak() {
		System.out.println("��ֻ�������λ�����߱���λ����");
	}

}
