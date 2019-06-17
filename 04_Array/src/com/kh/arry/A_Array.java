package com.kh.arry;

import java.util.Scanner;

public class A_Array {
    public void method1() {
    	// 배열 선언 및 할당
    	int[] arr; // 배열선언
        int arr2[]; // 반대로도 가능
        
        arr = new int[4]; // 배열 할당
        arr2 = new int[100];
        
        // 배열 초기화
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        
        // 배열명.length  --> 배열의 길이(칸수)
        for(int i=0; i<arr.length; i++) {
        	arr[i] = i+4;
        	System.out.println(arr[i]);
        }
       // 4, 5, 6, 7
        
       // 선언과 동시에 초기화
        
        int[] arr3 = {1,2,3,4,5};
    }
    public void method2() {
    	// 배열이란?
    	// 여러개의 변수가 나란히 나열되어 있는 형태
    	
    	// 배열을 사용하기 위한 순서
    	// 배열 선언 -> 배열할당 -> 배열 초기화
    	//
    	//    Stack       Heap      Staitic
    	//  ---------------------------------
    	//  |         |            |        |
    	//  | arr[]   |   값과 주소  |        |                         
    	//  | heap주소 |   stack주소 |        |
    	//  |  저장      |   와 일치     |        |
    	//  |         |            |        |
        //  ---------------------------------
    	// 배열 선언 방법([]) : stack 영역에 만들어 지며 주소값이 저장됨
    	// int형 변수 arr[] stack 영역에 선언하여 만들어줌    
    	int[] arr;
    	int arr2[];
    	
    	// 배열 할당 : heap 영역에 할당 
    	// 변수명 = new 자료형[배열의 크기];
    	arr = new int[4];
    	
    	// 진짜 int 기본값으로 초기화 되었는지 확인
    	System.out.println(arr[0]);
    	System.out.println(arr[1]);
    	System.out.println(arr[2]);
    	System.out.println(arr[3]);
    	
    	// 배열 초기화
    	// 1) 각 인덱스 별로 초기화
    	arr[0] = 100;
    	arr[1] = 200;
    	arr[2] = 300;
    	arr[3] = 400;
 
    	System.out.println("1) 각 인덱스별로 초기화");
    	System.out.println(arr[0]);
    	System.out.println(arr[1]);
    	System.out.println(arr[2]);
    	System.out.println(arr[3]); 
    	
    	// 2) 반복문을 이용한 초기화
    	System.out.println();
    	System.out.println("2) 반복문을 이용한 초기화");
    	for(int i=0; i<arr.length; i++) {
    		// 배열명.length --> 배열의 길이(칸) 반환
    		
        	arr[i] = 1000 * i;
        	System.out.println("arr[" + i + "] = " + arr[i]);
        }
    	
    	// 3){} 직접 초기화
    	int[] arr3 = {5,4,3,2,1};
    	
    	System.out.println();
    	System.out.println("{} 초기화");
    	for(int i=0; i<arr3.length; i++) {
    		System.out.println(arr3[i]);
    	}
    }
    
    public void method3() {
    	// 학생 5명의 점수 합계, 평균구하기
    	// 배열은 복수형으로 명명 필요
    	double[] sArr = new double[5];
    	sArr[0] = 50.8;
    	sArr[1] = 95.5;
    	sArr[2] = 60.4;
    	sArr[3] = 80.3;
    	sArr[4] = 35.9;
    	
    	double sum = 0.0;
    	for(int i=0; i<sArr.length; i++) {
    		sum += sArr[i];
      	}
    	
    	System.out.println("합계 : " + sum);
    	System.out.println("평균 : " + sum/sArr.length);
    }
    
    public void method4() {
    	// 5명의 점수를 난수를 발생 시켜 저장 후 합계, 평균 출력
    	// (단, 난수의 범위는 0~100);
    	
    	double sum = 0;
    	double[] sArr = new double[5];
    	for(int i=0; i<sArr.length; i++) {
    		double random = Math.random() * 101;
    		                // 0.0 <= random < 101.0
    		                // 100.999999999
    		if(random > 100) {
    			random = 100;
    			random = Math.floor(random); //버림  cf) ceil 올림
    		}
    		
    		sArr[i] = random;
    		
    		sum += sArr[i];
    	}
    	
    	System.out.println("합계 : " + sum);
    	System.out.println("합계 : " + sum/sArr.length);
    }
    
    public void method5() {
    	// 5명의 점수를 각각 입력받아 배열에 저장후
    	// 합계, 평균을 출력
    	
    	Scanner sc = new Scanner(System.in);
    	
    	// Stack공간       Heap공간
    	double[] sArr = new double[5];
    	double sum = 0.0;
    	
    	for(int i=0; i<sArr.length; i++) {
    		System.out.println(i+ "번 점수 입력 :");
    		sArr[i] = sc.nextDouble();
    		sum += sArr[i];
    	}
    	System.out.println("합계 : " + sum);
    	System.out.println("합계 : " + sum/sArr.length);
    	
    }
    
    public void method6() {
    	// 입력 받은 수 만큼 공간을 할당한 배열을 생성하여
    	// 각 인덱스에 점수 저장후 
    	// 합계 평균 구하기
    	
        Scanner sc = new Scanner(System.in);
    	
        System.out.println("배열 크기 지정: ");
        int size = sc.nextInt();
        
    	// Stack공간       Heap공간
    	double[] sArr = new double[size];
    	double sum = 0.0;
    	
    	for(int i=0; i<sArr.length; i++) {
    		System.out.println(i+ "번 점수 입력 :");
    		sArr[i] = sc.nextDouble();
    		sum += sArr[i];
    	}
    	System.out.println("합계 : " + sum);
    	System.out.println("합계 : " + sum/sArr.length);
    }
    
    public void method7() {
    	// 메뉴 5개를 입력받아 저장하는 배열 생성 후
    	// 난수를 발생 시켜 하나만 선택하기
    	
    	Scanner sc = new Scanner(System.in);
    	
    	String[] mArr = new String[5];
    	
    	for(int i=0; i<mArr.length; i++) {
    		System.out.print("입력" + (i+1)+":");
    		mArr[i] = sc.nextLine();
    	}
    	
    	int random = (int)(Math.random() * mArr.length);
    	
    	System.out.println("오늘의 메뉴: "+ mArr[random]);
    	// null : 아직 참조하지 않고 있다라는 뜻을 가지고 있음
    	
    }
    
    public void method8() {
    	// 메뉴 5개를 입력받아 저장하는 배열 생성 후
    	// 난수를 발생 시켜 하나만 선택하기
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("몇개 입력? :");
    	int size = sc.nextInt();
    	sc.nextLine();
    	
    	String[] mArr = new String[size];
    	
    	for(int i=0; i<mArr.length; i++) {
    		System.out.print("입력" + (i+1)+":");
    		mArr[i] = sc.nextLine();
    	}
    	
    	int random = (int)(Math.random() * mArr.length);
    	
    	System.out.println("오늘의 메뉴: "+ mArr[random]);
    	// null : 아직 참조하지 않고 있다라는 뜻을 가지고 있음
    	
    }
    public void method9() {

    	String[] mArr = {"현선이네", "김밥천국", "다담정식",
    			         "참치공방", "김밥일번가","서브웨이",
    			         "홍콩반점", "남원추어탕", "행복식탁"};
    	    	
    	  	
    	int random = (int)(Math.random() * mArr.length);
    	
    	System.out.println("오늘의 식당: "+ mArr[random]);
    	// null : 아직 참조하지 않고 있다라는 뜻을 가지고 있음
    	
    }
    
}
