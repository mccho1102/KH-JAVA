package com.kh.chap01_inheit.example2.run;

import com.kh.chap01_inheit.example2.model.vo.Computer;
import com.kh.chap01_inheit.example2.model.vo.Desktop;
import com.kh.chap01_inheit.example2.model.vo.Product;
import com.kh.chap01_inheit.example2.model.vo.SmartPhone;
import com.kh.chap01_inheit.example2.model.vo.Tv;

public class Run {

	public static void main(String[] args) {
		
		Computer com = new Computer("LG", "LG�׷�", "lg123456", 
				                    1500000,"i8-123", 8, 250, "windows");
		SmartPhone sp = new SmartPhone("SS", "SSNote", "ss1234", 1500000, "SK");
		Tv tv = new Tv("LG", "Lg", "lg123", 1235000, 55);
		
		//System.out.println(com.information());// �θ� �ʵ� ������
		// System.out.println(com.comInformation());// �θ� + �ڽ� ���� ���
		//System.out.println(sp.information());// �θ� �ʵ� ������
		//System.out.println(sp.spInformation());// �θ� + �ڽ� ���� ���
		//System.out.println(tv.information());// �θ� �ʵ� ������
		//System.out.println(tv.tvInformation());// �θ� + �ڽ� ���� ���
		
		System.out.println("=========�������̵� ����==========");
		//System.out.println(com.information());
		//System.out.println(sp.information());
		//System.out.println(tv.information());
		System.out.println(com.toString());
		System.out.println(sp.toString());
		System.out.println(tv.toString());
		
		System.out.println(com);
		System.out.println(sp);
		System.out.println(tv);
		
		System.out.println("=========equals �������̵�==========");
		Product p1 = new Product("�Ｚ", "������", "p123", 10000);
		Product p2 = new Product("�Ｚ", "������", "p123", 10000);
		
		if(p1.equals(p1)) {
			System.out.println("���� �ּҸ� ����Ŵ");
		}
		
		if(!p1.equals(null)) {
			System.out.println("null�̶��� ���� �ʿ䵵 ����");
		}
		
		if(p1.equals(p2)) {
			System.out.println("�ʵ� ���� ��� �����Ƿ� ���� ��ü");
		}
		
		System.out.println("===================");
		
		Desktop dt = new Desktop();
		com.print();
		dt.print();
		
	}

}
