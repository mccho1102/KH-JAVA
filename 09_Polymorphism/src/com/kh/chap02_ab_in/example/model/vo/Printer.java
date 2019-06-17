package com.kh.chap02_ab_in.example.model.vo;

public interface Printer extends ElectronicGoods{
	// 부모 인터페이스 - 자식 인터페이스 상속 : extends(확장)
	// 부모 인터페이스 - 자식 클래스 상속 : implements(구현)
	
	// 인터페이스의 메소드는 항상 추상 메소드
	public abstract void print();// 출력가능
}
