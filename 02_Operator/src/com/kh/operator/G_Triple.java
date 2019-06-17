package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	// 삼항 연산자
	// 조건식 ? 식1 : 식2
	// 식1은 조건식이 true일 때 실행되는 식
	// 식2는 조건식이 false일 때 실행되는 식
	// 조건식에느 주로 비교, 논리 연산자로 이루어진 식이 사용됨
	// --> 식의 결과가 true 또는 false인 식
	public void method1() {
		// 입력받은 정수가 짝수면 "짝수"
		// 홀수면 "홀수" 문자열 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int input = sc.nextInt();
		
		String result = (input % 2 == 0)? "짝수" : "홀수";
		
		System.out.println("입력하신 정수" + input + "은" + result + "입니다.");
	}
	
	public void method2() {
		// 입력받은 정수가 양수이면 "양수"
		// 음수이면 "음수", 0이면 "0" 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력 :");
		int input = sc.nextInt();
		
		String result = (input == 0 ? "0" : (input < 0 ? "음수" : "양수"));
		
		System.out.println("입력하신 정수" + input + "은" + result + "입니다.");
	}
	
	public void method3() {
		// 정수 2개와, '+' or '-' 를 입력받아
		// 정수 2개의 연산결과를 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.println("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine(); // 엔터빼기
		
		System.out.println("연산자 입력(+ or -) : ");
		char op = sc.nextLine().charAt(0);
		
		// +, -,이외의 (*, /, %) --> "잘못입력하였습니다."
		String result = (op == '+') ? (num1 + num2 +"") : 
	           ((op == '-') ? (num1 - num2 +"") : "잘못입력하였습니다.");
		System.out.println(result);
		
	}
}
