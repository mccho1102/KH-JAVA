package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	
	public void mainMenu() {
		
		boolean check = true;
		while(check) {
			System.out.println("======= 메뉴 =======");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.print("메뉴번호 :");
			int num = sc.nextInt();
			
			switch(num){
			case 1 : circleMenu(); break;
			case 2 : rectangleMenu(); break;	
			case 9 : System.out.println("끝내기 입니다");
			         check = false;
			         break;	
			default : System.out.println("다시 입력 해주세요");break;	
			}
		}
	}
	
	public void circleMenu() {
		
		boolean check = true;
		while(check) {
			System.out.println("======= 원 메뉴 =======");
			System.out.println("1. 원 둘레");
			System.out.println("2. 원 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴번호 :");
			int num = sc.nextInt();
			
			switch(num){
			case 1 : calcCircum(); break;
			case 2 : calcCircleArea(); break;	
			case 9 : return;
			default : System.out.println("다시 입력해주세요"); break;	
			}
		}
	}
	
    public void rectangleMenu() {
    	boolean check = true;
		while(check) {
			System.out.println("======= 사각형  메뉴 =======");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴번호 :");
			int num = sc.nextInt();
			
			switch(num){
			case 1 : calcCircum(); break;
			case 2 : calcCircleArea(); break;	
			case 9 : return;	
			default : System.out.println("다시 입력해 주세요."); break;	
			}
		}
	}
    
    public void calcCircum() {
    	System.out.println("X 좌표 :");
		int x = sc.nextInt();
		System.out.println("Y 좌표 :");
		int y = sc.nextInt();
		System.out.println("반지름 :");
		int radius = sc.nextInt();
		cc.calcCircum(x, y, radius);
		System.out.println("둘레 : " + cc.calcCircum(x, y, radius));
	}
    
    public void calcCircleArea() {
    	System.out.println("X 좌표 :");
		int x = sc.nextInt();
		System.out.println("Y 좌표 :");
		int y = sc.nextInt();
		System.out.println("반지름 :");
		int radius = sc.nextInt();
		System.out.println("면적 : " + cc.calcArea(x, y, radius));
	}
    
    public void calcPerimeter() {
    	System.out.println("X 좌표 :");
		int x = sc.nextInt();
		System.out.println("Y 좌표 :");
		int y = sc.nextInt();
		System.out.println("높이 :");
		int height = sc.nextInt();
		System.out.println("너비 :");
		int width = sc.nextInt();
		System.out.println("둘레 : " + rc.calcPerimeter(x, y, height, width));
    }
    
    public void calcRectArea() {
    	System.out.println("X 좌표 :");
		int x = sc.nextInt();
		System.out.println("Y 좌표 :");
		int y = sc.nextInt();
		System.out.println("높이 :");
		int height = sc.nextInt();
		System.out.println("너비 :");
		int width = sc.nextInt();
		System.out.println("면적 : " + rc.calcArea(x, y, height, width));
    }
	
}
