package com.kh.operator;

public class F_Compound {
	// ���� ���� ������
	// �ٸ� �����ڿ� ���� �����ڸ� �Բ� ����ϴ� ������
	// ��� ���� ���� : +=, -=, /=, %=
	// ����Ʈ ���� ���� : <<=, >>=, <<<= (����)
	
	public void method1() {
		int num = 12;
		// num�� 3 ������Ű��
		System.out.println("num 3����: " + (num += 3) );
		
		// num�� 5 ���ҽ�Ű��
		System.out.println("num 5����: " + (num -= 5) );
		
		// num�� 6�� ������Ű��
		System.out.println("num 6�� ����: " + (num *= 6) );
		
		// num�� �������� ����
		System.out.println("num �������� ����: " +(num /= 2));
		
		// num�� 4�� ������ �� ������
		System.out.println("num 4�� ������ �� ������: " +(num %= 4));
	}
}
