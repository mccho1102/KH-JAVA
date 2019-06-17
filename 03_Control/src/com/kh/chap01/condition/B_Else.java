package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {
    // if - else 문 : 조건이 두개인 경우(T/F) 사용
	/*
	 * if(조건식){
	 *    실행코드1; 
	 * } else {
	 *    실행코드2;
	 * }
	 * 
	 * --> 조건식이 true인 경우 if문 내부에 있는 실행코드 1 수행
	 * --> 조건식이 false인 경우 else문 내부에 있는데 실행코드2 수행
	 * 
	 */
	
	// if - else if - else : 조건이 세개 이상인 경우 사용
	/*
	 * if(조건식1){
	 *      실행코드1;
	 * } else if(조건식2){     
	 *      실행코드2;
	 * } else {
	 *      실행코드3;
	 * }
	 * 
	 * --> 조건식1 == true인 경우, 실행코드1 실행
	 * --> 조건식1 == false인 경우, 
	 *     --> 조건식2 T/F 확인
	 *     --> 조건식2 == true인 경우, 실행코드2 실행
	 *     
	 * --> 모든 조건식이 false 인 경우, 실행코드3 실행
	 *     
	 */
	
	public void method1() {
		// 짝수, 홀수
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력:");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
	}
	
	public void method2() {
		// 양수, 음수, 0
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수");
		}else if(num == 0){
			System.out.println("영");
		}else {
			System.out.println("음수");
		}
		
	}
	
	public void method3() {
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
		}else if(age <= 19) {
			str = "청소년";
		}else  {
			str = "성인";
		}
		System.out.println("나이 :" + age);
		System.out.println(str);
	}
	
	public void method4() {
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
		}else if(sex == 'M') {
			gen = "남학생";
		}else {
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
	
	public void method5() {
		// 입력받은 이름이 본인의 이름이 맞는지 확인하기
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요:");
		String name = sc.nextLine();

		if(name.equals("최창욱")) {
			System.out.println("본인이 맞습니다.");
		}else {
			System.out.println("본인이 아닙니다");
		}
	}
	
	public void method6() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 월을 넣어 주세요");
		int month = sc.nextInt();
		String season = "";
		
		if(month == 1 || month == 2 || month == 12) {
			season = "겨울";
		}else if(month >= 3 && month <= 5) {
			season = "봄";
		}else if(month >= 6 && month <= 8) {
			season = "여름";
		}else if(month >= 9 && month <= 11) {
			season = "가을";
		}else {
			season = "해당하는 계절이 없습니다.";
		}
		
		System.out.print(month + "월은 " + season + "입니다.");
	}
	
	public void method7() {
		// 점수를 하나 입력받아 등급을 나눠 점수와 등급을 출력하는 메소드
		// 90점 이상은 A등급
		// 90점 미만 80점 이상은 B등급
		// 80점 미만 70점 이상은 C등급
		// 70점 미만 60점 이상은 D등급
		// 60점 미만은 F등급
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력해 주세요");
		int jumsu = sc.nextInt();
		String grade = "";
		
		if(jumsu <= 100 && jumsu >= 90 ) {
			grade = "A등급";
		}else if(jumsu < 90 && jumsu >= 80) {
			grade = "B등급";	
		}else if(jumsu < 80 && jumsu >= 70) {
			grade = "C등급";	
		}else if(jumsu < 70 && jumsu >= 60) {
			grade = "D등급";	
		}else {
			grade = "F등급";
		}
		
		System.out.print(jumsu + "는 " + grade + "입니다.");
	}
	
	public void method8() {
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
		System.out.print("성적를 입력해 주세요 : ");
		double jumsu = sc.nextDouble();
		sc.nextLine();
		System.out.print("성별을 입력해 주세요 : ");
		char sex = sc.nextLine().charAt(0);
		
		// 성별을 알맞게 입력한 경우
		if(sex == 'M' || sex == 'F') {
			String gen = "";
			if(sex == 'F') {
				gen = "여학생";
			}else if(sex == 'M') {
				gen = "남학생";
			}else {
				System.out.println("성별이 잘못 입력되었습니다.");
				gen = "외계인";
			}
			
			
			// 3학년 4반 15번 박신우 여학생의 성적은 85.75이다.
			System.out.println(grade + "학년" + ban + "반" + num + "번" + name + 
					gen + "의 성적은" + jumsu + "이다" );
		 
		}
		
		// 성별을 잘못 입력한 경우
		else {
			System.out.println("성별을 잘못 입력하셨습니다.");
		}
		
	}
	
}
