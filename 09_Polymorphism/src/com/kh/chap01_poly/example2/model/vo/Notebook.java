package com.kh.chap01_poly.example2.model.vo;

public class Notebook extends Electronics{
	private double weight;
	private double battery;
	
	public Notebook() { }

	public Notebook(String brand, String name, int price, double weight, double battery) {
		super(brand, name, price);
		this.weight = weight;
		this.battery = battery;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getBattery() {
		return battery;
	}

	public void setBattery(double battery) {
		this.battery = battery;
	}

	@Override
	public String toString() {
		return super.toString() + "weight=" + weight + ", battery=" + battery;
	}
	

}
