package com.khchap01_Abstraction.model.vo;

//학생을 추상화한 클래스
public class Student {

	// 속성
	public String name;       // 이름
	public int age;           // 나이
	public char gender;       // 성별
	public int grade;         // 학년
	public String schoolName; // 학교명
	public double kor;        // 국어점수
	public double math;       // 수학점수
	
	// 기능
	public void study() {
		System.out.println("공부 기능 수행합니다.");
	}
	
	public void test() {
		System.out.println("시험 기능 수행합니다.");
	}
	
	public void attendance() {
		System.out.println("출석 기능 수행합니다.");
	}
	
	
	
	
	
}
