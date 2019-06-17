package com.kh.chap01_String.controller;

import java.util.Arrays;
import java.util.Scanner;

public class StringController {
	public void method1(){
		// String 리터럴
		String str1 = "abc";
		String str2 = "abc";
		
		// 값 자체가 같은지 비교
		System.out.println(str1.contentEquals(str2));
		
		// 참조하고 있는 객체의 주소가 같은지 비교
		System.out.println(str1 == str2);
		
		System.out.println("hashCode()를 이용하여 비교");
		System.out.println("str1.hashCode() : " + str1.hashCode());
		System.out.println("str2.hashCode() : " + str2.hashCode());
		
		// Object.hashCode()
		// 객체의 주소를 이용하여 생성된 해시코드
		
		// String.hashCode()
		// 객체가 보유하고 있는 값을 이용하여 해시코드 생성
		
		// hashCode()는 equals()와 함께 동등 비교를 위해 만들어진 메소드
		// HashMap, HashSet, HashTable에서 값 비교시 사용됨.
		
		// System.identityHashCode()
		// 객체의 실제 주소값을 이용하여 만든 해시코드
		// == Object.hashCode()와 같은값
		System.out.println("== System.identityHashCode()==");
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		System.out.println();
		String str3 = new String("abc");
		System.out.println(str1 == str3);
		System.out.println(System.identityHashCode(str3));
		
		// 같은 값을 이용하여 hashCode()를 생성하기 때문에 같음
		System.out.println(str1.hashCode());
		System.out.println(str3.hashCode());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("str4 입력");
		String str4 = sc.nextLine();
		
		System.out.println(str1 == str4);
		System.out.println(str1.equals(str4));
		System.out.println(str4.hashCode());
		System.out.println(System.identityHashCode(str4));
		
		// String Immutable(불변성)
		// String 값 변경시 기존 공간에서 값이 변경되는 것이 아닌
		// 새로운 공간에 값이 할당되고 
		// 참조하ㅏ는 변수에 새로운 공간의 주소를 반환함
		System.out.println("\n==String Immutable ==");
		System.out.println("변경전 str2 : " + System.identityHashCode(str2));
		
		str2 += "efg";
		System.out.println("변경후 str2 : " + System.identityHashCode(str2));
		// 값이 다름 -> 별도의 공간에 새로 생성됨 -> 불변성 확인
		String s = "";
		for(int i='a'; i<'z'; i++) {
			s += (char)i;
		}
		System.out.println(s);
		
	}
	
	public void method2() {
		// StringBuffer
		// StringBuffer 변수명 = new StringBuffer(문자열);
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer("java api");
		
		// 버퍼크기 확인
		System.out.println("==버퍼 크기 확인 ==");
		System.out.println("sb1 : " + sb1.capacity());
		System.out.println("sb1 : " + sb2.capacity());
		
		// 가변성 확인
		System.out.println("\n== 가변성확인 ==");
		System.out.println("변경전 :"+ System.identityHashCode(sb2));
		
		sb2 = sb2.append(" StringBuffer Class");
		System.out.println("변경후 :"+ System.identityHashCode(sb2));

	    // 버퍼 크기 증가 확인
		System.out.println("\n== 버퍼 크기 증가 확인 ==");
		System.out.println(sb2.capacity());
		
	}
	
	public void method3() {
		// String.split(구분자);
		
		String str = "김소연, 박준혁, 양주연, 송창혁, 장혜지, 정승화";
		
		String[] arr = str.split(",");
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<arr.length; i++) {
			arr[i] = arr[i].trim();
			System.out.println(arr[i]);
		}
	}
	
}
