package com.kh.chap04_assist.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap03_char.model.vo.Phone;
import com.kh.chap03_char.model.vo.Student;

public class ObjectTest {
	
	private Student[] stList = null;
	
	// 파일 저장용 메소드
	
	public void fileSava() {
		//샘플 데이터
		stList = new Student[3];
		stList[0] = new Student("박재식", 30, '남', new Phone("삼성","갤럭시S10",1050000));
		stList[1] = new Student("제상란", 33, '여', new Phone("삼성","갤럭시S9",900000));
		stList[2] = new Student("정지수", 27, '남', new Phone("삼성","갤럭시S7",500000));
		
		try(ObjectOutputStream oss= new ObjectOutputStream(new FileOutputStream("studentList.txt"))){
			
			oss.writeObject(stList);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	//파일 오픈용 메소드
	public void fileOpen() {
		
		Student[] stList2 = null;
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("studentList.txt")) ){
			// studentList.txt에 저장되어 있는 객체의 타입은?
			//Student[]  타입
			
			stList2 = (Student[]) ois.readObject();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
		
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//읽어온 student[] 정보를 순차적으로 출력
		
		for(int i=0; i<stList2.length; i++) {
			System.out.println(stList2[i]);
		}
		System.out.println("파일 읽기 완료");
		
	}
}
