package com.kh.chap01_ObjectVsObjectArray.run;

import java.util.Scanner;

import com.kh.chap01_ObjectVsObjectArray.model.vo.Book;

public class ObjectRun {
	public static void main(String[] args) {
		// 책 3권을 만들어 도서 검색하기
		
		Book book1 = new Book("자바의 정석","남궁 성", "도우출판", 30000);
		Book book2 = new Book("명품자바","최창욱", "동우출판", 20000);
		Book book3 = new Book("자바의 해법","김종석", "도올출판", 10000);
		Book book4 = new Book("자바의 해법1","김종석1", "도올출판1", 40000);
		Book book5 = new Book("자바의 해법2","김종석2", "도올출판2", 50000);
		
		//생성된 책 정보 출력해보기
		System.out.println("=========책정보출력=========");
		System.out.println(book1.information());
		System.out.println(book2.information());
		System.out.println(book3.information());
		System.out.println();
		
		//도서검색
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 책 제목");
		String title = sc.nextLine();
		
		// 검색 결과가 있으면 책의 정보 출력
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
			System.out.println("검색 결과가 없습니다.");
		}
	}
}
