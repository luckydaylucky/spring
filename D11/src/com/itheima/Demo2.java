package com.itheima;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo2 {
	public static void main(String[] args) {
		List<String> lis = new ArrayList<>();
		lis.add("wanglo");
		lis.add("liis");
		lis.add("lijf");
		
		ListIterator<String> liss = lis.listIterator();
		while (liss.hasNext()) {
			String s = liss.next();
			
			if(s.equals("lijf"))
				liss.add("�۰�����");
			
		}
		
		
		
//		for (int i = 0; i < lis.size(); i++) {
//			String s = lis.get(i);
//			if(s.equals("liis")) {
//				lis.add("������");
//			}
//			
//		}
		System.out.println(lis);
		
//		while (liss.hasNext()) {
//			String s = liss.next();
//			System.out.println(lis);
//			
//		}
		
		
//		while (liss.hasPrevious()) {
//			
//			String s = liss.previous();
//			System.out.println(s);
//		}
		
	}

}
