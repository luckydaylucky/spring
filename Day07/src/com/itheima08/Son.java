package com.itheima08;

public class Son extends Father {
	public int age = 16;
//	public int height = 170;
	
	public void print() {
		int age = 10;
//		���ʾֲ�����
		System.out.println("������Ǿֲ���Ա����"+age);
//		���ʳ�Ա����
		System.out.println("����������г�Ա����"+this.age);
//		���ʸ����Ա����
		System.out.println("������Ǹ����Ա����"+super.age);
	}

}
