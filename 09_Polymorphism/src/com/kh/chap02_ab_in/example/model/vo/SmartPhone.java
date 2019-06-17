package com.kh.chap02_ab_in.example.model.vo;

public class SmartPhone implements ElectronicGoods{

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("로고가 뜨면서 전원 켜짐");
	}

	@Override
	public void poweroff() {
		// TODO Auto-generated method stub
		System.out.println("로고가 없어지면서 전원 꺼짐");
	}

}
