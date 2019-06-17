package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		// 면적 : 너비 * 높이
		return r.toString()+ "/"  + (width * height);
	}
   
	public String calcPerimeter(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		// 둘레 : 2 * (너비 + 높이)
		return r.toString()+ "/" + (2*(width * height));
	}
	
	
}
