package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	// ���� ������
	// ���ǽ� ? ��1 : ��2
	// ��1�� ���ǽ��� true�� �� ����Ǵ� ��
	// ��2�� ���ǽ��� false�� �� ����Ǵ� ��
	// ���ǽĿ��� �ַ� ��, �� �����ڷ� �̷���� ���� ����
	// --> ���� ����� true �Ǵ� false�� ��
	public void method1() {
		// �Է¹��� ������ ¦���� "¦��"
		// Ȧ���� "Ȧ��" ���ڿ� ���
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int input = sc.nextInt();
		
		String result = (input % 2 == 0)? "¦��" : "Ȧ��";
		
		System.out.println("�Է��Ͻ� ����" + input + "��" + result + "�Դϴ�.");
	}
	
	public void method2() {
		// �Է¹��� ������ ����̸� "���"
		// �����̸� "����", 0�̸� "0" ���
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Է� :");
		int input = sc.nextInt();
		
		String result = (input == 0 ? "0" : (input < 0 ? "����" : "���"));
		
		System.out.println("�Է��Ͻ� ����" + input + "��" + result + "�Դϴ�.");
	}
	
	public void method3() {
		// ���� 2����, '+' or '-' �� �Է¹޾�
		// ���� 2���� �������� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ���� : ");
		int num1 = sc.nextInt();
		
		System.out.println("�ι�° ���� : ");
		int num2 = sc.nextInt();
		
		sc.nextLine(); // ���ͻ���
		
		System.out.println("������ �Է�(+ or -) : ");
		char op = sc.nextLine().charAt(0);
		
		// +, -,�̿��� (*, /, %) --> "�߸��Է��Ͽ����ϴ�."
		String result = (op == '+') ? (num1 + num2 +"") : 
	           ((op == '-') ? (num1 - num2 +"") : "�߸��Է��Ͽ����ϴ�.");
		System.out.println(result);
		
	}
}
