package com.kh.chap01_file.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileTset {
	
	public void method1() {
		//File 클래스 API확인
		// -->java.io 패키지
		
		
		//생성된 파일 객체와 test.txt 연결
		try {
			
			//1. 현재 프로젝트에 파일생성
			File f1 = new File("test.txt");
			f1.createNewFile();
			
			//2. 원하는 경로에 파일 생성
			File f2 = new File("c:\\dev\\test.txt");
			f2.createNewFile();
			
			//3. 폴더 만들고 파일 생성
			
			//File f3 = new File("c:\\dev\\temp\\test2.txt");
			//f3.createNewFile();
			//--> 폴더가 없으면 IOException 발생
			
			//temp 폴더 생성
			
			File f3 = new File("c:\\dev\\temp");
			if(f3.mkdir()) {
				System.err.println("폴더 생성에 성공했습니다.");
			}
	
			File f4 = new File("c:\\dev\\temp\\test3.txt");
			if(f4.createNewFile()) {
				System.out.println("파일 생성에 성공했습니다.");
			}
			
			/*
				File.exists() : 해당 파일 또는 폴더가 존재하면 true
										없으면 false를 반환
				File.isFile() : 해당 파일이 폴더가 아닌 파일이면 true
										아니면 false
			*/
			
			System.out.println(f1.exists());
			System.out.println(f2.exists());
			System.out.println(f3.exists());
			
			
			
			System.out.println(f1.isFile());
			System.out.println(f2.isFile());
			System.out.println(f3.isFile());   //f3는 폴더
			
			System.out.println(f3.isHidden());                           
			
			
			
			
			
			
			
			/*
			File f5 = new File("c:\\dev\\temp");
			if(f5.delete()) {
				System.out.println("파일 제거에 성공했습니다.");
			}
			*/
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public void method2() {
		
		File folder  =  new File("c:\\dev\\temp2");
		try {
			
			if(!folder.exists()) { //폴더가 존재하지 않을 경우
				folder.mkdir();
				System.out.println(folder.getName() + "폴더 생성");
			}
			
			File file = new File("c:\\dev\\temp2\\person.txt");
			if(!file.exists()) {
				if(file.createNewFile()) {
				System.out.println(file.getName() + "파일 생성");
				}
			}
			
			System.out.println("파일명 : " + file.getName());
			System.out.println("파일의 경로 : " + file.getAbsolutePath());  //파일의 절대경로
			System.out.println("파일 크기: " + file.length()); //파일의 크기
			System.out.println("현재 폴더 : " + file.getParent()); //상위 경로 
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void method3() {
		
		try {
			FileInputStream fis = new FileInputStream("c:\\dev\\test.txt");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
