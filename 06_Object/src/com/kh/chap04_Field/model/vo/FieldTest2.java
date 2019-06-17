package com.kh.chap04_Field.model.vo;

public class FieldTest2 {
	// 필드(Field)
	// - 클래스 영역에 작성하는 변수로
	//   같은 클래스 내 어디서든 사용 가능
	
	// 지역변수
	// - 메소드, 생성자, 제어문 등 클래스 영역이 아닌
	//   특정한 구역( {} ) 내에 생성되는 변수로 
	//   그 구역 내에서만 사용 가능함
	
	private int num;
	
	public void method1() {
		int num2 = 0; // 지역변수
		num = 1;      // 필드
	}
    
	public void method2() {
		num++;
	}
	
	// 필드 세분화
	// 1) 멤버 변수(인스턴스 변수)
	private char ch;
	private double db;
	// 생성과 소멸을 함
	// 생성 : new를 통해 Heap 영역에 객체(인스턴스) 생성 시
	//       메모리에 할당됨
	// 소멸 : 객체 소멸 시
	//       --> 객체가 어떤 참조형 변수에도 참조되지 않을 때
	//           GC(가비지콜렉터)에 의해 소멸됨
	
	// 2) 클래스 변수(static 변수)
	//  - static 예약어가 붙은 변수
	public static int number;
	// 생성 : 프로그램 실행 시 static 메모리 영역에 할당됨
	// 소멸 : 프로그램 종료 시 소멸

	
}
