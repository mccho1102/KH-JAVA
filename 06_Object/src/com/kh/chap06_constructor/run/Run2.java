package com.kh.chap06_constructor.run;

import com.kh.chap06_constructor.model.vo.Book;

public class Run2 {

	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book("자바의 정석", "도우출판", "남궁 성");
		Book b3 = new Book("프로그래밍 언어 활용", "KH정보교육원",
				           "백동현",5000, 0.2);
	}

}
