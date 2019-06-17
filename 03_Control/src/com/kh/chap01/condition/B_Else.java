package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {
    // if - else �� : ������ �ΰ��� ���(T/F) ���
	/*
	 * if(���ǽ�){
	 *    �����ڵ�1; 
	 * } else {
	 *    �����ڵ�2;
	 * }
	 * 
	 * --> ���ǽ��� true�� ��� if�� ���ο� �ִ� �����ڵ� 1 ����
	 * --> ���ǽ��� false�� ��� else�� ���ο� �ִµ� �����ڵ�2 ����
	 * 
	 */
	
	// if - else if - else : ������ ���� �̻��� ��� ���
	/*
	 * if(���ǽ�1){
	 *      �����ڵ�1;
	 * } else if(���ǽ�2){     
	 *      �����ڵ�2;
	 * } else {
	 *      �����ڵ�3;
	 * }
	 * 
	 * --> ���ǽ�1 == true�� ���, �����ڵ�1 ����
	 * --> ���ǽ�1 == false�� ���, 
	 *     --> ���ǽ�2 T/F Ȯ��
	 *     --> ���ǽ�2 == true�� ���, �����ڵ�2 ����
	 *     
	 * --> ��� ���ǽ��� false �� ���, �����ڵ�3 ����
	 *     
	 */
	
	public void method1() {
		// ¦��, Ȧ��
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�:");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("¦��");
		}else {
			System.out.println("Ȧ��");
		}
	}
	
	public void method2() {
		// ���, ����, 0
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է� : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("���");
		}else if(num == 0){
			System.out.println("��");
		}else {
			System.out.println("����");
		}
		
	}
	
	public void method3() {
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
		}else if(age <= 19) {
			str = "û�ҳ�";
		}else  {
			str = "����";
		}
		System.out.println("���� :" + age);
		System.out.println(str);
	}
	
	public void method4() {
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
		}else if(sex == 'M') {
			gen = "���л�";
		}else {
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
	
	public void method5() {
		// �Է¹��� �̸��� ������ �̸��� �´��� Ȯ���ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ���:");
		String name = sc.nextLine();

		if(name.equals("��â��")) {
			System.out.println("������ �½��ϴ�.");
		}else {
			System.out.println("������ �ƴմϴ�");
		}
	}
	
	public void method6() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϴ� ���� �־� �ּ���");
		int month = sc.nextInt();
		String season = "";
		
		if(month == 1 || month == 2 || month == 12) {
			season = "�ܿ�";
		}else if(month >= 3 && month <= 5) {
			season = "��";
		}else if(month >= 6 && month <= 8) {
			season = "����";
		}else if(month >= 9 && month <= 11) {
			season = "����";
		}else {
			season = "�ش��ϴ� ������ �����ϴ�.";
		}
		
		System.out.print(month + "���� " + season + "�Դϴ�.");
	}
	
	public void method7() {
		// ������ �ϳ� �Է¹޾� ����� ���� ������ ����� ����ϴ� �޼ҵ�
		// 90�� �̻��� A���
		// 90�� �̸� 80�� �̻��� B���
		// 80�� �̸� 70�� �̻��� C���
		// 70�� �̸� 60�� �̻��� D���
		// 60�� �̸��� F���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��� �ּ���");
		int jumsu = sc.nextInt();
		String grade = "";
		
		if(jumsu <= 100 && jumsu >= 90 ) {
			grade = "A���";
		}else if(jumsu < 90 && jumsu >= 80) {
			grade = "B���";	
		}else if(jumsu < 80 && jumsu >= 70) {
			grade = "C���";	
		}else if(jumsu < 70 && jumsu >= 60) {
			grade = "D���";	
		}else {
			grade = "F���";
		}
		
		System.out.print(jumsu + "�� " + grade + "�Դϴ�.");
	}
	
	public void method8() {
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
		double jumsu = sc.nextDouble();
		sc.nextLine();
		System.out.print("������ �Է��� �ּ��� : ");
		char sex = sc.nextLine().charAt(0);
		
		// ������ �˸°� �Է��� ���
		if(sex == 'M' || sex == 'F') {
			String gen = "";
			if(sex == 'F') {
				gen = "���л�";
			}else if(sex == 'M') {
				gen = "���л�";
			}else {
				System.out.println("������ �߸� �ԷµǾ����ϴ�.");
				gen = "�ܰ���";
			}
			
			
			// 3�г� 4�� 15�� �ڽſ� ���л��� ������ 85.75�̴�.
			System.out.println(grade + "�г�" + ban + "��" + num + "��" + name + 
					gen + "�� ������" + jumsu + "�̴�" );
		 
		}
		
		// ������ �߸� �Է��� ���
		else {
			System.out.println("������ �߸� �Է��ϼ̽��ϴ�.");
		}
		
	}
	
}
