package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	public void method1() {
		for(int i=0; ; i++) {
			System.out.println(i+"번 출력");
			
			if(i == 10) {
				break;
			}
		}
	}
	
	public void method2() {
		// 문자열을 입력받아 글자 개수를 출력하는 반복 프로그램
		// 단, "end" 입력시 프로그램 종료
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("문자열 입력 : ");
			String str = sc.nextLine();
			
			if(str.equals("end")) {
				System.out.println("프로그램을 종료합니다.");
				break; // if문을 중지시키는 의미가 아니라 가장 가까운 while문을 종료시킴
			}
			
			System.out.println(str+"의 글자개수 : " + str.length());
			
		}
		
	}
	
	public void method3() {
		// 구구단 2~9단 까지  모두 출력
				for(int dan = 2; dan <= 9; dan++) {// 단
					for(int num = 1; num <= 9; num++) {// 단에 곱해지는 수
					   System.out.printf("%2d x %2d = %2d\n", dan, num, dan*num);
						               // 2 x 5 = 10
					   if(num == 5) {
						   break;
					   }
					}
					System.out.println();
				}	
		
	}
}
