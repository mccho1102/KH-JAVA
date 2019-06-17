package com.kh.chap01_inheit.example2.model.vo;

public class Computer extends Product{
	private String cpu;
	private int ram;
	private int ssd;
	private String os;
	
	//�⺻������
	public Computer() {
		// super������
		// �ڽ� ��ü ������
		// �ڽ��� ������ ù �⿡ �ڵ� �����Ǹ�
		// �ڽİ�ü �޸� �Ҵ� �� �θ� �κк��� ������
		// (��, super() ��� �� �ݵ�� ù �ٿ� �ۼ�) 
		super(); 
	}
	
	

	public Computer(String brand, String pName, String pCode, int price,
			String cpu, int ram, int ssd, String os) {
		super(brand, pName, pCode, price);
		this.cpu = cpu;
		this.ram = ram;
		this.ssd = ssd;
		this.os = os;
	}



	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getSsd() {
		return ssd;
	}

	public void setSsd(int ssd) {
		this.ssd = ssd;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}
	/*
	public String comInformation() {
		return super.information() + " / " + cpu + " / " + ram + " / " + ssd
				+ " / " + os; 
	} */
	
	/*
	@Override
	public String information() {
		return super.information() + " / " + cpu + " / " + ram + " / " + ssd
				+ " / " + os; 
	}*/



	@Override
	public String toString() {
		return "Computer [" + super.toString() + ", cpu=" + cpu + ", "
			            	+ "ram=" + ram + ", ssd=" + ssd + ", os=" + os + "]";
	}
	
	public void print() {
		System.out.println("��ǻ����");
	}
	
}
