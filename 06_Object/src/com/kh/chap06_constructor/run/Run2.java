package com.kh.chap06_constructor.run;

import com.kh.chap06_constructor.model.vo.Book;

public class Run2 {

	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book("�ڹ��� ����", "��������", "���� ��");
		Book b3 = new Book("���α׷��� ��� Ȱ��", "KH����������",
				           "�鵿��",5000, 0.2);
	}

}
