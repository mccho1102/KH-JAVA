package com.kh.practice1;

import java.util.Scanner;

public class VariablePractice1 {
	// 실습문제1
	// 이름, 성별, 나이, 키를 사용자에게 입력 받아
	// 각각의 값을 변수에 담고 출력하세요
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("성별: ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("나이: ");
		int age = sc.nextInt();
		System.out.print("키: ");
		double height = sc.nextDouble();
		
		System.out.println(name + "님의 성별은 " 
		          + gender + "자 이고, 나이는 "
		          + age + "이며, 키는"
		          + height + "cm 입니다.");
		
	}
	
	// 실습문제2
	// 키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.
	/* ex.
	    첫 번째 정수 : 23
	    두 번째 정수 : 7
	    더하기 결과 : 30
	    빼기 결과 : 16
	     곱하기 결과 : 161
	    나누기 몫 결과 : 3  
	*/    
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수: ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수: ");
		int num2 = sc.nextInt();
		
		int plus = num1 + num2;
		int minus = num1 - num2;
		int mult  = num1 * num2;
		int nanugi = num1 / num2;
		
		System.out.println("더하기 결과 : " + plus);
		System.out.println("빼기 결과 : " + minus);
		System.out.println("곱하기 결과 : " + mult);
		System.out.println("나누기 결과 : " + nanugi);
	}
	
	/*키보드로 가로, 세로 값을 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
	   계산 공식 ) 면적 : 가로 * 세로
	   둘레 : (가로 + 세로) * 2
		ex.
		가로 : 13.5
		세로 : 41.7
		면적 : 562.95
		둘레 : 110.4
	*/	
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 값 : ");
		double num1 = sc.nextDouble();
		System.out.print("세로 값 : ");
		double num2 = sc.nextDouble();
		
		double menjuk = num1 * num2;
		double dule = (num1 + num2) * 2;
		
		
		System.out.println("가로 : " + num1);
		System.out.println("세로 : " + num2);
		System.out.println("면적 : " + menjuk);
		System.out.println("둘레 : " + dule);
	}
	
	/* 영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력하세요.
	ex.
	문자열을 입력하세요 : apple
	첫 번째 문자 : a
	두 번째 문자 : p
	세 번째 문자 : p
	*/
	public void method4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요: ");
		String munjayeul = sc.nextLine();
		System.out.println("첫번째 문자: " + munjayeul.charAt(0));
		System.out.println("두번째 문자: " + munjayeul.charAt(1));
		System.out.println("세번째 문자: " + munjayeul.charAt(2));
		
		
	}
	
}
