package com.kh.run;

import com.kh.first.A_MethodCall;
import com.kh.first.B_PrintExample;

public class Run {

	public static void main(String[] args) {
		// main 메서드는 프로그램을 시작하라고 지시하는 역할
		// ex) 컴퓨터 전원같은 역할
		// main 메서드 내부에는 기능을 수행하는 코드를
		// 작성하면 안된다.
		
		A_MethodCall mc = new A_MethodCall();
		
		mc.methodA();
		mc.methodB();
		mc.methodC(); // methodC()호출됨
		mc.methodD();
		
		B_PrintExample pe = new B_PrintExample();
		
		pe.printValue();

	}

}
