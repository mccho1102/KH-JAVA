package com.kh.chap01_list.part01.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part01.model.vo.Student;

public class ArrayListTest {
	
	// ArrayList(Collection 중 List 의 자식 클래스)
	
	ArrayList sList = new ArrayList(3);
	
	//학생 정보 추가
	public void addStudent(Student std) {
		
		System.out.println("addStudent() 메소드 호출");
		
		System.out.println(sList.size());
		sList.add(std);
		
	}
	
	public void printStudent() {
		System.out.println("printStudent() 메소드 호출");
		for(int i=0; i<sList.size(); i++) {
				System.out.println(sList.get(i));
		}
	}
	
	public void removeStudent(int index) {
		
		System.out.println("removeStudent() 메소드 호출");
		sList.remove(index);
	}
	

}
