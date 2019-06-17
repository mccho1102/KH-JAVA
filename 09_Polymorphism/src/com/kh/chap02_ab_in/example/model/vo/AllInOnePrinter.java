package com.kh.chap02_ab_in.example.model.vo;

public abstract class AllInOnePrinter implements Printer, Scanner, Fax{
	// 추상 클래스
	// 일반 멤버 + 미완성 메소드가 포함된 형태
	// 미완성된 클래스로써 객체 생성 불가능
	// -> 단, 부모타입의 참조형 변수로는 사용 가능
	
	// * 클래스간 다중상속은 불가능 하지만
	//   인터페이스의 다중 상속은 가능!
	
	private String brand;     // 제조사
	private String name;      // 제품명
	
	// 생성자도 생성 가능
	// --> 상속 받은 자식의 객체 생성 시
	//     추상클래스인 부모의 부분 초기화 할 때 필요
	// 단, 생성자가 있다고 해서 직접 개체 생성은 불가능.
	
	public AllInOnePrinter() { }
	
	

	public AllInOnePrinter(String brand, String name) {
		super();
		this.brand = brand;
		this.name = name;
	}



	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// 미완성 메소드
	public abstract int paperSize();
}
