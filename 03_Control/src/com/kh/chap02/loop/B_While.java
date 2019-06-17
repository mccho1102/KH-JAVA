package com.kh.chap02.loop;

import java.util.Scanner;

public class B_While {
    // while��
	
	/* [�ʱ��]
	 * while(���ǽ�){
	 *  ������ ����;
	 *  [������ or �б⹮;]
	 * }
	 * 
	 * ���� 1ȸ��
	 * ���ǽ� Ȯ�� -> (���ǽ� true) ������ ���� ����
	 * 
	 * 2ȸ�� ����
	 * ���ǽ� Ȯ�� -> (���ǽ� true) ������ ���� ����
	 * 
	 * ���ǽ��� false�� ���� �� ���� ��� �ݺ�
	 */
	
	public void method1() {
		// 1���� 5���� While���� �̿��Ͽ� ���
		
		int i = 1; // �ʱ��
		while(i<=5) { // ���ǽ�
			System.out.print(i + " ");
			i++; // ������
		}
	}
	
	public void method2() {
		// 5���� 1���� ���
		
		int i = 5; // �ʱ��
		while(i>0) { // ���ǽ�
			System.out.print(i+" ");
			i--; // ������
		}
	}
	
	public void method3() {
		// 1~20 ������ 4�� ��� ����ϱ�(1, 20 ����)
		int i = 1;
		while(i <= 20){
			if(i % 4 == 0) {
				System.out.print(i + " ");
			}
			
			i++; // ������
		}
	}
	
	public void method4() {
		// 1���� �߻��� ���������� �� ����ϱ�(while�� ���)
		// ��, ������ ������ 1 ~ 100
		int random = (int)(Math.random() * 100 + 1);
        // 0.0 <= ���� < 101.0
		int sum = 0;//�հ�
		int i = 1; //�ʱ��
		while(i <= random) {
			sum += i;
			i++;
		}
		System.out.println("1����" + random + "������ �� : " + sum );
	}
	
	public void method5(){
		// -1�� �Էµ� �� ���� �Է¹��� �� ���ϱ�
		
		Scanner sc = new Scanner(System.in);
		int num = 0; // �Է¹��� �� ����
		int sum = 0; // �Է¹��� �� ���ϱ�
		
		while(num != -1) {// ���� ����
			System.out.print("�Է�: ");
			num = sc.nextInt();
			
			if(num != -1) {//�� ����
			   sum += num;
			}
		}
		System.out.print("���� �� : " + sum);
	}
	
	public void method6(){
		// 0�� �Էµ� �� ���� �Է¹��� �� ���ϱ�
		
		Scanner sc = new Scanner(System.in);
		int sum = 0; // �Է¹��� �� ���ϱ�
		int num = 1; // �Է¹��� �� ����
		// 0�� �ƴ� ������ ������ �ʱ�ȭ �صα�
		
		while(num != 0) {// ���� ����
			System.out.print("�Է�: ");
			num = sc.nextInt();
			
			sum += num;
		}
		System.out.print("���� �� : " + sum);
	}
	
	public void method7() {
		// ���ڿ��� �Է¹޾� �ε����� ���� ���
		// ex)
		// �Է� : abc
		// 0�� �ε��� : a
		// 1�� �ε��� : b
		// 2�� �ε��� : c
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		String str = sc.nextLine();
		
		int index = 0; //�ʱ��
		while(index < str.length()) {// ���ǽ�
			// String.length() : ���ڿ��� ���� ��ȯ
			char ch = str.charAt(index);
			System.out.println(index + "�� �ε��� : " + ch);
			
			index++; // ������
		}
	}
	
	// ��ø while��
	public void method8() {
		// (1) 12345
		// (2) 12345
		// (3) 12345
		// (4) 12345
		// (5) 12345
        
		int i = 1; 
		while(i <= 5) {// ��(��)
			System.out.print("("+i+")");
			
			int j = 1;
			while(j<=5) {// ĭ(��)
				System.out.print(j);
				j++;
			}
			System.out.println();
			
			i++;
		}
	}
	// �ð����
	
	public void method9() {
		int i = 0;
		while(i < 3) {
			
			int j = 0;
			while(j < 60) {
				
				int k = 0;
				while(k < 60) {
					
				  System.out.print(i +"��");
				  System.out.print(j +"��");
				  System.out.println(k +"��");
				  k++;
				}
			    j++;
			}
			System.out.println();
			i++;
		}

	}
	
	public void method10() {
		// �޴� �����
		Scanner sc = new Scanner(System.in);
		int num = -1;
		
		while(num != 0) {
		    System.out.println("������ �޼ҵ带 1~9 �����ϼ���! ���α׷� ����� 0�Դϴ� : ");
		    num = sc.nextInt();
		
		    switch(num) {
		    case 1 : System.out.println("method1() ����");
		             method1(); break;
		    case 2 : System.out.println("method2() ����"); 
					 method2(); break;
		    case 3 : System.out.println("method3() ����"); 
		    		 method3(); break;
		    case 4 : System.out.println("method4() ����"); 
		    		 method4(); break;
		    case 5 : System.out.println("method5() ����"); 
   		       		 method5(); break;
		    case 6 : System.out.println("method6() ����"); 
					 method6(); break;
		    case 7 : System.out.println("method7() ����"); 
					 method7(); break;
		    case 8 : System.out.println("method8() ����"); 
					 method8(); break;
		    case 9 : System.out.println("method9() ����"); 
					 method9(); break;
		    case 0 : System.out.println("���α׷��� �����մϴ�.");
		                        break;
		    default : System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
		}// end switch
	  }// end while
	}
	
	public void method11() {
		// �޴� ����� do ~ while ������...
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		do {
		    System.out.println("������ �޼ҵ带 1~9 �����ϼ���! ���α׷� ����� 0�Դϴ� : ");
		    num = sc.nextInt();
		
		    switch(num) {
		    case 1 : System.out.println("method1() ����");
		             method1(); break;
		    case 2 : System.out.println("method2() ����"); 
					 method2(); break;
		    case 3 : System.out.println("method3() ����"); 
		    		 method3(); break;
		    case 4 : System.out.println("method4() ����"); 
		    		 method4(); break;
		    case 5 : System.out.println("method5() ����"); 
   		       		 method5(); break;
		    case 6 : System.out.println("method6() ����"); 
					 method6(); break;
		    case 7 : System.out.println("method7() ����"); 
					 method7(); break;
		    case 8 : System.out.println("method8() ����"); 
					 method8(); break;
		    case 9 : System.out.println("method9() ����"); 
					 method9(); break;
		    case 0 : System.out.println("���α׷��� �����մϴ�.");
		                        break;
		    default : System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
		}
	  }while(num != 0);
	}		
}
