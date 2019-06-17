package com.kh.chap01_poly.example2.view;

import com.kh.chap01_poly.example2.controllor.ElectronisController2;
import com.kh.chap01_poly.example2.model.vo.Desktop;
import com.kh.chap01_poly.example2.model.vo.Notebook;
import com.kh.chap01_poly.example2.model.vo.Tablet;

public class ElectronicsView2 {
	// =========== 다형성 적용 후 ============
	
	private ElectronisController2 ec2 = new ElectronisController2();
	
	public void displayView() {
		// 1. ElectronisController2에서 사용
		// insert() 메소드를 통해 초기화
		ec2.insert(new Desktop("Samsung", "삼성데탑",2000000, "i7-9700k", "Geforce 2080ti"));
		ec2.insert(new Notebook("LG", "Gram",1500000,0.9,4000));
		ec2.insert(new Tablet("Apple", "아이패드",800000,true));
		
		// 2. 생성된 객체의 정보를 조회하기 위해 select() 메소드 호출
		System.out.println(ec2.select(0));
		
		for(int i = 0; i<ElectronisController2.elecsIndex; i++) {
			System.out.println(ec2.select(i));
			// Electronis의 toString()이 출력될 것 같지만
			// 자식이 오버라이딩한 toString()이 출력됨
			// --> 동적바인딩
			
		}
		// 3. 모든 정보 조회를 위한 selectAll() 호출
		System.out.println(ec2.selectAll());
		
		// 4. 상품 판매 가능 여부 조회를 위한 sell() 메소드 호출
		for(int i=0; i<ElectronisController2.elecsIndex; i++) {
			System.out.println(ec2.sell(ec2.select(i)));
		}
		
	}
	
	
	
	
}
