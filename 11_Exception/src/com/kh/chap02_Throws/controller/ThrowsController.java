package com.kh.chap02_Throws.controller;

public class ThrowsController {
	public void method1() throws ArithmeticException{
		method2();
	}
	public void method2() throws ArithmeticException{
		method3();
	}
    public void method3() throws ArithmeticException{
	    int a = 2 / 0;
    }
}
