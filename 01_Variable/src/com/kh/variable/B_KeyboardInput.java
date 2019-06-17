package com.kh.variable;

import java.util.Scanner;

public class B_KeyboardInput {
	
	// 키보드로 자기 이름 입력받아서 출력하기
	public void inputScanner1(){
		// java.util 패키지에서 제공하는 클래스
    	Scanner sc = new Scanner(System.in);
    	System.out.print("당신의 이름을 입력하세요:");
    	//String name = sc.nextLine();
    	// nextLine() : 사용자가 입력한 한줄에 대한 모든 값을 읽어옴.
    	String name = sc.next();
    	// next() : 사용자가 입력한 단어의 공백을 만나면 한단어의 값을 읽어옴.
    	
    	System.out.println("당신의 이름은" + name + "입니다.");
	} 

	public void inputScanner2() {
		Scanner sc = new Scanner(System.in);
		// import 없이 Scanner 사용방법
		// java.util.Scanner sc = new java.util.Scanner(System.in);
		
		// 이름, 사는곳, 주머니에 있는 현금, 키
		System.out.print("이름: ");
		String name = sc.nextLine();
		
		System.out.print("사는곳: ");
		String addr = sc.nextLine();
		
		System.out.println("현금: ,키: ");
		int cash = sc.nextInt();
		double height = sc.nextDouble();
		
		//System.out.print("키: ");
		//double height = sc.nextDouble();
		
		System.out.println(name + "님의 사는곳은"
				           + addr + "이고, 현금은"
				           + cash + "가지고 있고, 키는"
				           + height + "입니다");
	}
	
	public void inputScanner3() {
		Scanner sc = new Scanner(System.in);
		
		// 이름, 주소, 나이, 키
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("주소: ");
		String addr = sc.nextLine();
		System.out.print("나이: ");
		int age = sc.nextInt();
		System.out.print("키: ");
		double height = sc.nextDouble();
		
		// nextDouble(), nextInt() 이후 엔터제거 방법
		// -> sc.nextLine()을 한번 더 사용한다.
		sc.nextLine();
		
		System.out.print("좌우명: ");
		String str = sc.nextLine();
		
		System.out.println(name + "님은"
		           + age + "세이며, 사는곳은"
		           + addr + "이고, 키는"
		           + height + "cm, 좌우명은 "
		           + str + "입니다.");
	
	}
	//키보드로 입력받은 값으로 저장된 값 변경하기
	
	public void changeValue() {
		Scanner sc = new Scanner(System.in);
	    // 변수선언과 동시에 초기화
		String name = "최창욱";
		int age = 55;
		double height = 171.2;
		// 성별
		char gender = '남';
		
		System.out.println(name + "님의 나이는 " 
				          + age + "세이고, 키는 "
				          + height + "cm 이며, 성별은"
				          + gender + "자 입니다.");
		
		System.out.println("[변경 값 입력]");
		
		System.out.print("이름: ");
		name = sc.nextLine();
		
		System.out.print("나이: ");
		age = sc.nextInt();
		
		System.out.print("키: ");
		height = sc.nextDouble();
		
		sc.nextLine(); //엔터제거
		
		System.out.print("성별 ");
		gender = sc.nextLine().charAt(0);
		//charAt(index):
		//문자열에서 원하는 위치의 문자 하나를 뽑는것
		
		System.out.println(name + "님의 나이는 " 
		          + age + "세이고, 키는 "
		          + height + "cm 이며, 성별은"
		          + gender + "자 입니다.");
	}
	
}
