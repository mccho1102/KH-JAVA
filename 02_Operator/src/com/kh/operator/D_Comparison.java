package com.kh.operator;

import java.util.Scanner;

public class D_Comparison {
	// 비교 연산자
	// 두 항의 값을 비교하는 연산자(관계연산자 라고도 함)
	
	// a < b --> a 가 b 미만인가?
	// a > b --> a 가 b 초과인가?
	// a == b --> a 가 b와 같은가?
	// a != b --> a 가 b와 같지 않은가?
	// a <= b --> a 가 b 이하인가?
	// a >= b --> a 가 b 이상인가?
	
	public void method1() {
		int a = 10;
		int b = 25;
		
		System.out.println(a==b); // 0
		System.out.println(a!=b); // 1
		System.out.println(a>b);  // 0
		System.out.println(a<b);  // 1 
		System.out.println(a>=b); // 0
		System.out.println(a<=b); // 0
	}
	
	public void method2() {
		// 입력받은 수가 짝수인지 홀수인지 검사하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력 : ");
		int input = sc.nextInt();
		
		System.out.println("짝수가 맞습니까?" + ((input % 2) == 0));
	}
}
