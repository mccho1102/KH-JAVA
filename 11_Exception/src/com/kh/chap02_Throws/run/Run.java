package com.kh.chap02_Throws.run;

import com.kh.chap02_Throws.controller.ThrowsController;

public class Run {
	public static void main(String[] args) {
		ThrowsController tc = new ThrowsController();
		try {
		     tc.method1();
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}
}
