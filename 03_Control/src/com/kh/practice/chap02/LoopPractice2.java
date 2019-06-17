package com.kh.practice.chap02;

import java.util.Scanner;

public class LoopPractice2 {
  /*
   * 메소드 명 : public void practice1(){}
	사용자로부터 한 개의 값을 입력 받아 
	1부터 그 숫자까지의 숫자들을 모두 출력하세요.
	단, 입력한 수는 1보다 크거나 같아야 합니다.
	만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
	1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요”가 출력되면서
	다시 사용자가 값을 입력하도록 하세요.
	ex.
	1이상의 숫자를 입력하세요 : 4 1이상의 숫자를 입력하세요 : 0
	1 2 3 4 1 이상의 숫자를 입력해주세요.
	1이상의 숫자를 입력하세요 : 8
	1 2 3 4 5 6 7 8
   */
	public void practice1(){
		Scanner sc = new Scanner(System.in);
		System.out.println("양수 숫자를 입력해주세요");
		int num = sc.nextInt();

		while(true) {
			if(num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요");
				num = sc.nextInt();
			}else {
				break;
			}
			
		}
		for(int i = 1; i <= num; i++) {
			System.out.print(i);
		} 
	
	}
	/*
	 * 메소드 명 : public void practice2(){}
		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		단, 입력한 수는 1보다 크거나 같아야 합니다.
		1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요”가 출력되면서
		다시 사용자가 값을 입력하도록 하세요.
		ex.
		1이상의 숫자를 입력하세요 : 4 1이상의 숫자를 입력하세요 : 0
		4 3 2 1 1 이상의 숫자를 입력해주세요.
		1이상의 숫자를 입력하세요 : 8
		8 7 6 5 4 3 2 1
	 */
	public void practice2(){
		Scanner sc = new Scanner(System.in);
		System.out.println("양수 숫자를 입력해주세요");
		int num = sc.nextInt();

		while(true) {
			if(num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요");
				num = sc.nextInt();
			}else {
				break;
			}
			
		}
		for(int i = num; i >= 1; i--) {
			System.out.print(i);
			
		} 
	
	}
	/*
	 * 메소드 명 : public void practice3(){}
		사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요”가 출력되면서
		다시 사용자가 값을 입력하도록 하세요.
		ex.
		첫 번째 숫자 : 8 첫 번째 숫자 : 4 첫 번째 숫자 : 9
		두 번째 숫자 : 4 두 번째 숫자 : 8 두 번째 숫자 : 0
		4 5 6 7 8 4 5 6 7 8 1 이상의 숫자를 입력해주세요.
		첫 번째 숫자 : 6
		두 번째 숫자 : 2
		2 3 4 5 6
	 */
	public void practice3(){
		Scanner sc = new Scanner(System.in);
		System.out.println("양수 숫자(1)를 입력해주세요");
		int num1 = sc.nextInt();
		System.out.println("양수 숫자(2)를 입력해주세요");
		int num2 = sc.nextInt();

		while(true) {
			if(num1 < 1 || num2 < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요");
				if(num1 < 1) {
					System.out.println("양수 숫자(1)에 1 이상의 숫자를 입력해주세요");
			    	num1 = sc.nextInt();
				}else {
					System.out.println("양수 숫자(2)에 1 이상의 숫자를 입력해주세요");
					num2 = sc.nextInt();
				}
			}else {
				break;
			}
			
		}
		
		if(num1 > num2) {
		    for(int i = num2; i <= num1; i++) {
			    System.out.print(i);
		    } 
	   }else if(num2 > num1) {
		    for(int j = num1; j <= num2; j++) {
			    System.out.print(j);
		    } 
	   }
	}
	/*메소드 명 : public void practice4(){}
		사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.
		9를 초과하는 숫자가 입력됐다면 “ 9 이하의 숫자를 입력해주세요”가 출력되면서
		다시 사용자가 값을 입력하도록 하세요.
		숫자 : 4              숫자 : 10
		===== 4단 ===== 9 이하의 숫자만 입력해주세요.
		===== 5단 ===== 숫자 : 8
		===== 6단 ===== ===== 8단 =====
		===== 7단 ===== ===== 9단 =====
		===== 8단 =====
		===== 9단 =====
        (해당 단의 내용들은 길이 상 생략)
	 */
	public void practice4(){
		Scanner sc = new Scanner(System.in);
		System.out.println("양수 숫자를 입력해주세요");
		int dan = sc.nextInt();

		while(true) {
			if(dan > 9) {
				System.out.println("9 이하의 숫자만 입력해주세요");
				dan = sc.nextInt();
			}else {
				break;
			}
			
		}
	        // 구구단 dan ~ 9단 까지  모두 출력
		for(int i = dan; i <= 9; i++) {
				for(int num = 1; num <= 9; num++) {
				   System.out.printf("%2d x %2d = %2d\n", i, num, i*num);
					               // 2 x 5 = 10
				}
				System.out.println();
			}
	}
	/*메소드 명 : public void practice5(){}
		사용자로부터 시작 숫자와 공차를 입력 받아
		일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요.
		단, 출력되는 숫자는 총 10개입니다.
	 	* ‘공차’는 숫자들 사이에서 일정한 숫자의 차가 존재하는 것을 말한다.
		ex) 2, 7, 12, 17, 22 …
		5 5 5 5 => 여기서 공차는 5
		ex.
		시작 숫자 : 4
		공차 : 3
		4 7 10 13 16 19 22 25 28 31
	 */
	public void practice5(){
		Scanner sc = new Scanner(System.in);
		System.out.println("시작 숫자를 입력해주세요");
		int num = sc.nextInt();
		System.out.println("공차를 입력해주세요");
		int gc = sc.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			    System.out.print(num + " ");
			    num += gc;
		    } 
	
	}
	/*메소드 명 : public void practice6(){}
		연산자(+, -, *, /, %) : +
		정수1 : 10
		정수2 : 4
		10 + 4 = 14
		
		연산자(+, -, *, /, %) : / 연산자(+, -, *, /, %) : /
		정수1 : 10 정수1 : 10
		정수2 : 4 정수2 : 0
		10 / 4 = 2        0으로 나눌 수 없습니다. 다시 입력해주세요.
		
		연산자(+, -, *, /, %) : ^ 연산자(+, -, *, /, %) : exit
		정수1 : 10 프로그램을 종료합니다.
		정수2 : 4
		없는 연산자입니다. 다시 입력해주세요.
	 */
	public void practice6(){
		Scanner sc = new Scanner(System.in);
		String op = null;
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		
		while(true) {
			System.out.print("연산자를 입력(+,-,*,/,%) 입력하세요: ");
			op = sc.nextLine();
			
			if(op.equals("exit")) {// exit가 입력된 경우
				System.out.print("프로그램을 종료합니다. ");
				break;
			} // end if
		
			System.out.print("정수1을 입력하세요: ");
			num1 = sc.nextInt();
			
			System.out.print("정수2를 입력하세요 : ");
			num2 = sc.nextInt();
		    sc.nextLine(); // 버퍼에 남아 있는 개행문자 \n를 없애는 기능
			
			if(op.equals("/") && num2 == 0) {// 0으로 나누는 경우
				System.out.print("0으로 나눌 수 없습니다. 다시 입력 해 주세요. ");
				continue;
			} // end if
			
			switch(op) {
    		case("+"):result = num1 + num2;break;
    		case("-"):result = num1 - num2;break;
    		case("*"):result = num1 * num2;break;
    		case("/"):result = num1 / num2;break;
    		case("%"):result = num1 % num2;break;
    		default:System.out.println("잘못된 연산자를 입력하였습니다.다시 입력해 주세요.");
                     continue;
    		} // end switch
			
			System.out.printf("%d %s %d = %f\n", num1, op, num2, result);
			
    		/* 다른 방법 : 
    		     double result = 0; //연산결과를 저장할 변수 
    		     boolean check = true; // 올바른 연산자인지 판단할 변수
    		     switch(op) {
    		     case('+'): result = num1 + num2; break;
    		     ....
    		     default:System.out.println("잘못된 연산자를 입력하였습니다.프로그램을 종료합니다.");
    		             check = false;
    		     }
    		     if(check){  
    		     System.out.printf("%d %s %d = %f\n", num1, op, num2, result);
    		     } 
    	   */
		}	    		
	}
}
