package com.itheima08;

public class SaveSubject {
//	定义成员变量
	private String number;
	private String sun;
	private String time;
	private String describe;
//	定义空构造方法
	public SaveSubject() {
		super();
		// TODO Auto-generated constructor stub
	}
//	定义构造方法
	public SaveSubject(String number, String sun, String time, String describe) {
		super();
		this.number = number;
		this.sun = sun;
		this.time = time;
		this.describe = describe;
	}
//	定义成员方法
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getSun() {
		return sun;
	}
	public void setSun(String sun) {
		this.sun = sun;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	

}
