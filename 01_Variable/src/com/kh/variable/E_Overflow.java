package com.kh.variable;

public class E_Overflow {
	// �����÷ο�
	public void overflow() {
		byte bNum = 127;
		
		byte bNum2 = (byte)(bNum + 1);
		
		System.out.println("bNum : " + bNum);
		System.out.println("bNum2 : " + bNum2);
	}
	
	// ������� ũ�⸦ �����Ͽ� �˸´� �ڷ��� �����ϱ�
	public void calc() {
		int num1 = 1_000_000;
		int num2 = 700_000;
		
		int multi = num1 * num2; // 7õ��
		
		System.out.println("multi : " + multi);
		
		long multi2 = (long)num1 * num2;
		System.out.println("multi2 :" + multi2);
	}
}
