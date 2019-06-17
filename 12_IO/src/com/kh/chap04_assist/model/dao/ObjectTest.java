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
import com.kh.chap03_char.model.vo.Student;

public class ObjectTest {
	
	private Student[] stList = null;
	
	// ���� ����� �޼ҵ�
	
	public void fileSava() {
		//���� ������
		stList = new Student[3];
		stList[0] = new Student("�����", 30, '��', new Phone("�Ｚ","������S10",1050000));
		stList[1] = new Student("�����", 33, '��', new Phone("�Ｚ","������S9",900000));
		stList[2] = new Student("������", 27, '��', new Phone("�Ｚ","������S7",500000));
		
		try(ObjectOutputStream oss= new ObjectOutputStream(new FileOutputStream("studentList.txt"))){
			
			oss.writeObject(stList);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	//���� ���¿� �޼ҵ�
	public void fileOpen() {
		
		Student[] stList2 = null;
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("studentList.txt")) ){
			// studentList.txt�� ����Ǿ� �ִ� ��ü�� Ÿ����?
			//Student[]  Ÿ��
			
			stList2 = (Student[]) ois.readObject();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
		
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//�о�� student[] ������ ���������� ���
		
		for(int i=0; i<stList2.length; i++) {
			System.out.println(stList2[i]);
		}
		System.out.println("���� �б� �Ϸ�");
		
	}
}
