package com.kh.chap04_UserException.run;

import com.kh.chap04_UserException.controller.UserExceptionController;
import com.kh.chap04_UserException.model.exception.UserException;

public class Run {
	public static void main(String[] args) {
		try {
			new UserExceptionController().method();
		} catch (UserException e) {
			// TODO Auto-generated catch block
			System.out.println( e.getMessage() );
		}
	}
}
