package com.kh.chap04_UserException.model.exception;
// ����� ���� ����
// -> Exception�� �� ��� �޾ƾ� ��
// --> Exception�� ��� ���� Ŭ������ ��ӹ����� ��
public class UserException extends Exception {
	public UserException() {}
	public UserException(String msg) {
		super(msg);
	}
}
