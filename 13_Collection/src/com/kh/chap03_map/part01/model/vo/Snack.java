package com.kh.chap03_map.part01.model.vo;

public class Snack {
	
	private String name;
	private int price;
	private int calory;
	
	
	
	//»ý¼ºÀÚ,get/setter, toString() , hashCode(), equals()
	
	
	public Snack() {
		super();
	}
	public Snack(String name, int price, int calory) {
		super();
		this.name = name;
		this.price = price;
		this.calory = calory;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCalory() {
		return calory;
	}
	public void setCalory(int calory) {
		this.calory = calory;
	}
	@Override
	public String toString() {
		return "Snack [name=" + name + ", price=" + price + ", calory=" + calory + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + calory;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Snack other = (Snack) obj;
		if (calory != other.calory)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	
	

}
