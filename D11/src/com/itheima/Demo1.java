package com.itheima;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo1 {
	public static void main(String[] args) {
		List<String> st = new ArrayList<>();
		
		st.add("����ʦ");
		st.add("����ʦ");
		st.add("����ʦ");
		
		
		ListIterator<String> lit = st.listIterator();
		while (lit.hasNext()) {
			String s = lit.next();
			System.out.println(s);
			
		}
	}

}
