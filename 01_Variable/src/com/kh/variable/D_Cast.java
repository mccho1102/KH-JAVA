package com.kh.variable;

public class D_Cast {
	// 자동 형변환
	public void rule1() {
		// 값의 범위가 작은데에서 큰곳으로 자동적으로 변환
		
		// int -> double
		int i = 12;
		double d = 3.3;
		
		double result = i + d;
		
		System.out.println("result : " + result);
		
		// int -> long
		int i2 = 2_147_483_647; // int의 최대값
		long l2 = i2 + 1000000000000000L;
		System.out.println("i2 : " + i2);
		System.out.println("L2 : " + l2);
		
		// float -> double
		float f3 = 1.0f;
		float f4 = 3.1231231231235f;
		double d3 = f4;
		
		System.out.println("f3+f4:" + (f3+f4));
		System.out.println("f3+d3:" + (f3+d3));
		
		// long -> float
		long l5 = 12345678910L;
		float f5 = l5;
		
		System.out.println("l5 : " + l5);
		System.out.println("f5 : " + f5);
		
		// char -> int
		char ch6 = 'A';
		int i6 = ch6 + 5;
		System.out.println("i6 : " + i6);
		
		char ch7 = 65;
		System.out.println("ch7 : " + ch7);
		
		// byte, short, int 리터럴
		
		// -128 ~ 127
		byte b8 = 127; // int 리터럴
		byte b9 = 1;
		
		// byte b10 = b8 + b9;
		
		// 바이트 연산 오류 해결방법
		// 1) 결과를 int형으로 받는다
		int i10 = b8 + b9;
				
		// 2) 바이트로 결과를 출력하는 방법
		// -> 강제형변환		
	}
	// 강제 형변환
	public void rule2(){
		// 값의 범위가 큰 자료형 -> 작은 자료형으로 강제적으로 변환
		
		int iNum = 10;
		double dNum = 5.89;
		
		
		// int sum =iNum + dNum;
		
		// 해결방법 1
		// double sum = iNum + dNum;
		// 해결방법 2
		// dNum을 int형으로 형변환
		int sum = iNum + (int)dNum;
		// 10 + (int)5.89
		// 10 + 5
		// 15
		// 해결방법 3
		// iNum + dNum의 결과를 int로 강제 형변환
		sum = (int)(iNum + dNum);
		System.out.println("sum : " + sum);
	}
	
	// 데이터 손실
	public void datalose() {
		int iNum = 290;
		byte bNum = (byte)iNum;
		
		System.out.println("bNum : " + bNum);
	}
	
}
