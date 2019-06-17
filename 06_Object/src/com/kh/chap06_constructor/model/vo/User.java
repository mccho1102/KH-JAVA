package com.kh.chap06_constructor.model.vo;

public class User {
	/* public class 클래스명{
	 * 	필드
	 *  생성자
	 *  메소드
	 *      -> getter/setter
	 *      -> 필드정보 출력 메소드
	 *      -> 추가 기능 메소드
	 * }
	 * 
	 */
		
     // 필드
	private String userId; // 멤버변수(또는 인스턴스 변수)
	private String userPwd;
	private String userName;
	private int age;
	private char gender;

	// 생성자
	/*
	 * 생성자를 사용하는 목적
	 * 
	 * - new 연산자를 통해 객체 생성 시
	 *   객체 생성과 동시에 필드를 초기화 해줄 목적으로 사용
	 *   + 객체 생성과 동시에 특정 기능 수행
	 *   
	 * - 생성자 사용시 주의사항
	 *  1. 반드시 클래스명과 생성자명 동일 해야 한다
	 *  2. 반환형이 존재하지 않는다.
	 *  3. 매개변수 있는 생성자 작성 시
	 *     기본 생성자가 JVM에 의해 자동으로 생성되지 않으므로
	 *     반드시 기본 생성자를 작성해야 한다.  
	 */
	
	 // 기본 생성자
	 // [접근제한자] 클래스명(){}
	public User() {
		// 기본 생성자(매개변수 없음)
		// 객체 생성을 목적으로 할 때 사용
		
		// 만약 클래스 내부에 생성자를 하나도 작성하지 않은 경우
		// JVM에 의해서 자동으로 컴파일 단계에서 생성됨
		
		System.out.println("User() 기본 생성자에 의해서 객체 생성");
	}
	
	// 매개변수 있는 생성자
	
	// 객체 생성과 동시에 매개변수로 전달된 값들을
	// 필드에 초기화 하는 목적으로 사용
	
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
	
	// 매개변수 순서 다름(오버로딩)
	/*
	public User(char gender, String userid, String userPwd, String username,
		    int age ) {

    } 
	*/
	// 오버로딩
	// 한 클래스 내에서 동일한 이름으로 메소드(생성자 포함)를
	// 여러개 작성하는 기법
	
	// 오버로딩의 조건
	// 1. 매개변수의 개수
	// 2. 매개변수의 타입
	// 3. 매개변수의 순서
	//    (단, 동인 타입의 매개변수 끼리는 순서가 바뀌어도
	//     조건 충족이 되지 않음)

	
	// 메소드
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
