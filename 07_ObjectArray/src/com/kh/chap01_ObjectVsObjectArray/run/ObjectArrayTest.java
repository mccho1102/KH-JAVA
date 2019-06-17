package com.kh.chap01_ObjectVsObjectArray.run;

import java.util.Scanner;

import com.kh.chap01_ObjectVsObjectArray.model.vo.Book;

public class ObjectArrayTest {
	public static void main(String[] args) {
		
		Book[] books = {new Book("�ڹ��� ����","���� ��", "��������", 30000),
				        new Book("��ǰ�ڹ�","��â��", "��������", 20000),
				        new Book("�ڹ��� �ع�","������", "��������", 10000),
				        new Book("�ڹ��� �ع�1","������1", "��������1", 40000),
		                new Book("�ڹ��� �ع�2","������2", "��������2", 50000)
		               };
		
		System.out.println("==========å ���� ��� ===========");
		for(int i = 0; i<books.length; i++) {
		   System.out.println(books[i].information());
		}
		System.out.println();
		
		//�����˻�
		Scanner sc = new Scanner(System.in);
		System.out.println("�˻��� å ����");
		String title = sc.nextLine();
		
		System.out.println();
		System.out.println("==========�˻� ��� ===========");
		
		boolean check = true;
		for(int i = 0; i<books.length; i++) {
			if(books[i].getTitle().equals(title)) {
			   System.out.println(books[i].information());
			   check = false;
			   break;
			}
		}
		
		if(check) {
			System.out.println("�˻� ����� �����ϴ�.");
		}
	}

}
