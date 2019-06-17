package com.kh.chap01_list.part01.controller;

import com.kh.chap01_list.part01.model.vo.Student;

public class ObjectArrayTest {
	
	// ��ü �迭�� �̿��Ͽ�
	// Student ��ü�� �����ϴ� ���α׷�
	
	
	private Student[] sList =  new Student[3]; //�ʱ� ���� 3
	private int size = 0;  //��ü �迭�� ���� �ε��� �� ���� ��� �� ������
	
	//��ü�迭�� ������ �߰�
	public void addStudent(Student std) {
		System.out.println("addStudent() �޼ҵ� ȣ��");
		
		//���� ����Ű�� �ε����� �迭 ���̺��� ���� ���
		if(size < sList.length) {
			sList[size] = std;  //�Ű������� ���޵� Student ��ü��
										// sList�� ������� ����
			size++;
		}else {
			//�����迭�� ���̸� �Ѿ�� ���
			//�迭�� ���̸� �ι�� ���� ���� ������ ����
			Student[] newList = new Student[sList.length*2];
			System.out.println("�迭 ũ�� ���� : " + newList.length);
			
			
			//���� �迭�� �����͸� ���ο� �迭�� ����
			System.arraycopy(sList, 0, newList, 0, sList.length);
			
			//���� �Էµ� ������ ����
			newList[size] = std;
			size++;
			sList = newList;
			
			
		}
		
	}

	
	//��ü �迭�� ����� ��� ������ ���
	public void printStudent() {
		System.out.println("printStudent() �޼ҵ� ȣ����");
		
		for(int i=0; i<sList.length; i++) {
			
			if(sList[i] !=null)
			System.out.println(sList[i]);
		}
	}
	
	//�Ű� ������ ���޹��� �ε����� student ��ü�� �����ϰ�
	//�迭 �߰��� ������ ������ ���ʰ� ����ֱ�
	public void removeStudent(int index) {
		
		System.out.println("removeStudent() �޼ҵ� ȣ��");
		
		for(int i=index; i<sList.length-1; i++) {
			
			
			sList[i] = sList[i+1];
	
			  if(i == sList.length-2) {
			 
				sList[sList.length-2] = null;
			}
		
	
		}
	}
	
	
}
