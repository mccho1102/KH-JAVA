package com.kh.chap01_poly.example1.model.vo;

public class Parent {
	// �ʵ�
	private int x;
	private int y;
	// ������
	public Parent() { } // �⺻������
	public Parent(int x, int y) { // �Ű����� �ִ� ������
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
		System.out.println("�� Parent ��");
	}
	
}
