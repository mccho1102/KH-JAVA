package com.kh.chap02_ab_in.example.model.vo;

import com.kh.chap01_poly.example2.model.vo.Electronics;

public class SamsungAp extends AllInOnePrinter implements Fax  {
	public SamsungAp() {}

	public SamsungAp(String brand, String name) {
		super(brand, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("������");
	}

	@Override
	public void poweroff() {
		// TODO Auto-generated method stub
		System.out.println("������");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("������");
    }

	@Override
	public void scan() {
		// TODO Auto-generated method stub
		System.out.println("��ĳ��");

	}

	@Override
	public void sendFax() {
		// TODO Auto-generated method stub
		System.out.println("�����ѽ�");

	}

	@Override
	public int paperSize() {
		// TODO Auto-generated method stub
		return 3;
	}




}
