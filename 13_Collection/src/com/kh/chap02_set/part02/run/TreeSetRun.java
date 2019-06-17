package com.kh.chap02_set.part02.run;

import java.util.Iterator;
import java.util.TreeSet;

import com.kh.chap02_set.part02.mel.vo.Student3;

public class TreeSetRun {
	
	public static void main(String[] args) {
		//TreeSet // ����Ʈ�� -> ����� Ʈ��
		//�ߺ� ���� �ȵ�(Set�� �⺻ Ư¡)
		//����� ���ÿ� ���ĵ�(��ü �⺻ ���� ����)
		
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add(new String("I"));
		ts.add(new String("Am"));
		ts.add(new String("Ironman"));
		ts.add(new String("I"));
		ts.add(new String("Am"));
		ts.add(new String("Steven Logers"));
		
		
		System.out.println(ts);
		
		TreeSet<Student3> ts2 = new TreeSet<>();
		ts2.add(new Student3("���ٿ�",25,95));
		ts2.add(new Student3("�����",23,100));
		ts2.add(new Student3("������",27,5));
		ts2.add(new Student3("���α�",30,90));
		ts2.add(new Student3("���ٿ�",25,95));
		
		//TreeSet�� hashcode()�� equals()�� �ƴ�
		//Comparable ��� �� �������̵� �ϴ�
		//compareTo() �޼ҵ带 �̿��Ͽ� ���� �� �ߺ����Ÿ� ��.
		
		Iterator<Student3> it = ts2.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
