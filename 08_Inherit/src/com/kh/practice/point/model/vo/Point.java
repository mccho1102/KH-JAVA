package com.kh.practice.point.model.vo;

public class Point {
	private int x;  // x 데이터
	private int y;  // y 데이터
	
	public Point() {} // 매개변수가 없는 생성자
	
	public Point(int x,int y) {
		super();
		this.x = x;
		this.y = y;
	}

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
		return  x +","+ y ;
	}


}
