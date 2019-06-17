package com.kh.chap01_poly.example2.view;

import com.kh.chap01_poly.example2.controllor.ElectronisController2;
import com.kh.chap01_poly.example2.model.vo.Desktop;
import com.kh.chap01_poly.example2.model.vo.Notebook;
import com.kh.chap01_poly.example2.model.vo.Tablet;

public class ElectronicsView2 {
	// =========== ������ ���� �� ============
	
	private ElectronisController2 ec2 = new ElectronisController2();
	
	public void displayView() {
		// 1. ElectronisController2���� ���
		// insert() �޼ҵ带 ���� �ʱ�ȭ
		ec2.insert(new Desktop("Samsung", "�Ｚ��ž",2000000, "i7-9700k", "Geforce 2080ti"));
		ec2.insert(new Notebook("LG", "Gram",1500000,0.9,4000));
		ec2.insert(new Tablet("Apple", "�����е�",800000,true));
		
		// 2. ������ ��ü�� ������ ��ȸ�ϱ� ���� select() �޼ҵ� ȣ��
		System.out.println(ec2.select(0));
		
		for(int i = 0; i<ElectronisController2.elecsIndex; i++) {
			System.out.println(ec2.select(i));
			// Electronis�� toString()�� ��µ� �� ������
			// �ڽ��� �������̵��� toString()�� ��µ�
			// --> �������ε�
			
		}
		// 3. ��� ���� ��ȸ�� ���� selectAll() ȣ��
		System.out.println(ec2.selectAll());
		
		// 4. ��ǰ �Ǹ� ���� ���� ��ȸ�� ���� sell() �޼ҵ� ȣ��
		for(int i=0; i<ElectronisController2.elecsIndex; i++) {
			System.out.println(ec2.sell(ec2.select(i)));
		}
		
	}
	
	
	
	
}
