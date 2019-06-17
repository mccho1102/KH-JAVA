package com.kh.chap01_list.part01.controller;

import com.kh.chap01_list.part01.model.vo.Student;

public class ObjectArrayTest {
	
	// 객체 배열을 이용하여
	// Student 객체를 관리하는 프로그램
	
	
	private Student[] sList =  new Student[3]; //초기 길이 3
	private int size = 0;  //객체 배열의 현재 인덱스 및 저장 요소 수 관리용
	
	//객체배열에 데이터 추가
	public void addStudent(Student std) {
		System.out.println("addStudent() 메소드 호출");
		
		//현재 가르키는 인덱스가 배열 길이보다 작을 경우
		if(size < sList.length) {
			sList[size] = std;  //매개변수로 전달된 Student 객체를
										// sList에 순서대로 저장
			size++;
		}else {
			//기존배열의 길이를 넘어서는 경우
			//배열의 길이를 두배로 증가 시켜 데이터 저장
			Student[] newList = new Student[sList.length*2];
			System.out.println("배열 크기 증가 : " + newList.length);
			
			
			//기존 배열의 데이터를 새로운 배열에 복사
			System.arraycopy(sList, 0, newList, 0, sList.length);
			
			//새로 입력된 데이터 삽입
			newList[size] = std;
			size++;
			sList = newList;
			
			
		}
		
	}

	
	//객체 배열에 저장된 모든 데이터 출력
	public void printStudent() {
		System.out.println("printStudent() 메소드 호출중");
		
		for(int i=0; i<sList.length; i++) {
			
			if(sList[i] !=null)
			System.out.println(sList[i]);
		}
	}
	
	//매개 변수로 전달받은 인덱스의 student 객체를 삭제하고
	//배열 중간에 공백이 없도록 뒤쪽값 당겨주기
	public void removeStudent(int index) {
		
		System.out.println("removeStudent() 메소드 호출");
		
		for(int i=index; i<sList.length-1; i++) {
			
			
			sList[i] = sList[i+1];
	
			  if(i == sList.length-2) {
			 
				sList[sList.length-2] = null;
			}
		
	
		}
	}
	
	
}
