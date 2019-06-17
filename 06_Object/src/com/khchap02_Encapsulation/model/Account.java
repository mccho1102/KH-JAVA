package com.khchap02_Encapsulation.model;

import java.util.Scanner;

public class Account {
	// �Ӽ�
	private String name = "��â��";           // �̸�
	private String accountNumber = "123-45-678";  // ���¹�ȣ
	private String password = "1q2w3e4r";       // ��й�ȣ
	private int bankCode = 002;          // �����ڵ�
	private int balance = 10000;           // �ܾ�
	
	// ���
	
	// name�� setter
	public void setName(String name) {
		this.name = name;
	}
	
	// name�� getter
	public String getName() {
		return name;
	}
	
	public void setBankCode(int bankCode) {
		this.bankCode = bankCode;
	}
	
	public int getBankCode() {
		return bankCode;
	}

	// getter/setter �ڵ��ϼ�
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
	
    // �Ա� ����� ���� �޼���
	public void deposit(int money) {
		if(money > 0) {
		   balance += money;
		   System.out.println("�Աݾ� : "+ money + "��");
		   System.out.println("�����ܾ� : "+ balance + "��");
		}else {
		   System.out.println("�߸� �Ա��ϼ̽��ϴ�.");
		}
	}
	
	// �ܾ���ȸ
	public void displayBalance() {
		System.out.println(name + "���� �Ʒ� ������ �ܾ�");
		System.out.println("���¹�ȣ : " + accountNumber);
		System.out.println(balance + "���Դϴ�.");
	}
	
	// ��ݱ���� ���� �޼���
	public int withdraw() {
	    // ��� �� �ܾ��� ��ȯ
		
		Scanner sc = new Scanner(System.in);
		
		// ����� �ϱ� ���ؼ��� ��й�ȣ Ȯ��, ��� �ݾ� Ȯ��
		System.out.print("��й�ȣ�� �Է��� �ּ���: ");
		String pwd = sc.nextLine();
		
		// ��й�ȣ�� ��ġ�� ��� -> ��� �ݾ� �Է��ϱ�
		if(pwd.contentEquals(password)) {
			System.out.println("��ݱݾ��� �Է��� �ּ���");
			int money = sc.nextInt();
			
			// ��� �ݾ��� �ܾ׺��� ������� ��� ����
			if(money <= balance) {
				balance -= money;
				System.out.println(name + "�� ���¿���"
						+ money + "�� ��ŭ ��ݵǾ����ϴ�.");
				//System.out.println("�����ܾ� : "+ balance + "��");
			}else {
			   System.out.println("�ܾ��� �����մϴ�.");	
			}
			
			return balance;
		}else {
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			
			return -1;
		}
		
	}
	
}
