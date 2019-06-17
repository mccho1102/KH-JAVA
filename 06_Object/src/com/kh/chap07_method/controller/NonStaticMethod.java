package com.kh.chap07_method.controller;

import java.util.Scanner;

public class NonStaticMethod {
	
	// �Ű�����, ��ȯ�� ������ ���� ����
	
	// 1. �Ű����� X, ��ȯ�� X ���� �޼ҵ�
	public void method1() {
		// ������ �޼ҵ� ������ ��ɸ� �����ϰ� ������ �� ���
		System.out.println("�Ű������� ��ȯ���� �Ѵ� ���� �޼ҵ�");

		return; // ��ȯ�� void �� ��  JVM�� ������ �� return;�� �ڵ����� �߰�
	}
    
	// 2. �Ű����� X, ��ȯ�� O �޼ҵ�
	public String method2() {
		String str = "�Ű������� ������ ��ȯ���� �ִ� �޼ҵ�";
		return str;
	}
	
	public String method2_1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��� �ּ���: ");
		String name = sc.nextLine();
		return name;

	}
	
	// 3. �Ű����� O, ��ȯ�� X
	public void method3(int num1, int num2) {
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
		
	}
	
	// 4. �Ű����� O, ��ȯ�� O
	public String method4(int num1, int num2) {
		return num1 + "+" + num2 + "=" + (num1 + num2) + "�Դϴ�.";
	}
	
	// 5. �迭
	public int[] method5(int index) {
		// �ε����� ���޹޾�
		// �ε��� ũ�� ��ŭ�� �迭�� ���� ��
		// �� ��ҿ� ������ �ʱ�ȭ �Ͽ� ��ȯ
		int[] arr = new int[index];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * index) +1;
		}
	
		return arr;  // ������ �迭�� �ּҸ� ��ȯ
		
	}
}
