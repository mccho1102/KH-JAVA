package com.khchap02_Encapsulation.model;

import java.util.Scanner;

public class Account {
	// 속성
	private String name = "최창욱";           // 이름
	private String accountNumber = "123-45-678";  // 계좌번호
	private String password = "1q2w3e4r";       // 비밀번호
	private int bankCode = 002;          // 은행코드
	private int balance = 10000;           // 잔액
	
	// 기능
	
	// name의 setter
	public void setName(String name) {
		this.name = name;
	}
	
	// name의 getter
	public String getName() {
		return name;
	}
	
	public void setBankCode(int bankCode) {
		this.bankCode = bankCode;
	}
	
	public int getBankCode() {
		return bankCode;
	}

	// getter/setter 자동완성
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
    // 입금 기능을 위한 메서드
	public void deposit(int money) {
		if(money > 0) {
		   balance += money;
		   System.out.println("입금액 : "+ money + "원");
		   System.out.println("현재잔액 : "+ balance + "원");
		}else {
		   System.out.println("잘못 입금하셨습니다.");
		}
	}
	
	// 잔액조회
	public void displayBalance() {
		System.out.println(name + "님의 아래 계좌의 잔액");
		System.out.println("계좌번호 : " + accountNumber);
		System.out.println(balance + "원입니다.");
	}
	
	// 출금기능을 위한 메서드
	public int withdraw() {
	    // 출금 후 잔액을 반환
		
		Scanner sc = new Scanner(System.in);
		
		// 출금을 하기 위해서는 비밀번호 확인, 출금 금액 확인
		System.out.print("비밀번호를 입력해 주세요: ");
		String pwd = sc.nextLine();
		
		// 비밀번호가 일치할 경우 -> 출금 금액 입력하기
		if(pwd.contentEquals(password)) {
			System.out.println("출금금액을 입력해 주세요");
			int money = sc.nextInt();
			
			// 출금 금액이 잔액보다 적을경우 출금 성공
			if(money <= balance) {
				balance -= money;
				System.out.println(name + "님 계좌에서"
						+ money + "원 만큼 출금되었습니다.");
				//System.out.println("현재잔액 : "+ balance + "원");
			}else {
			   System.out.println("잔액이 부족합니다.");	
			}
			
			return balance;
		}else {
			System.out.println("비밀번호가 일치하지 않습니다.");
			
			return -1;
		}
		
	}
	
}
