package com.kh.practice2;

import java.util.Scanner;

public class CastingPractice2 {
	public void castMethod2(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int tot = kor + eng + math;
		int evg = tot / 3;
		
		System.out.println("총점 : " + tot);
		System.out.println("평점 : " + evg);
	}
}
