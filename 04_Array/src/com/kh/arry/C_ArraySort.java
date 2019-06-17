package com.kh.arry;

import java.util.Arrays;

public class C_ArraySort {
    public void method1(){
    	// ���� �ΰ��� �� ���� �����ϱ�
    	int a = 10;
    	int b = 20;
    	
    	// a = b; // a == 20, b == 20
    	// b = a; // a == 20, b == 20
    	
    	System.out.println("������");
    	System.out.println("a : " + a + ", b :" + b);
    	
    	int tmp = 0;
    	
    	tmp = a; // a=10, b=20, tmp=10;
    	a = b;   // a=20, b=20, tmp=10;
    	b = tmp; // a=20, b=10, tmp=10;
    	
    	System.out.println("������");
    	System.out.println("a : " + a + ", b :" + b);
    }
    
    public void method2(){
    	// �迭 ���� ���� ��ġ ����
    	int[] arr = {2,1,3};
    	// --> {1,2,3}���� ����
       	
    	int tmp = 0;
    	tmp = arr[0];
    	arr[0] = arr[1];
    	arr[1] = tmp;
    	
    	System.out.println("������");
    	System.out.println(Arrays.toString(arr));
    }
    
    public void method3() {
    	
    	int[] arr = {2,5,4,1,3};
    	
    	// ������������ ����
    	// ��������(insertion sort)
    	// �迭�� n�� �ε����� ����
    	// 0~n-1�� �ε������� ��
    	
    	// 1. ������ �迭 �ε��� ������ ���� for��
    	for(int i=1; i<arr.length; i++) {
    		//2. �񱳸� ������ for��
    		 for(int j=0; j<i; j++) {
    			 
    			 if(arr[i] < arr[j]) {
    				 int tmp = arr[i];
    				 arr[i] = arr[j];
    				 arr[j] = tmp;
    				 System.out.println("��ȯ �߻� : "
    						 + Arrays.toString(arr));
    			 }
    		 }
    	}
    	System.out.println(Arrays.toString(arr));
    }
    
    public void method4() {
    	int[] arr = {2,5,4,1,3};
    	
    	Arrays.sort(arr);
    	
    	System.out.println(Arrays.toString(arr));
    }
  
}



