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
		
		hm.put("초코과자",new Snack("크런키", 1000, 190));
		hm.put("아저씨과자",new Snack("오징어땅콩", 1500, 450));
		hm.put("비싼과자",new Snack("홈런볼", 2000, 300));
		hm.put("이상한과자",new Snack("바나나킥", 1400, 250));
		
		System.out.println(hm);
		//Map 저장 시 순서 유지 안됨
		//저장 시 key == value 형태로 저장됨
		//Map의 key 부분은 Set의 특징을 가짐.
		//key값은 중복을 허용하지않음.
		// -> 만약 key값 중복 시 value가 덮어씌워짐.
		hm.put("아저씨과자",new Snack("맛동산",2500,500));
		
		System.out.println(hm);
		
		//Map의 Value는 List의 특징을 가진다.
		//중복을 허용한다.
		
		hm.put("이상한과자",new Snack("홈런볼", 2000, 300));
		
		System.out.println(hm);
		
		//2.get(key) : key값과 쌍으로 저장된 value를 반환
		System.out.println(hm.get("이상한과자"));
		System.out.println(hm.get("아저씨과자"));
		
		//3. replace(Key,value) : 해당 key의 value를 변경
		hm.replace("아저씨과자", new Snack("국희땅콩샌드",2000,300));
		System.out.println(hm.get("아저씨과자"));
		
		//4. remove(key)
		hm.remove("아저씨과자");
		System.out.println(hm);
		
		//Map 저장 데이터에 순차적으로 접근하는 방법
		//1. keySet 을 이용하여 Map의 key값만을 뽑아 
		//			Set 형태로 변경 -> Iterator로 접근 
		Set<String> ks = hm.keySet();  //key값만 담긴 set 생성
		Iterator<String> it = ks.iterator();
		
		while(it.hasNext()) {
			String key =it.next();
			System.out.println("key : " + key + " / value : " + hm.get(key));
		}
		
		System.out.println();
		
		//2. entrySet()
		//Map.Entry<K,V> : Map 내부에 존재하는 인터페이스
		
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
