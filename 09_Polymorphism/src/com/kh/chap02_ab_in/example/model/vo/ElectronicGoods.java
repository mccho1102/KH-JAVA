package com.kh.chap02_ab_in.example.model.vo;

public interface ElectronicGoods {

	// �������̽��� �ʵ�� �׻� ��� �ʵ�
	// public static final(���� ����) 
	// public static final int VOLT = 220;
	int VOLT = 220;
	
	// �������̽��� �޼ҵ�� �׻� �߻� �޼ҵ�(�̿ϼ� �޼ҵ�)
	// public abstact(��������)
	public abstract void powerOn();
	void poweroff();
	
	
	
	
	
}
