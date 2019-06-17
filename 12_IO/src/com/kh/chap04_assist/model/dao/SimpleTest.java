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

public class SimpleTest {
	
	// ��ü ����� ���� ��Ʈ��
	// ��ü ��ü�� �ۼ��� �� �� �ֵ��� ����� �ִ� ���� ��Ʈ��
	// ��ü�� �������� ������ �������� ����(����ȭ) �Ǵ�
	// �ݴ� �۾�(������ȭ)�� ������ ���� ��Ʈ��
	
	public void fileSave() {
		
		Phone ph = new Phone("�Ｚ","������S10",1050000);
		Phone ph2 = new Phone("����","������10X",1000000);
		Phone ph3 = new Phone("����","V50",1200000);
		
		
		//try -with -resource
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e_simple.txt"))) {
			
			//objectOutputStream : ��ü�� ������ִ� ���� ��Ʈ��
			//-->��ü�� ��Ʈ���� ��� ��ų �� �ֵ��� 
			//		��ü�� ����ȭ �����ִ� ������Ʈ��
			
			oos.writeObject(ph);
			oos.writeObject(ph2);
			oos.writeObject(ph3);
			
			//��ü�� ����ȭ ���Ѽ� ����ϱ� ���ؼ���
			//����ȭ�� ���Ѿ� �ϴ� ��ü�� '����ȭ ������ ��ü'
			//��� ��ø� ����� ��.
			//-->Serializable ��� �������̽�
			//		��ӹ޾Ƽ� �ۼ��ؾ� ��.
			
	
			System.out.println("���� ��� �Ϸ�");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void fileOpen() {
		
		
		//ObjectInputStream : ����ȭ�� ��ü��
		//		������ȭ ���Ѽ� ��ü�� ��� �����ϰ� �ϴ� ������Ʈ��.
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e_simple.txt"))){
			
			/*
			while(true) {
				Object obj = ois.readObject();
				// ReadObject() : ��ü�� ���������� �о����
				// ���̻� ���� ��ü�� ������
				// EOFException �߻�
				Phone ph = (Phone)obj;  //�ٿ� ĳ����
	
				System.out.println(ph.toString());
			}
			*/
			while(true) {
				Object obj = ois.readObject();
				System.out.println(obj);
			}
			
			
	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
			
		} catch(EOFException e) {
			System.out.println("���� �б� �Ϸ�.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}
