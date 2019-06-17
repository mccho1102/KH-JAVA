package com.kh.chap07_method.controller;

import java.util.Scanner;

public class NonStaticMethod {
	
	// 매개변수, 반환형 유무에 따른 구분
	
	// 1. 매개변수 X, 반환형 X 없는 메소드
	public void method1() {
		// 순수히 메소드 내부의 기능만 수행하고 종료할 때 사용
		System.out.println("매개변수와 반환값이 둘다 없는 메소드");

		return; // 반환형 void 일 시  JVM이 컴파일 시 return;을 자동으로 추가
	}
    
	// 2. 매개변수 X, 반환형 O 메소드
	public String method2() {
		String str = "매개변수가 없지만 반환값이 있는 메소드";
		return str;
	}
	
	public String method2_1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해 주세요: ");
		String name = sc.nextLine();
		return name;

	}
	
	// 3. 매개변수 O, 반환값 X
	public void method3(int num1, int num2) {
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
		
	}
	
	// 4. 매개변수 O, 반환값 O
	public String method4(int num1, int num2) {
		return num1 + "+" + num2 + "=" + (num1 + num2) + "입니다.";
	}
	
	// 5. 배열
	public int[] method5(int index) {
		// 인덱스를 전달받아
		// 인덱스 크기 만큼의 배열을 생성 후
		// 각 요소에 난수를 초기화 하여 반환
		int[] arr = new int[index];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * index) +1;
		}
	
		return arr;  // 생성된 배열의 주소를 반환
		
	}
}
