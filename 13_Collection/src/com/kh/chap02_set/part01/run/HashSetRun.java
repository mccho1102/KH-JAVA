package com.kh.chap02_set.part01.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.kh.chap02_set.part01.model.vo.Student2;


public class HashSetRun {
		public static void main(String[] args) {
			//Set
			//저장 순서를 유지하지 않음
			// -->index로 구분하지 않음.
			// 중복값 허용되지 않음.
			
			
			Set<String> hSet = new HashSet<String>();
			//String 타입만 저장가능한 HashSet 생성
			
			hSet.add(new String("안녕하세요"));
			hSet.add(new String("점심 뭐 드셨어요"));
			hSet.add(new String("뼈다귀해장국 먹었습니다."));
			hSet.add(new String("이는 닦으셨어요?"));  // 중복 안되는지 확인
			hSet.add(new String("이는 닦으셨어요?")); 
			
			System.out.println(hSet);
			
			
			//로또 번호 생성
			System.out.println("---------로또-------------");
			
			int count = 0;
			Set<Integer> lotto = new HashSet<Integer>();
			while(true)
			{
				
				//int ->Integer Auto boxing
				int ran = (int)(Math.random()*46) + 1;
				lotto.add(ran);
			
				if(lotto.size() == 6) {
					break;
				}
				
			}
			System.out.println(lotto);
			
			Set<Student2> hSet2 = new HashSet<Student2>();
			
			hSet2.add(new Student2("정승화",30,100));
			hSet2.add(new Student2("박재식",30,50));
			hSet2.add(new Student2("황종인",26,10));
			hSet2.add(new Student2("정승화",30,100));
			
			System.out.println(hSet2);
		
			//Set 객체에서 데이터 하나씩 접근하기
			//1. Set -> ArrayList로 변환하여 접근하기 
			ArrayList<Student2> list = new ArrayList<>(hSet2);
			
			System.out.println("\nArrayList로 변환하여 접근");
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));
			}
			
			System.out.println("향상된 for문으로 접근");
			//2. for-each 문 (향상된 for문) 으로 접근
			for(Student2 std2 : hSet2) {
				System.out.println(std2);
			}
			
			//3. Iterator 반복자를 이용하여 접근
			//  -> 컬렉션 객체 접근시 사용되는 반복접근자
			Iterator<Student2> it = hSet2.iterator();
			
			System.out.println("Iterator를 이용한 접근");
			while(it.hasNext()){
				// hasNext() : 다음에 접근할 값이 있으면 true 없으면 false 반환
				
				//next() : 컬렉션 객체에 하나씩 접근
				System.out.println(it.next());
			}
			
			
		}
		
}
