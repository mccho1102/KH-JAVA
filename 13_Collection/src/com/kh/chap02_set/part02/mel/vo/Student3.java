package com.kh.chap02_set.part02.mel.vo;

public class Student3 implements Comparable<Student3>{
	
	private String name;
	private int age;
	private int score;
	public Student3() {
		super();
	}
	public Student3(String name, int age, int score) {
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
		return "Student3 [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	@Override
	public int compareTo(Student3 o) {
		//기본 정렬 기준 작성
		//이름 오름차순
		return this.getName().compareTo(o.getName());
	}
	
	
}
