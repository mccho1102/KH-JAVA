package com.kh.chap04_UserException.model.exception;
// 사용자 정의 예외
// -> Exception을 꼭 상속 받아야 됨
// --> Exception을 상속 받은 클래스를 상속받으면 됨
public class UserException extends Exception {
	public UserException() {}
	public UserException(String msg) {
		super(msg);
	}
}
