package com.kh.chap01.condition;

import java.util.Scanner;

public class C_Switch {
	// switch문
	/*
	 * switch(동등 비교 대상자){
	 * case 값1 : 실행코드1; break;
	 * case 값2 : 실행코드2; break;
	 * case 값3 : 실행코드3; break;
	 * ...
	 * default : 실행코드4;
	 * }
	 */
	
	public void method1() {
		// 1~3의 정수를 입력받아
		// 1이면 "빨간색"
		// 2이면 "파란색"
		// 3이면 "초록색"
		// 이외의 숫자는 "잘못입력하셨습니다."

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		switch(num){
		 case 1 : System.out.println("빨간색"); break;
		 case 2 : System.out.println("파란색"); break;
		 case 3 : System.out.println("초록색"); break;
		 default : System.out.println("잘못 입력하였습니다.");
		  }
	}
	
	public void method2() {
		// 과일명을 입력받으면 해당 과일 가격 출력
		// 사과 - 1000원
		// 바나나 - 3000원
		// 복숭아 - 2000원
		// 한라봉 - 5000원
		
		Scanner sc = new Scanner(System.in);
		System.out.print("과일을 입력하세요 : ");
		String fruit = sc.nextLine();
		
		int price = 0;
		
		switch(fruit) {
		case "사과" : price = 1000; break;
		case "바나나" : price = 3000; break;
		case "복숭아" : price = 2000; break;
		case "한라봉" : price = 5000; break;
		}
		
		if(price != 0) {
		    System.out.print(fruit + "의 가격은 " + price + "원 입니다.");
		}else {
			System.out.println("잘못 입력하였습니다.");
		}
	}
	
	
	public void method3() {
		// 등급별 권한 부여하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등급을 입력하세요(1,2,3): ");
		int level = sc.nextInt();
		
		// level 1 : 관리, 쓰기, 읽기
		// level 2 :       쓰기, 읽기
		// level 3 :            읽기
		
		switch(level) {
		case 1 : System.out.print("관리");
		case 2 : System.out.print("쓰기"); 
		case 3 : System.out.print("읽기"); break;
		default : System.out.print("잘못 입력하셨습니다.");
		}
	}
	 
}


