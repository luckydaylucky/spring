package com.itheima06;

public class ExtendTest extends Student {
	public static void main(String[] args) {
//		java�м̳�ֻ֧�ֵ��̳�,�����Զ��̳�
		Student st = new Student();
		
		
		st.setName("����ϼ");
		st.setAge(30);
		System.out.println(st.getName()+"------------"+st.getAge());
		st.study();
		
	}

}
