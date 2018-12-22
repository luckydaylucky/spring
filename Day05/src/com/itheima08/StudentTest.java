package com.itheima08;

public class StudentTest {
	public static void main(String[] args) {
//		定义无参构造方法
		Student sc = new Student();
//		带参构造方法
//		String num, String name, int gender, int age, String subject
		Student sc1 = new Student("t001","薛之谦","男",26,"java");
		Student sc2 = new Student("t002","张碧晨","女",24,"IOS");
		Student sc3 = new Student("t003","张杰","男",28,"java");
//		输出语句
		System.out.println("教师编号      "+"姓名    "+"性别    "+"年龄    "+"科目    ");
		
		System.out.println(sc1.getNum()+"    "+sc1.getName()+"    "+sc1.getGender()+"    "+sc1.getAge()+"    "+sc1.getSubject());
		System.out.println(sc2.getNum()+"    "+sc2.getName()+"    "+sc2.getGender()+"    "+sc2.getAge()+"    "+sc2.getSubject());
		System.out.println(sc3.getNum()+"    "+sc3.getName()+"    "+sc3.getGender()+"    "+sc3.getAge()+"    "+sc3.getSubject());
		System.out.println("课程编号      "+"名称    "+"创建时间    "+"课程描述    ");
//		int number, String sun, int time, String describe
		SaveSubject sa = new SaveSubject();
		SaveSubject sa1 = new SaveSubject("s001","java","2007-02-08","java学科，包含javase和javaee");
		SaveSubject sa2 = new SaveSubject("s002","ios","2007-02-09","IOS系统开发");
		System.out.println(sa1.getNumber()+"    "+sa1.getSun()+"    "+sa1.getTime()+"    "+sa1.getDescribe());
		System.out.println(sa2.getNumber()+"    "+sa2.getSun()+"    "+sa2.getTime()+"    "+sa2.getDescribe());
		
	}

}
