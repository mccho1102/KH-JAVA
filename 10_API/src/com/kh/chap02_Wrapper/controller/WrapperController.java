package com.kh.chap02_Wrapper.controller;

public class WrapperController {
	/* Wrapper Ŭ����
	 * - Wrapper : ������
	 * - �⺻ �ڷ����� ��ü �����ϴ� Ŭ����
	 * 
	 * �� Wrapper Ŭ������ ����ϳ�?
	 * 1) �⺻ �ڷ��� �����δ� ����� �� ����
	 *    �Ӽ�, ����� ����ϱ� ���Ͽ�
	 *   --> ex) ���ڿ��� �⺻�ڷ������� ��ȯ�ϴ� parsexxx()
	 *   
	 * 2) �⺻ �ڷ����� ��¿ �� ���� ��ü�� �ٷ�� �ϴ� ���
	 *   --> ex) Collection, ��ü �迭,
	 *   		�Ű� ���� ���°� Object �ļ�(��ü���� �Ѵٴ� ��)
	 */
	public void method1() {
		// Integer Ŭ�������� �����ϴ� ��� �ʵ� Ȯ��
		System.out.println(Integer.BYTES); // int�� byte ũ��
		// public static final int BYTES
		System.out.println(Integer.SIZE);  // int�� bit ũ��
		// 1byte == 8bit, 4byte == 32bit
		System.out.println(Integer.MAX_VALUE); // int�� �ִ�ũ��
		System.out.println(Integer.MIN_VALUE); // int�� �ּ�ũ��
		System.out.println(Integer.TYPE); //���� �� �⺻�ڷ���
		
		// parse000()
		// ���ڿ� -> �⺻�ڷ��� ���� ���ִ� �޼ҵ�
		byte b = Byte.parseByte("100");
		short s = Short.parseShort("1000");
		int i = Integer.parseInt("123456789");
		long l = Long.parseLong("123456789123456");
		float f = Float.parseFloat("1.123456");
		double d = Double.parseDouble("1.123456789");
		boolean bool = Boolean.parseBoolean("true");
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(bool);
		
		// �⺻�ڷ��� -> ���ڿ��� ��ȯ
		int iNum = 123;
		String str1 = Integer.valueOf(iNum).toString();
		String str2 = iNum + "";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1.equals(str2));
		
		
		// Boxing : �⺻�ڷ��� -> ����Ŭ������ �����ϴ� ��
		//         -�⺻ �ڷ����� �ڽ�(����Ŭ����)�� �����ϴ� ����
		int iNum2 = 999;
		
		Integer it1 = new Integer(iNum2);
		Integer it2 = new Integer("999");
		
		// UnBoxing : ����Ŭ���� -> �⺻�ڷ��� �����ϴ� ��
		int iNum3 = it1.intValue();
		int iNum4 = (int)it2;
		
		// AutoBoxing : �ڵ����� �⺻�ڷ��� <-> ����Ŭ���� ����
		Integer it3 = 100; // AutoBoxing
		int iNum5 = it1;   // AtutoUnBoxing
		
		// jdk 1.5���� ����
		
		
	}
	

}
