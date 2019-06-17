package com.kh.chap01_list.part02.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part02.model.vo.Music;

public class Run {
	public static void main(String[] args) {
		//Arraylist ����
		//�÷����� � Ÿ���� ��ü�� ���� ����
		ArrayList exList = new ArrayList();
		
		
		exList.add(new Music());
		exList.add("asd");
		exList.add(1);  //int-> Integer :  Auto boxing 
		
		//� Ÿ���̵� ����� 
		//���� �� �� Ÿ�԰˻縦 �ؾߵȴٴ� �������� �߻�
		
		//�̸� �ذ��ϱ� ���ؼ�
		//�÷��ǿ� �����ϴ� ��ü�� Ÿ���� ���ʿ� �����ϴ� ����� ����
		
		/* ���׸���(Generics) (<>)
		 * - Ŭ����, �޼ҵ�, �÷��� ���ο��� ���Ǵ� Ÿ����
		 *   �� ������ Ÿ������ �����ϴ� ���.
		 *   
		 * - �÷��ǿ� ���� Ÿ���� ����� ���
		 *   -> ���� ������ ��� �� ���� Ÿ��üũ, ����ȯ �ʿ�
		 *   
		 * - ���׸����� Ÿ�� ���� �� 
		 * 	-> ���� �����Ͱ� �� ���� Ÿ���̹Ƿ�
		 * 		������ Ÿ��üũ, ����ȯ�� �ʿ� ����. -> ���~ 
		 * 
		 *  * ���׸��� ��� ���� :  Ÿ��üũ
		 *  									-> ������ �ܰ迡�� �����ϰ� üũ��
		 *  
		 *  --> ��Ŭ������ �ڵ� �ۼ� �� �� �ڸ����� ������ �������� ������
		 *    --> ���׸����� ����� �÷��ǿ� �ٸ� Ÿ�� ���� �� 
		 *          �ٷ� ���� ���!
		 * 
		 * 
		 */
		
		//������
		List<Music> list = new ArrayList<Music>(3);
		//Music ��ü�� ������ �� �ִ� ArrayList 3ĭ¥�� ����
		
		
		
		//����Ʈ ���� ���� ��ȸ
		System.out.println(list.toString());
		
		//1. add(E e) : ����Ʈ�� ���κп� �ν��Ͻ� �����͸� �߰�
		
		list.add(new Music("������","�����"));
		list.add(new Music("��������","��â��"));
		list.add(new Music("����","������"));
		//�ʱ⼳�� ũ�� 3�ʰ��� �˾Ƽ� ArrayList ũ�� ������
		
		//add ��� ���
		
		//2. add(int index, E e)
		
		list.add(2, new Music("�뷡�濡��","�����"));
		
		System.out.println(list);
		
		//3. set(int index , E e)
		//�ش� �ε����� ��ü�� ����
		
		list.set(1, new Music("���� �޴�","��������"));
		
		System.out.println(list);
		
		//4. remove(int index, E e)
		
		list.remove(1);
		
		System.out.println(list);
		
		//5. size() :  ����Ʈ ���ο� ����Ǿ��ִ� ��ü ���� ��ȯ
		System.out.println(list.size());
		
		//6. get(int index) : �ش� �ε����� ��ü�� ����
		System.out.println(list.get(2));
		
		//7. subList(int index1,int index2) : ����Ʈ �κ� ����
		System.out.println(list.subList(0,2));
		
		//���� ����Ʈ �߶� ���� ����Ʈ ��밡��
		List<Music> sub = list.subList(0,2);
		
		//8.addAll(Collection c) : �÷����� ���ʿ� ��°�� �߰�
		list.addAll(sub);
		System.out.println(list);
		
		//9.isEmpty() :  �÷����� ����ִ��� Ȯ���ϴ� �޼ҵ�
		//������� true ������� ������ false
		System.out.println(list.isEmpty());
		
		//10. clear() : �÷����� ������ �������
		list.clear();
		System.out.println(list.isEmpty());
		System.out.println(list);

	}

}
