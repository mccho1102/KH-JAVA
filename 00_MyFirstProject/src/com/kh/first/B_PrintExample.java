package com.kh.first;

public class B_PrintExample {
	// 여러가지 형태의 값을 출력해보자
	
	public void printValue() {
	// 문자열(" ")
	// print() : ()괄호 안에 있는 값들을 출력
	// println() : ()괄호 안에 있는 값들을 출력후 줄바꿈 까지
	System.out.println("안녕하세요??");
	System.out.print("반갑습니다~");
	
	System.out.println();
	
	System.out.println("점심 뭐먹죠?");
	// 문자 한 글자(' ')
	System.out.println('A');
	System.out.println('남');
	
	// 숫자출력
	// 정수
	System.out.println(123456);
	// 실수
	System.out.println(12.3456);
	// 숫자연산
	System.out.println(3 + 4);
	System.out.println(3.14 - 0.14);
	System.out.println(7 * 6);
	System.out.println(10/5);
	System.out.println(10+5+6-12);
	System.out.println(5+6*3);
	
	//문자열 더하기
	//문자열 + 문자열
	
	System.out.println("안녕하세요~"+" 반갑습니다.");
	
	//문자열 + 문자
	System.out.println("저의 성별은 : " + '남');
	
	//숫자+문자열
	System.out.println(5 + "Hello");
	System.out.println("Hello" + 5);
	// 숫자와 문자열이 만나면 숫자를 문자열로 인식함
	
	// 숫자 + 문자열 복합 연산
	System.out.println(5 + 10 + "Hello");
	System.out.println("Hello" + 5 + 10);
	System.out.println("Hello" + (5 + 10));
	// 연산시 우선순위가 왼쪽부터 연산하며 괄호가 우선됨
	}
}
