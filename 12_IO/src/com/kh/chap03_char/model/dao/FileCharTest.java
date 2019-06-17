package com.kh.chap03_char.model.dao;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.imageio.IIOException;

public class FileCharTest {
	//문자 기반 스트림
	//2byte 문자(유니코드) 단위로 데이터를 입출력하는 스트림
	
	
	public void fileSave() {
		
		FileWriter fw1 = null;
		//FileWriter : 문자기반 출력 스트림
		//문자 단위로 텍스트 기반 파일을 쓸 경우 사용
		//프로그램 --> 파일
		try{
			
			fw1 = new FileWriter("b_char.txt");
			
			String str = "Hello world!! 안녕하세요";
			
			fw1.write(97); //'a'
			fw1.write('\n');
			fw1.write('B'); //'B'
			fw1.write('\n');
			fw1.write(str);
			
			System.out.println("파일 출력완료");
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fw1 != null) { fw1.close(); }
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void fileOpen() {
		
		FileReader fr = null;
		//FileReader : 문자 기반 파일 입력 스트림
		//문자 단위로 텍스트 기반 파일을 읽을 경우 사용
		//프로그램 <--  파일:  파일의 내용이 프로그램에 순차적으로 입력됨.
		
		try {
			fr = new FileReader("b_char.txt");
			
			int value = 0;
			while((value  = fr.read()) != -1) {
			
				System.out.print((char)value);
				
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr != null) {
				fr.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
