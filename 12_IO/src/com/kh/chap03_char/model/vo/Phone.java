package com.kh.chap03_char.model.vo;

import java.io.Serializable;

public class Phone implements Serializable{
	
	//*��Ŀ �������̽�
		// ����� �޾Ƶ� ������ �޼ҵ尡 �������� �ʰ�
		//����, ��ӹ��� Ŭ������ � ������ �� Ŭ�������� 
		//Ÿ�� üũ������ ��� �Ǵ� �������̽�
		//Sirializable ��� Ŭ���� :  ����ȭ�� ������ Ŭ���� ��� �ǹ�
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1730743313463283158L;
	//����ȭ�� ��ü�� ��Ʈ���� ���ؼ� ���� �� �� 
	//���� �޴� ������ �ش� ��ü�� ����ϰ� �Ǵ� ��쿡
	//Ŭ�������� ���Ƶ� ���� ������ �ٸ� �� �����Ƿ�
	//���� Ŭ������ ���� ������� ��ü���� �����ϴ� ����.

	
	//�ʵ�
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
