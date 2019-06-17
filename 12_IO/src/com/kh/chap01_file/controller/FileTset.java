package com.kh.chap01_file.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileTset {
	
	public void method1() {
		//File Ŭ���� APIȮ��
		// -->java.io ��Ű��
		
		
		//������ ���� ��ü�� test.txt ����
		try {
			
			//1. ���� ������Ʈ�� ���ϻ���
			File f1 = new File("test.txt");
			f1.createNewFile();
			
			//2. ���ϴ� ��ο� ���� ����
			File f2 = new File("c:\\dev\\test.txt");
			f2.createNewFile();
			
			//3. ���� ����� ���� ����
			
			//File f3 = new File("c:\\dev\\temp\\test2.txt");
			//f3.createNewFile();
			//--> ������ ������ IOException �߻�
			
			//temp ���� ����
			
			File f3 = new File("c:\\dev\\temp");
			if(f3.mkdir()) {
				System.err.println("���� ������ �����߽��ϴ�.");
			}
	
			File f4 = new File("c:\\dev\\temp\\test3.txt");
			if(f4.createNewFile()) {
				System.out.println("���� ������ �����߽��ϴ�.");
			}
			
			/*
				File.exists() : �ش� ���� �Ǵ� ������ �����ϸ� true
										������ false�� ��ȯ
				File.isFile() : �ش� ������ ������ �ƴ� �����̸� true
										�ƴϸ� false
			*/
			
			System.out.println(f1.exists());
			System.out.println(f2.exists());
			System.out.println(f3.exists());
			
			
			
			System.out.println(f1.isFile());
			System.out.println(f2.isFile());
			System.out.println(f3.isFile());   //f3�� ����
			
			System.out.println(f3.isHidden());                           
			
			
			
			
			
			
			
			/*
			File f5 = new File("c:\\dev\\temp");
			if(f5.delete()) {
				System.out.println("���� ���ſ� �����߽��ϴ�.");
			}
			*/
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public void method2() {
		
		File folder  =  new File("c:\\dev\\temp2");
		try {
			
			if(!folder.exists()) { //������ �������� ���� ���
				folder.mkdir();
				System.out.println(folder.getName() + "���� ����");
			}
			
			File file = new File("c:\\dev\\temp2\\person.txt");
			if(!file.exists()) {
				if(file.createNewFile()) {
				System.out.println(file.getName() + "���� ����");
				}
			}
			
			System.out.println("���ϸ� : " + file.getName());
			System.out.println("������ ��� : " + file.getAbsolutePath());  //������ ������
			System.out.println("���� ũ��: " + file.length()); //������ ũ��
			System.out.println("���� ���� : " + file.getParent()); //���� ��� 
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void method3() {
		
		try {
			FileInputStream fis = new FileInputStream("c:\\dev\\test.txt");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
