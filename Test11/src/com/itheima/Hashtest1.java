package com.itheima;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Hashtest1 {
	public static void main(String[] args) {
//		��������
		HashMap<String, ArrayList<String>> hm = new HashMap<>();
//		����Ԫ��1
		ArrayList<String> sgyy = new ArrayList<>();
		
		sgyy.add("�����");
		sgyy.add("����");
		hm.put("��������", sgyy);
		
		ArrayList<String> xyj = new ArrayList<>();
		
		xyj.add("��ɮ");
		xyj.add("�����");
		hm.put("���μ�", xyj);
		
		ArrayList<String> shz = new ArrayList<>();
		
		shz.add("����");
		shz.add("³����");
		hm.put("ˮ䰴�", shz);
		
		Set<String> keySet = hm.keySet();
		for(String key : keySet) {
			System.out.println(key);
			ArrayList<String> value = hm.get(key);
			for(String string : value) {
				System.out.println("\t"+string);
			}
		}
	}

}