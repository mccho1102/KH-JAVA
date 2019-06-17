package com.khchap02_Encapsulation.model.vo;

// vo(Value Object) : ���� ������ �� �ִ� ��ü�� ���� �� �ִ� Ŭ����
// ���� �����ϰ� ���� ���� �ִ� setter�� getter �� �ִ� Ŭ����
public class Student2 {

	// �Ӽ�
	private String name;       // �̸�
	private int age;           // ����
	private char gender;       // ����
	private int grade;         // �г�
	private String schoolName; // �б���
	private double kor;        // ��������
	private double math;       // ��������
		
	// ���
	
	// �ܺο��� Ŭ���� ������ �����͸� ó���� �� �ִ� ��ɱ���
	// --> setter / getter
	
	// setter
	// ��ü�� ���� ����ϴ� ����� �ϴ� �޼ҵ�
	// �ܺο��� ������ �� �ֵ��� public���� �����ؾ� ��
	public void setName(String name) {
		                // �Ű�����
		                // �޼ҵ� ȣ��� ���޵Ǵ� ���� �޾ƿ�
		this.name = name;
		// this --> ���� ��ü(Ŭ����)�� ���� �ּҸ� ����Ŵ
	
	}
	
    // getter
	// ��ü�� ���� �ܺη� ��ȯ�ϴ� ����� ������ �޼ҵ�
	// �ܺο��� ������ �� �ֵ��� public���� �����ؾ� ��
	public String getName() {
		// ��ȯ �ϰ��� �ϴ� �������� �ڷ��� ����
		return name;
	}
	
	// age�� setter
	public void setAge(int age) {
		this.age = age;
	}
	
	// age�� getter
	public int getAge() {
		return age;
	}
	
	// gender�� setter
	public void setGender(char gender) {
		this.gender = gender; 
	}
	// gender�� getter
	public char getGender() {
		return gender;
	}
	
	// grade�� setter
	public void setGrade(int grade) {
		this.grade = grade;
	}
	// grade�� getter
	public int getGrade() {
		return grade;
	}
	
	// schoolName�� setter
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	// schoolName�� getter
	public String getSchoolName() {
		return schoolName;
	}

	public String information() {
		return "�̸� : " + name + "���� : " + age +"���� : " + gender;
	}
	
}
