package com.itheima08;

public class StudentTest {
	public static void main(String[] args) {
//		�����޲ι��췽��
		Student sc = new Student();
//		���ι��췽��
//		String num, String name, int gender, int age, String subject
		Student sc1 = new Student("t001","Ѧ֮ǫ","��",26,"java");
		Student sc2 = new Student("t002","�ű̳�","Ů",24,"IOS");
		Student sc3 = new Student("t003","�Ž�","��",28,"java");
//		������
		System.out.println("��ʦ���      "+"����    "+"�Ա�    "+"����    "+"��Ŀ    ");
		
		System.out.println(sc1.getNum()+"    "+sc1.getName()+"    "+sc1.getGender()+"    "+sc1.getAge()+"    "+sc1.getSubject());
		System.out.println(sc2.getNum()+"    "+sc2.getName()+"    "+sc2.getGender()+"    "+sc2.getAge()+"    "+sc2.getSubject());
		System.out.println(sc3.getNum()+"    "+sc3.getName()+"    "+sc3.getGender()+"    "+sc3.getAge()+"    "+sc3.getSubject());
		System.out.println("�γ̱��      "+"����    "+"����ʱ��    "+"�γ�����    ");
//		int number, String sun, int time, String describe
		SaveSubject sa = new SaveSubject();
		SaveSubject sa1 = new SaveSubject("s001","java","2007-02-08","javaѧ�ƣ�����javase��javaee");
		SaveSubject sa2 = new SaveSubject("s002","ios","2007-02-09","IOSϵͳ����");
		System.out.println(sa1.getNumber()+"    "+sa1.getSun()+"    "+sa1.getTime()+"    "+sa1.getDescribe());
		System.out.println(sa2.getNumber()+"    "+sa2.getSun()+"    "+sa2.getTime()+"    "+sa2.getDescribe());
		
	}

}
