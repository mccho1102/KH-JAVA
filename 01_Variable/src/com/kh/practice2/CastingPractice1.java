package com.kh.practice2;

import java.util.Scanner;

public class CastingPractice1 {
	public void castMethod1(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		char munja = sc.nextLine().charAt(0);
		int unicd = munja;
		System.out.println(munja + "�� �����ڵ� :" + unicd);
	}
}
