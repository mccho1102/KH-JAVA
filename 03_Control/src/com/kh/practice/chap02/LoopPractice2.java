package com.kh.practice.chap02;

import java.util.Scanner;

public class LoopPractice2 {
  /*
   * �޼ҵ� �� : public void practice1(){}
	����ڷκ��� �� ���� ���� �Է� �޾� 
	1���� �� ���ڱ����� ���ڵ��� ��� ����ϼ���.
	��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�.
	���� 1 �̸��� ���ڰ� �Էµƴٸ� ��1 �̻��� ���ڸ� �Է����ּ��䡰�� ����ϼ���.
	1 �̸��� ���ڰ� �Էµƴٸ� ��1 �̻��� ���ڸ� �Է����ּ��䡱�� ��µǸ鼭
	�ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
	ex.
	1�̻��� ���ڸ� �Է��ϼ��� : 4 1�̻��� ���ڸ� �Է��ϼ��� : 0
	1 2 3 4 1 �̻��� ���ڸ� �Է����ּ���.
	1�̻��� ���ڸ� �Է��ϼ��� : 8
	1 2 3 4 5 6 7 8
   */
	public void practice1(){
		Scanner sc = new Scanner(System.in);
		System.out.println("��� ���ڸ� �Է����ּ���");
		int num = sc.nextInt();

		while(true) {
			if(num < 1) {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���");
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
	 * �޼ҵ� �� : public void practice2(){}
		����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ��� ���ڸ� �Ųٷ� ����ϼ���.
		��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�.
		1 �̸��� ���ڰ� �Էµƴٸ� ��1 �̻��� ���ڸ� �Է����ּ��䡱�� ��µǸ鼭
		�ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
		ex.
		1�̻��� ���ڸ� �Է��ϼ��� : 4 1�̻��� ���ڸ� �Է��ϼ��� : 0
		4 3 2 1 1 �̻��� ���ڸ� �Է����ּ���.
		1�̻��� ���ڸ� �Է��ϼ��� : 8
		8 7 6 5 4 3 2 1
	 */
	public void practice2(){
		Scanner sc = new Scanner(System.in);
		System.out.println("��� ���ڸ� �Է����ּ���");
		int num = sc.nextInt();

		while(true) {
			if(num < 1) {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���");
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
	 * �޼ҵ� �� : public void practice3(){}
		����ڷκ��� �� ���� ���� �Է� �޾� �� ������ ���ڸ� ��� ����ϼ���.
		���� 1 �̸��� ���ڰ� �Էµƴٸ� ��1 �̻��� ���ڸ� �Է����ּ��䡰�� ����ϼ���.
		1 �̸��� ���ڰ� �Էµƴٸ� ��1 �̻��� ���ڸ� �Է����ּ��䡱�� ��µǸ鼭
		�ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
		ex.
		ù ��° ���� : 8 ù ��° ���� : 4 ù ��° ���� : 9
		�� ��° ���� : 4 �� ��° ���� : 8 �� ��° ���� : 0
		4 5 6 7 8 4 5 6 7 8 1 �̻��� ���ڸ� �Է����ּ���.
		ù ��° ���� : 6
		�� ��° ���� : 2
		2 3 4 5 6
	 */
	public void practice3(){
		Scanner sc = new Scanner(System.in);
		System.out.println("��� ����(1)�� �Է����ּ���");
		int num1 = sc.nextInt();
		System.out.println("��� ����(2)�� �Է����ּ���");
		int num2 = sc.nextInt();

		while(true) {
			if(num1 < 1 || num2 < 1) {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���");
				if(num1 < 1) {
					System.out.println("��� ����(1)�� 1 �̻��� ���ڸ� �Է����ּ���");
			    	num1 = sc.nextInt();
				}else {
					System.out.println("��� ����(2)�� 1 �̻��� ���ڸ� �Է����ּ���");
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
	/*�޼ҵ� �� : public void practice4(){}
		����ڷκ��� �Է� ���� ������ �ܺ��� 9�ܱ��� ����ϼ���.
		��, 9�� �ʰ��ϴ� ���ڰ� ������ ��9 ������ ���ڸ� �Է����ּ��䡱�� ����ϼ���.
		9�� �ʰ��ϴ� ���ڰ� �Էµƴٸ� �� 9 ������ ���ڸ� �Է����ּ��䡱�� ��µǸ鼭
		�ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
		���� : 4              ���� : 10
		===== 4�� ===== 9 ������ ���ڸ� �Է����ּ���.
		===== 5�� ===== ���� : 8
		===== 6�� ===== ===== 8�� =====
		===== 7�� ===== ===== 9�� =====
		===== 8�� =====
		===== 9�� =====
        (�ش� ���� ������� ���� �� ����)
	 */
	public void practice4(){
		Scanner sc = new Scanner(System.in);
		System.out.println("��� ���ڸ� �Է����ּ���");
		int dan = sc.nextInt();

		while(true) {
			if(dan > 9) {
				System.out.println("9 ������ ���ڸ� �Է����ּ���");
				dan = sc.nextInt();
			}else {
				break;
			}
			
		}
	        // ������ dan ~ 9�� ����  ��� ���
		for(int i = dan; i <= 9; i++) {
				for(int num = 1; num <= 9; num++) {
				   System.out.printf("%2d x %2d = %2d\n", i, num, i*num);
					               // 2 x 5 = 10
				}
				System.out.println();
			}
	}
	/*�޼ҵ� �� : public void practice5(){}
		����ڷκ��� ���� ���ڿ� ������ �Է� �޾�
		������ ������ ���ڰ� Ŀ���ų� �۾����� ���α׷��� �����ϼ���.
		��, ��µǴ� ���ڴ� �� 10���Դϴ�.
	 	* ���������� ���ڵ� ���̿��� ������ ������ ���� �����ϴ� ���� ���Ѵ�.
		ex) 2, 7, 12, 17, 22 ��
		5 5 5 5 => ���⼭ ������ 5
		ex.
		���� ���� : 4
		���� : 3
		4 7 10 13 16 19 22 25 28 31
	 */
	public void practice5(){
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���ڸ� �Է����ּ���");
		int num = sc.nextInt();
		System.out.println("������ �Է����ּ���");
		int gc = sc.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			    System.out.print(num + " ");
			    num += gc;
		    } 
	
	}
	/*�޼ҵ� �� : public void practice6(){}
		������(+, -, *, /, %) : +
		����1 : 10
		����2 : 4
		10 + 4 = 14
		
		������(+, -, *, /, %) : / ������(+, -, *, /, %) : /
		����1 : 10 ����1 : 10
		����2 : 4 ����2 : 0
		10 / 4 = 2        0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.
		
		������(+, -, *, /, %) : ^ ������(+, -, *, /, %) : exit
		����1 : 10 ���α׷��� �����մϴ�.
		����2 : 4
		���� �������Դϴ�. �ٽ� �Է����ּ���.
	 */
	public void practice6(){
		Scanner sc = new Scanner(System.in);
		String op = null;
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		
		while(true) {
			System.out.print("�����ڸ� �Է�(+,-,*,/,%) �Է��ϼ���: ");
			op = sc.nextLine();
			
			if(op.equals("exit")) {// exit�� �Էµ� ���
				System.out.print("���α׷��� �����մϴ�. ");
				break;
			} // end if
		
			System.out.print("����1�� �Է��ϼ���: ");
			num1 = sc.nextInt();
			
			System.out.print("����2�� �Է��ϼ��� : ");
			num2 = sc.nextInt();
		    sc.nextLine(); // ���ۿ� ���� �ִ� ���๮�� \n�� ���ִ� ���
			
			if(op.equals("/") && num2 == 0) {// 0���� ������ ���
				System.out.print("0���� ���� �� �����ϴ�. �ٽ� �Է� �� �ּ���. ");
				continue;
			} // end if
			
			switch(op) {
    		case("+"):result = num1 + num2;break;
    		case("-"):result = num1 - num2;break;
    		case("*"):result = num1 * num2;break;
    		case("/"):result = num1 / num2;break;
    		case("%"):result = num1 % num2;break;
    		default:System.out.println("�߸��� �����ڸ� �Է��Ͽ����ϴ�.�ٽ� �Է��� �ּ���.");
                     continue;
    		} // end switch
			
			System.out.printf("%d %s %d = %f\n", num1, op, num2, result);
			
    		/* �ٸ� ��� : 
    		     double result = 0; //�������� ������ ���� 
    		     boolean check = true; // �ùٸ� ���������� �Ǵ��� ����
    		     switch(op) {
    		     case('+'): result = num1 + num2; break;
    		     ....
    		     default:System.out.println("�߸��� �����ڸ� �Է��Ͽ����ϴ�.���α׷��� �����մϴ�.");
    		             check = false;
    		     }
    		     if(check){  
    		     System.out.printf("%d %s %d = %f\n", num1, op, num2, result);
    		     } 
    	   */
		}	    		
	}
}
