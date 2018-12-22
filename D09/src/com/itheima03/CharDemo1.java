package com.itheima03;

public class CharDemo1 {
	public static void main(String[] args) {
		int[] i = {1,2,3,4,5,6,8,7,8};
		
		String result = arrToString(i);
		System.out.println(i);
		
		
		
		
	}
	public static String arrToString(int[] i) {
		String s = "";
		s += "[";
		for (int j = 0; j < i.length; j++) {
			if(j==i.length-1) {
				s += i[j];
			}else {
				s += i[j];
				s += ", ";
			}
		}
		s += "]";
		return s;
		
	}

}
