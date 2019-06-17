package com.kh.operator;

public class B_InDecrease {
	// ���� ������( ++, --)
	
	public void method1(){
		int a = 10;
		int b = ++a; // b = 11, a = 11
		System.out.println("���� ���� ������");
		System.out.println("a:" + a + ",b:" +b);
		
		a = 10; 
		b = a++; // b = 10, a = 11
		System.out.println("���� ���� ������");
		System.out.println("a:" + a + ",b:" +b);
		
		int num1 = 10;
		System.out.println("���� ���� ������ ����� :" + num1); //num1 = 10
		System.out.println("++num1 1ȸ ���� :" + (++num1));   //num1 = 11
		System.out.println("++num1 2ȸ ���� :" + (++num1));   //num1 = 12
		System.out.println("++num1 3ȸ ���� :" + (++num1));   //num1 = 13
		System.out.println("++num1 4ȸ ���� :" + (++num1));   //num1 = 14
		System.out.println("++num1 5ȸ ���� :" + (++num1));   //num1 = 15
		System.out.println("���� ���� ���� 5ȸ ���� �� num1 :" + num1); //num1 = 15
		
		int num2 = 10;
		System.out.println("���� ���� ������ ����� :" + num2); //num2 = 10
		System.out.println("num2++ 1ȸ ���� :" + (num2++));   //num2 = 10
		System.out.println("num2++ 2ȸ ���� :" + (num2++));   //num2 = 11
		System.out.println("num2++ 3ȸ ���� :" + (num2++));   //num2 = 12
		System.out.println("num2++ 4ȸ ���� :" + (num2++));   //num2 = 13
		System.out.println("num2++ 5ȸ ���� :" + (num2++));   //num2 = 14
		System.out.println("���� ���� ���� 5ȸ ���� �� num1 :" + num1); //num2 = 15
	}
	
	public void method2() {
		int age = 20;
		
		System.out.println("���� ���̴�?" + age);   // 20
		
		System.out.println("++age��?" + (++age));  // 21
		
		System.out.println("age++��?" + age++);    // 21 -> 22
		
        System.out.println("--age��?" + (--age));  // 21
		
		System.out.println("age--��?" + age--);    // 21 -> 20
		
		System.out.println("���� ���̴�?" + age);   // 20
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
