package com.kh.arry;

import java.util.Arrays;
import java.util.Scanner;

public class D_Overlap {
	public void method1() {
		// 중복 제거
		
		// 입력된 갑을 배열에 저장
		// 단, 중복값 입력시 다시 입력
		
		int[] arr = new int[6];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			//System.out.print("arr[" + i + "] =");
			//arr[i] = sc.nextInt();
			int rotto = (int)(Math.random() * 45)+1; // +1은 1부터 시작하기 위함
			arr[i] = rotto;
			
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					//System.out.println("중복값이 존재합니다.");
					i--;
					break;
				}
			}
			
			
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
