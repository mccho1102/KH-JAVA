package com.kh.variable;

import java.util.Scanner;

public class B_KeyboardInput {
	
	// Ű����� �ڱ� �̸� �Է¹޾Ƽ� ����ϱ�
	public void inputScanner1(){
		// java.util ��Ű������ �����ϴ� Ŭ����
    	Scanner sc = new Scanner(System.in);
    	System.out.print("����� �̸��� �Է��ϼ���:");
    	//String name = sc.nextLine();
    	// nextLine() : ����ڰ� �Է��� ���ٿ� ���� ��� ���� �о��.
    	String name = sc.next();
    	// next() : ����ڰ� �Է��� �ܾ��� ������ ������ �Ѵܾ��� ���� �о��.
    	
    	System.out.println("����� �̸���" + name + "�Դϴ�.");
	} 

	public void inputScanner2() {
		Scanner sc = new Scanner(System.in);
		// import ���� Scanner �����
		// java.util.Scanner sc = new java.util.Scanner(System.in);
		
		// �̸�, ��°�, �ָӴϿ� �ִ� ����, Ű
		System.out.print("�̸�: ");
		String name = sc.nextLine();
		
		System.out.print("��°�: ");
		String addr = sc.nextLine();
		
		System.out.println("����: ,Ű: ");
		int cash = sc.nextInt();
		double height = sc.nextDouble();
		
		//System.out.print("Ű: ");
		//double height = sc.nextDouble();
		
		System.out.println(name + "���� ��°���"
				           + addr + "�̰�, ������"
				           + cash + "������ �ְ�, Ű��"
				           + height + "�Դϴ�");
	}
	
	public void inputScanner3() {
		Scanner sc = new Scanner(System.in);
		
		// �̸�, �ּ�, ����, Ű
		System.out.print("�̸�: ");
		String name = sc.nextLine();
		System.out.print("�ּ�: ");
		String addr = sc.nextLine();
		System.out.print("����: ");
		int age = sc.nextInt();
		System.out.print("Ű: ");
		double height = sc.nextDouble();
		
		// nextDouble(), nextInt() ���� �������� ���
		// -> sc.nextLine()�� �ѹ� �� ����Ѵ�.
		sc.nextLine();
		
		System.out.print("�¿��: ");
		String str = sc.nextLine();
		
		System.out.println(name + "����"
		           + age + "���̸�, ��°���"
		           + addr + "�̰�, Ű��"
		           + height + "cm, �¿���� "
		           + str + "�Դϴ�.");
	
	}
	//Ű����� �Է¹��� ������ ����� �� �����ϱ�
	
	public void changeValue() {
		Scanner sc = new Scanner(System.in);
	    // ��������� ���ÿ� �ʱ�ȭ
		String name = "��â��";
		int age = 55;
		double height = 171.2;
		// ����
		char gender = '��';
		
		System.out.println(name + "���� ���̴� " 
				          + age + "���̰�, Ű�� "
				          + height + "cm �̸�, ������"
				          + gender + "�� �Դϴ�.");
		
		System.out.println("[���� �� �Է�]");
		
		System.out.print("�̸�: ");
		name = sc.nextLine();
		
		System.out.print("����: ");
		age = sc.nextInt();
		
		System.out.print("Ű: ");
		height = sc.nextDouble();
		
		sc.nextLine(); //��������
		
		System.out.print("���� ");
		gender = sc.nextLine().charAt(0);
		//charAt(index):
		//���ڿ����� ���ϴ� ��ġ�� ���� �ϳ��� �̴°�
		
		System.out.println(name + "���� ���̴� " 
		          + age + "���̰�, Ű�� "
		          + height + "cm �̸�, ������"
		          + gender + "�� �Դϴ�.");
	}
	
}
