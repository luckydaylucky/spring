package com.itheima;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Practice03 {
	public static void main(String[] args) {
		List<String> lis = new ArrayList<String>();
		
		lis.add("java");
		lis.add("man");
		lis.add("loolp");
		
		ListIterator<String> it = lis.listIterator();
//		while (it.hasNext()) {
//			String s = it.next();
//			if(s.equals("man")) {
//				it.add("lllll");
//			}
//			
//		}
		
//		for (int i = 0; i < lis.size(); i++) {
//			String s = lis.get(i);
//			if(s.equals("man")) {
//				lis.add("lulu");
//			}
//			
//		}
		
		
		for (String s : lis) {
			System.out.println(s);
		}
		
		
//		System.out.println(lis);
 	}

	@Override
	public String toString() {
		return "Practice03 [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
