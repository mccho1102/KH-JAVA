package com.kh.chap02.loop;

import java.util.Scanner;

public class B_While {
    // while문
	
	/* [초기식]
	 * while(조건식){
	 *  실행할 문장;
	 *  [증감식 or 분기문;]
	 * }
	 * 
	 * 최초 1회전
	 * 조건식 확인 -> (조건식 true) 실행할 문장 수행
	 * 
	 * 2회전 이후
	 * 조건식 확인 -> (조건식 true) 실행할 문장 수행
	 * 
	 * 조건식이 false가 나올 때 까지 계속 반복
	 */
	
	public void method1() {
		// 1부터 5까지 While문을 이용하여 출력
		
		int i = 1; // 초기식
		while(i<=5) { // 조건식
			System.out.print(i + " ");
			i++; // 증감식
		}
	}
	
	public void method2() {
		// 5부터 1까지 출력
		
		int i = 5; // 초기식
		while(i>0) { // 조건식
			System.out.print(i+" ");
			i--; // 증감식
		}
	}
	
	public void method3() {
		// 1~20 사이의 4의 배수 출력하기(1, 20 포함)
		int i = 1;
		while(i <= 20){
			if(i % 4 == 0) {
				System.out.print(i + " ");
			}
			
			i++; // 증감식
		}
	}
	
	public void method4() {
		// 1부터 발생된 난수까지의 합 출력하기(while문 사용)
		// 단, 난수의 범위는 1 ~ 100
		int random = (int)(Math.random() * 100 + 1);
        // 0.0 <= 난수 < 101.0
		int sum = 0;//합계
		int i = 1; //초기식
		while(i <= random) {
			sum += i;
			i++;
		}
		System.out.println("1부터" + random + "까지의 합 : " + sum );
	}
	
	public void method5(){
		// -1이 입력될 때 까지 입력받은 값 더하기
		
		Scanner sc = new Scanner(System.in);
		int num = 0; // 입력받은 값 저장
		int sum = 0; // 입력받은 값 더하기
		
		while(num != -1) {// 종료 조건
			System.out.print("입력: ");
			num = sc.nextInt();
			
			if(num != -1) {//합 조건
			   sum += num;
			}
		}
		System.out.print("더한 값 : " + sum);
	}
	
	public void method6(){
		// 0이 입력될 때 까지 입력받은 값 더하기
		
		Scanner sc = new Scanner(System.in);
		int sum = 0; // 입력받은 값 더하기
		int num = 1; // 입력받은 값 저장
		// 0이 아닌 임의의 값으로 초기화 해두기
		
		while(num != 0) {// 종료 조건
			System.out.print("입력: ");
			num = sc.nextInt();
			
			sum += num;
		}
		System.out.print("더한 값 : " + sum);
	}
	
	public void method7() {
		// 문자열을 입력받아 인덱스별 문자 출력
		// ex)
		// 입력 : abc
		// 0번 인덱스 : a
		// 1번 인덱스 : b
		// 2번 인덱스 : c
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String str = sc.nextLine();
		
		int index = 0; //초기식
		while(index < str.length()) {// 조건식
			// String.length() : 문자열의 길이 반환
			char ch = str.charAt(index);
			System.out.println(index + "번 인덱스 : " + ch);
			
			index++; // 증감식
		}
	}
	
	// 중첩 while문
	public void method8() {
		// (1) 12345
		// (2) 12345
		// (3) 12345
		// (4) 12345
		// (5) 12345
        
		int i = 1; 
		while(i <= 5) {// 줄(행)
			System.out.print("("+i+")");
			
			int j = 1;
			while(j<=5) {// 칸(열)
				System.out.print(j);
				j++;
			}
			System.out.println();
			
			i++;
		}
	}
	// 시간출력
	
	public void method9() {
		int i = 0;
		while(i < 3) {
			
			int j = 0;
			while(j < 60) {
				
				int k = 0;
				while(k < 60) {
					
				  System.out.print(i +"시");
				  System.out.print(j +"분");
				  System.out.println(k +"초");
				  k++;
				}
			    j++;
			}
			System.out.println();
			i++;
		}

	}
	
	public void method10() {
		// 메뉴 만들기
		Scanner sc = new Scanner(System.in);
		int num = -1;
		
		while(num != 0) {
		    System.out.println("실행할 메소드를 1~9 선택하세요! 프로그램 종료는 0입니다 : ");
		    num = sc.nextInt();
		
		    switch(num) {
		    case 1 : System.out.println("method1() 실행");
		             method1(); break;
		    case 2 : System.out.println("method2() 실행"); 
					 method2(); break;
		    case 3 : System.out.println("method3() 실행"); 
		    		 method3(); break;
		    case 4 : System.out.println("method4() 실행"); 
		    		 method4(); break;
		    case 5 : System.out.println("method5() 실행"); 
   		       		 method5(); break;
		    case 6 : System.out.println("method6() 실행"); 
					 method6(); break;
		    case 7 : System.out.println("method7() 실행"); 
					 method7(); break;
		    case 8 : System.out.println("method8() 실행"); 
					 method8(); break;
		    case 9 : System.out.println("method9() 실행"); 
					 method9(); break;
		    case 0 : System.out.println("프로그램을 종료합니다.");
		                        break;
		    default : System.out.println("잘못 입력 하셨습니다.");
		}// end switch
	  }// end while
	}
	
	public void method11() {
		// 메뉴 만들기 do ~ while 문으로...
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		do {
		    System.out.println("실행할 메소드를 1~9 선택하세요! 프로그램 종료는 0입니다 : ");
		    num = sc.nextInt();
		
		    switch(num) {
		    case 1 : System.out.println("method1() 실행");
		             method1(); break;
		    case 2 : System.out.println("method2() 실행"); 
					 method2(); break;
		    case 3 : System.out.println("method3() 실행"); 
		    		 method3(); break;
		    case 4 : System.out.println("method4() 실행"); 
		    		 method4(); break;
		    case 5 : System.out.println("method5() 실행"); 
   		       		 method5(); break;
		    case 6 : System.out.println("method6() 실행"); 
					 method6(); break;
		    case 7 : System.out.println("method7() 실행"); 
					 method7(); break;
		    case 8 : System.out.println("method8() 실행"); 
					 method8(); break;
		    case 9 : System.out.println("method9() 실행"); 
					 method9(); break;
		    case 0 : System.out.println("프로그램을 종료합니다.");
		                        break;
		    default : System.out.println("잘못 입력 하셨습니다.");
		}
	  }while(num != 0);
	}		
}
