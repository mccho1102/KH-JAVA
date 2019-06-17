package com.kh.chap04_assist.model.dao;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTest {
	
	// Buffered Stream
	// 보조 스트림의 일종으로 기반 스트림만으로는 부족했던 성능을
	// 보다 향상 시켜주는 역할을 하는 스트림
	// 단독 객체생성이 불가능
	// --> 반드시 기반 스트림에 대한 객체 레퍼런스가 필요.
	
	// Buffered Stream 이용 시 
	//1바이트 , 1문자 단위로 스트림을 이용하는 것 보다
	// 여러 데이터를 한번에 묶어 스트림을 이용하므로
	//입출력 속도가 향상됨.
	
	//주의점!
	//buffered 관련 스트림 이용 시 꼭 flush() 또는 close() 메소드를 마지막에 호출 해야 함
	//--> flush() :  버퍼에 남은 데이터를 내보냄
	// ---> close() : 내부적으로 flush()를 실행한 후 스트림 반환
	
	// Buffered Stream 을 이용한 문자 기반 파일 생성
	
	public void fileSave1() {
		
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
			//버퍼 크기를 따로 지정 안해주면 8192byte  크기로 버퍼가 초기화됨.
			
			bw.write("안녕하세요.\n");
			bw.write("반갑습니다.");
			bw.newLine();  //줄바꿈해주는 메소드
			bw.write("졸면 나와서 시킵니다.");
			
		}catch(IOException e) {
			
			e.printStackTrace();
		}finally {
			try {
				if(bw !=null) {
				bw.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//try~ with ~ resource
	//--> try 구문 내부에서 사용할 스트림을 생성하면
	//      별도의 close() 호출 없이도  try -catch문 종료시
	//      스트림이 자동 반환됨.
	public void fileSave2() {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer2.txt"))){
			
				bw.write("I\n");
				bw.write("am\n");
				bw.write("ironman");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	//Buffered 스트림을 이용하여 문자 기반 파일 읽어오기
	
	public void fileOpen1() {
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer2.txt"))){
			
			String tmp;
			
			while((tmp = br.readLine())!= null) {
				System.out.println(tmp);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//어떤 형식의 파일이든 복사하는 기능 만들기
	//-> 바이트 기반 스트림
	//Buffered 스트림 사용
	
	public void fileCopy() {
		
		//복사 -> 읽고, 쓰는 과정을 동시에 진행
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("hqdefault.jpg"));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.jpg"));)
			{
			
			//버퍼를 이용해 읽어 와서 한번에 내보냄
			int readByte;
			while((readByte = bis.read()) != -1) {
				// 1바이트씩 읽어 온 후 
				System.out.println(readByte);  //콘솔창 출력
				bos.write(readByte);//바로 파일로 출력
			}
			System.out.println("파일 복사 완료");
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}
