package com.kh.chap02_ab_in.example.controller;

import com.kh.chap02_ab_in.example.model.vo.AllInOnePrinter;
import com.kh.chap02_ab_in.example.model.vo.ElectronicGoods;
import com.kh.chap02_ab_in.example.model.vo.LgAP;
import com.kh.chap02_ab_in.example.model.vo.SamsungAp;
import com.kh.chap02_ab_in.example.model.vo.SmartPhone;

public class ElectronicGoodsController {
	public void method() {
		// 추상 클래스 객체 생성 불가
		//AllInOnePrinter ap = new AllInOnePrinter();
		// --> 내부클래스 구현하라는 소리
		
		// 추상클래스는 부모 타입 참조형 변수로 사용 가능
		AllInOnePrinter ap1 = new LgAP("LG", "LG복합기");
		AllInOnePrinter ap2 = new SamsungAp("삼성", "삼성복합기");
		
		// 추상 클래스를 이용하여 객체배열 생성
		AllInOnePrinter[] apArr = new AllInOnePrinter[2];
		apArr[0] = ap1;
		apArr[1] = ap2;
		
		System.out.println("======= AllInOnePrinter[] =======");
		for(int i=0; i<apArr.length; i++) {
			apArr[i].powerOn();
			// 추상클래스 + 객체배열 + 다형성 + 동적바인딩
		}
		
		// 복합기와 스마트폰을 한번에 관리하고 싶은데 방법이 없나?
		// 둘다 모두 전자제품(ElectronicGoods)이라는 공통된 인터페이스를 상속받아 구현 하고 있음
		// --> ElectronicGoods 인터페이스를 이용해서 통합 관리 가능
		
		// 인터페이스도 부모 타입 참조형 변수로 사용 가능
		ElectronicGoods sp = new SmartPhone();
		// SmartPhone은 ElectronicGoods의 자식 --> 다형성
		
		// 인터페이스 객체 배열
		ElectronicGoods[] egArr = new ElectronicGoods[3];
		egArr[0] = ap1;
		egArr[1] = ap2;
		egArr[2] = sp;
		
		System.out.println("\n==========ElectronicGoods[]==============");
		for(int i = 0; i<egArr.length; i++) {
			egArr[i].powerOn();
			// 인터페이스 + 추상클래스 + 객체배열 + 다형성 + 동적바인딩
		}
	}
}
