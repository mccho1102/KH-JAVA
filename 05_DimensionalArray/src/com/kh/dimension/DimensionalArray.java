package com.kh.dimension;

import java.util.Scanner;

public class DimensionalArray {
   // 이차원 배열 : 일차원 배열 여러개를 하나로 묶은 것
   // 이차원 배열은 행(줄)과 열(칸)이 존재
	
	public void method1() {
	   // 이차원 배역 선언 및 할당
	   int[][] arr = new int[3][5];  //3행 5열 int형 배열 생성
	   
	   // 생성된 배열의 행과, 열의 길이 구하기
	   // arr : row,  arr[0] : col
	   System.out.println("행의 길이(개수) : " +arr.length);
	   System.out.println("열의 길이(개수) : " +arr[0].length);
	   
	   // ******
	   // ******
	   // ******
	   for(int i=0; i<3; i++) {
		   for(int j=0; j<5; j++) {
			   System.out.print("*");
		   }
		   System.out.println();
	   }
	  
	   // 생성 및 할당된 2차원 배열 출력
	   for(int i = 0; i<arr.length; i++) {// 0~행의 갯수
		   for(int j = 0; j<arr[0].length; i++) { // 0~열의 개수
			   System.out.print(arr[i][j]+" ");
		   }
		   System.out.println();
	   }
	}  
	
	public void method2() {
		// 2차원 배열 초기화
		int[][] arr = new int[3][5]; // 3행5열
		
		// 1~15
		// 1  2  3  4  5 
		// 6  7  8  9  10
		// 11 12 13 14 15
		
		// 1. 각 인덱스 요소에 접근하여 값 기록하기
		/*
		arr[0][0] = 1; 
		arr[0][1] = 2; 
		arr[0][2] = 3; 
		arr[0][3] = 4; 
		arr[0][4] = 5; 
		
		arr[1][0] = 6;
		// ....
		
		arr[2][4] = 15;
		*/
		
		// 2.{}를 이용한 초기화
		int[][] arr2 = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[0].length; j++) {
				System.out.print(arr2[i][j] + " ");	
			}
			System.out.println();
		}
		// 3. for문을 이용한 초기화
		int[][] arr3 = new int[3][5];
		
		int value = 1;
		for(int i= 0; i<arr3.length; i++) {
			for(int j= 0; j<arr3[0].length; j++) {
				arr3[i][j] = value++;
			}
			System.out.println();
		}
	}
	
	public void method3() {
		// 가변 배열
		// 행의 개수는 정해져 있으나
		// 열의 개수가 정해져 있지 않은 2차원 배열
		
		// 2차원 배열 == 자료형이 같은 1차원 배열을 하나로 묶은 것
		// 1차원 배열 == 자료형이 같은 변수를 하나로 묶은 것
		
		// 가변 배열 선언 및 할당
		int[][] arr = new int[3][];
		
		arr[0] = new int[2];
		arr[1] = new int[1];
		arr[2] = new int[3];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		// {}를 이용한 가변 배열 초기화
		int[][] arr2 = {{1,2},
				        {3},
				        {4,5,6}};
		
		System.out.println("============arr2++++++++++");
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		// for문을 이용한 초기화
		int[][] arr3 = new int[3][];
		arr3[0] = new int[2];
		arr3[1] = new int[1];
		arr3[2] = new int[3];
		
		int value = 1;
		for(int i=0; i<arr3.length; i++) {
			for(int j=0; j<arr3[i].length; j++) {
				arr3[i][j] = value++; // 후위증감
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}	
	}
	
	public void method4() {
		// 다음과 같은 배열 형태로 값을 입력받고 저장하기.
		/*
		 * 0번 국어점수 1번 국어점수 2번 국어점수 국어점수합계
		 * 0번 영어점수 1번 영어점수 2번 영어점수 영어점수합계
		 */
		
		double[][] arr = new double[2][4];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length-1; j++) {
				if(i==0) {
					System.out.println("국어점수 : ");
				}else {
					System.out.println("영어점수 : ");
				}
				
				arr[i][j] = sc.nextDouble();
				arr[i][3] += arr[i][j];
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");	
			}
	   }
	}	
}
