package com.kh.practice2;

import java.util.Scanner;

public class CastingPractice2 {
	public void castMethod2(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int kor = sc.nextInt();
		System.out.print("���� : ");
		int eng = sc.nextInt();
		System.out.print("���� : ");
		int math = sc.nextInt();
		
		int tot = kor + eng + math;
		int evg = tot / 3;
		
		System.out.println("���� : " + tot);
		System.out.println("���� : " + evg);
	}
}
