package com.itheima;

import java.time.Year;

public class IfDemo3 {
	public static void main(String[] args) {
		System.out.println("��ʼ");
		
		//���ݸ���x��ֵ������y��ֵ
		int x = 10;
		
		//�������
		int y;
		
		if (x >= 3) {
			y = 2*x+1;
		}else if (x>=1 && x<=3) {
			y = 2*x;
		}else if (x<1){
			y = 2*x-1;
		}else {
			y = 0;
			System.out.println("������������x��ֵ");
		}
		System.out.println("x:"+x);
		System.out.println("����");
	}

}
