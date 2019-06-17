package com.kh.chap04_assist.model.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataTest {
	
	//data 보조 스트림
	// 데이터를 읽고 쓰는데 있어서 byte 단위가 아닌
	// 기본자료형의 크기로 입출력을 할 수 있음.
	
	// 주의 사항
	// 1) DataOutputStream으로 내보내진 데이터는
	//  반드시 DataInputStream으로 읽어와야 됨.
	
	// 2) 각 기본 자료형의 크기가 다르기 때문에 저장한 데이터 순서와
	//     똑같은 순서로 읽어 와야됨.
	
	public void fileSaveOpen() {
		
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("d_data.txt"));
				DataInputStream dis = new DataInputStream(new FileInputStream("d_data.txt"));
				){
			
			//파일로 출력
			dos.writeInt(30);
			dos.writeChar('남');
			dos.writeUTF("홍길동");
			dos.writeBoolean(true);
			dos.writeDouble(185.5);
			
			dos.writeInt(30);
			dos.writeChar('여');
			dos.writeUTF("홍길순");
			dos.writeBoolean(false);
			dos.writeDouble(165.5);
			
			dos.writeInt(20);
			dos.writeChar('남');
			dos.writeUTF("홍길연");
			dos.writeBoolean(true);
			dos.writeDouble(183.5);
			
			//파일 내용 입력
			while(true) {
				
				// 파일을 읽어 나가다 더 이상 읽어올 값이 없으면
				//EOFException() 발생
				//EOF(End Of File)
				System.out.println(dis.readInt());
				System.out.println(dis.readChar());
				System.out.println(dis.readUTF());
				System.out.println(dis.readBoolean());
				System.out.println(dis.readDouble());
			
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(EOFException e) {
			System.out.println("파일 읽기 완료");
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
