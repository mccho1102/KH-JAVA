package com.khchap01_Abstraction.run;

import com.khchap01_Abstraction.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Student std = new Student();
		std.name = "최창욱";
		std.age = 20;
		std.gender = '남';
		std.schoolName = "KH대학";
		std.grade = 1;
		std.kor = 70;
		std.math = 90;
		
		System.out.println(std.name + "은 나이는"+ std.age + "세이다"); 
		std.study();
	}

}
