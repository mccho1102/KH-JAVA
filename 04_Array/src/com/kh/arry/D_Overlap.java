package com.kh.arry;

import java.util.Arrays;
import java.util.Scanner;

public class D_Overlap {
	public void method1() {
		// �ߺ� ����
		
		// �Էµ� ���� �迭�� ����
		// ��, �ߺ��� �Է½� �ٽ� �Է�
		
		int[] arr = new int[6];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			//System.out.print("arr[" + i + "] =");
			//arr[i] = sc.nextInt();
			int rotto = (int)(Math.random() * 45)+1; // +1�� 1���� �����ϱ� ����
			arr[i] = rotto;
			
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					//System.out.println("�ߺ����� �����մϴ�.");
					i--;
					break;
				}
			}
			
			
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
