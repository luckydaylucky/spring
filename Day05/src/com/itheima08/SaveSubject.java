package com.itheima08;

public class SaveSubject {
//	�����Ա����
	private String number;
	private String sun;
	private String time;
	private String describe;
//	����չ��췽��
	public SaveSubject() {
		super();
		// TODO Auto-generated constructor stub
	}
//	���幹�췽��
	public SaveSubject(String number, String sun, String time, String describe) {
		super();
		this.number = number;
		this.sun = sun;
		this.time = time;
		this.describe = describe;
	}
//	�����Ա����
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
