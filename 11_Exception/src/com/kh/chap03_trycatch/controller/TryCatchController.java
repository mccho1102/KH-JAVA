package com.kh.chap03_trycatch.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchController {
	public void method1() {
			Scanner sc = new Scanner(System.in);
			try {	
			   System.out.println("입력 받은 두 정수의 나누기 값 구하기");
			   System.out.println("입력 1 : ");
			   int num1 = sc.nextInt();
			
			    System.out.println("입력 2 : ");
		    	int num2 = sc.nextInt();
			
		    	System.out.println("결과 : " + (num1 / num2));
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌수 없습니다.");
			} catch (InputMismatchException e) {
				System.out.println("0으로 나눌수 없습니다.");
			} finally {
				System.out.println("무조건 실행되는 구문");
				System.out.println("프로그램 종료");
			}
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
				
				System.out.print("입력1:");
				int num1 = Integer.parseInt(br.readLine()); // IOException 발생 가능성이 있음
				
				System.out.print("입력2:");
				int num2 = Integer.parseInt(br.readLine()); // IOException 발생 가능성이 있음
				
				System.out.println("결과 : " + (num1 / num2));
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("IOException 발생됨");
				e.printStackTrace();
			} catch(NumberFormatException e) {
				 System.out.println("잘못된 값을 입력하셨습니다.");
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌수 없습니다.");
		    } finally {
		    	// BufferedReader 반환
		    	try {
		    		System.out.println("BufferedReader 반환");
					br.close();
					System.out.println("프로그램 종료");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
	}
		
		public void method3() {
	
		
			try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
				System.out.println("입력받은 문자열 출력하기");
				
		
				System.out.print("입력1:");
				int num1 = Integer.parseInt(br.readLine()); // IOException 발생 가능성이 있음
				
				System.out.print("입력2:");
				int num2 = Integer.parseInt(br.readLine()); // IOException 발생 가능성이 있음
				
				System.out.println("결과 : " + (num1 / num2));
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("IOException 발생됨");
				e.printStackTrace();
			} catch(NumberFormatException e) {
				 System.out.println("잘못된 값을 입력하셨습니다.");
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌수 없습니다.");
		    } finally {
		    	// BufferedReader 반환
		    	System.out.println("프로그램 종료");
		    }
	}			
}
