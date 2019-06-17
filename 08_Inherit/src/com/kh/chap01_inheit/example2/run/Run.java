package com.kh.chap01_inheit.example2.run;

import com.kh.chap01_inheit.example2.model.vo.Computer;
import com.kh.chap01_inheit.example2.model.vo.Desktop;
import com.kh.chap01_inheit.example2.model.vo.Product;
import com.kh.chap01_inheit.example2.model.vo.SmartPhone;
import com.kh.chap01_inheit.example2.model.vo.Tv;

public class Run {

	public static void main(String[] args) {
		
		Computer com = new Computer("LG", "LG그램", "lg123456", 
				                    1500000,"i8-123", 8, 250, "windows");
		SmartPhone sp = new SmartPhone("SS", "SSNote", "ss1234", 1500000, "SK");
		Tv tv = new Tv("LG", "Lg", "lg123", 1235000, 55);
		
		//System.out.println(com.information());// 부모 필드 정보만
		// System.out.println(com.comInformation());// 부모 + 자식 정보 모두
		//System.out.println(sp.information());// 부모 필드 정보만
		//System.out.println(sp.spInformation());// 부모 + 자식 정보 모두
		//System.out.println(tv.information());// 부모 필드 정보만
		//System.out.println(tv.tvInformation());// 부모 + 자식 정보 모두
		
		System.out.println("=========오버라이딩 이후==========");
		//System.out.println(com.information());
		//System.out.println(sp.information());
		//System.out.println(tv.information());
		System.out.println(com.toString());
		System.out.println(sp.toString());
		System.out.println(tv.toString());
		
		System.out.println(com);
		System.out.println(sp);
		System.out.println(tv);
		
		System.out.println("=========equals 오버라이딩==========");
		Product p1 = new Product("삼성", "갤럭시", "p123", 10000);
		Product p2 = new Product("삼성", "갤럭시", "p123", 10000);
		
		if(p1.equals(p1)) {
			System.out.println("같은 주소를 가리킴");
		}
		
		if(!p1.equals(null)) {
			System.out.println("null이랑은 비교할 필요도 없음");
		}
		
		if(p1.equals(p2)) {
			System.out.println("필드 값이 모두 같으므로 같은 객체");
		}
		
		System.out.println("===================");
		
		Desktop dt = new Desktop();
		com.print();
		dt.print();
		
	}

}
