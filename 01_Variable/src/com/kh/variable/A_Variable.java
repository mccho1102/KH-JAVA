package com.kh.variable;

public class A_Variable {

	// 변수를 사용하지 않은 경우
	public void noVariable() {
		System.out.println("변수를 사용 안한 경우");
		System.out.println(2 * 3.141592651589793 * 10);
		System.out.println(3.141592653589793 * 10 * 10);
		System.out.println(3.141592653589793 * 10 * 10 * 20);
		System.out.println(4 * 3.141592653589793 * 10 * 10);
	
	}
	
	public void usingVariable() {
		double pi = 3.141592653589793; // 원주율
	    int r = 20;                    // 반지름
	    int h = 30;                    // 높이
	    
	    System.out.println("변수를 사용한 경우");
	    
	    // 원의둘레 : 2*원주율*반지름
	    System.out.println(2*pi*r);    
	    
	    // 원의 넓이 : 원주율 * 반지름 * 반지름
	    System.out.println(pi*r*r);    
	    
	    // 원기둥의 부피 : 원주율 * 반지름 * 반지름 * 높이
	    System.out.println(pi*r*r*h);    
	    
	    // 구의 겉넓이 : 4*원주율*반지름*반지름
	    System.out.println(4*pi*r*r);
	}
	
	/* 변수 사용의 장점
	 * 1. 값에 의미를 부여할 수 있다
	 * 2. 가독성이 좋아진다
	 * 3. 재사용성이 좋아진다
	 * 4. 유지보수가 좋다
	 */
	
	// 변수선언
	public void declareVariable() {
		// 1. 논리형
		// 논리 : 참(true), 거짓(false) T/F
		boolean isTrue; // 1byte
		
		// 2. 숫자형
		// 2_1. 정수형:
		// 1,2,3,0,-1,-2
		byte bNum; // 정수형중 가장 작은 정수 1byte 
		short sNum;// int 보다 작은              2byte
		int iNum;  // 정수형 기준                  4byte
		long lNum; // int 보다 큰                 8byte
		
		// 2_2. 실수형
		// 3.14, 0.123
		float fNum;  // 부동소숫점                4byte
		double dNum; // 실수형 기준 두배        8byte
		
		// 3. 문자형
		// 'A', '남', '여'
		char ch;     // 2byte
		
		// 4. 문자열
		String str; // 자바에서 제공해주는 기능 , 예약어가 아님, 참조형임
		
		/**************************************************************/
		
		// 변수 명명 규칙
		// 1.대소문자 구분
		int number;
		int numBer;
		
		// 2. 예약어 사용 x
		// int byte;
		// int true;
		
		// 3. 숫자로 시작 x
	    int age1;
	    // int 1age;
		
		// 4. 특수문자 '_', '$'만 사용 가능
	    int number_1;
	    // int number-1;
		
		// 5. 낙타봉 표기법 관례상 표기함 : 두개이상의 문자 조합
	    String userName; // user + name
	    String username;
	    
	    // 6. 자바는 한글변수도 가능하다.
	    byte 바이트정수;
	    boolean 논리형;
	    String 이름;
	    
	    // 한글을 사용하지 않는 환경에서는 오류를 발생시킬수 있음
	    // --> 영어로만 하자
	    
	    /**************************************************************/
	    
	    // 선언한 변수에 값 대입해보기
	    
	    // 1. 논리형 값 대입
	    isTrue = true;
	    
	    System.out.println("isTrue의 값:" + isTrue);
	    
	    isTrue = false;
	    
	    System.out.println("isTrue 변경 후 :" + isTrue);
	    
	    // 2. 정수형
	    // byte정수
	    bNum = 1;
	    
	    System.out.println("bNum의 값 :" + bNum);
		
        bNum = 100;
	    
	    System.out.println("bNum의 변경 후 :" + bNum);
	    
	    // byte의 범위 : -128 ~ +127
	    // 값의 범위를 넘어서면 에러 발생
	    // bNum = 128;
	    
	    // short정수
	    sNum = 20000;
	    // sNum = 40000;
	    
	    // int정수
	    iNum = 1000000000; // 10억
	    // iNum = 30000000000;
	    
	    // long정수
	    lNum = 12345678912345678L;
	    
	    // 3. 실수형
	    // float
	    fNum = 3.141592123456789f;
	    System.out.println("fNum의 값:" + fNum);
	    
	    // double : 실수형 보다 정확도가 두배 
	    dNum = 3.141592123456789;
	    System.out.println("dNum의 값:" + dNum);
	    
	    // 4. 문자형
	    ch = 'A';
	    System.out.println("ch의 값 :" + ch);
	    ch = 66;
	    System.out.println("ch의 변경 후 :" + ch);
	    
	    // 5. 문자열
	    str = "ABCDEF";
	    System.out.println("str의 값 : " + str);
	    
	    str = "A";
	    System.out.println("str의 변경 후 :" + str);
	 
	    
	}
	
	// 변수 선언과 동시에 초기화
	public void initVariable() {
		// 1. 논리형
		boolean isTrue = false;
		
		// 2. 정수형
		byte   bNum = 1;
		short  sNum = 2;
		int    iNum = 4;
		long   lNum = 8L;
		
		// 3. 실수형
		float fNum = 3.14f;
		double dNum = 2.5612;
		
		// 4. 문자형
		char ch = '가';
		
		// 5. 문자열
		String str = "A강의장";
		
		System.out.println(isTrue);
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println(fNum);
		System.out.println(dNum);
		System.out.println(ch);
		System.out.println(str);		
		
		
		
	}
	
}
