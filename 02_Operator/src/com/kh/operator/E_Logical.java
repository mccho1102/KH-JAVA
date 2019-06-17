package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	// 논리 연산자
	// - 두 개의 논리 값을 비교하는 연산자
	// && (AND) : 그리고, ~이고, ~면서
	// || (OR)  : 또는, ~거나
	
	public void method1() {
		// 입력받은 숫자가 1이상이고 100 미만 인 경우 true;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		boolean isTrue = (input >= 1) && (input <= 100);
		System.out.println("범위 안에 값이 맞습니까?" + isTrue);
	}
	
	public void method2() {
		// 입력받은 문자(한 글자)가 영어 대문자인지 확인하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 입력 : ");
		char input = sc.nextLine().charAt(0);
		
		boolean isTrue = (input >= 'A') && (input <= 'Z');
		
		System.out.println("영어 대문자가 맞습니까? " + isTrue);
		
	}
	
	public void method3() {
		// 논리A && 논리B
		// --> 논리 A가 false면 뒤를 생각 안함
		// --> 논리 B의 식을 실행하지 말아라
		
		// 논리A || 논리B
		// --> 논리 A가 true이면 뒤를 생각 안함
		// --> 논리 B의 식을 실행하지 말아라
		
		int num = 10;
		
		boolean bool = false && (++num > 0);
		System.out.println("num : " + num);
		
		bool = true && (++num < 0);
		System.out.println("num : " + num);
		
		bool = true || (++num < 0);
		System.out.println("num : " + num);	
		
		bool = false || (++num > 0);
		System.out.println("num : " + num);
		
	}
	
	public void method4() {
		// 증감 + 산술 + 비교 + 논리
	
		int a = 2;
		int b = 3;
			
		boolean c = a > b;             // c:false  a:2, b:3
		boolean d = ++a <= b++;        // d:false  a:3, b:3->4

		System.out.println("a : " +a); // a:3
		System.out.println("b : " +b); // b:4
		System.out.println("c : " +c); // c:false
		System.out.println("d : " +d); // d:true
			
		System.out.println();
			
		System.out.println("!c : " + !c);           // !c:true
		System.out.println("c != d : " + (c != d)); // c != d : true
			
		System.out.println();
			
		System.out.println("(a % b) == 1 : " + ((a % b) == 1)); // false
		System.out.println("(a == 3) && (b == 4) : " + ((a == 3) && (b == 4))); //true
		System.out.println("!d || (a-b) > 0 : " + (!d || (a-b) > 0)); // false
			
		System.out.println();
			
		System.out.println("!(c == d) && ((a * b == 10) || ( b % 2 == 0)) : " + (!(c == d) && ((a * b == 10) || ( b % 2 == 0))));
		                  // true          true
		                           // true
		
		
		
	}		
}
