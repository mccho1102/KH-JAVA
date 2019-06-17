package com.kh.operator;

public class B_InDecrease {
	// 증감 연산자( ++, --)
	
	public void method1(){
		int a = 10;
		int b = ++a; // b = 11, a = 11
		System.out.println("전위 증감 연산자");
		System.out.println("a:" + a + ",b:" +b);
		
		a = 10; 
		b = a++; // b = 10, a = 11
		System.out.println("후위 증감 연산자");
		System.out.println("a:" + a + ",b:" +b);
		
		int num1 = 10;
		System.out.println("전위 증감 연산자 사용전 :" + num1); //num1 = 10
		System.out.println("++num1 1회 수행 :" + (++num1));   //num1 = 11
		System.out.println("++num1 2회 수행 :" + (++num1));   //num1 = 12
		System.out.println("++num1 3회 수행 :" + (++num1));   //num1 = 13
		System.out.println("++num1 4회 수행 :" + (++num1));   //num1 = 14
		System.out.println("++num1 5회 수행 :" + (++num1));   //num1 = 15
		System.out.println("전위 증감 연산 5회 수행 후 num1 :" + num1); //num1 = 15
		
		int num2 = 10;
		System.out.println("후위 증감 연산자 사용전 :" + num2); //num2 = 10
		System.out.println("num2++ 1회 수행 :" + (num2++));   //num2 = 10
		System.out.println("num2++ 2회 수행 :" + (num2++));   //num2 = 11
		System.out.println("num2++ 3회 수행 :" + (num2++));   //num2 = 12
		System.out.println("num2++ 4회 수행 :" + (num2++));   //num2 = 13
		System.out.println("num2++ 5회 수행 :" + (num2++));   //num2 = 14
		System.out.println("후위 증감 연산 5회 수행 후 num1 :" + num1); //num2 = 15
	}
	
	public void method2() {
		int age = 20;
		
		System.out.println("현재 나이는?" + age);   // 20
		
		System.out.println("++age는?" + (++age));  // 21
		
		System.out.println("age++은?" + age++);    // 21 -> 22
		
        System.out.println("--age는?" + (--age));  // 21
		
		System.out.println("age--은?" + age--);    // 21 -> 20
		
		System.out.println("현재 나이는?" + age);   // 20
	}
	
	public void method3() {
		int num1 = 20;
		
		int result = (num1++) * 3;                 
		
		System.out.println("result :" + result);   // 60
		System.out.println("num1 :" + num1);       // 21
		
		result = (--num1) / 5;                     
		System.out.println("result :" + result);   // 4
		System.out.println("num1 :" + num1);       // 20
	}
	public void method4() {
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a++);  //10  
		// a=10 -> 11, b=20, c=30,
		
		System.out.println((++a) + (b++)); 
		// a=12, b=20 -> 21, c=30,
		
		System.out.println((a++) + (--b) + (--c));   
		// a=12 -> 13, b=20, c=29,
		System.out.println("a :" + a);   
		// a=13, b=20, c=29,
		System.out.println("b :" + b); 
		// a=13, b=20, c=29,
		System.out.println("c :" + c); 
		// a=13, b=20, c=29,
	}	
		
		
		
		
}
