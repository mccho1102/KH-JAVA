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

public class SimpleTest {
	
	// 객체 입출력 보조 스트림
	// 객체 자체를 송수신 할 수 있도록 만들어 주는 보조 스트림
	// 객체를 연속적인 데이터 형식으로 변경(직렬화) 또는
	// 반대 작업(역직렬화)이 가능한 보조 스트림
	
	public void fileSave() {
		
		Phone ph = new Phone("삼성","갤럭시S10",1050000);
		Phone ph2 = new Phone("애플","아이폰10X",1000000);
		Phone ph3 = new Phone("엘쥐","V50",1200000);
		
		
		//try -with -resource
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e_simple.txt"))) {
			
			//objectOutputStream : 객체를 출력해주는 보조 스트림
			//-->객체를 스트림에 통과 시킬 수 있도록 
			//		객체를 직렬화 시켜주는 보조스트림
			
			oos.writeObject(ph);
			oos.writeObject(ph2);
			oos.writeObject(ph3);
			
			//객체를 직렬화 시켜서 출력하기 위해서는
			//직렬화를 시켜야 하는 객체에 '직렬화 가능한 객체'
			//라고 명시를 해줘야 함.
			//-->Serializable 라는 인터페이스
			//		상속받아서 작성해야 함.
			
	
			System.out.println("파일 출력 완료");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void fileOpen() {
		
		
		//ObjectInputStream : 직렬화된 객체를
		//		역직렬화 시켜서 객체로 사용 가능하게 하는 보조스트림.
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e_simple.txt"))){
			
			/*
			while(true) {
				Object obj = ois.readObject();
				// ReadObject() : 객체를 순차적으로 읽어들어옴
				// 더이상 읽을 객체가 없으면
				// EOFException 발생
				Phone ph = (Phone)obj;  //다운 캐스팅
	
				System.out.println(ph.toString());
			}
			*/
			while(true) {
				Object obj = ois.readObject();
				System.out.println(obj);
			}
			
			
	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
			
		} catch(EOFException e) {
			System.out.println("파일 읽기 완료.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}
