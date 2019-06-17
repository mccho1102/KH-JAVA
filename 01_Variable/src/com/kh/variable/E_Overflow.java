package com.kh.variable;

public class E_Overflow {
	// 오버플로우
	public void overflow() {
		byte bNum = 127;
		
		byte bNum2 = (byte)(bNum + 1);
		
		System.out.println("bNum : " + bNum);
		System.out.println("bNum2 : " + bNum2);
	}
	
	// 결과값의 크기를 예상하여 알맞는 자료형 선택하기
	public void calc() {
		int num1 = 1_000_000;
		int num2 = 700_000;
		
		int multi = num1 * num2; // 7천억
		
		System.out.println("multi : " + multi);
		
		long multi2 = (long)num1 * num2;
		System.out.println("multi2 :" + multi2);
	}
}
