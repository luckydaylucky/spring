package com.itheima;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashTest {
	public static void main(String[] args) {
		// ����arraylist����
		ArrayList<HashMap<String, String>> array = new ArrayList<>();

		// ����Ԫ�ؼ���
		HashMap<String, String> hm1 = new HashMap<>();
		hm1.put("������", "baby");
		hm1.put("���ܷ�", "����ӱ");
		// ��Ԫ�����ӵ�������
		array.add(hm1);

		// ����Ԫ�ؼ���
		HashMap<String, String> hm2 = new HashMap<>();
		hm2.put("�˳�", "��ٳ");
		hm2.put("������", "��С�");
		// ��Ԫ�����ӵ�������
		array.add(hm2);
		// ����Ԫ�ؼ���
		HashMap<String, String> hm3 = new HashMap<>();
		hm3.put("����", "�ż̿�");
		hm3.put("л����", "�Ű�֥");
		// ��Ԫ�����ӵ�������
		array.add(hm3);
		// ���ݼ���ȡֵ�Ĳ���
		for (HashMap<String, String> hashMap : array) {
			// ����Ƕ��hashmap����Ҫ��������
			Set<String> ss = hashMap.keySet();
//			���ݼ���ȡֵ�ķ���
			for (String key : ss) {
				String value = hashMap.get(key);
				System.out.println(key + "   " + value);

			}

			System.out.println("---------------");
		}

	}

}