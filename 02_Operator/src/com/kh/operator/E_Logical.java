package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	// �� ������
	// - �� ���� �� ���� ���ϴ� ������
	// && (AND) : �׸���, ~�̰�, ~�鼭
	// || (OR)  : �Ǵ�, ~�ų�
	
	public void method1() {
		// �Է¹��� ���ڰ� 1�̻��̰� 100 �̸� �� ��� true;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		boolean isTrue = (input >= 1) && (input <= 100);
		System.out.println("���� �ȿ� ���� �½��ϱ�?" + isTrue);
	}
	
	public void method2() {
		// �Է¹��� ����(�� ����)�� ���� �빮������ Ȯ���ϱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		char input = sc.nextLine().charAt(0);
		
		boolean isTrue = (input >= 'A') && (input <= 'Z');
		
		System.out.println("���� �빮�ڰ� �½��ϱ�? " + isTrue);
		
	}
	
	public void method3() {
		// ��A && ��B
		// --> �� A�� false�� �ڸ� ���� ����
		// --> �� B�� ���� �������� ���ƶ�
		
		// ��A || ��B
		// --> �� A�� true�̸� �ڸ� ���� ����
		// --> �� B�� ���� �������� ���ƶ�
		
		int num = 10;
		
		boolean bool = false && (++num > 0);
		System.out.println("num : " + num);
		
		bool = true && (++num < 0);
		System.out.println("num : " + num);
		
		bool = true || (++num < 0);
		System.out.println("num : " + num);	
		
		bool = false || (++num > 0);
		System.out.println("num : " + num);
		
	}
	
	public void method4() {
		// ���� + ��� + �� + ��
	
		int a = 2;
		int b = 3;
			
		boolean c = a > b;             // c:false  a:2, b:3
		boolean d = ++a <= b++;        // d:false  a:3, b:3->4

		System.out.println("a : " +a); // a:3
		System.out.println("b : " +b); // b:4
		System.out.println("c : " +c); // c:false
		System.out.println("d : " +d); // d:true
			
		System.out.println();
			
		System.out.println("!c : " + !c);           // !c:true
		System.out.println("c != d : " + (c != d)); // c != d : true
			
		System.out.println();
			
		System.out.println("(a % b) == 1 : " + ((a % b) == 1)); // false
		System.out.println("(a == 3) && (b == 4) : " + ((a == 3) && (b == 4))); //true
		System.out.println("!d || (a-b) > 0 : " + (!d || (a-b) > 0)); // false
			
		System.out.println();
			
		System.out.println("!(c == d) && ((a * b == 10) || ( b % 2 == 0)) : " + (!(c == d) && ((a * b == 10) || ( b % 2 == 0))));
		                  // true          true
		                           // true
		
		
		
	}		
}
