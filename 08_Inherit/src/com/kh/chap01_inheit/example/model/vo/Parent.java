package com.kh.chap01_inheit.example.model.vo;

public class Parent {
	private String lastName;
	private int money = -50_000_000;
	private String house;
	
	public Parent() {}

	public Parent(String lastName, int money, String house) {
		super();
		this.lastName = lastName;
		this.money = money;
		this.house = house;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}
	
	
}
