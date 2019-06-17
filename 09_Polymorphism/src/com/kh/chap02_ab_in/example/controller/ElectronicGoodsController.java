package com.kh.chap02_ab_in.example.controller;

import com.kh.chap02_ab_in.example.model.vo.AllInOnePrinter;
import com.kh.chap02_ab_in.example.model.vo.ElectronicGoods;
import com.kh.chap02_ab_in.example.model.vo.LgAP;
import com.kh.chap02_ab_in.example.model.vo.SamsungAp;
import com.kh.chap02_ab_in.example.model.vo.SmartPhone;

public class ElectronicGoodsController {
	public void method() {
		// �߻� Ŭ���� ��ü ���� �Ұ�
		//AllInOnePrinter ap = new AllInOnePrinter();
		// --> ����Ŭ���� �����϶�� �Ҹ�
		
		// �߻�Ŭ������ �θ� Ÿ�� ������ ������ ��� ����
		AllInOnePrinter ap1 = new LgAP("LG", "LG���ձ�");
		AllInOnePrinter ap2 = new SamsungAp("�Ｚ", "�Ｚ���ձ�");
		
		// �߻� Ŭ������ �̿��Ͽ� ��ü�迭 ����
		AllInOnePrinter[] apArr = new AllInOnePrinter[2];
		apArr[0] = ap1;
		apArr[1] = ap2;
		
		System.out.println("======= AllInOnePrinter[] =======");
		for(int i=0; i<apArr.length; i++) {
			apArr[i].powerOn();
			// �߻�Ŭ���� + ��ü�迭 + ������ + �������ε�
		}
		
		// ���ձ�� ����Ʈ���� �ѹ��� �����ϰ� ������ ����� ����?
		// �Ѵ� ��� ������ǰ(ElectronicGoods)�̶�� ����� �������̽��� ��ӹ޾� ���� �ϰ� ����
		// --> ElectronicGoods �������̽��� �̿��ؼ� ���� ���� ����
		
		// �������̽��� �θ� Ÿ�� ������ ������ ��� ����
		ElectronicGoods sp = new SmartPhone();
		// SmartPhone�� ElectronicGoods�� �ڽ� --> ������
		
		// �������̽� ��ü �迭
		ElectronicGoods[] egArr = new ElectronicGoods[3];
		egArr[0] = ap1;
		egArr[1] = ap2;
		egArr[2] = sp;
		
		System.out.println("\n==========ElectronicGoods[]==============");
		for(int i = 0; i<egArr.length; i++) {
			egArr[i].powerOn();
			// �������̽� + �߻�Ŭ���� + ��ü�迭 + ������ + �������ε�
		}
	}
}
