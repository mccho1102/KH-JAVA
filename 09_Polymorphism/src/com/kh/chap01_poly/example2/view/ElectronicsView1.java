package com.kh.chap01_poly.example2.view;

import com.kh.chap01_poly.example2.controllor.ElectronisController1;
import com.kh.chap01_poly.example2.model.vo.Desktop;
import com.kh.chap01_poly.example2.model.vo.Notebook;
import com.kh.chap01_poly.example2.model.vo.Tablet;


public class ElectronicsView1 {
	// ========== �������� ������� ���� ��� =============
	
	private ElectronisController1 ec1 = new ElectronisController1();
	
	public void displayView() {
		// 1.ElectronisController1���� ����� ��ü 3����
		// insert() �޼ҵ带 ���ؼ� �ʱ�ȭ
		ec1.insert(new Desktop("Samsung", "�Ｚ��ž",2000000, "i7-9700k", "Geforce 2080ti"));
		ec1.insert(new Notebook("LG", "Gram",1500000,0.9,4000));
		ec1.insert(new Tablet("Apple", "�����е�",800000,true));
		
		// 2. ������ ��ü�� ������ ��ȸ�ϱ� ���� select() �޼ҵ� ȣ��
		System.out.println(ec1.selectDesktop());
		System.out.println(ec1.selectNotebook());
		System.out.println(ec1.selectTablet());
		
		// 3. ��� ��ǰ�� ������ �ѹ��� ��ȸ�Ѵ� SelectAll() �޼ҵ� ȣ��
		
		System.out.println(ec1.selectAll());
		
		// 4. ��ǰ �ǸŰ��� ���� ��ȸ�� ����  Sell() �޼ҵ� ȣ��
		System.out.println(ec1.sell(new Desktop()));
		System.out.println(ec1.sell(new Notebook()));
		System.out.println(ec1.sell(new Tablet()));
		
	}
}
