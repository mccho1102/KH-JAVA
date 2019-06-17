package com.khchap02_Encapsulation.model.vo;

// vo(Value Object) : 값을 보관할 수 있는 객체를 만들 수 있는 클래스
// 값을 저장하고 꺼내 쓸수 있는 setter와 getter 가 있는 클래스
public class Student2 {

	// 속성
	private String name;       // 이름
	private int age;           // 나이
	private char gender;       // 성별
	private int grade;         // 학년
	private String schoolName; // 학교명
	private double kor;        // 국어점수
	private double math;       // 수학점수
		
	// 기능
	
	// 외부에서 클래스 내부의 데이터를 처리할 수 있는 기능구현
	// --> setter / getter
	
	// setter
	// 객체에 값을 기록하는 기능을 하는 메소드
	// 외부에서 접근할 수 있도록 public으로 선언해야 함
	public void setName(String name) {
		                // 매개변수
		                // 메소드 호출시 전달되는 값을 받아옴
		this.name = name;
		// this --> 현재 객체(클래스)의 시작 주소를 가리킴
	
	}
	
    // getter
	// 객체에 값을 외부로 반환하는 기능을 구현한 메소드
	// 외부에서 접근할 수 있도록 public으로 선언해야 함
	public String getName() {
		// 반환 하고자 하는 데이터의 자료형 기입
		return name;
	}
	
	// age의 setter
	public void setAge(int age) {
		this.age = age;
	}
	
	// age의 getter
	public int getAge() {
		return age;
	}
	
	// gender의 setter
	public void setGender(char gender) {
		this.gender = gender; 
	}
	// gender의 getter
	public char getGender() {
		return gender;
	}
	
	// grade의 setter
	public void setGrade(int grade) {
		this.grade = grade;
	}
	// grade의 getter
	public int getGrade() {
		return grade;
	}
	
	// schoolName의 setter
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	// schoolName의 getter
	public String getSchoolName() {
		return schoolName;
	}

	public String information() {
		return "이름 : " + name + "나이 : " + age +"성별 : " + gender;
	}
	
}
