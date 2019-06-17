package com.kh.chap01_list.part01.run;

import com.kh.chap01_list.part01.controller.ArrayListTest;
import com.kh.chap01_list.part01.controller.ObjectArrayTest;
import com.kh.chap01_list.part01.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		//ObjectArrayTest lt = new ObjectArrayTest();
		ArrayListTest lt = new ArrayListTest();
		lt.addStudent(new Student("ȫ�浿",100));
		lt.addStudent(new Student("�迵��",60));
		lt.addStudent(new Student("��ö��",30));
		lt.addStudent(new Student("������",80));
		lt.addStudent(new Student("������",30));
		lt.addStudent(new Student("�ٹ�",90));
		lt.addStudent(new Student("�ٶ���",50));
		
		System.out.println("------------------------------------");
		
		lt.printStudent();
		lt.removeStudent(3);
		lt.printStudent();
		
		//lt.printStudent();
		//lt.removeStudent(3);
		//lt.printStudent();
	}

}

//�÷��� (Collection)
/*
 *-�÷����̶� : �ڷᱸ���� ����Ǿ� �ִ� Ŭ������
 *						�ڹٿ��� �����ϴ� �ڷᱸ�� ��� �����ӿ�ũ
 *
 *				->�ڷᱸ�� :  �ڷῡ ���� ó���� ȿ�������� ���� �� �� �ֵ���
 *									�ڷḦ �����Ͽ� ǥ���� ��
 *				-> �����ӿ�ũ : �����ͳ� ����� �ٷ�� ���� �����ϴ� Ʋ
 * 	�������� �迭�� �̿��ؼ� ������ ó��, ������ ������
 * 	�迭�� ���������� ���Ͽ� �÷����� ź����.
 * 
 * - �迭�� ������
 *   1)�ѹ� ũ�⸦ �����ϸ� ������ ��ƴ�
 *   		--> ���ο� �迭�� �����Ͽ� ���� �迭 ������ ����
 *   2)�迭 �߰��� ������ ����,������ �����
 *   3)�迭�� �Ѱ��� Ÿ�Ը� ���� ����.
 *   
 *   �̸� ������ �� -> �÷���
 *   
 *   
 *   -�÷��� ����
 *   1) �ʱ� ũ��, ���� ������ ũ���� ������ ����.
 *   ->�ڵ����� ��������� �þ��� �پ��� ��
 *   2) �߰��� ���� ����,���� �ϴ� �˰����� ����Ǿ� �־� 
 *   		���� ó�� ����.
 *   3)Ÿ�Կ� ������ ����(����Ÿ�� ���� ����) -> ��ü�� ����.
 *   	-> ��,  �⺻�ڷ����� �����ϰ� ���� �� Wrapper Class�� ��ȯ
 * 

 * 
 */
