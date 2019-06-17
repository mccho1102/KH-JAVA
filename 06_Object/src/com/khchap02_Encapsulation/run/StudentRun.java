package com.khchap02_Encapsulation.run;

import com.khchap02_Encapsulation.model.vo.Student2;

public class StudentRun {

	public static void main(String[] args) {
		Student2 std2 = new Student2();
		std2.setName("최창욱");
		std2.setAge(55);
		
		System.out.println(std2.getName() + "의 나이는"
				         + std2.getAge() + "세 입니다.");
		
		System.out.println(std2.information());
	}

}
