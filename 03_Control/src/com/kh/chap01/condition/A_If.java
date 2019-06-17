package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	// 단독 if문
	/*
	 * if(조건식){
	 *      실행할 코드;
	 * }
	 * 
	 * --> 조건식이 true이면 {}(블럭) 내부 코드 수행
	 * --> 조건식이 false이면 if문을 건너 뜀.
	 * 
	 */
	
	public void method1() {
		// 양수이다/양수가 아니다
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수입력 :");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수다.");
		}
		
		if(num < 0) {
			System.out.println("음수다.");
		}
		
		if(num == 0) {
			System.out.println("영이다.");
		}
	}
	
	public void method2() {
		// 입력받은 수가 짝수 인지 홀수 인지?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력 :");
		int num = sc.nextInt();
		
		if(num % 2 == 0 ) {
			System.out.println("짝수");
		}
		
		if(num % 2 != 0) {
			System.out.println("홀수");
		}
		
	}
	
	public void method3() {
		/* 키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
			이 때 성별이 ‘M’이면 남학생, ‘M’이 아니면 여학생으로 출력 처리 하세요.
			ex.
			이름 : 박신우
			학년(숫자만) : 3
			반(숫자만) : 4
			번호(숫자만) : 15
			성별(M/F) : F
			성적(소수점 아래 둘째자리까지) : 85.75
			3학년 4반 15번 박신우 여학생의 성적은 85.75이다.
		 */
        Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력해 주세요 : ");
		String name = sc.nextLine();
		
		System.out.print("학년을 입력해 주세요 : ");
		int grade = sc.nextInt();
		sc.nextLine();
		System.out.print("반을 입력해 주세요 : ");
		int ban = sc.nextInt();
		sc.nextLine();
		System.out.print("번호를 입력해 주세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.print("성별을 입력해 주세요 : ");
		char sex = sc.nextLine().charAt(0);
		
		String gen = "";
		
		if(sex == 'F') {
			gen = "여학생";
		}
		if(sex == 'M') {
			gen = "남학생";
		}
		if(sex != 'F' && sex != 'M') {
			System.out.println("성별이 잘못 입력되었습니다.");
			gen = "외계인";
		}
			
		System.out.print("성적를 입력해 주세요 : ");
		double jumsu = sc.nextDouble();
		sc.nextLine();
		// 3학년 4반 15번 박신우 여학생의 성적은 85.75이다.
		System.out.println(grade + "학년" + ban + "반" + num + "번" + name + 
				gen + "의 성적은" + jumsu + "이다" );
		// 
	}
	
	public void method4() {
		/* 나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지,
			성인(19세 초과)인지 출력하세요.
			ex.
			나이 : 19
			청소년         */
        Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력해 주세요 : ");
		int age = sc.nextInt();
		
		String str = "";
		if(age <= 13) {
			str = "어린이";
		}
		if(age > 13 && age <= 19) {
			str = "청소년";
		}
		if(age > 19) {
			str = "성인";
		}
		System.out.println("나이 :" + age);
		System.out.println(str);
	}
	
	public void method5() {
		// 입력받은 이름이 본인의 이름이 맞는지 확인하기
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요:");
		String name = sc.nextLine();

		if(name.equals("최창욱")) {
			System.out.println("본인이 맞습니다.");
		}
		if(!name.equals("최창욱")) {
			System.out.println("본인이 아닙니다");
		}
	}
	
}
