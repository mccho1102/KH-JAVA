package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {

	// for��(���� for��)
	/*
	 * for(�ʱ��; ���ǽ�; ������){
	 *     ����� ����;
	 * }
	 * 
	 * ���� 1ȸ��
	 * �ʱ�� -> ���ǽ� Ȯ�� -> (���ǽ�true) ����� ���� ���� -> ������ ����
	 * 
	 * 2ȸ�� ����
	 * ���ǽ� Ȯ�� -> (���ǽ� true) ����� ���� ���� -> ������ ����
	 * 
	 * ���ǽ��� fail�� �ɶ� ���� �ݺ�
	 * 
	 */
	public void method_random() {
		// 1���� �߻��� ���� ������ ���� �� ���ϱ�
		// (���� ���� 1~10)
		// ���� : ������ ��(random)
		// java.lang.Math.random()
		// ���� �߻� ���� : 0.0 <= ���� < 1.0 (double�� �Ǽ���) 
		// a pseudorandom double greater than or equal to 0.0 and less than 1.0.
		
		int random = (int)(Math.random() * 10 + 1);
		              // 0.0 <= ���� < 11.0
		
		int sum = 0;
		for(int i = 1; i <= random; i++) {
			//sum = sum + i;
			sum += i;
		}
		
		System.out.println("1����" + random + "������ ��" + sum );
	}
	
	public void method1() {
		// for���� �̿��Ͽ� 1���� 5���� ���
		for(int i=1; i <= 5; i++) {
			System.out.println(i);
		}
		
	}
	
	public void method2() {
		// for���� �̿��ؼ� 5���� 1���� ���
		for(int i=5; i >= 1; i--) {
			System.out.println(i);
		}
	}
	
	public void method3() {
		// for���� �̿��Ͽ� 1���� 10���� Ȧ���� ���
		
		// 1���� 10������ Ȧ���� ���(1,3,5,7,9)
		System.out.println("Ȧ���� ���");
		for(int i = 1; i <= 10; i += 2) {
			System.out.println(i);
		}
		
		// 1���� 10������ ¦���� ���(2,4,6,8,10)
		System.out.println("¦���� ���");
		for(int i = 2; i <= 10; i += 2) {
			System.out.println(i);
		}
	}
	
	public void method4() {
		// ���� ������ �Է¹޾� 1���� �Է¹��� �� ���� ���(1�� ����)
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� �Է�");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			System.out.println(i);
		}
	}
	
	public void method5() {
		// ������ 2�� ����ϱ�
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
		// ������ 2�� ����ϱ�
		// 2 x 1 = 2
		// 2 x 2 = 4
		// 2 x 3 = 6
		// .....
		// 2 x 9 = 18
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��� �ּ���");
		int num = sc.nextInt();
		for(int i=1; i<=9; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));
		}
		
	}
	
	public void method7() {
		// �Է¹��� ���� ������ ����ϱ�
		// ��, �Է¹޴� ���� ������ 2~9 �϶��� ������ ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� ?");
		int dan = sc.nextInt();
		
		if(dan >= 2 && dan <= 9) { // �Է¹��� ���� 2�̻� 9���� �� ���
			for(int i=1; i<=9; i++) {
				//System.out.println(dan + "x" + i + "=" + (dan * i));
				  int result = dan * i;
				  System.out.printf("%s x %d = %d\n", dan, i, result);
			}
		}else {
			System.out.print("������ �ʰ��Ͽ����ϴ�.");
			
		}
		
		
	}
	
	public void method8() {
		// �� ���� �Է¹޾� �� �� ������ ��� ������ �� ���ϱ�
		// ��, ù ��° �Է°��� �� ��° �Է°� ���� �۾ƾ� ��
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ������ �Է��ϼ��� :");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ������ �Է��ϼ��� :");
		int num2 = sc.nextInt();
		int sum = 0;
		
		if(num1 < num2) {
			// ù ��° �Է°��� �� ��° �Է°� ���� �۾ƾ� ��
			for(int i = num1; i <= num2; i++) {
				sum += i;
			}
			System.out.println("�� �� " + num1 +"," + num2 + "�� �� :" + sum);
		}else {
			System.out.println("ù ��° �Է°�"+ num1 + "��" + " �� ��° �Է°�" + num2 + "���� �۾ƾ� �մϴ�.");
		}
		
	}
	
	public void method9() {
		// 1���� 20���̿� �ִ� 3�� ��� ����ϱ�
		// �μ��� �Է¹޾� 3�� ��� ����ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ������ �Է��ϼ��� :");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ������ �Է��ϼ��� :");
		int num2 = sc.nextInt();
		System.out.print("����� �Է��ϼ��� :");
		int baesu = sc.nextInt();
		
		if(num1 < num2) {
			// ù ��° �Է°��� �� ��° �Է°� ���� �۾ƾ� ��	
			for(int i=num1; i<=num2; i++) {
				//if���� ���ǹ����� �� �Ǵ� ������ ���;� ��
				if(i % baesu==0) {// 3�� ����� ���
					System.out.print(i + " ");
				}
			}
		}else {
			System.out.println("ù ��° �Է°�"+ num1 + "��" + " �� ��° �Է°�" + num2 + "���� �۾ƾ� �մϴ�.");
		}
		System.out.println();
	}
	
	/*******************************************************************************************/
	
	// ��ø for��
	
	public void method10() {
		// 1���� 5���� ��µǴ� ������ 5�� ����ϱ�
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		
		for(int i = 1; i <= 5; i++) { //���� ���
			
			System.out.print("("+ i + ")");
			
			for(int j= 1; j <= 5; j++) { // �������
			    System.out.print(j + " ");
			}
			System.out.println();//�ٹٲ�
		}
	}
	
	public void method11() {
		// 0�� 0�� ���� 23�� 59�б��� ����ϱ�
		for(int hour = 0; hour < 24; hour++) {
			for(int min = 0; min < 60; min++) {
				for(int sec = 0; sec < 60; sec++) {
				System.out.printf("%2d�� %2d�� %2d��\n", hour, min, sec);
				}
			}
		}
	}
	
	public void method12( ) {
		// ������ 2~9�� ����  ��� ���
		for(int dan = 2; dan <= 9; dan++) {
			for(int num = 1; num <= 9; num++) {
			   System.out.printf("%2d x %2d = %2d\n", dan, num, dan*num);
				               // 2 x 5 = 10
			}
			System.out.println();
		}	
	}
	
	public void method13() {
		// �����!!!!!!!!
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
	   // �� �ٿ� ��ǥ���ڸ� �Էµ� �ټ��� ĭ ����ŭ ���
	   // ��, �ټ��� ĭ���� ��ġ�ϴ� ��ġ���� �ٹ�ȣ�� ���� ������ ���
		/*
		 1***** 
		 *2**** 
		 **3*** 
		 ***4** 
		 ****5*
		 *****6 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("�ټ��� �Է��ϼ��� :");
		int num1 = sc.nextInt();
		System.out.print("ĭ���� �Է��ϼ��� :");
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
