package com.kh.chap01_ObjectVsObjectArray.run;

import java.util.Scanner;

import com.kh.chap01_ObjectVsObjectArray.model.vo.Book;

public class ObjectRun {
	public static void main(String[] args) {
		// å 3���� ����� ���� �˻��ϱ�
		
		Book book1 = new Book("�ڹ��� ����","���� ��", "��������", 30000);
		Book book2 = new Book("��ǰ�ڹ�","��â��", "��������", 20000);
		Book book3 = new Book("�ڹ��� �ع�","������", "��������", 10000);
		Book book4 = new Book("�ڹ��� �ع�1","������1", "��������1", 40000);
		Book book5 = new Book("�ڹ��� �ع�2","������2", "��������2", 50000);
		
		//������ å ���� ����غ���
		System.out.println("=========å�������=========");
		System.out.println(book1.information());
		System.out.println(book2.information());
		System.out.println(book3.information());
		System.out.println();
		
		//�����˻�
		Scanner sc = new Scanner(System.in);
		System.out.println("�˻��� å ����");
		String title = sc.nextLine();
		
		// �˻� ����� ������ å�� ���� ���
		if(book1.getTitle().equals(title)) {
			System.out.println(book1.information());
		}else if(book2.getTitle().equals(title)) {
			System.out.println(book2.information());
		}else if(book3.getTitle().equals(title)) {
			System.out.println(book3.information());
		}else if(book4.getTitle().equals(title)) {
			System.out.println(book4.information());
		}else if(book5.getTitle().equals(title)) {
			System.out.println(book5.information());
		}else {
			System.out.println("�˻� ����� �����ϴ�.");
		}
	}
}
