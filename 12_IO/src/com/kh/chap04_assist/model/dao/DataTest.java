package com.kh.chap04_assist.model.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataTest {
	
	//data ���� ��Ʈ��
	// �����͸� �а� ���µ� �־ byte ������ �ƴ�
	// �⺻�ڷ����� ũ��� ������� �� �� ����.
	
	// ���� ����
	// 1) DataOutputStream���� �������� �����ʹ�
	//  �ݵ�� DataInputStream���� �о�;� ��.
	
	// 2) �� �⺻ �ڷ����� ũ�Ⱑ �ٸ��� ������ ������ ������ ������
	//     �Ȱ��� ������ �о� �;ߵ�.
	
	public void fileSaveOpen() {
		
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("d_data.txt"));
				DataInputStream dis = new DataInputStream(new FileInputStream("d_data.txt"));
				){
			
			//���Ϸ� ���
			dos.writeInt(30);
			dos.writeChar('��');
			dos.writeUTF("ȫ�浿");
			dos.writeBoolean(true);
			dos.writeDouble(185.5);
			
			dos.writeInt(30);
			dos.writeChar('��');
			dos.writeUTF("ȫ���");
			dos.writeBoolean(false);
			dos.writeDouble(165.5);
			
			dos.writeInt(20);
			dos.writeChar('��');
			dos.writeUTF("ȫ�濬");
			dos.writeBoolean(true);
			dos.writeDouble(183.5);
			
			//���� ���� �Է�
			while(true) {
				
				// ������ �о� ������ �� �̻� �о�� ���� ������
				//EOFException() �߻�
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
			System.out.println("���� �б� �Ϸ�");
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
