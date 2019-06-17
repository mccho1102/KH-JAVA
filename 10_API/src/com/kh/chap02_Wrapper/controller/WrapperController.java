package com.kh.chap02_Wrapper.controller;

public class WrapperController {
	/* Wrapper 클래스
	 * - Wrapper : 포장지
	 * - 기본 자료형을 객체 포장하는 클래스
	 * 
	 * 왜 Wrapper 클래스를 사용하나?
	 * 1) 기본 자료형 만으로는 사용할 수 없는
	 *    속성, 기능을 사용하기 위하여
	 *   --> ex) 문자열을 기본자료형으로 변환하는 parsexxx()
	 *   
	 * 2) 기본 자료형을 어쩔 수 없이 객체로 다뤄야 하는 경우
	 *   --> ex) Collection, 객체 배열,
	 *   		매개 변수 형태가 Object 후손(객체여야 한다는 뜻)
	 */
	public void method1() {
		// Integer 클래스에서 제공하는 상수 필드 확인
		System.out.println(Integer.BYTES); // int의 byte 크기
		// public static final int BYTES
		System.out.println(Integer.SIZE);  // int의 bit 크기
		// 1byte == 8bit, 4byte == 32bit
		System.out.println(Integer.MAX_VALUE); // int의 최대크기
		System.out.println(Integer.MIN_VALUE); // int의 최소크기
		System.out.println(Integer.TYPE); //포장 전 기본자료형
		
		// parse000()
		// 문자열 -> 기본자료형 변경 해주는 메소드
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
		
		// 기본자료형 -> 문자열로 변환
		int iNum = 123;
		String str1 = Integer.valueOf(iNum).toString();
		String str2 = iNum + "";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1.equals(str2));
		
		
		// Boxing : 기본자료형 -> 래퍼클래스로 변경하는 것
		//         -기본 자료형을 박스(래퍼클래스)로 포장하는 형태
		int iNum2 = 999;
		
		Integer it1 = new Integer(iNum2);
		Integer it2 = new Integer("999");
		
		// UnBoxing : 래퍼클래스 -> 기본자료형 변경하는 것
		int iNum3 = it1.intValue();
		int iNum4 = (int)it2;
		
		// AutoBoxing : 자동으로 기본자료형 <-> 래퍼클래스 변경
		Integer it3 = 100; // AutoBoxing
		int iNum5 = it1;   // AtutoUnBoxing
		
		// jdk 1.5부터 적용
		
		
	}
	

}
