package com.kh.chap01_poly.example2.view;

import com.kh.chap01_poly.example2.controllor.ElectronisController1;
import com.kh.chap01_poly.example2.model.vo.Desktop;
import com.kh.chap01_poly.example2.model.vo.Notebook;
import com.kh.chap01_poly.example2.model.vo.Tablet;


public class ElectronicsView1 {
	// ========== 다형성이 적용되지 않은 경우 =============
	
	private ElectronisController1 ec1 = new ElectronisController1();
	
	public void displayView() {
		// 1.ElectronisController1에서 사용할 객체 3개를
		// insert() 메소드를 통해서 초기화
		ec1.insert(new Desktop("Samsung", "삼성데탑",2000000, "i7-9700k", "Geforce 2080ti"));
		ec1.insert(new Notebook("LG", "Gram",1500000,0.9,4000));
		ec1.insert(new Tablet("Apple", "아이패드",800000,true));
		
		// 2. 생성된 객체의 정보를 조회하기 위해 select() 메소드 호출
		System.out.println(ec1.selectDesktop());
		System.out.println(ec1.selectNotebook());
		System.out.println(ec1.selectTablet());
		
		// 3. 모든 상품의 정보를 한번에 조회한는 SelectAll() 메소드 호출
		
		System.out.println(ec1.selectAll());
		
		// 4. 상품 판매가능 여부 조회를 위한  Sell() 메소드 호출
		System.out.println(ec1.sell(new Desktop()));
		System.out.println(ec1.sell(new Notebook()));
		System.out.println(ec1.sell(new Tablet()));
		
	}
}
