package com.kh.chap04_Field.run;

import com.kh.chap04_Field.model.vo.FieldTest1;
import com.kh.chap04_Field.model.vo.FieldTest3;

public class FieldRun {
	public static void main(String[] args) {
		//FieldTest1 f1 = new FieldTest1();
		//System.out.println(f1.temp1);
		//System.out.println(f1.temp3);
		//System.out.println(f1.temp4);
		
		FieldTest3 ft3 = new FieldTest3();
		
		System.out.println("ft3.fMax = " + ft3.fMax);
		System.out.println("ft3.fMax2 = " + ft3.fMax2);
		
		// static 변수는 프로그램 실행시 
		// 클래스명.변수명 으로 static 영역에 메모리 공간이 할당됨
		// --> 클래스명.변수명으로 접근하여 사용 가능함
		System.out.println("FieldTest3.fMax = " + FieldTest3.fMax);
		
		// static final 변수
		System.out.println("FieldTest3.LIMIT = " + FieldTest3.LIMIT);
		
		for(int i=0; i<FieldTest3.LIMIT; i++) {}
		
	
		
	}
}
