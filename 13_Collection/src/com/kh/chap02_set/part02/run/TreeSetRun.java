package com.kh.chap02_set.part02.run;

import java.util.Iterator;
import java.util.TreeSet;

import com.kh.chap02_set.part02.mel.vo.Student3;

public class TreeSetRun {
	
	public static void main(String[] args) {
		//TreeSet // 이진트리 -> 레드블랙 트리
		//중복 저장 안됨(Set의 기본 특징)
		//저장과 동시에 정렬됨(객체 기본 정렬 기준)
		
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add(new String("I"));
		ts.add(new String("Am"));
		ts.add(new String("Ironman"));
		ts.add(new String("I"));
		ts.add(new String("Am"));
		ts.add(new String("Steven Logers"));
		
		
		System.out.println(ts);
		
		TreeSet<Student3> ts2 = new TreeSet<>();
		ts2.add(new Student3("정다운",25,95));
		ts2.add(new Student3("김샛별",23,100));
		ts2.add(new Student3("박현진",27,5));
		ts2.add(new Student3("선인규",30,90));
		ts2.add(new Student3("정다운",25,95));
		
		//TreeSet은 hashcode()나 equals()가 아닌
		//Comparable 상속 후 오버라이딩 하는
		//compareTo() 메소드를 이용하여 정렬 및 중복제거를 함.
		
		Iterator<Student3> it = ts2.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
