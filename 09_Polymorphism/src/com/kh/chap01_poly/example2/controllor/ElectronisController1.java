package com.kh.chap01_poly.example2.controllor;

import com.kh.chap01_poly.example2.model.vo.Desktop;
import com.kh.chap01_poly.example2.model.vo.Notebook;
import com.kh.chap01_poly.example2.model.vo.Tablet;

public class ElectronisController1 {
	// =========== 다형성이 적용되지 않았을 때 ============
	
	// 1. 사용하려는 객체의 참조변수를 필드에 선언
	private Desktop desk = null;
	private Notebook note = null;
	private Tablet tab = null;
	
	// 2. 외부에서 생성된 객체의 주소를 전달 받아 필드에 대입하는 메소드 insert()선언
	// - 전달 받아야 되는 객체의 타입은 Desktop, Notebook, Tablet 3종류
	// --> 메소드 오버로딩(Over Loading)을 통해서 해결
	public void insert(Desktop desk) {
		this.desk = desk;
	}
	public void insert(Notebook note) {
		this.note = note;
	}
	public void insert(Tablet tab) {
		this.tab = tab;
	}
	
	// 3. 객체의 정보를 반환하는 메소드 select() 선언
	// - 객체의 타입이 모두 다르므로 선언하는 메소드의 반환값이 모두 달라야 함
	// --> 오버로딩으로 해결 불가능 --> 각각 메소드를 따로 만들어야 함
	public Desktop selectDesktop() {
		return desk;
	}
	public Notebook selectNotebook() {
		return note;
	}
	public Tablet selectTablet() {
		return tab;
	}
	
	// 4. 모든 객체의 정보를 하나의 문자열로 만들어 
	//    반환하는 메소드  selectAll() 선언
	public String selectAll() {
		String str = "\n*****모든 상품 정보 *****\n";
		str += desk.toString() + "\n";
		str += note + "\n";
		str += tab + "\n";
		
		return str;
		
	}
	
	
	// 5. 전달 받은 객체의 타입에 따라 판매 가능여부를 
	// 문자열로 반환하는 sell() 메소드 선언
	// 전달 받을 수 있는 객체 타입은 3종류
	// --> 메소드 오버로딩을 통해서 해결
	public String sell(Desktop desk) {
		return "판매 가능";
	}
	public String sell(Notebook note) {
		return "판매 가능";
	}
	public String sell(Tablet tab) {
		return "판매 불가[품절]";
	}
	
	
}
