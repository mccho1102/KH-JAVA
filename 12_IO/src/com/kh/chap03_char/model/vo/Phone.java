package com.kh.chap03_char.model.vo;

import java.io.Serializable;

public class Phone implements Serializable{
	
	//*마커 인터페이스
		// 상속을 받아도 구현할 메소드가 존재하지 않고
		//단지, 상속받은 클래스가 어떤 역할을 할 클래스인지 
		//타입 체크용으로 사용 되는 인터페이스
		//Sirializable 상속 클래스 :  직렬화가 가능한 클래스 라는 의미
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1730743313463283158L;
	//직렬화된 객체가 스트림을 통해서 전송 될 때 
	//전송 받는 곳에서 해당 객체를 사용하게 되는 경우에
	//클래스명이 같아도 실제 내용은 다를 수 있으므로
	//같은 클래스를 통해 만들어진 객체임을 증명하는 수단.

	
	//필드
	private String brand;
	private String pName;
	private int price;
	public Phone() {
	}
	public Phone(String brand, String pName, int price) {
		this.brand = brand;
		this.pName = pName;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Phone [brand=" + brand + ", pName=" + pName + ", price=" + price + "]";
	}
	
	
	
	
	

}
