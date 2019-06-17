package com.kh.practice2;

import java.util.Scanner;

public class CastingPractice1 {
	public void castMethod1(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		char munja = sc.nextLine().charAt(0);
		int unicd = munja;
		System.out.println(munja + "의 유니코드 :" + unicd);
	}
}
