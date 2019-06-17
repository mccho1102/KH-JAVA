package com.kh.chap02_ab_in.example.model.vo;

public class LgAP extends AllInOnePrinter{
	
	public LgAP() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public LgAP(String brand, String name) {
		super(brand, name);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(" Good printer");
	}



	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println(" Good printer");
	}



	@Override
	public void poweroff() {
		// TODO Auto-generated method stub
		System.out.println(" Good printer");
	}



	@Override
	public void scan() {
		// TODO Auto-generated method stub
		System.out.println(" Good scanner");
	}



	@Override
	public void sendFax() {
		// TODO Auto-generated method stub
		System.out.println(" Good sendFax");
	}



	@Override
	public int paperSize() {
		// TODO Auto-generated method stub
		return 3;
	}





	
	// 일반 클래스에서 상속받은 클래스가 추상 클래스인 경우
	// 미완성된 메소드를 구현하지 않으면 에러가 발생한다
	// --> 미완성 메소드를 구현
	
	
}
