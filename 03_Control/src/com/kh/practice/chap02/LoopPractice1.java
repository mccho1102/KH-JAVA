package com.kh.practice.chap02;

import java.util.Scanner;

public class LoopPractice1 {
	/*
	 * �޼ҵ� �� : public void practice1(){}
		����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ���ڵ��� ��� ����ϼ���.
		��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�.
		���� 1 �̸��� ���ڰ� �Էµƴٸ� ��1 �̻��� ���ڸ� �Է����ּ��䡰�� ����ϼ���.
		ex.
		1�̻��� ���ڸ� �Է��ϼ��� : 4 1�̻��� ���ڸ� �Է��ϼ��� : 0
		1 2 3 4 1 �̻��� ���ڸ� �Է����ּ���.
	 */
     public void practice1() {
    	 
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("���� ������ �Է����ּ���");
    	 int num1 = sc.nextInt();
    	 
    	 if(num1 >= 1) {
    		 for(int i = 1; i <= num1; i++) {
    			 System.out.print(i + " ");
    		 }
 	 
    	 }else {
    		 System.out.println("1 �̻��� ���ڸ� �Է����ּ���");
    	 }
     }
     /*
           �޼ҵ� �� : public void practice2(){}
		����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ��� ���ڸ� �Ųٷ� ����ϼ���.
		��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�.
		ex.
		1�̻��� ���ڸ� �Է��ϼ��� : 4 1�̻��� ���ڸ� �Է��ϼ��� : 0
		4 3 2 1 1 �̻��� ���ڸ� �Է����ּ���. 
      */
     public void practice2(){
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("���� ������ �Է����ּ���");
    	 int num1 = sc.nextInt();
    	 
    	 if(num1 >= 1) {
    		 for(int i = num1; i >= 1; i--) {
    			 System.out.print(i + " ");
    		 }
 	 
    	 }else {
    		 System.out.println("1 �̻��� ���ڸ� �Է����ּ���");
    	 }
     }
     /*
      * �޼ҵ� �� : public void practice3(){}
		1���� ����ڿ��� �Է� ���� �������� �������� ���� for���� �̿��Ͽ� ����ϼ���.
		ex.
		������ �ϳ� �Է��ϼ��� : 8
		1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
      */
     public void practice3(){
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("���� ������ �Է����ּ���");
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
      * �޼ҵ� �� : public void practice4(){}
             ����ڷκ��� �� ���� ���� �Է� �޾� �� ������ ���ڸ� ��� ����ϼ���.
		���� 1 �̸��� ���ڰ� �Էµƴٸ� ��1 �̻��� ���ڸ� �Է����ּ��䡰�� ����ϼ���.
		ex.
		ù ��° ���� : 8 ù ��° ���� : 4 ù ��° ���� : 9
		�� ��° ���� : 4 �� ��° ���� : 8 �� ��° ���� : 0
		4 5 6 7 8 4 5 6 7 8 1 �̻��� ���ڸ� �Է����ּ���.
      */
     public void practice4(){
    	Scanner sc = new Scanner(System.in);
 		System.out.print("ù��° ������ �Է��ϼ��� :");
 		int num1 = sc.nextInt();
 		System.out.print("�ι�° ������ �Է��ϼ��� :");
 		int num2 = sc.nextInt();
 		int sum = 0;
 		
 		if(num1 < num2 && num1 > 0 && num2 >0) {
 			// ù ��° �Է°��� �� ��° �Է°� ���� �۾ƾ� ��
 			for(int i = num1; i <= num2; i++) {
 				System.out.print(i+" ");
 			}
 			//System.out.println("�� �� " + num1 +"," + num2 + "�� �� :" + sum);
 		}else {
 			System.out.println("ù ��° �Է°�"+ num1 + "��" + " �� ��° �Է°�" + num2 + "���� �۾ƾ� �մϴ�."
 					+ "�׸��� ������ �ȵ˴ϴ�.");
 		}
     }
 		/*
 		 * �޼ҵ� �� : public void practice5(){}
			����ڷκ��� �Է� ���� ������ ���� ����ϼ���.
			ex.
				���� : 4
			===== 4�� =====
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
  		System.out.print("���� �Է��ϼ��� :");
  		int dan = sc.nextInt();
  		
 		for(int i = dan; i <= dan; i++) {
 			for(int j = 1; j <= 9; j++) {
 			   System.out.printf("%2d x %2d = %2d\n", i, j, dan*j);
 				               // 2 x 5 = 10
 			}
 			System.out.println();
 		}	
 	}
     /*(�޼ҵ� �� : public void practice6(){}
 	 ����ڷκ��� �Է� ���� ������ �ܺ��� 9�ܱ��� ����ϼ���.
 	 ��, 9�� �ʰ��ϴ� ���ڰ� ������ ��9 ������ ���ڸ� �Է����ּ��䡱�� ����ϼ���.
 	 ���� : 4 ���� : 10
 	===== 4�� ===== 9 ������ ���ڸ� �Է����ּ���.
 	===== 5�� =====
 	===== 6�� =====
 	===== 7�� =====
 	===== 8�� =====
 	===== 9�� =====
 	(�ش� ���� ������� ���� �� ����) 
 	*/
     public void practice6(){
    	 
    	Scanner sc = new Scanner(System.in);
   		System.out.print("���� �Է��ϼ��� :");
   		int dan = sc.nextInt();
 		
   		if(dan > 9) {
   			System.out.println("9 ������ ���ڸ� �Է����ּ���");
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
      * �޼ҵ� �� : public void practice7(){}
		������ ���� ���� ������ �����ϼ���.
		ex.
		���� �Է� : 4
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
       �޼ҵ� �� : public void practice8(){}
       ������ ���� ���� ������ �����ϼ���.
     ex.
        ���� �Է� : 4
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
      * �޼ҵ� �� : public void practice9(){}
		1���� ����ڿ��� �Է� ���� ������ �߿���
		1) 2�� 3�� ����� ��� ����ϰ�
		2) 2�� 3�� ������� ������ ����ϼ���.
      	* ����������� �� �̻��� ���� ������ ������ ������ � ���� �ش� ����� ������ ��
		��� �������� 0�� ������ ��
		ex.
		�ڿ��� �ϳ��� �Է��ϼ��� : 15
		2 3 4 6 8 9 10 12 14 15
		count : 2
      */
     public void practice9(){
    	 Scanner sc = new Scanner(System.in);
    	 System.out.print("�ڿ��� �ϳ��� �Է��ϼ��� :");
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
      * �޼ҵ� �� : public void practice12(){}
             ������ ���� ���� ������ �����ϼ���.
		ex.
		���� �Է� : 4
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
