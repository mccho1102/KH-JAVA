package com.kh.practice1;

import java.util.Scanner;

public class VariablePractice1 {
	// �ǽ�����1
	// �̸�, ����, ����, Ű�� ����ڿ��� �Է� �޾�
	// ������ ���� ������ ��� ����ϼ���
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸�: ");
		String name = sc.nextLine();
		System.out.print("����: ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("����: ");
		int age = sc.nextInt();
		System.out.print("Ű: ");
		double height = sc.nextDouble();
		
		System.out.println(name + "���� ������ " 
		          + gender + "�� �̰�, ���̴� "
		          + age + "�̸�, Ű��"
		          + height + "cm �Դϴ�.");
		
	}
	
	// �ǽ�����2
	// Ű����� ���� �� ���� �Է� �޾� �� ���� ��, ��, ��, �������� ���� ����ϼ���.
	/* ex.
	    ù ��° ���� : 23
	    �� ��° ���� : 7
	    ���ϱ� ��� : 30
	    ���� ��� : 16
	     ���ϱ� ��� : 161
	    ������ �� ��� : 3  
	*/    
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ����: ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ����: ");
		int num2 = sc.nextInt();
		
		int plus = num1 + num2;
		int minus = num1 - num2;
		int mult  = num1 * num2;
		int nanugi = num1 / num2;
		
		System.out.println("���ϱ� ��� : " + plus);
		System.out.println("���� ��� : " + minus);
		System.out.println("���ϱ� ��� : " + mult);
		System.out.println("������ ��� : " + nanugi);
	}
	
	/*Ű����� ����, ���� ���� ���� �Ǽ������� �Է� �޾� �簢���� ������ �ѷ��� ����Ͽ� ����ϼ���.
	   ��� ���� ) ���� : ���� * ����
	   �ѷ� : (���� + ����) * 2
		ex.
		���� : 13.5
		���� : 41.7
		���� : 562.95
		�ѷ� : 110.4
	*/	
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �� : ");
		double num1 = sc.nextDouble();
		System.out.print("���� �� : ");
		double num2 = sc.nextDouble();
		
		double menjuk = num1 * num2;
		double dule = (num1 + num2) * 2;
		
		
		System.out.println("���� : " + num1);
		System.out.println("���� : " + num2);
		System.out.println("���� : " + menjuk);
		System.out.println("�ѷ� : " + dule);
	}
	
	/* ���� ���ڿ� ���� Ű����� �Է� �޾� ���ڿ��� �տ��� �� ���� ����ϼ���.
	ex.
	���ڿ��� �Է��ϼ��� : apple
	ù ��° ���� : a
	�� ��° ���� : p
	�� ��° ���� : p
	*/
	public void method4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��ϼ���: ");
		String munjayeul = sc.nextLine();
		System.out.println("ù��° ����: " + munjayeul.charAt(0));
		System.out.println("�ι�° ����: " + munjayeul.charAt(1));
		System.out.println("����° ����: " + munjayeul.charAt(2));
		
		
	}
	
}
