package com.kh.chap04_assist.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ChangeTest {
	//���� ��ȯ ������Ʈ��
	//byte������� ����µǴ� �����͸� 
	//���ڱ������ ��ȯ�ϴ� ��Ʈ��
	
	public void fileSave() {
		//Ű����� �Է� ���� ����
		//�״�� ���Ͽ� ����
		//�� exit�� �ԷµǸ� ����
		
		//Ű���� �Է�(����Ʈ���) -> ���ڷ� ��ȯ
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new FileWriter("f_change.txt"));)
		{
			
			String tmp = null; //���ڿ��� �Է¹޾� �ӽ� ���� �� ����
			
			while(true) {
				System.out.print("�Է� : ");
				tmp = br.readLine();
				if(tmp.equals("exit")) {//exit �Էµ� ���
					break;
				}
				
				bw.write(tmp);
				bw.newLine();

			}
			System.out.println("���� ��¿Ϸ�");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
