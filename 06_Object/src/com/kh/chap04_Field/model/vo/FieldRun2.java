package com.kh.chap04_Field.model.vo;

import com.kh.chap04_Field.model.vo.FieldTest1;

public class FieldRun2 {
	public static void main(String[] args) {
		FieldTest1 f1 = new FieldTest1();
		System.out.println(f1.temp1);
		System.out.println(f1.temp3);
		//System.out.println(f1.temp4);
		
		FieldTest2 f2_1 = new FieldTest2();
		FieldTest2 f2_2 = new FieldTest2();
		
		f2_1.number = 1000;
		System.out.println(f2_1.number);
		System.out.println(f2_2.number);
	}
}
