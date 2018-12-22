package com.test02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class EmployeeTest implements Employeeinterface {
	public static void main(String[] args) {
		ArrayList<Employee>listcs = new ArrayList<>();
		Employee em1 = new Employee("ÎºÓ§Âç", 10000);
		Employee em2 = new Employee("ËÕ¾²ºÃ", 11000);
		Employee em3 = new Employee("ÈİÒô", 15000);
		
		listcs.add(em1);
		listcs.add(em2);
		listcs.add(em3);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÒ»¸öÊı×Ö");
		int num = sc.nextInt();
		
		
		HashMap<Integer, Employee> ha = new HashMap<>();
		Set<Entry<Integer, Employee>> entrySet = ha.entrySet();
		for (Entry<Integer, Employee> entry : entrySet) {
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		
	}

}
