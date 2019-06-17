package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		// ���� : �ʺ� * ����
		return r.toString()+ "/"  + (width * height);
	}
   
	public String calcPerimeter(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		// �ѷ� : 2 * (�ʺ� + ����)
		return r.toString()+ "/" + (2*(width * height));
	}
	
	
}
