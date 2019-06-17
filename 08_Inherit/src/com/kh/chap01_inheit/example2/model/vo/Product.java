package com.kh.chap01_inheit.example2.model.vo;

public class Product {
	private String brand;
	private String pName;
	private String pCode;
	private int price;
	
	public Product() {}

	public Product(String brand, String pName, String pCode, int price) {
		super();
		this.brand = brand;
		this.pName = pName;
		this.pCode = pCode;
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

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	/*
	public String information() {
		return brand + "/" + pName + "/" + pCode + "/" + price ;
	} */

	@Override
	public String toString() {
		return "Product [brand=" + brand + ", pName=" + pName + ", pCode=" + pCode + ", price=" + price + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		// 1. 객체의 주소가 같으면 같은 객체이다.
		if(this == obj) {
			return true;
		}
		
		// 2. 매개변수로 전달받은 값이 null이면 false
		if(obj == null) {
			return false;
		}
		
		Product other = (Product)obj; // 강제 형변환
		
		if(!(this.brand.equals(other.brand))) {
			return false;
		}else if(!(this.pName.equals(other.pName))){
			return false;
		}else if(!(this.pCode.equals(other.pCode))){
			return false;
		}else if(this.price != other.price){
			return false;
		}
		
		
		return false;
	}
	
	
	
	
	
}
