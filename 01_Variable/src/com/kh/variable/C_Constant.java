package com.kh.variable;

public class C_Constant {// 상수 테스트
	
	public void testConstant() {
		// 변수, 상수의 차이점
		int age = 20;        //일반변수
		final int AGE = 30;  //상수
		
		System.out.println("[변경전]");
		System.out.println("age : "+ age);
		System.out.println("AGE : "+ AGE);
		
		age = 100;
		// AGE = 50; // 에러 발생, 상수는 값 변경 불가
		
		System.out.println("[변경후]");
		System.out.println("age : "+ age);
		System.out.println("AGE : "+ AGE);
	}

}
