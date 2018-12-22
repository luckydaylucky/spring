package com.itheima10;

public class Manager {
	
	float id;
	String name;
	double salary;
	double bonus;
	
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Manager(String name, float id, double salary, double bonus) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.bonus = bonus;
	}
	


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getId() {
		return id;
	}


	public void setId(float id) {
		this.id = id;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public double getBonus() {
		return bonus;
	}


	public void setBonus(double bonus) {
		this.bonus = bonus;
	}


	public void work() {
		System.out.println();
	}

}
