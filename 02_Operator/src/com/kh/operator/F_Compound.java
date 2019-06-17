package com.kh.operator;

public class F_Compound {
	// 복합 대입 연산자
	// 다른 연산자와 대입 연산자를 함께 사용하는 연산자
	// 산술 복합 대입 : +=, -=, /=, %=
	// 쉬프트 복합 대입 : <<=, >>=, <<<= (참고)
	
	public void method1() {
		int num = 12;
		// num을 3 증가시키기
		System.out.println("num 3증가: " + (num += 3) );
		
		// num을 5 감소시키기
		System.out.println("num 5감소: " + (num -= 5) );
		
		// num을 6배 증가시키기
		System.out.println("num 6배 증가: " + (num *= 6) );
		
		// num을 절반으로 감소
		System.out.println("num 절반으로 감소: " +(num /= 2));
		
		// num을 4로 나눴을 때 나머지
		System.out.println("num 4로 나눴을 때 나머지: " +(num %= 4));
	}
}
