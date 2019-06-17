package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.tools.FileObject;

// DAO(Data Access Object) : 데이터 접근 객체
//데이터를 외부 장치로 입출력 할 때 사용되는 객체

public class FileByteTest {
	
	public void fileOpen() {
		
		FileInputStream fis = null;
		//바이트 기반 파일 입력 스트림
		//파일로부터 1byte 단위로 데이터를 읽어들임.
	    
		//프로그램 <<-- 파일(파일의 내용(데이터)를 입력 받아옴)
		
		//FileInputStream 객체가 생성되는 경우
		//바로 파일과 직접 연결됨
		//이 때 파일이 존재하지 않는 경우 FileNotFoundException 이 발생
		//try ~ catch 구문으로 처리할 것
		
		try {
				
				fis = new FileInputStream("a_byte.txt");
				
				//read() 메소드
				//FileInputStream.read()
				//--> 파일의 내용을 1바이트씩 순차적으로 읽어옴.
				//더 이상 읽어올 내용이 없으면 -1 반환.
				
				
				//byte 자료형 : -128~127 정수형
				// 아스키 코드 : 제일 앞 1비트 제외 7비트  (0~127)
				int value = 0;
				while((value  = fis.read()) != -1) {
					//파일에 읽어올 데이터가 존재 하는 경우
					System.out.print((char)value);
					
				}
				
				
				
				
				
		}catch(FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {// 무조건 실행되는 부분
			try {
				if(fis != null)
				fis.close();                  
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}
	
	public void fileSave() {
		
		//FileOutputStream
		//1byte 씩 파일로 데이터를 내보냄
		//프로그램 --> 파일로 출력
		
		FileOutputStream fos = null;
		//객체 생성 시 자동으로 파일과 연결
		//파일이 없을경우 생성, 있을 경우 덮어쓰기(옵션 지정)
		
		try {
			fos =  new FileOutputStream("a_byte2.txt"/*,true*/);
			//a_byte2.txt 없으면 -> 생성
			//					있으면 -> 덮어쓰기
			//true 작성시 -> 이어쓰기
			
			/*
			fos.write(97); //'a'
			fos.write('b'); //'b'
			fos.write('김');
			
			byte[] barr = {'h','e','l','l','o'};
			
			fos.write('\n');
			fos.write(barr);
			*/
			
			
			String str = "Hello world!! 안녕 반가워? 졸립죠? yes";
			
			/*
			byte[] barr2 = new byte[str.length()];
			
			for(int i=0; i<str.length(); i++) {
				barr2[i] = (byte) str.charAt(i);
			}
			
			fos.write(barr2);
			*/
			
			
			for(int i=0; i<str.length(); i++) {
				fos.write(str.charAt(i));
			}
			
			System.out.println("파일 저장 완료");                                                                                             
			
		}catch(IOException e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				if(fos != null)
					fos.close();
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}	
		
	}

	
	
}
