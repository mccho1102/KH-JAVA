package com.kh.operator;

import java.util.Scanner;

public class D_Comparison {
	// �� ������
	// �� ���� ���� ���ϴ� ������(���迬���� ��� ��)
	
	// a < b --> a �� b �̸��ΰ�?
	// a > b --> a �� b �ʰ��ΰ�?
	// a == b --> a �� b�� ������?
	// a != b --> a �� b�� ���� ������?
	// a <= b --> a �� b �����ΰ�?
	// a >= b --> a �� b �̻��ΰ�?
	
	public void method1() {
		int a = 10;
		int b = 25;
		
		System.out.println(a==b); // 0
		System.out.println(a!=b); // 1
		System.out.println(a>b);  // 0
		System.out.println(a<b);  // 1 
		System.out.println(a>=b); // 0
		System.out.println(a<=b); // 0
	}
	
	public void method2() {
		// �Է¹��� ���� ¦������ Ȧ������ �˻��ϱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����Է� : ");
		int input = sc.nextInt();
		
		System.out.println("¦���� �½��ϱ�?" + ((input % 2) == 0));
	}
}
