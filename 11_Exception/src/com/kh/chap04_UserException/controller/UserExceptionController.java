package com.kh.chap04_UserException.controller;

import java.util.Scanner;

import com.kh.chap04_UserException.model.exception.UserException;

public class UserExceptionController {
	public void method() throws UserException {
		// ���� 3���� �Է¹޾� ���� ����ϴ� �޼ҵ�
		// ��, 0�� �Է� �� UserException�� �߻���Ű��
		// ���α׷��� ���� ���� ��Ŵ
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num = 0;
		
		for(int i=1; i<3; i++) {
			System.out.println("�Է� " + i + " : ");
			num = sc.nextInt();
			
			if(num == 0) {
				throw new UserException("0�� �ԷµǾ� ���α׷� ���� ����");
			}
			sum += num;
		}
		
		System.out.println("�հ� : " + sum);
	}
}
