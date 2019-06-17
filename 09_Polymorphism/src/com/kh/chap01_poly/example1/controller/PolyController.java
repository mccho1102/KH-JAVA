package com.kh.chap01_poly.example1.controller;

import com.kh.chap01_poly.example1.model.vo.Child1;
import com.kh.chap01_poly.example1.model.vo.Child2;
import com.kh.chap01_poly.example1.model.vo.Parent;

public class PolyController {

	// 다형성
	// 부모타입의 참조형 변수로
	// 부모에게서 파생된 여러 자식 타입의 객체를 참조할 수 있는 기술
	
	public void method() {
		// 1. 부모 타입 참조형 변수(레퍼런스)로 부모 객체를 다룰때
		System.out.println("1. 부모 타입 참조형변수(레퍼런스)로 부모객체를 다룰때");
		
		Parent p1 = new Parent();
		// 부모 참조 변수 = 부모 객체
		p1.printParent();
		
		System.out.println();
		
		// 2. 자식 타입 참조형 변수(레퍼런스)로 부모 객체를 다룰때
		System.out.println("2. 자식 타입 참조형변수(레퍼런스)로 부모객체를 다룰때");
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		
		c1.printParent();
		c1.printChild1();
		
		c2.printParent();
		c2.printChild2();
		
		// 3. 부모 타입 참조형 변수로 자식 객체를 다룰때
		System.out.println("3. 부모 타입 참조형 변수로 자식 객체를 다룰때");
		Parent p2 = new Child1();
		Parent p3 = new Child2(); // 다형성이 적용된 형태
		// 부모 참조 변수 = 자식 객체
		
		// 업 캐스팅(Up-Casting)
		// - 부모 타입의 참조형 변수가 모든 자식 객체를 참조할 수 있는 것
		// - 형변환 생략 가능(자동 형변환)
		// - 단, 부모 참조변수로 참조 가능한  자식 객체 멤버는
		//   상속받은 부모의 멤버만 가능
		
		p2.printParent();
		//p2.printChild1(); // 부모 참조 변수로는 자식 멤버 접근 불가
		
		p3.printParent();
		//p3.printChild2(); // 부모 참조 변수로는 자식 멤버 접근 불가
		
		// 다운 캐스팅(Down-Casting)
		// - 부모 타입의 참조형 변수를 자식 타입으로 강제 형변환
		// - 다운 캐스팅시 부모 타입 참조 변수로 자식 멤버 참조 가능
		
		System.out.println("다운 캐스팅 적용");
		((Child1)p2).printChild1();
		((Child2)p3).printChild2();
		
		// 4. 자식 타입 참조형 변수로 부모 타입 개체를 다룰때
		// Child1 c3 = new Parent();
		// 자식 참조 변수는 부모 객체를 받을 수 없음
		
		// 부모 객체를 자식 객체로 강제 형변환(다운 캐스팅) 한다면?
		Child1 c3 = (Child1)(new Parent());
		c3.printChild1();
		// 런타임 에러 : 컴파일 에러는 없지만 프로그램 실행중 발생한 에러
		// ClassCastException : 자료형이 일치하지 않는 경우 발생하는 런타임 에러
	}
}
