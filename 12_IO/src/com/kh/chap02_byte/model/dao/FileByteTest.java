package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.tools.FileObject;

// DAO(Data Access Object) : ������ ���� ��ü
//�����͸� �ܺ� ��ġ�� ����� �� �� ���Ǵ� ��ü

public class FileByteTest {
	
	public void fileOpen() {
		
		FileInputStream fis = null;
		//����Ʈ ��� ���� �Է� ��Ʈ��
		//���Ϸκ��� 1byte ������ �����͸� �о����.
	    
		//���α׷� <<-- ����(������ ����(������)�� �Է� �޾ƿ�)
		
		//FileInputStream ��ü�� �����Ǵ� ���
		//�ٷ� ���ϰ� ���� �����
		//�� �� ������ �������� �ʴ� ��� FileNotFoundException �� �߻�
		//try ~ catch �������� ó���� ��
		
		try {
				
				fis = new FileInputStream("a_byte.txt");
				
				//read() �޼ҵ�
				//FileInputStream.read()
				//--> ������ ������ 1����Ʈ�� ���������� �о��.
				//�� �̻� �о�� ������ ������ -1 ��ȯ.
				
				
				//byte �ڷ��� : -128~127 ������
				// �ƽ�Ű �ڵ� : ���� �� 1��Ʈ ���� 7��Ʈ  (0~127)
				int value = 0;
				while((value  = fis.read()) != -1) {
					//���Ͽ� �о�� �����Ͱ� ���� �ϴ� ���
					System.out.print((char)value);
					
				}
				
				
				
				
				
		}catch(FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {// ������ ����Ǵ� �κ�
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
		//1byte �� ���Ϸ� �����͸� ������
		//���α׷� --> ���Ϸ� ���
		
		FileOutputStream fos = null;
		//��ü ���� �� �ڵ����� ���ϰ� ����
		//������ ������� ����, ���� ��� �����(�ɼ� ����)
		
		try {
			fos =  new FileOutputStream("a_byte2.txt"/*,true*/);
			//a_byte2.txt ������ -> ����
			//					������ -> �����
			//true �ۼ��� -> �̾��
			
			/*
			fos.write(97); //'a'
			fos.write('b'); //'b'
			fos.write('��');
			
			byte[] barr = {'h','e','l','l','o'};
			
			fos.write('\n');
			fos.write(barr);
			*/
			
			
			String str = "Hello world!! �ȳ� �ݰ���? ������? yes";
			
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
			
			System.out.println("���� ���� �Ϸ�");                                                                                             
			
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
