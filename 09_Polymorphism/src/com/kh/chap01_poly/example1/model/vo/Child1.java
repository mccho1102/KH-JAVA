package com.kh.chap01_poly.example1.model.vo;

public class Child1 extends Parent{
	// 필드
	private int z;
	// 생성자
	public Child1() { } // 기본 생성자
	public Child1(int x, int y, int z) { // 매개변수 있는 생성자
		super(x, y);
		this.z = z;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	@Override
	public String toString() {
		return super.toString() + ",z =" + z;
	}
	
	public void printChild1() {
		System.out.println("난 Child1 이야");
	}
}
