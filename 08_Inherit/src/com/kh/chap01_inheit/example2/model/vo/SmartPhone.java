package com.kh.chap01_inheit.example2.model.vo;

public class SmartPhone extends Product{
	private String mobileAgency;
		
	public SmartPhone(){
		super();
	}

	
	
	public SmartPhone(String brand, String pName, String pCode, int price,
			          String mobileAgency) {
		super(brand, pName, pCode, price);
		this.mobileAgency = mobileAgency;
	}



	public String getMobileAgency() {
		return mobileAgency;
	}

	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	/*
	public String spInformation() {
		return super.information() + "/" + mobileAgency;
	} */
    /*
	@Override
	public String information(){
		return super.information() + "/" + mobileAgency;
	} */



	@Override
	public String toString() {
		return "SmartPhone ["+ super.toString() +", mobileAgency=" + mobileAgency + "]";
	}
	
}
