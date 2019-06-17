package com.kh.arry;

import java.util.Arrays;

public class C_ArraySort {
    public void method1(){
    	// 변수 두개의 값 서로 변경하기
    	int a = 10;
    	int b = 20;
    	
    	// a = b; // a == 20, b == 20
    	// b = a; // a == 20, b == 20
    	
    	System.out.println("변경전");
    	System.out.println("a : " + a + ", b :" + b);
    	
    	int tmp = 0;
    	
    	tmp = a; // a=10, b=20, tmp=10;
    	a = b;   // a=20, b=20, tmp=10;
    	b = tmp; // a=20, b=10, tmp=10;
    	
    	System.out.println("변경후");
    	System.out.println("a : " + a + ", b :" + b);
    }
    
    public void method2(){
    	// 배열 내부 값들 위치 변경
    	int[] arr = {2,1,3};
    	// --> {1,2,3}으로 변경
       	
    	int tmp = 0;
    	tmp = arr[0];
    	arr[0] = arr[1];
    	arr[1] = tmp;
    	
    	System.out.println("변경후");
    	System.out.println(Arrays.toString(arr));
    }
    
    public void method3() {
    	
    	int[] arr = {2,5,4,1,3};
    	
    	// 오름차순으로 정렬
    	// 삽입정렬(insertion sort)
    	// 배열의 n번 인덱스의 값을
    	// 0~n-1번 인덱스까지 비교
    	
    	// 1. 삽입할 배열 인덱스 지정을 위한 for문
    	for(int i=1; i<arr.length; i++) {
    		//2. 비교를 실행할 for문
    		 for(int j=0; j<i; j++) {
    			 
    			 if(arr[i] < arr[j]) {
    				 int tmp = arr[i];
    				 arr[i] = arr[j];
    				 arr[j] = tmp;
    				 System.out.println("교환 발생 : "
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



