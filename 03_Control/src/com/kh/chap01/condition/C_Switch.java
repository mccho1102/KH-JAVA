package com.kh.chap01.condition;

import java.util.Scanner;

public class C_Switch {
	// switch��
	/*
	 * switch(���� �� �����){
	 * case ��1 : �����ڵ�1; break;
	 * case ��2 : �����ڵ�2; break;
	 * case ��3 : �����ڵ�3; break;
	 * ...
	 * default : �����ڵ�4;
	 * }
	 */
	
	public void method1() {
		// 1~3�� ������ �Է¹޾�
		// 1�̸� "������"
		// 2�̸� "�Ķ���"
		// 3�̸� "�ʷϻ�"
		// �̿��� ���ڴ� "�߸��Է��ϼ̽��ϴ�."

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		switch(num){
		 case 1 : System.out.println("������"); break;
		 case 2 : System.out.println("�Ķ���"); break;
		 case 3 : System.out.println("�ʷϻ�"); break;
		 default : System.out.println("�߸� �Է��Ͽ����ϴ�.");
		  }
	}
	
	public void method2() {
		// ���ϸ��� �Է¹����� �ش� ���� ���� ���
		// ��� - 1000��
		// �ٳ��� - 3000��
		// ������ - 2000��
		// �Ѷ�� - 5000��
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		String fruit = sc.nextLine();
		
		int price = 0;
		
		switch(fruit) {
		case "���" : price = 1000; break;
		case "�ٳ���" : price = 3000; break;
		case "������" : price = 2000; break;
		case "�Ѷ��" : price = 5000; break;
		}
		
		if(price != 0) {
		    System.out.print(fruit + "�� ������ " + price + "�� �Դϴ�.");
		}else {
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
		}
	}
	
	
	public void method3() {
		// ��޺� ���� �ο��ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� �Է��ϼ���(1,2,3): ");
		int level = sc.nextInt();
		
		// level 1 : ����, ����, �б�
		// level 2 :       ����, �б�
		// level 3 :            �б�
		
		switch(level) {
		case 1 : System.out.print("����");
		case 2 : System.out.print("����"); 
		case 3 : System.out.print("�б�"); break;
		default : System.out.print("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	 
}


