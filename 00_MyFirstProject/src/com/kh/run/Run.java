package com.kh.run;

import com.kh.first.A_MethodCall;
import com.kh.first.B_PrintExample;

public class Run {

	public static void main(String[] args) {
		// main �޼���� ���α׷��� �����϶�� �����ϴ� ����
		// ex) ��ǻ�� �������� ����
		// main �޼��� ���ο��� ����� �����ϴ� �ڵ带
		// �ۼ��ϸ� �ȵȴ�.
		
		A_MethodCall mc = new A_MethodCall();
		
		mc.methodA();
		mc.methodB();
		mc.methodC(); // methodC()ȣ���
		mc.methodD();
		
		B_PrintExample pe = new B_PrintExample();
		
		pe.printValue();

	}

}
