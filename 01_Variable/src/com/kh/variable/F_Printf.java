package com.kh.variable;

public class F_Printf {
	
	public void printfMethod() {
		char ch = 'a';
		char ch2 = 'b';
		char ch3 = 'c';
		char ch4 = 'd';
		char ch5 = 'e';
		
		
		
		System.out.println(ch);
		System.out.printf("%c \n",ch);
		
		// a b c d e
		System.out.println(ch + " " + ch2 + " " + ch3 + " " + ch4 + " " + ch5 );
		System.out.printf("%c %c %c %c %c \n",ch,ch2,ch3,ch4,ch5);
		
		int i = 100;
		int i2 = 10;
		int i3 = 200;
		int i4 = 1;
		/*
		100
		 10
		200
		  1 
		*/
		System.out.println(i+"\n"
				          +" "+ i2 + "\n"
				          + i3 + "\n"
				          + "  " + i4);
		// 오른쪽 정렬(+)
		System.out.printf("%3d\n%3d\n%3d\n%3d\n",i,i2,i3,i4);
		
		// 왼쪽 정렬(-)
		System.out.printf("%-3d\n%-3d\n%-3d\n%-3d\n",i,i2,i3,i4);
		
		// 실수 + 문자열
		double dNum = 3.141592;
		String str = "원주율";
		
		// 원주율은 3.141592 입니다.
		System.out.printf("%s은 %f 입니다. \n", str, dNum);
		
		// 원주율은 3.14 입니다.
		System.out.printf("%s은 %.2f 입니다. \n", str, dNum);
		
	}
}
