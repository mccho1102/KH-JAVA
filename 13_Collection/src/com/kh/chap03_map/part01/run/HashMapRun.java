package com.kh.chap03_map.part01.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import com.kh.chap03_map.part01.model.vo.Snack;

public class HashMapRun {
	public static void main(String[] args) {
		
		Map<String, Snack> hm = new HashMap<String, Snack>();
		
		hm.put("���ڰ���",new Snack("ũ��Ű", 1000, 190));
		hm.put("����������",new Snack("��¡���", 1500, 450));
		hm.put("��Ѱ���",new Snack("Ȩ����", 2000, 300));
		hm.put("�̻��Ѱ���",new Snack("�ٳ���ű", 1400, 250));
		
		System.out.println(hm);
		//Map ���� �� ���� ���� �ȵ�
		//���� �� key == value ���·� �����
		//Map�� key �κ��� Set�� Ư¡�� ����.
		//key���� �ߺ��� �����������.
		// -> ���� key�� �ߺ� �� value�� �������.
		hm.put("����������",new Snack("������",2500,500));
		
		System.out.println(hm);
		
		//Map�� Value�� List�� Ư¡�� ������.
		//�ߺ��� ����Ѵ�.
		
		hm.put("�̻��Ѱ���",new Snack("Ȩ����", 2000, 300));
		
		System.out.println(hm);
		
		//2.get(key) : key���� ������ ����� value�� ��ȯ
		System.out.println(hm.get("�̻��Ѱ���"));
		System.out.println(hm.get("����������"));
		
		//3. replace(Key,value) : �ش� key�� value�� ����
		hm.replace("����������", new Snack("���������",2000,300));
		System.out.println(hm.get("����������"));
		
		//4. remove(key)
		hm.remove("����������");
		System.out.println(hm);
		
		//Map ���� �����Ϳ� ���������� �����ϴ� ���
		//1. keySet �� �̿��Ͽ� Map�� key������ �̾� 
		//			Set ���·� ���� -> Iterator�� ���� 
		Set<String> ks = hm.keySet();  //key���� ��� set ����
		Iterator<String> it = ks.iterator();
		
		while(it.hasNext()) {
			String key =it.next();
			System.out.println("key : " + key + " / value : " + hm.get(key));
		}
		
		System.out.println();
		
		//2. entrySet()
		//Map.Entry<K,V> : Map ���ο� �����ϴ� �������̽�
		
		Set<Entry<String, Snack>> es  = hm.entrySet();
		Iterator<Entry<String, Snack>> it2 = es.iterator();
		
		while(it2.hasNext()) {
			Entry<String, Snack> entry = it2.next();
			
			String key = entry.getKey();
			Snack value = entry.getValue();
			
			System.out.println("key : " + key + " / value : " + value);
			
		}
		
	}

}
