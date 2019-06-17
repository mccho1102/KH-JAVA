package com.kh.dimension;

import java.util.Scanner;

public class DimensionalArray {
   // ������ �迭 : ������ �迭 �������� �ϳ��� ���� ��
   // ������ �迭�� ��(��)�� ��(ĭ)�� ����
	
	public void method1() {
	   // ������ �迪 ���� �� �Ҵ�
	   int[][] arr = new int[3][5];  //3�� 5�� int�� �迭 ����
	   
	   // ������ �迭�� ���, ���� ���� ���ϱ�
	   // arr : row,  arr[0] : col
	   System.out.println("���� ����(����) : " +arr.length);
	   System.out.println("���� ����(����) : " +arr[0].length);
	   
	   // ******
	   // ******
	   // ******
	   for(int i=0; i<3; i++) {
		   for(int j=0; j<5; j++) {
			   System.out.print("*");
		   }
		   System.out.println();
	   }
	  
	   // ���� �� �Ҵ�� 2���� �迭 ���
	   for(int i = 0; i<arr.length; i++) {// 0~���� ����
		   for(int j = 0; j<arr[0].length; i++) { // 0~���� ����
			   System.out.print(arr[i][j]+" ");
		   }
		   System.out.println();
	   }
	}  
	
	public void method2() {
		// 2���� �迭 �ʱ�ȭ
		int[][] arr = new int[3][5]; // 3��5��
		
		// 1~15
		// 1  2  3  4  5 
		// 6  7  8  9  10
		// 11 12 13 14 15
		
		// 1. �� �ε��� ��ҿ� �����Ͽ� �� ����ϱ�
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
		
		// 2.{}�� �̿��� �ʱ�ȭ
		int[][] arr2 = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[0].length; j++) {
				System.out.print(arr2[i][j] + " ");	
			}
			System.out.println();
		}
		// 3. for���� �̿��� �ʱ�ȭ
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
		// ���� �迭
		// ���� ������ ������ ������
		// ���� ������ ������ ���� ���� 2���� �迭
		
		// 2���� �迭 == �ڷ����� ���� 1���� �迭�� �ϳ��� ���� ��
		// 1���� �迭 == �ڷ����� ���� ������ �ϳ��� ���� ��
		
		// ���� �迭 ���� �� �Ҵ�
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
		
		// {}�� �̿��� ���� �迭 �ʱ�ȭ
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
		// for���� �̿��� �ʱ�ȭ
		int[][] arr3 = new int[3][];
		arr3[0] = new int[2];
		arr3[1] = new int[1];
		arr3[2] = new int[3];
		
		int value = 1;
		for(int i=0; i<arr3.length; i++) {
			for(int j=0; j<arr3[i].length; j++) {
				arr3[i][j] = value++; // ��������
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}	
	}
	
	public void method4() {
		// ������ ���� �迭 ���·� ���� �Է¹ް� �����ϱ�.
		/*
		 * 0�� �������� 1�� �������� 2�� �������� ���������հ�
		 * 0�� �������� 1�� �������� 2�� �������� ���������հ�
		 */
		
		double[][] arr = new double[2][4];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length-1; j++) {
				if(i==0) {
					System.out.println("�������� : ");
				}else {
					System.out.println("�������� : ");
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
