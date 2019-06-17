package com.kh.chap02_ab_in.example.model.vo;

public interface ElectronicGoods {

	// 인터페이스의 필드는 항상 상수 필드
	// public static final(생략 가능) 
	// public static final int VOLT = 220;
	int VOLT = 220;
	
	// 인터페이스의 메소드는 항상 추상 메소드(미완성 메소드)
	// public abstact(생략가능)
	public abstract void powerOn();
	void poweroff();
	
	
	
	
	
}
