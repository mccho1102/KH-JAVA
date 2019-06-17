package com.kh.chap01_list.part01.run;

import com.kh.chap01_list.part01.controller.ArrayListTest;
import com.kh.chap01_list.part01.controller.ObjectArrayTest;
import com.kh.chap01_list.part01.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		//ObjectArrayTest lt = new ObjectArrayTest();
		ArrayListTest lt = new ArrayListTest();
		lt.addStudent(new Student("홍길동",100));
		lt.addStudent(new Student("김영식",60));
		lt.addStudent(new Student("박철수",30));
		lt.addStudent(new Student("김지수",80));
		lt.addStudent(new Student("박재훈",30));
		lt.addStudent(new Student("다미",90));
		lt.addStudent(new Student("다란이",50));
		
		System.out.println("------------------------------------");
		
		lt.printStudent();
		lt.removeStudent(3);
		lt.printStudent();
		
		//lt.printStudent();
		//lt.removeStudent(3);
		//lt.printStudent();
	}

}

//컬렉션 (Collection)
/*
 *-컬렉션이란 : 자료구조가 저장되어 있는 클래스로
 *						자바에서 제공하는 자료구조 담당 프레임워크
 *
 *				->자료구조 :  자료에 대한 처리를 효율적으로 수행 할 수 있도록
 *									자료를 구분하여 표현한 것
 *				-> 프레임워크 : 데이터나 기능을 다루기 쉽게 제공하는 틀
 * 	기존에는 배열을 이용해서 데이터 처리, 관리를 했으나
 * 	배열의 문제점으로 인하여 컬렉션이 탄생함.
 * 
 * - 배열의 문제점
 *   1)한번 크기를 지정하면 변경이 어렵다
 *   		--> 새로운 배열을 생성하여 기존 배열 내용을 복사
 *   2)배열 중간에 데이터 삽입,삭제가 어려움
 *   3)배열은 한가지 타입만 저장 가능.
 *   
 *   이를 보완한 것 -> 컬렉션
 *   
 *   
 *   -컬렉션 장점
 *   1) 초기 크기, 저장 가능한 크기의 제약이 없다.
 *   ->자동으로 저장공간이 늘었다 줄었다 함
 *   2) 중간에 값을 삽입,삭제 하는 알고리즘이 내장되어 있어 
 *   		쉽게 처리 가능.
 *   3)타입에 제약이 없음(여러타입 저장 가능) -> 객체만 저장.
 *   	-> 단,  기본자료형을 저장하고 싶을 땐 Wrapper Class로 변환
 * 

 * 
 */
