package com.kh.chap04_assist.run;

import com.kh.chap04_assist.model.dao.ChangeTest;
import com.kh.chap04_assist.model.dao.ObjectTest;
import com.kh.chap04_assist.model.dao.SimpleTest;

public class SimpleRun {
	
	public static void main(String[] args) {
		SimpleTest st = new SimpleTest();
		ObjectTest ot = new ObjectTest();
		ChangeTest ct = new ChangeTest();
		//st.fileSave();
		//st.fileOpen();
		//ot.fileSava();
		//ot.fileOpen();
		ct.fileSave();
	}

}
