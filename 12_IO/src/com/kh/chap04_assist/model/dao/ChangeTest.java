package com.kh.chap04_assist.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ChangeTest {
	//문자 변환 보조스트림
	//byte기반으로 입출력되는 데이터를 
	//문자기반으로 변환하는 스트림
	
	public void fileSave() {
		//키보드로 입력 받은 값을
		//그대로 파일에 저장
		//단 exit가 입력되면 종료
		
		//키보드 입력(바이트기반) -> 문자로 변환
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new FileWriter("f_change.txt"));)
		{
			
			String tmp = null; //문자열을 입력받아 임시 저장 할 변수
			
			while(true) {
				System.out.print("입력 : ");
				tmp = br.readLine();
				if(tmp.equals("exit")) {//exit 입력된 경우
					break;
				}
				
				bw.write(tmp);
				bw.newLine();

			}
			System.out.println("파일 출력완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
