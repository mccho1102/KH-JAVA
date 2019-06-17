package com.kh.chap01_Exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ExceptionController {
	// UnChecked Exception Ȯ��
	// ���α׷� �ۼ��� ������ ����ó���� ���� �ʰ�
	// if�� ���� ���ǹ����� ó�� ������ ����
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�Է� ���� �� ������ ������ �� ���ϱ�");
		System.out.println("�Է� 1 : ");
		int num1 = sc.nextInt();
		
		System.out.println("�Է� 2 : ");
		int num2 = sc.nextInt();
		
		System.out.println("��� : " + (num1 / num2));
	}
	
	// Checked Exception
	// ���ǹ� ���� �ڵ�� �ذ��� �� ���� ���ܸ�
	// �߻���ų ���ɼ��� �ִ� ���
	// �ݵ�� ����ó���� �ؾ� �Ǵ� ����(Exception)
	
	public void method2() {
		BufferedReader br = null;
		
		
		try {
			System.out.println("�Է¹��� ���ڿ� ����ϱ�");
			
			br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("�Է�:");
			String str = br.readLine(); // IOException �߻� ���ɼ��� ����
			// �������� �ڵ� �ƴ�!, ���÷θ� ����ϱ�
			throw new IOException();
			//System.out.println("�Է� ���� ���ڿ� : " + str);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
