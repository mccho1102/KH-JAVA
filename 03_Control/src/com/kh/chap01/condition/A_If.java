package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	// �ܵ� if��
	/*
	 * if(���ǽ�){
	 *      ������ �ڵ�;
	 * }
	 * 
	 * --> ���ǽ��� true�̸� {}(��) ���� �ڵ� ����
	 * --> ���ǽ��� false�̸� if���� �ǳ� ��.
	 * 
	 */
	
	public void method1() {
		// ����̴�/����� �ƴϴ�
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�����Է� :");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("�����.");
		}
		
		if(num < 0) {
			System.out.println("������.");
		}
		
		if(num == 0) {
			System.out.println("���̴�.");
		}
	}
	
	public void method2() {
		// �Է¹��� ���� ¦�� ���� Ȧ�� ����?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Է� :");
		int num = sc.nextInt();
		
		if(num % 2 == 0 ) {
			System.out.println("¦��");
		}
		
		if(num % 2 != 0) {
			System.out.println("Ȧ��");
		}
		
	}
	
	public void method3() {
		/* Ű����� �Է� ���� ������ ������ ����ϰ� ����� ���� ���� ȭ�鿡 ����Ͽ� Ȯ���ϼ���.
			�� �� ������ ��M���̸� ���л�, ��M���� �ƴϸ� ���л����� ��� ó�� �ϼ���.
			ex.
			�̸� : �ڽſ�
			�г�(���ڸ�) : 3
			��(���ڸ�) : 4
			��ȣ(���ڸ�) : 15
			����(M/F) : F
			����(�Ҽ��� �Ʒ� ��°�ڸ�����) : 85.75
			3�г� 4�� 15�� �ڽſ� ���л��� ������ 85.75�̴�.
		 */
        Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��� �ּ��� : ");
		String name = sc.nextLine();
		
		System.out.print("�г��� �Է��� �ּ��� : ");
		int grade = sc.nextInt();
		sc.nextLine();
		System.out.print("���� �Է��� �ּ��� : ");
		int ban = sc.nextInt();
		sc.nextLine();
		System.out.print("��ȣ�� �Է��� �ּ��� : ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.print("������ �Է��� �ּ��� : ");
		char sex = sc.nextLine().charAt(0);
		
		String gen = "";
		
		if(sex == 'F') {
			gen = "���л�";
		}
		if(sex == 'M') {
			gen = "���л�";
		}
		if(sex != 'F' && sex != 'M') {
			System.out.println("������ �߸� �ԷµǾ����ϴ�.");
			gen = "�ܰ���";
		}
			
		System.out.print("������ �Է��� �ּ��� : ");
		double jumsu = sc.nextDouble();
		sc.nextLine();
		// 3�г� 4�� 15�� �ڽſ� ���л��� ������ 85.75�̴�.
		System.out.println(grade + "�г�" + ban + "��" + num + "��" + name + 
				gen + "�� ������" + jumsu + "�̴�" );
		// 
	}
	
	public void method4() {
		/* ���̸� Ű����� �Է� �޾� ���(13�� ����)����, û�ҳ�(13�� �ʰ� ~ 19�� ����)����,
			����(19�� �ʰ�)���� ����ϼ���.
			ex.
			���� : 19
			û�ҳ�         */
        Scanner sc = new Scanner(System.in);
		
		System.out.print("���̸� �Է��� �ּ��� : ");
		int age = sc.nextInt();
		
		String str = "";
		if(age <= 13) {
			str = "���";
		}
		if(age > 13 && age <= 19) {
			str = "û�ҳ�";
		}
		if(age > 19) {
			str = "����";
		}
		System.out.println("���� :" + age);
		System.out.println(str);
	}
	
	public void method5() {
		// �Է¹��� �̸��� ������ �̸��� �´��� Ȯ���ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ���:");
		String name = sc.nextLine();

		if(name.equals("��â��")) {
			System.out.println("������ �½��ϴ�.");
		}
		if(!name.equals("��â��")) {
			System.out.println("������ �ƴմϴ�");
		}
	}
	
}
