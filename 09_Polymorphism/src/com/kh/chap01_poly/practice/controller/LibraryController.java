package com.kh.chap01_poly.practice.controller;

import com.kh.chap01_poly.practice.model.vo.AniBook;
import com.kh.chap01_poly.practice.model.vo.Book;
import com.kh.chap01_poly.practice.model.vo.CookBook;
import com.kh.chap01_poly.practice.model.vo.Member;

    public class LibraryController {
	private Member mem = null; // null로 명시초기화
	private Book[] bList = new Book[5];  // 크기 5 할당
	
	public static int memIndex = 0;
	public static int bListIndex = 0;
	// 객체배열에 데이터 추가 시 인덱스 위치를 관리해줄 변수 선언
	// Controller 및 View 에서 공용으로 사용할 수 있도록 static 선언
	
	{ // 초기화 블록
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
		}
	
	// 2. 외부에서 생성된 객체의 주소를 전달받아 필드에 대입하는 insert() 메소드 선언
	public void insertMember(Member mem) {
	       this.mem = mem;
	}
	
	public Member myinfo() {
		return mem;
		
	}
	// 3. 생성된 객체의 정보를 반환하는 메소드 select()선언
	// - 객체배열을 통해 데이터를 관리하므로
	//   조회하려는 인덱스를 매개변수로 전달받기
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
