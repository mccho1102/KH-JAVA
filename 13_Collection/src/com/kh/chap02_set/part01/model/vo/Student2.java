package com.kh.chap02_set.part01.model.vo;

public class Student2 {
	
	private String name;
	private int age;
	private int score;
	public Student2(){}
	public Student2(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student2 [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	
	
	//Set이 중복제거를 하기 위해서는
	//object에서 상속받은 두가지 메소드가 오버라이딩 되어있어야함.
	//1)equals();
	//2)hashcode();
	
	
	
	//해시코드
	// hashCode()와 equals() 메소드는 짝꿍
	// 1)둘중 하나라도 오버라이딩을 하게 되는 경우
	// 		둘 메소드 다 오버라이딩 진행.
	// 2) equals()의 결과가 true인 경우
	//		반드시 hashCode()의 값도 일치해야
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) //비교 대상이 나일 경우
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) //타입이 다를경우
			return false; 
		
		//두 객체가 가지고 있는 필드값 비교 시작 
		Student2 other = (Student2) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (score != other.score)
			return false;
		return true;
	}
	

}
