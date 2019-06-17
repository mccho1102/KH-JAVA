package com.kh.chap03_trycatch.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchController {
	public void method1() {
			Scanner sc = new Scanner(System.in);
			try {	
			   System.out.println("�Է� ���� �� ������ ������ �� ���ϱ�");
			   System.out.println("�Է� 1 : ");
			   int num1 = sc.nextInt();
			
			    System.out.println("�Է� 2 : ");
		    	int num2 = sc.nextInt();
			
		    	System.out.println("��� : " + (num1 / num2));
			} catch (ArithmeticException e) {
				System.out.println("0���� ������ �����ϴ�.");
			} catch (InputMismatchException e) {
				System.out.println("0���� ������ �����ϴ�.");
			} finally {
				System.out.println("������ ����Ǵ� ����");
				System.out.println("���α׷� ����");
			}
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
				
				System.out.print("�Է�1:");
				int num1 = Integer.parseInt(br.readLine()); // IOException �߻� ���ɼ��� ����
				
				System.out.print("�Է�2:");
				int num2 = Integer.parseInt(br.readLine()); // IOException �߻� ���ɼ��� ����
				
				System.out.println("��� : " + (num1 / num2));
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("IOException �߻���");
				e.printStackTrace();
			} catch(NumberFormatException e) {
				 System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�.");
			} catch (ArithmeticException e) {
				System.out.println("0���� ������ �����ϴ�.");
		    } finally {
		    	// BufferedReader ��ȯ
		    	try {
		    		System.out.println("BufferedReader ��ȯ");
					br.close();
					System.out.println("���α׷� ����");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
	}
		
		public void method3() {
	
		
			try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
				System.out.println("�Է¹��� ���ڿ� ����ϱ�");
				
		
				System.out.print("�Է�1:");
				int num1 = Integer.parseInt(br.readLine()); // IOException �߻� ���ɼ��� ����
				
				System.out.print("�Է�2:");
				int num2 = Integer.parseInt(br.readLine()); // IOException �߻� ���ɼ��� ����
				
				System.out.println("��� : " + (num1 / num2));
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("IOException �߻���");
				e.printStackTrace();
			} catch(NumberFormatException e) {
				 System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�.");
			} catch (ArithmeticException e) {
				System.out.println("0���� ������ �����ϴ�.");
		    } finally {
		    	// BufferedReader ��ȯ
		    	System.out.println("���α׷� ����");
		    }
	}			
}
