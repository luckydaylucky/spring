package com.itheima09;

public class Son extends Father {
//	���ʸ����޲ι��췽����super
//	�޲ι��췽���������в�������
	public Son() {
		super("����ϼ");
		System.out.println("son���޲ι��췽��");
	}
//	���ι��췽��
//	ֻ�ܷ��ʸ��๫�д��ι��췽��
	public Son(String name) {
		super("����ϼ");
		System.out.println("son�Ĵ��ι��췽��");
		
	}

}
