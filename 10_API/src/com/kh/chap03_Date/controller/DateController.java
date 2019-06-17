package com.kh.chap03_Date.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateController {
	public void method() {
		// Date : 시스템으로 부터 현재 날짜, 시간 정보를
		//		   가져와 다룰수 있게 해주는 클래스
		// 주의사항!
		// --> import 시 java.util.Date 꼭 확인하기
		// --> java.sql.Date라는 동명 클래스가 존재함
		//     (저희 JDBC때 사용할 꺼에요)
		
		// Date()기본생성자
		// 객체가 생성된 가장 가까운 밀리세컨드 초 단위로 초기화
		
		// 1970년 1월 1일 (UTC 00:00) 00시 00분 00초 부터
		// 밀리 세컨드(ms)단위로 시간을 세고 있음
		
		Date date = new Date();
		System.out.println(date);
		
		// Date(long date)
		Date date2 = new Date(0L);
		System.out.println(date2);
		
		// 하루 : 24시간 * 60분 * 60초 * 1000밀리초
		// == 86_400_000 ms
		long day = 864000000L;
		
		Date date3 = new Date(86400000L);
		System.out.println(date3);
		
		// Date.getTime() : 현재 기준으로 부터 증가한 ms 반환
		
		System.out.println("date.getTim() : " + date.getTime());
		
	}
	public void method2(){
		// SimpleDateFormat
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sft
		= new SimpleDateFormat("G yyyy-mm-dd E요일 hh:mm:ss");
		
		System.out.println(sft.format(date));
	}
}
