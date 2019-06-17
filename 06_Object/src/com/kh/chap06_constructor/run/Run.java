package com.kh.chap06_constructor.run;

import com.kh.chap06_constructor.model.vo.User;

public class Run {
	public static void main(String[] args) {
		User u1 = new User();
		User u2 = new User("admin", "1234", "������", 40, '��');
		System.out.println(u2.information());
		User u3 = new User("guest1", "aaaa", "�մ�1", 20, '��');
		System.out.println(u3.information());
		User u4 = new User("guest20", "2020", "�մ�20");
		System.out.println(u4.information());
		u4.setAge(30);
		u4.setGender('��');
		System.out.println(u4.information());
		
	}

}
