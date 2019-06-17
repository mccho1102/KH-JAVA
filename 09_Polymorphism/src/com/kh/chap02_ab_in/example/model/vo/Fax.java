package com.kh.chap02_ab_in.example.model.vo;

public interface Fax extends ElectronicGoods{
	// 인터페이스에서의 메소드는 항상 추상 메소드
	public abstract void sendFax(); // 팩스보내기
}
