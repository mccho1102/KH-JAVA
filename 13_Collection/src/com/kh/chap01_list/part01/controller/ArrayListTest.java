package com.kh.chap01_list.part01.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part01.model.vo.Student;

public class ArrayListTest {
	
	// ArrayList(Collection �� List �� �ڽ� Ŭ����)
	
	ArrayList sList = new ArrayList(3);
	
	//�л� ���� �߰�
	public void addStudent(Student std) {
		
		System.out.println("addStudent() �޼ҵ� ȣ��");
		
		System.out.println(sList.size());
		sList.add(std);
		
	}
	
	public void printStudent() {
		System.out.println("printStudent() �޼ҵ� ȣ��");
		for(int i=0; i<sList.size(); i++) {
				System.out.println(sList.get(i));
		}
	}
	
	public void removeStudent(int index) {
		
		System.out.println("removeStudent() �޼ҵ� ȣ��");
		sList.remove(index);
	}
	

}
