package com.kh.chap04_UserException.controller;

import java.util.Scanner;

import com.kh.chap04_UserException.model.exception.UserException;

public class UserExceptionController {
	public void method() throws UserException {
		// 숫자 3개를 입력받아 합을 출력하는 메소드
		// 단, 0을 입력 시 UserException을 발생시키고
		// 프로그램을 강제 종료 시킴
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num = 0;
		
		for(int i=1; i<3; i++) {
			System.out.println("입력 " + i + " : ");
			num = sc.nextInt();
			
			if(num == 0) {
				throw new UserException("0이 입력되어 프로그램 강제 종료");
			}
			sum += num;
		}
		
		System.out.println("합계 : " + sum);
	}
}
