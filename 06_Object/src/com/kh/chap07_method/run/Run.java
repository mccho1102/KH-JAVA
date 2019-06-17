package com.kh.chap07_method.run;

import java.util.Arrays;
import java.util.Scanner;

import com.kh.chap07_method.controller.NonStaticMethod;

public class Run {

	public static void main(String[] args) {
		
		NonStaticMethod nsm = new NonStaticMethod();
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해 주세요: ");
		String name = sc.nextLine();
		*/
		//String name = nsm.method2_1();
		
		//String name = new NonStaticMethod().method2_1(); // 객체를 1회용으로 쓰고 버리는 방법 
		//System.out.println("당신의 이름은 : "+ name + "입니다.");
		
		/*nsm.method3(10, 3);
		
		String result = nsm.method4(10, 20);
		System.out.println(result);*/
		
		int[] rArr = nsm.method5(10);
		System.out.println(Arrays.toString(rArr));
		
	}

}
