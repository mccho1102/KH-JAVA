package com.khchap01_Abstraction.run;

import com.khchap01_Abstraction.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Student std = new Student();
		std.name = "��â��";
		std.age = 20;
		std.gender = '��';
		std.schoolName = "KH����";
		std.grade = 1;
		std.kor = 70;
		std.math = 90;
		
		System.out.println(std.name + "�� ���̴�"+ std.age + "���̴�"); 
		std.study();
	}

}
