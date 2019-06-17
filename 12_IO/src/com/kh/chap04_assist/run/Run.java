package com.kh.chap04_assist.run;

import java.io.BufferedWriter;

import com.kh.chap04_assist.model.dao.BufferedTest;

public class Run {
	
	public static void main(String[] args) {
		
		BufferedTest bt = new BufferedTest();
		
		//bt.fileSave1();
		//bt.fileSave2();
		//bt.fileOpen1();
		bt.fileCopy();
	}

}
