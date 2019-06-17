package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	public void method1() {
		for(int i=0; ; i++) {
			System.out.println(i+"�� ���");
			
			if(i == 10) {
				break;
			}
		}
	}
	
	public void method2() {
		// ���ڿ��� �Է¹޾� ���� ������ ����ϴ� �ݺ� ���α׷�
		// ��, "end" �Է½� ���α׷� ����
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("���ڿ� �Է� : ");
			String str = sc.nextLine();
			
			if(str.equals("end")) {
				System.out.println("���α׷��� �����մϴ�.");
				break; // if���� ������Ű�� �ǹ̰� �ƴ϶� ���� ����� while���� �����Ŵ
			}
			
			System.out.println(str+"�� ���ڰ��� : " + str.length());
			
		}
		
	}
	
	public void method3() {
		// ������ 2~9�� ����  ��� ���
				for(int dan = 2; dan <= 9; dan++) {// ��
					for(int num = 1; num <= 9; num++) {// �ܿ� �������� ��
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
