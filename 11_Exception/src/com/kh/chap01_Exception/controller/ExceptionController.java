package com.kh.chap01_Exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ExceptionController {
	// UnChecked Exception 확인
	// 프로그램 작성시 별도의 예외처리를 하지 않고
	// if문 같은 조건문으로 처리 가능한 예외
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력 받은 두 정수의 나누기 값 구하기");
		System.out.println("입력 1 : ");
		int num1 = sc.nextInt();
		
		System.out.println("입력 2 : ");
		int num2 = sc.nextInt();
		
		System.out.println("결과 : " + (num1 / num2));
	}
	
	// Checked Exception
	// 조건문 같은 코드로 해결할 수 없는 예외를
	// 발생시킬 가능성이 있는 경우
	// 반드시 예외처리를 해야 되는 예외(Exception)
	
	public void method2() {
		BufferedReader br = null;
		
		
		try {
			System.out.println("입력받은 문자열 출력하기");
			
			br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("입력:");
			String str = br.readLine(); // IOException 발생 가능성이 있음
			// 정상적인 코드 아님!, 예시로만 기억하기
			throw new IOException();
			//System.out.println("입력 받은 문자열 : " + str);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
