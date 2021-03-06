package com.itheima;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashTest {
	public static void main(String[] args) {
		// 创建arraylist集合
		ArrayList<HashMap<String, String>> array = new ArrayList<>();

		// 创建元素集合
		HashMap<String, String> hm1 = new HashMap<>();
		hm1.put("黄晓明", "baby");
		hm1.put("冯绍峰", "赵丽颖");
		// 把元素添加到集合中
		array.add(hm1);

		// 创建元素集合
		HashMap<String, String> hm2 = new HashMap<>();
		hm2.put("邓超", "孙俪");
		hm2.put("贾乃亮", "李小璐");
		// 把元素添加到集合中
		array.add(hm2);
		// 创建元素集合
		HashMap<String, String> hm3 = new HashMap<>();
		hm3.put("景甜", "张继科");
		hm3.put("谢霆锋", "张柏芝");
		// 把元素添加到集合中
		array.add(hm3);
		// 根据键获取值的操作
		for (HashMap<String, String> hashMap : array) {
			// 其中嵌套hashmap所以要继续遍历
			Set<String> ss = hashMap.keySet();
//			根据键获取值的方法
			for (String key : ss) {
				String value = hashMap.get(key);
				System.out.println(key + "   " + value);

			}

			System.out.println("---------------");
		}

	}

}
