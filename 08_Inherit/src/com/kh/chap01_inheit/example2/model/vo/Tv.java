package com.kh.chap01_inheit.example2.model.vo;

public class Tv extends Product{
    private int inch;
    
    public Tv() {}
    
	public Tv(String brand, String pName, String pCode, int price, int inch) {
		super(brand, pName, pCode, price);
		this.inch = inch;
	}
    
    public int getInch() {
    	return inch;
    }

   	public void setInch(int inch) {
		this.inch = inch;
	}
    /*
    public String tvInformation() {
    	return super.information() + "/" + inch;
    } */
    /*
    @Override
    public String information(){
    	return super.information() + "/" + inch;
    } */

	@Override
	public String toString() {
		return "Tv ["+ super.toString() + "inch=" + inch + "]";
	}
   	
   	
}
