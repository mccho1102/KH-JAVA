package com.kh.chap01_poly.example1.model.vo;

public class Child1 extends Parent{
	// �ʵ�
	private int z;
	// ������
	public Child1() { } // �⺻ ������
	public Child1(int x, int y, int z) { // �Ű����� �ִ� ������
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
		System.out.println("�� Child1 �̾�");
	}
}
