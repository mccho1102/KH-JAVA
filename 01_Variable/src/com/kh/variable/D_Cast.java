package com.kh.variable;

public class D_Cast {
	// �ڵ� ����ȯ
	public void rule1() {
		// ���� ������ ���������� ū������ �ڵ������� ��ȯ
		
		// int -> double
		int i = 12;
		double d = 3.3;
		
		double result = i + d;
		
		System.out.println("result : " + result);
		
		// int -> long
		int i2 = 2_147_483_647; // int�� �ִ밪
		long l2 = i2 + 1000000000000000L;
		System.out.println("i2 : " + i2);
		System.out.println("L2 : " + l2);
		
		// float -> double
		float f3 = 1.0f;
		float f4 = 3.1231231231235f;
		double d3 = f4;
		
		System.out.println("f3+f4:" + (f3+f4));
		System.out.println("f3+d3:" + (f3+d3));
		
		// long -> float
		long l5 = 12345678910L;
		float f5 = l5;
		
		System.out.println("l5 : " + l5);
		System.out.println("f5 : " + f5);
		
		// char -> int
		char ch6 = 'A';
		int i6 = ch6 + 5;
		System.out.println("i6 : " + i6);
		
		char ch7 = 65;
		System.out.println("ch7 : " + ch7);
		
		// byte, short, int ���ͷ�
		
		// -128 ~ 127
		byte b8 = 127; // int ���ͷ�
		byte b9 = 1;
		
		// byte b10 = b8 + b9;
		
		// ����Ʈ ���� ���� �ذ���
		// 1) ����� int������ �޴´�
		int i10 = b8 + b9;
				
		// 2) ����Ʈ�� ����� ����ϴ� ���
		// -> ��������ȯ		
	}
	// ���� ����ȯ
	public void rule2(){
		// ���� ������ ū �ڷ��� -> ���� �ڷ������� ���������� ��ȯ
		
		int iNum = 10;
		double dNum = 5.89;
		
		
		// int sum =iNum + dNum;
		
		// �ذ��� 1
		// double sum = iNum + dNum;
		// �ذ��� 2
		// dNum�� int������ ����ȯ
		int sum = iNum + (int)dNum;
		// 10 + (int)5.89
		// 10 + 5
		// 15
		// �ذ��� 3
		// iNum + dNum�� ����� int�� ���� ����ȯ
		sum = (int)(iNum + dNum);
		System.out.println("sum : " + sum);
	}
	
	// ������ �ս�
	public void datalose() {
		int iNum = 290;
		byte bNum = (byte)iNum;
		
		System.out.println("bNum : " + bNum);
	}
	
}
