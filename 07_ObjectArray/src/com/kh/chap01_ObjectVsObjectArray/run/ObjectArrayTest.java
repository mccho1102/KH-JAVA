package com.kh.chap01_ObjectVsObjectArray.run;

import java.util.Scanner;

import com.kh.chap01_ObjectVsObjectArray.model.vo.Book;

public class ObjectArrayTest {
	public static void main(String[] args) {
		
		Book[] books = {new Book("자바의 정석","남궁 성", "도우출판", 30000),
				        new Book("명품자바","최창욱", "동우출판", 20000),
				        new Book("자바의 해법","김종석", "도올출판", 10000),
				        new Book("자바의 해법1","김종석1", "도올출판1", 40000),
		                new Book("자바의 해법2","김종석2", "도올출판2", 50000)
		               };
		
		System.out.println("==========책 정보 출력 ===========");
		for(int i = 0; i<books.length; i++) {
		   System.out.println(books[i].information());
		}
		System.out.println();
		
		//도서검색
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 책 제목");
		String title = sc.nextLine();
		
		System.out.println();
		System.out.println("==========검색 결과 ===========");
		
		boolean check = true;
		for(int i = 0; i<books.length; i++) {
			if(books[i].getTitle().equals(title)) {
			   System.out.println(books[i].information());
			   check = false;
			   break;
			}
		}
		
		if(check) {
			System.out.println("검색 결과가 없습니다.");
		}
	}

}
