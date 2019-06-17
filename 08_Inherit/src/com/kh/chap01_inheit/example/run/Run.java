package com.kh.chap01_inheit.example.run;

import com.kh.chap01_inheit.example.model.vo.Child1;
import com.kh.chap01_inheit.example.model.vo.Child2;
import com.kh.chap01_inheit.example.model.vo.Child3;
import com.kh.chap01_inheit.example.model.vo.Parent;

public class Run {
	public static void main(String[] args) {
		Parent p = new Parent();
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		Child3 c3 = new Child3();
		
		c1.setLastName("최");
		System.out.println(c1.getLastName());
		
		c2.setHouse("전원주택");
		System.out.println(c2.getHouse());
		
		c3.setLand("별내땅");
		System.out.println(c3.getLand());
		
		System.out.println("c1.getMoney() : " + c1.getMoney());
		System.out.println("c2.getMoney() : " + c2.getMoney());
		
	
		
	}
}
