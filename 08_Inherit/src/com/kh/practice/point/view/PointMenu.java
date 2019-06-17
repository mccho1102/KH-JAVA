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
			System.out.println("======= �޴� =======");
			System.out.println("1. ��");
			System.out.println("2. �簢��");
			System.out.println("9. ������");
			System.out.print("�޴���ȣ :");
			int num = sc.nextInt();
			
			switch(num){
			case 1 : circleMenu(); break;
			case 2 : rectangleMenu(); break;	
			case 9 : System.out.println("������ �Դϴ�");
			         check = false;
			         break;	
			default : System.out.println("�ٽ� �Է� ���ּ���");break;	
			}
		}
	}
	
	public void circleMenu() {
		
		boolean check = true;
		while(check) {
			System.out.println("======= �� �޴� =======");
			System.out.println("1. �� �ѷ�");
			System.out.println("2. �� ����");
			System.out.println("9. ��������");
			System.out.print("�޴���ȣ :");
			int num = sc.nextInt();
			
			switch(num){
			case 1 : calcCircum(); break;
			case 2 : calcCircleArea(); break;	
			case 9 : return;
			default : System.out.println("�ٽ� �Է����ּ���"); break;	
			}
		}
	}
	
    public void rectangleMenu() {
    	boolean check = true;
		while(check) {
			System.out.println("======= �簢��  �޴� =======");
			System.out.println("1. �簢�� �ѷ�");
			System.out.println("2. �簢�� ����");
			System.out.println("9. ��������");
			System.out.print("�޴���ȣ :");
			int num = sc.nextInt();
			
			switch(num){
			case 1 : calcCircum(); break;
			case 2 : calcCircleArea(); break;	
			case 9 : return;	
			default : System.out.println("�ٽ� �Է��� �ּ���."); break;	
			}
		}
	}
    
    public void calcCircum() {
    	System.out.println("X ��ǥ :");
		int x = sc.nextInt();
		System.out.println("Y ��ǥ :");
		int y = sc.nextInt();
		System.out.println("������ :");
		int radius = sc.nextInt();
		cc.calcCircum(x, y, radius);
		System.out.println("�ѷ� : " + cc.calcCircum(x, y, radius));
	}
    
    public void calcCircleArea() {
    	System.out.println("X ��ǥ :");
		int x = sc.nextInt();
		System.out.println("Y ��ǥ :");
		int y = sc.nextInt();
		System.out.println("������ :");
		int radius = sc.nextInt();
		System.out.println("���� : " + cc.calcArea(x, y, radius));
	}
    
    public void calcPerimeter() {
    	System.out.println("X ��ǥ :");
		int x = sc.nextInt();
		System.out.println("Y ��ǥ :");
		int y = sc.nextInt();
		System.out.println("���� :");
		int height = sc.nextInt();
		System.out.println("�ʺ� :");
		int width = sc.nextInt();
		System.out.println("�ѷ� : " + rc.calcPerimeter(x, y, height, width));
    }
    
    public void calcRectArea() {
    	System.out.println("X ��ǥ :");
		int x = sc.nextInt();
		System.out.println("Y ��ǥ :");
		int y = sc.nextInt();
		System.out.println("���� :");
		int height = sc.nextInt();
		System.out.println("�ʺ� :");
		int width = sc.nextInt();
		System.out.println("���� : " + rc.calcArea(x, y, height, width));
    }
	
}
