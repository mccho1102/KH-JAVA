package com.kh.chap02_set.part01.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.kh.chap02_set.part01.model.vo.Student2;


public class HashSetRun {
		public static void main(String[] args) {
			//Set
			//���� ������ �������� ����
			// -->index�� �������� ����.
			// �ߺ��� ������ ����.
			
			
			Set<String> hSet = new HashSet<String>();
			//String Ÿ�Ը� ���尡���� HashSet ����
			
			hSet.add(new String("�ȳ��ϼ���"));
			hSet.add(new String("���� �� ��̾��"));
			hSet.add(new String("���ٱ����屹 �Ծ����ϴ�."));
			hSet.add(new String("�̴� �����̾��?"));  // �ߺ� �ȵǴ��� Ȯ��
			hSet.add(new String("�̴� �����̾��?")); 
			
			System.out.println(hSet);
			
			
			//�ζ� ��ȣ ����
			System.out.println("---------�ζ�-------------");
			
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
			
			hSet2.add(new Student2("����ȭ",30,100));
			hSet2.add(new Student2("�����",30,50));
			hSet2.add(new Student2("Ȳ����",26,10));
			hSet2.add(new Student2("����ȭ",30,100));
			
			System.out.println(hSet2);
		
			//Set ��ü���� ������ �ϳ��� �����ϱ�
			//1. Set -> ArrayList�� ��ȯ�Ͽ� �����ϱ� 
			ArrayList<Student2> list = new ArrayList<>(hSet2);
			
			System.out.println("\nArrayList�� ��ȯ�Ͽ� ����");
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));
			}
			
			System.out.println("���� for������ ����");
			//2. for-each �� (���� for��) ���� ����
			for(Student2 std2 : hSet2) {
				System.out.println(std2);
			}
			
			//3. Iterator �ݺ��ڸ� �̿��Ͽ� ����
			//  -> �÷��� ��ü ���ٽ� ���Ǵ� �ݺ�������
			Iterator<Student2> it = hSet2.iterator();
			
			System.out.println("Iterator�� �̿��� ����");
			while(it.hasNext()){
				// hasNext() : ������ ������ ���� ������ true ������ false ��ȯ
				
				//next() : �÷��� ��ü�� �ϳ��� ����
				System.out.println(it.next());
			}
			
			
		}
		
}
