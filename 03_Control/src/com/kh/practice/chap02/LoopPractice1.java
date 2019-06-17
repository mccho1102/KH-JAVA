package com.kh.practice.chap02;

import java.util.Scanner;

public class LoopPractice1 {
	/*
	 * 메소드 명 : public void practice1(){}
		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		단, 입력한 수는 1보다 크거나 같아야 합니다.
		만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		ex.
		1이상의 숫자를 입력하세요 : 4 1이상의 숫자를 입력하세요 : 0
		1 2 3 4 1 이상의 숫자를 입력해주세요.
	 */
     public void practice1() {
    	 
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("양의 정수를 입력해주세요");
    	 int num1 = sc.nextInt();
    	 
    	 if(num1 >= 1) {
    		 for(int i = 1; i <= num1; i++) {
    			 System.out.print(i + " ");
    		 }
 	 
    	 }else {
    		 System.out.println("1 이상의 숫자를 입력해주세요");
    	 }
     }
     /*
           메소드 명 : public void practice2(){}
		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		단, 입력한 수는 1보다 크거나 같아야 합니다.
		ex.
		1이상의 숫자를 입력하세요 : 4 1이상의 숫자를 입력하세요 : 0
		4 3 2 1 1 이상의 숫자를 입력해주세요. 
      */
     public void practice2(){
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("양의 정수를 입력해주세요");
    	 int num1 = sc.nextInt();
    	 
    	 if(num1 >= 1) {
    		 for(int i = num1; i >= 1; i--) {
    			 System.out.print(i + " ");
    		 }
 	 
    	 }else {
    		 System.out.println("1 이상의 숫자를 입력해주세요");
    	 }
     }
     /*
      * 메소드 명 : public void practice3(){}
		1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.
		ex.
		정수를 하나 입력하세요 : 8
		1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
      */
     public void practice3(){
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("양의 정수를 입력해주세요");
    	 int num = sc.nextInt();
    	 int sum = 0;
    	 for(int i = 1; i <= num; i++ ) {
    		 if(i !=num ) {
    		        sum += i; 
    		        System.out.print(i);
    		        System.out.print(" + ");
    		 }else {
    			   sum += i;
    			   System.out.print(i);
    			   System.out.print(" = ");
    			   System.out.print(sum);
    		 }
    	 }
     }
     /*
      * 메소드 명 : public void practice4(){}
             사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		ex.
		첫 번째 숫자 : 8 첫 번째 숫자 : 4 첫 번째 숫자 : 9
		두 번째 숫자 : 4 두 번째 숫자 : 8 두 번째 숫자 : 0
		4 5 6 7 8 4 5 6 7 8 1 이상의 숫자를 입력해주세요.
      */
     public void practice4(){
    	Scanner sc = new Scanner(System.in);
 		System.out.print("첫번째 정수를 입력하세요 :");
 		int num1 = sc.nextInt();
 		System.out.print("두번째 정수를 입력하세요 :");
 		int num2 = sc.nextInt();
 		int sum = 0;
 		
 		if(num1 < num2 && num1 > 0 && num2 >0) {
 			// 첫 번째 입력값은 두 번째 입력값 보다 작아야 함
 			for(int i = num1; i <= num2; i++) {
 				System.out.print(i+" ");
 			}
 			//System.out.println("두 수 " + num1 +"," + num2 + "의 합 :" + sum);
 		}else {
 			System.out.println("첫 번째 입력값"+ num1 + "은" + " 두 번째 입력값" + num2 + "보다 작아야 합니다."
 					+ "그리고 음수는 안됩니다.");
 		}
     }
 		/*
 		 * 메소드 명 : public void practice5(){}
			사용자로부터 입력 받은 숫자의 단을 출력하세요.
			ex.
				숫자 : 4
			===== 4단 =====
			4 * 1 = 4
			4 * 2 = 8
			4 * 3 = 12
			4 * 4 = 16
			4 * 5 = 20
			4 * 6 = 24
			4 * 7 = 28
			4 * 8 = 32
			4 * 9 = 36

 		 */
     public void practice5( ) {
      
    	Scanner sc = new Scanner(System.in);
  		System.out.print("단을 입력하세요 :");
  		int dan = sc.nextInt();
  		
 		for(int i = dan; i <= dan; i++) {
 			for(int j = 1; j <= 9; j++) {
 			   System.out.printf("%2d x %2d = %2d\n", i, j, dan*j);
 				               // 2 x 5 = 10
 			}
 			System.out.println();
 		}	
 	}
     /*(메소드 명 : public void practice6(){}
 	 사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
 	 단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.
 	 숫자 : 4 숫자 : 10
 	===== 4단 ===== 9 이하의 숫자만 입력해주세요.
 	===== 5단 =====
 	===== 6단 =====
 	===== 7단 =====
 	===== 8단 =====
 	===== 9단 =====
 	(해당 단의 내용들은 길이 상 생략) 
 	*/
     public void practice6(){
    	 
    	Scanner sc = new Scanner(System.in);
   		System.out.print("단을 입력하세요 :");
   		int dan = sc.nextInt();
 		
   		if(dan > 9) {
   			System.out.println("9 이하의 숫자만 입력해주세요");
   		}else {
   		 		
   			for(int i = dan; i <= 9; i++) {
   				System.out.println("======" + i + "=======");
   				for(int num = 1; num <= 9; num++) {
   					System.out.printf("%2d x %2d = %2d\n", i, num, i*num);
				               // 2 x 5 = 10
   			    }
   				System.out.println();
   			}
   		}	
     }
     /*
      * 메소드 명 : public void practice7(){}
		다음과 같은 실행 예제를 구현하세요.
		ex.
		정수 입력 : 4
      	*
      	**
      	***
      	****
      */
     public void practice7(){
    	 for(int i=0; i<4; i++) {
  		   for(int k=0; k<=i; k++) {
  			   System.out.print("*");  
  		   }
  		   System.out.println();
  		}
     }
     /*
       메소드 명 : public void practice8(){}
       다음과 같은 실행 예제를 구현하세요.
     ex.
        정수 입력 : 4
     ****
     ***
     **
     *
     */
     public void practice8(){
    	 for(int i=1; i<=4; i++) {
  		   for(int k=4; k>=i; k--) {
  			   System.out.print("*");  
  		   }
  		   System.out.println();
  		}
     }
     /*
      * 메소드 명 : public void practice9(){}
		1부터 사용자에게 입력 받은 수까지 중에서
		1) 2와 3의 배수를 모두 출력하고
		2) 2와 3의 공배수의 개수를 출력하세요.
      	* ‘공배수’는 둘 이상의 수의 공통인 배수라는 뜻으로 어떤 수를 해당 수들로 나눴을 때
		모두 나머지가 0이 나오는 수
		ex.
		자연수 하나를 입력하세요 : 15
		2 3 4 6 8 9 10 12 14 15
		count : 2
      */
     public void practice9(){
    	 Scanner sc = new Scanner(System.in);
    	 System.out.print("자연수 하나를 입력하세요 :");
    	 int num = sc.nextInt();
    	 int sum = 0;
    	 
    	 for(int i = 1; i <= num; i++) {
    		if(i%2==0 || i%3==0) {
    			System.out.print(i+" ");
     		}
    		if(i%2==0 && i%3==0) {
     			sum += 1;
     		}
    	 }
    	 System.out.println();
    	 System.out.print(sum);
     }
     /*
      * 메소드 명 : public void practice12(){}
             다음과 같은 실행 예제를 구현하세요.
		ex.
		정수 입력 : 4
      	 *
      	***
       *****
      *******
      */
     public void practice12(){
    	 for(int i=1; i<=4; i++) {
    		   for(int j=1; j<=7; j++) {
    			   System.out.print(" ");
  
    		   }
    		   System.out.println();
    		}
     }
}
