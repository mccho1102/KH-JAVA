package com.kh.chap01_poly.example1.model.vo;

public class Parent {
	// 필드
	private int x;
	private int y;
	// 생성자
	public Parent() { } // 기본생성자
	public Parent(int x, int y) { // 매개변수 있는 생성자
		this.x = x;
		this.y = y;
	}
	// getter/setter
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "x="+ x + ",y="+ y;
	}
	public void printParent() {
		System.out.println("난 Parent 야");
	}
	
}
