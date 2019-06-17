package com.kh.chap01_poly.example1.model.vo;

public class Child2 extends Parent{
	// 필드
		private int n;
		// 생성자
		public Child2() { } // 기본 생성자
		public Child2(int x, int y, int z) { // 매개변수 있는 생성자
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
			System.out.println("난 Child2 이야");
		}
}
