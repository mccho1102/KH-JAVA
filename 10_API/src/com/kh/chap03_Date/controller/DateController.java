package com.kh.chap03_Date.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateController {
	public void method() {
		// Date : �ý������� ���� ���� ��¥, �ð� ������
		//		   ������ �ٷ�� �ְ� ���ִ� Ŭ����
		// ���ǻ���!
		// --> import �� java.util.Date �� Ȯ���ϱ�
		// --> java.sql.Date��� ���� Ŭ������ ������
		//     (���� JDBC�� ����� ������)
		
		// Date()�⺻������
		// ��ü�� ������ ���� ����� �и������� �� ������ �ʱ�ȭ
		
		// 1970�� 1�� 1�� (UTC 00:00) 00�� 00�� 00�� ����
		// �и� ������(ms)������ �ð��� ���� ����
		
		Date date = new Date();
		System.out.println(date);
		
		// Date(long date)
		Date date2 = new Date(0L);
		System.out.println(date2);
		
		// �Ϸ� : 24�ð� * 60�� * 60�� * 1000�и���
		// == 86_400_000 ms
		long day = 864000000L;
		
		Date date3 = new Date(86400000L);
		System.out.println(date3);
		
		// Date.getTime() : ���� �������� ���� ������ ms ��ȯ
		
		System.out.println("date.getTim() : " + date.getTime());
		
	}
	public void method2(){
		// SimpleDateFormat
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sft
		= new SimpleDateFormat("G yyyy-mm-dd E���� hh:mm:ss");
		
		System.out.println(sft.format(date));
	}
}
