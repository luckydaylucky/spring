package com.itheima01;

public class PhoneTest {
	public static void main(String[] args) {
//		������Ա����
		Phone p = new Phone();
//		���ó�Ա����
		System.out.println("�۸�"+p.price);
		System.out.println("Ʒ��"+p.name);
		System.out.println("��ɫ"+p.color);
		System.out.println("-----------");
		
		
		p.color = "��ɫ";
		p.name = "��Ϊ";
		p.price = 1111;
		
		
		System.out.println("�۸�"+p.price);
		System.out.println("Ʒ��"+p.name);
		System.out.println("��ɫ"+p.color);
		System.out.println("-----------");
		
		
//		���÷���
		p.PhoneCall("������");
		p.Message("�°���");
		
	}

}
