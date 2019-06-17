package com.kh.chap01_poly.example2.model.vo;

public class Desktop extends Electronics{
	private String cpu;
	private String graphic;
	
	public Desktop() { }

	public Desktop(String brand, String name, int price,String cpu, String graphic) {
		super(brand, name, price);
		this.cpu = cpu;
		this.graphic = graphic;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getGraphic() {
		return graphic;
	}

	public void setGraphic(String graphic) {
		this.graphic = graphic;
	}

	@Override
	public String toString() {
		return super.toString() + "cpu=" + cpu + ", graphic=" + graphic;
	}
	
	
}
