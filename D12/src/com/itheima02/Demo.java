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
		map1.put("法国","法语");
		map1.put("美国", "美式英语");
		list.add(map1);
		
		
		HashMap<String,String> map2 = new HashMap<>();
		map2.put("英国", "英语");
		map2.put("葡萄牙", "葡萄牙语");
		list.add(map2);
		
		HashMap<String,String> map3 = new HashMap<>();
		
		map3.put("意大利","意大利语");
		map3.put("泰国","泰语");
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
