package com.itheima02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class Demo {
	public static void main(String[] args) {
		ArrayList<HashMap<String,String>> list = new ArrayList<>();
		
		HashMap<String,String> map1 = new HashMap<>();
		map1.put("����","����");
		map1.put("����", "��ʽӢ��");
		list.add(map1);
		
		
		HashMap<String,String> map2 = new HashMap<>();
		map2.put("Ӣ��", "Ӣ��");
		map2.put("������", "��������");
		list.add(map2);
		
		HashMap<String,String> map3 = new HashMap<>();
		
		map3.put("�����","�������");
		map3.put("̩��","̩��");
		list.add(map3);
		
		
		for (HashMap<String, String> hashMap : list) {
			Set<Entry<String, String>> entrySet = map1.entrySet();
			for (Entry<String, String> entry : entrySet) {
				System.out.println(entry.getKey()+"     "+entry.getValue());
				
			}
			System.out.println("------------------");
		}
		
		
	}

}
