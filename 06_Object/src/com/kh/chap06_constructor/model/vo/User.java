package com.kh.chap06_constructor.model.vo;

public class User {
	/* public class Ŭ������{
	 * 	�ʵ�
	 *  ������
	 *  �޼ҵ�
	 *      -> getter/setter
	 *      -> �ʵ����� ��� �޼ҵ�
	 *      -> �߰� ��� �޼ҵ�
	 * }
	 * 
	 */
		
     // �ʵ�
	private String userId; // �������(�Ǵ� �ν��Ͻ� ����)
	private String userPwd;
	private String userName;
	private int age;
	private char gender;

	// ������
	/*
	 * �����ڸ� ����ϴ� ����
	 * 
	 * - new �����ڸ� ���� ��ü ���� ��
	 *   ��ü ������ ���ÿ� �ʵ带 �ʱ�ȭ ���� �������� ���
	 *   + ��ü ������ ���ÿ� Ư�� ��� ����
	 *   
	 * - ������ ���� ���ǻ���
	 *  1. �ݵ�� Ŭ������� �����ڸ� ���� �ؾ� �Ѵ�
	 *  2. ��ȯ���� �������� �ʴ´�.
	 *  3. �Ű����� �ִ� ������ �ۼ� ��
	 *     �⺻ �����ڰ� JVM�� ���� �ڵ����� �������� �����Ƿ�
	 *     �ݵ�� �⺻ �����ڸ� �ۼ��ؾ� �Ѵ�.  
	 */
	
	 // �⺻ ������
	 // [����������] Ŭ������(){}
	public User() {
		// �⺻ ������(�Ű����� ����)
		// ��ü ������ �������� �� �� ���
		
		// ���� Ŭ���� ���ο� �����ڸ� �ϳ��� �ۼ����� ���� ���
		// JVM�� ���ؼ� �ڵ����� ������ �ܰ迡�� ������
		
		System.out.println("User() �⺻ �����ڿ� ���ؼ� ��ü ����");
	}
	
	// �Ű����� �ִ� ������
	
	// ��ü ������ ���ÿ� �Ű������� ���޵� ������
	// �ʵ忡 �ʱ�ȭ �ϴ� �������� ���
	
	public User(String userId, String userPwd, String userName) {
	    this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
			
	}
	public User(String userId, String userPwd, String userName,
			    int age, char gender) {
		//this.userId = userId;
		//this.userPwd = userPwd;
		//this.userName = userName;
		this(userId, userPwd, userName);
		this.age = age;
		this.gender = gender;
	}
	
	// �Ű����� ���� �ٸ�(�����ε�)
	/*
	public User(char gender, String userid, String userPwd, String username,
		    int age ) {

    } 
	*/
	// �����ε�
	// �� Ŭ���� ������ ������ �̸����� �޼ҵ�(������ ����)��
	// ������ �ۼ��ϴ� ���
	
	// �����ε��� ����
	// 1. �Ű������� ����
	// 2. �Ű������� Ÿ��
	// 3. �Ű������� ����
	//    (��, ���� Ÿ���� �Ű����� ������ ������ �ٲ�
	//     ���� ������ ���� ����)

	
	// �޼ҵ�
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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
	
	public String information() {
		return userId + "/" + userPwd + "/" +  userName + "/" + 
			    age + "/" +  gender ;
	}
	
}
