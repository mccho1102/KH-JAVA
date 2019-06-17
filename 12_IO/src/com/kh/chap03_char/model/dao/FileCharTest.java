package com.kh.chap03_char.model.dao;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.imageio.IIOException;

public class FileCharTest {
	//���� ��� ��Ʈ��
	//2byte ����(�����ڵ�) ������ �����͸� ������ϴ� ��Ʈ��
	
	
	public void fileSave() {
		
		FileWriter fw1 = null;
		//FileWriter : ���ڱ�� ��� ��Ʈ��
		//���� ������ �ؽ�Ʈ ��� ������ �� ��� ���
		//���α׷� --> ����
		try{
			
			fw1 = new FileWriter("b_char.txt");
			
			String str = "Hello world!! �ȳ��ϼ���";
			
			fw1.write(97); //'a'
			fw1.write('\n');
			fw1.write('B'); //'B'
			fw1.write('\n');
			fw1.write(str);
			
			System.out.println("���� ��¿Ϸ�");
			
			
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
		//FileReader : ���� ��� ���� �Է� ��Ʈ��
		//���� ������ �ؽ�Ʈ ��� ������ ���� ��� ���
		//���α׷� <--  ����:  ������ ������ ���α׷��� ���������� �Էµ�.
		
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
