package com.kh.variable;

public class C_Constant {// ��� �׽�Ʈ
	
	public void testConstant() {
		// ����, ����� ������
		int age = 20;        //�Ϲݺ���
		final int AGE = 30;  //���
		
		System.out.println("[������]");
		System.out.println("age : "+ age);
		System.out.println("AGE : "+ AGE);
		
		age = 100;
		// AGE = 50; // ���� �߻�, ����� �� ���� �Ұ�
		
		System.out.println("[������]");
		System.out.println("age : "+ age);
		System.out.println("AGE : "+ AGE);
	}

}
