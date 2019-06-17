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
	// ���� ��Ʈ���� �������� ��� ��Ʈ�������δ� �����ߴ� ������
	// ���� ��� �����ִ� ������ �ϴ� ��Ʈ��
	// �ܵ� ��ü������ �Ұ���
	// --> �ݵ�� ��� ��Ʈ���� ���� ��ü ���۷����� �ʿ�.
	
	// Buffered Stream �̿� �� 
	//1����Ʈ , 1���� ������ ��Ʈ���� �̿��ϴ� �� ����
	// ���� �����͸� �ѹ��� ���� ��Ʈ���� �̿��ϹǷ�
	//����� �ӵ��� ����.
	
	//������!
	//buffered ���� ��Ʈ�� �̿� �� �� flush() �Ǵ� close() �޼ҵ带 �������� ȣ�� �ؾ� ��
	//--> flush() :  ���ۿ� ���� �����͸� ������
	// ---> close() : ���������� flush()�� ������ �� ��Ʈ�� ��ȯ
	
	// Buffered Stream �� �̿��� ���� ��� ���� ����
	
	public void fileSave1() {
		
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
			//���� ũ�⸦ ���� ���� �����ָ� 8192byte  ũ��� ���۰� �ʱ�ȭ��.
			
			bw.write("�ȳ��ϼ���.\n");
			bw.write("�ݰ����ϴ�.");
			bw.newLine();  //�ٹٲ����ִ� �޼ҵ�
			bw.write("���� ���ͼ� ��ŵ�ϴ�.");
			
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
	//--> try ���� ���ο��� ����� ��Ʈ���� �����ϸ�
	//      ������ close() ȣ�� ���̵�  try -catch�� �����
	//      ��Ʈ���� �ڵ� ��ȯ��.
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
	
	
	//Buffered ��Ʈ���� �̿��Ͽ� ���� ��� ���� �о����
	
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
	
	
	//� ������ �����̵� �����ϴ� ��� �����
	//-> ����Ʈ ��� ��Ʈ��
	//Buffered ��Ʈ�� ���
	
	public void fileCopy() {
		
		//���� -> �а�, ���� ������ ���ÿ� ����
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("hqdefault.jpg"));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.jpg"));)
			{
			
			//���۸� �̿��� �о� �ͼ� �ѹ��� ������
			int readByte;
			while((readByte = bis.read()) != -1) {
				// 1����Ʈ�� �о� �� �� 
				System.out.println(readByte);  //�ܼ�â ���
				bos.write(readByte);//�ٷ� ���Ϸ� ���
			}
			System.out.println("���� ���� �Ϸ�");
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}
