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
	
	
	//Set�� �ߺ����Ÿ� �ϱ� ���ؼ���
	//object���� ��ӹ��� �ΰ��� �޼ҵ尡 �������̵� �Ǿ��־����.
	//1)equals();
	//2)hashcode();
	
	
	
	//�ؽ��ڵ�
	// hashCode()�� equals() �޼ҵ�� ¦��
	// 1)���� �ϳ��� �������̵��� �ϰ� �Ǵ� ���
	// 		�� �޼ҵ� �� �������̵� ����.
	// 2) equals()�� ����� true�� ���
	//		�ݵ�� hashCode()�� ���� ��ġ�ؾ�
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
		if (this == obj) //�� ����� ���� ���
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) //Ÿ���� �ٸ����
			return false; 
		
		//�� ��ü�� ������ �ִ� �ʵ尪 �� ���� 
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
