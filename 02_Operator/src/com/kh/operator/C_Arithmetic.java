package com.kh.operator;

public class C_Arithmetic {
    // 산술연산자
	// 사칙연산(+,-,*,/) + %(modulus, mod)
	public void method1() {
		int num1 =10;
		int num2 = 3;
		
		System.out.println("num1+num2=" + (num1+num2)); //13
		System.out.println("num1-num2=" + (num1-num2)); //7
		System.out.println("num1*num2=" + (num1*num2)); //30
		System.out.println("num1/num2=" + (num1/num2)); //3
		// num1 / num2결과 실수형으로 출력
		System.out.println("num1/num2=" + ((double)num1/num2)); //3.3333333333
		
		// '%' : 나누기 연산후 나머지 값을 구하는 연산자
		System.out.println("num1 % num2 =" + (num1 % num2)); // 1
		
		// 어떠한 수의 배수인가?, 짝수인가? 홀수인가?
		
		// num2 = 3
		//(num2 % 3) == 0  // 3의 배수인가?
		
	}
    
	public void method2() {
		double dNum1 = 35;
		double dNum2 = 10;
		
		// 어떤값이 출력될지 예상 해보기
		
		System.out.println("dNum1 = " + dNum1);
		System.out.println("dNum2 = " + dNum2);
		
		double add = dNum1 + dNum2;
		System.out.println("dNum1 + dNum2 = " + add);
		
		double sub = dNum1 - dNum2;
		System.out.println("dNum1 - dNum2 = " + sub);
		
		double mul = dNum1 * dNum2;
		System.out.println("dNum1 * dNum2 = " + mul);
		
		double div = dNum1 / dNum2;
		System.out.println("dNum1 / dNum2 = " + div);
		
		double mod = dNum1 % dNum2;
		System.out.println("dNum1 % dNum2 = " + mod);
	}
	
	public void method3() {
		int a = 5;                                      
		int b = 10;
		
		int c = (++a) + b;   // 16
		
		int d = c/a;         // 2
		
		int e = c % a;       // 4      
		
		int f = e++;         // 4
		
		int g = (--b) + (d--);  // 11
		
		int h = 2;           
		
		int i = a++ + b / (--c/f) * (g-- - d) % (++e + h);  // 12
        
		// a =7, b=9, c=15, d=1, e= 6,f=4,g=10, h=2,i=12
  
		System.out.println("a :" + a);
		System.out.println("b :" + b);
		System.out.println("c :" + c);
		System.out.println("d :" + d);
		System.out.println("e :" + e);
		System.out.println("f :" + f);
		System.out.println("g :" + g);
		System.out.println("h :" + h);
		System.out.println("i :" + i);
		                                               
		
	}
	
}
