package com.kh.chap01_poly.practice.controller;

import com.kh.chap01_poly.practice.model.vo.AniBook;
import com.kh.chap01_poly.practice.model.vo.Book;
import com.kh.chap01_poly.practice.model.vo.CookBook;
import com.kh.chap01_poly.practice.model.vo.Member;

    public class LibraryController {
	private Member mem = null; // null�� ����ʱ�ȭ
	private Book[] bList = new Book[5];  // ũ�� 5 �Ҵ�
	
	public static int memIndex = 0;
	public static int bListIndex = 0;
	// ��ü�迭�� ������ �߰� �� �ε��� ��ġ�� �������� ���� ����
	// Controller �� View ���� �������� ����� �� �ֵ��� static ����
	
	{ // �ʱ�ȭ ���
		bList[0] = new CookBook("�������� ����", "������", "tvN", true);
		bList[1] = new AniBook("�ѹ� �� �ؿ�", "��Ƽ", "�����", 19);
		bList[2] = new AniBook("������ ���ǽ�", "����", "japan", 12);
		bList[3] = new CookBook("�������� �󸶳� ���ְԿ�", "������", "����", false);
		bList[4] = new CookBook("������ �� �����غ�", "������", "�ұ�å", true);
		}
	
	// 2. �ܺο��� ������ ��ü�� �ּҸ� ���޹޾� �ʵ忡 �����ϴ� insert() �޼ҵ� ����
	public void insertMember(Member mem) {
	       this.mem = mem;
	}
	
	public Member myinfo() {
		return mem;
		
	}
	// 3. ������ ��ü�� ������ ��ȯ�ϴ� �޼ҵ� select()����
	// - ��ü�迭�� ���� �����͸� �����ϹǷ�
	//   ��ȸ�Ϸ��� �ε����� �Ű������� ���޹ޱ�
	public Book[] select() {
		return bList;
	}	
			
	public Book[] searchBook(String keyword) {
		int cnt = 0;
		Book[] bk2 = new Book[5];
		for(int i = 0; i<bList.length; i++) {
			if((bList[i].getTitle()).contains(keyword)) {
				
			}
		}
			return  null;
		}
		

		
}
