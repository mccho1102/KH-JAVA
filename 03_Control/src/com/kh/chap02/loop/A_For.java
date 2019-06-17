package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {

	// for문(단일 for문)
	/*
	 * for(초기식; 조건식; 증감식){
	 *     실행될 문장;
	 * }
	 * 
	 * 최초 1회전
	 * 초기식 -> 조건식 확인 -> (조건식true) 실행될 문장 수행 -> 증감식 연산
	 * 
	 * 2회전 이후
	 * 조건식 확인 -> (조건식 true) 실행될 문장 수행 -> 증감식 연산
	 * 
	 * 조건식이 fail가 될때 까지 반복
	 * 
	 */
	public void method_random() {
		// 1부터 발생한 난수 까지의 정수 합 구하기
		// (난수 범위 1~10)
		// 난수 : 임의의 수(random)
		// java.lang.Math.random()
		// 난수 발생 범위 : 0.0 <= 난수 < 1.0 (double형 실수값) 
		// a pseudorandom double greater than or equal to 0.0 and less than 1.0.
		
		int random = (int)(Math.random() * 10 + 1);
		              // 0.0 <= 난수 < 11.0
		
		int sum = 0;
		for(int i = 1; i <= random; i++) {
			//sum = sum + i;
			sum += i;
		}
		
		System.out.println("1부터" + random + "까지의 합" + sum );
	}
	
	public void method1() {
		// for문을 이용하여 1부터 5까지 출력
		for(int i=1; i <= 5; i++) {
			System.out.println(i);
		}
		
	}
	
	public void method2() {
		// for문을 이용해서 5부터 1까지 출력
		for(int i=5; i >= 1; i--) {
			System.out.println(i);
		}
	}
	
	public void method3() {
		// for문을 이용하여 1부터 10사이 홀수만 출력
		
		// 1부터 10사이의 홀수만 출력(1,3,5,7,9)
		System.out.println("홀수만 출력");
		for(int i = 1; i <= 10; i += 2) {
			System.out.println(i);
		}
		
		// 1부터 10사이의 짝수만 출력(2,4,6,8,10)
		System.out.println("짝수만 출력");
		for(int i = 2; i <= 10; i += 2) {
			System.out.println(i);
		}
	}
	
	public void method4() {
		// 양의 정수를 입력받아 1부터 입력받은 값 까지 출력(1씩 증가)
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수 입력");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			System.out.println(i);
		}
	}
	
	public void method5() {
		// 구구단 2단 출력하기
		// 2 x 1 = 2
		// 2 x 2 = 4
		// 2 x 3 = 6
		// .....
		// 2 x 9 = 18
		for(int i=1; i<=9; i++) {
			System.out.println("2 X " + i + " = " + (2 * i));
		}
		
	}
	
	public void method6() {
		// 구구단 2단 출력하기
		// 2 x 1 = 2
		// 2 x 2 = 4
		// 2 x 3 = 6
		// .....
		// 2 x 9 = 18
		
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력해 주세요");
		int num = sc.nextInt();
		for(int i=1; i<=9; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));
		}
		
	}
	
	public void method7() {
		// 입력받은 단의 구구단 출력하기
		// 단, 입력받는 수의 범위가 2~9 일때만 구구단 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 단 ?");
		int dan = sc.nextInt();
		
		if(dan >= 2 && dan <= 9) { // 입력받은 값이 2이상 9이하 일 경우
			for(int i=1; i<=9; i++) {
				//System.out.println(dan + "x" + i + "=" + (dan * i));
				  int result = dan * i;
				  System.out.printf("%s x %d = %d\n", dan, i, result);
			}
		}else {
			System.out.print("범위를 초과하였습니다.");
			
		}
		
		
	}
	
	public void method8() {
		// 두 수를 입력받아 두 수 사이의 모든 정수의 합 구하기
		// 다, 첫 번째 입력값은 두 번째 입력값 보다 작아야 함
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요 :");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 :");
		int num2 = sc.nextInt();
		int sum = 0;
		
		if(num1 < num2) {
			// 첫 번째 입력값은 두 번째 입력값 보다 작아야 함
			for(int i = num1; i <= num2; i++) {
				sum += i;
			}
			System.out.println("두 수 " + num1 +"," + num2 + "의 합 :" + sum);
		}else {
			System.out.println("첫 번째 입력값"+ num1 + "은" + " 두 번째 입력값" + num2 + "보다 작아야 합니다.");
		}
		
	}
	
	public void method9() {
		// 1부터 20사이에 있는 3의 배수 출력하기
		// 두수를 입력받아 3의 배수 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요 :");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 :");
		int num2 = sc.nextInt();
		System.out.print("배수를 입력하세요 :");
		int baesu = sc.nextInt();
		
		if(num1 < num2) {
			// 첫 번째 입력값은 두 번째 입력값 보다 작아야 함	
			for(int i=num1; i<=num2; i++) {
				//if문은 조건문에서 참 또는 거짓이 나와야 함
				if(i % baesu==0) {// 3의 배수인 경우
					System.out.print(i + " ");
				}
			}
		}else {
			System.out.println("첫 번째 입력값"+ num1 + "은" + " 두 번째 입력값" + num2 + "보다 작아야 합니다.");
		}
		System.out.println();
	}
	
	/*******************************************************************************************/
	
	// 중첩 for문
	
	public void method10() {
		// 1부터 5까지 출력되는 문장을 5줄 출력하기
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		
		for(int i = 1; i <= 5; i++) { //라인 출력
			
			System.out.print("("+ i + ")");
			
			for(int j= 1; j <= 5; j++) { // 숫자출력
			    System.out.print(j + " ");
			}
			System.out.println();//줄바꿈
		}
	}
	
	public void method11() {
		// 0시 0분 부터 23시 59분까지 출력하기
		for(int hour = 0; hour < 24; hour++) {
			for(int min = 0; min < 60; min++) {
				for(int sec = 0; sec < 60; sec++) {
				System.out.printf("%2d시 %2d분 %2d초\n", hour, min, sec);
				}
			}
		}
	}
	
	public void method12( ) {
		// 구구단 2~9단 까지  모두 출력
		for(int dan = 2; dan <= 9; dan++) {
			for(int num = 1; num <= 9; num++) {
			   System.out.printf("%2d x %2d = %2d\n", dan, num, dan*num);
				               // 2 x 5 = 10
			}
			System.out.println();
		}	
	}
	
	public void method13() {
		// 별찍기!!!!!!!!
		// *****
		// *****
		// *****
		// *****
		for(int i=0; i<4; i++) { // i==0,1,2,3
			for(int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
	}
	
	public void method14() {
		// *
		// **
		// ***
		// ****
	    //    *
	    //   **
	   //   ***
	   //  ****

		for(int i=0; i<4; i++) {
		   for(int j=3; j>=i; j--) {
			   System.out.print(" ");  
		   }
		   for(int k=0; k<=i; k++) {
			   System.out.print("*");  
		   }
		   System.out.println();
		}
	}
	
	public void method15() {
	   // 한 줄에 별표문자를 입력된 줄수와 칸 수만큼 출력
	   // 단, 줄수와 칸수가 일치하는 위치에는 줄번호에 대한 정수가 출력
		/*
		 1***** 
		 *2**** 
		 **3*** 
		 ***4** 
		 ****5*
		 *****6 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("줄수를 입력하세요 :");
		int num1 = sc.nextInt();
		System.out.print("칸수를 입력하세요 :");
		int num2 = sc.nextInt();
		
	    for(int i=1; i<=num1; i++) {
	    	for(int j=1; j<=num2; j++) {
	    		if(i==j) {
	    			System.out.print(i);
	    		}else {
	    			System.out.print("*");
	    		}
	    	}
	    	 System.out.println();
	    }
	}
}
