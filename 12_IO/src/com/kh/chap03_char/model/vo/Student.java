package com.kh.chap03_char.model.vo;

public class Student implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2085449610263821906L;
	private String name;
	private int age;
	private char gender;
	public Student() {
		super();
	}
	private Phone ph;
	public Student(String name, int age, char gender, Phone ph) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.ph = ph;
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public Phone getPh() {
		return ph;
	}
	public void setPh(Phone ph) {
		this.ph = ph;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", ph=" + ph + "]";
	}
	
	
}
