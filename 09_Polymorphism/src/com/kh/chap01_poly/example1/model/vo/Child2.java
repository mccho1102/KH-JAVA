package com.kh.chap01_poly.example1.model.vo;

public class Child2 extends Parent{
	// �ʵ�
		private int n;
		// ������
		public Child2() { } // �⺻ ������
		public Child2(int x, int y, int z) { // �Ű����� �ִ� ������
			super(x, y);
			this.n = n;
		}
		public int getZ() {
			return n;
		}
		public void setZ(int z) {
			this.n = n;
		}
		
		@Override
		public String toString() {
			return super.toString() + ",n =" + n;
		}
		
		public void printChild2() {
			System.out.println("�� Child2 �̾�");
		}
}
