package com.kh.arry;

import java.util.Arrays;
import java.util.Scanner;

public class B_ArrayCopy {
    // 얕은복사 : 배열 주소만 복사
	// 깊은복사 : 새로운배열을 생성하여
	//           기존배열 내부의 값을 그대로 복사
	
	public void method1() {
		// 얕은복사 예제
		int[] origin = {1, 1, 1, 1, 1};
		
		System.out.println("origin 출력");
		for(int i=0; i<origin.length; i++) {
			System.out.println(origin[i] + " ");
		}
		System.out.println();
		
		// arrCopy에 origin이 참조하고 있는 주소값 복사
		int[] arrCopy = origin;
		System.out.println("arrCopy 출력");
		for(int i=0; i<arrCopy.length; i++) {
			System.out.println(arrCopy[i] + " ");
		}
		System.out.println();
		
		// arrCopy[2]의 값을 99로 변경
		System.out.println("arrCopy[2]의 값을 99로 변경");
		arrCopy[2] = 99;
		
		// arrCopy 값 변경 확인
		System.out.println("arrCopy 출력");
		for(int i=0; i<arrCopy.length; i++) {
			System.out.println(arrCopy[i] + " ");
		}
		System.out.println();
		
		// origin 확인
		System.out.println("origin 출력");
		for(int i=0; i<origin.length; i++) {
			System.out.println(origin[i] + " ");
		}
		System.out.println();
		
		System.out.println("origin 주소값 :" + origin);
		System.out.println("arrCopy 주소값 :" + arrCopy);
	}
	
	public void method2() {
		// 깊은 복사 예제
		// 기존 배열 복제
		
		int[] origin = {1, 1, 1, 1, 1};
		
		// origin 만큼의 메모리 공간 할당
		int[] arrCopy = new int[origin.length];
		
		System.out.println("origin 값 자체를 복사");
		for(int i=0; i<origin.length; i++) {
			arrCopy[i] = origin[i];
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		
		// arrCopy[2]의 값을 99999로 변경
		System.out.print("arrCopy[2]의 값을 99999로 변경");
		arrCopy[2] = 99999;
		
		// arrCopy 값 변경 확인
		System.out.println("arrCopy 출력");
		for(int i=0; i<arrCopy.length; i++) {
			System.out.print(arrCopy[i] + " ");
		}
		System.out.println();
		
		// origin 확인
		System.out.println("origin 출력");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		
		System.out.println("origin 주소값 :" + origin);
		System.out.println("arrCopy 주소값 :" + arrCopy);
	}
	public void method3() {
		// System.arraycopy() 사용하기
		// System.arraycopy(src, srcPos, dest, destPos, length);
		// System.arraycopy(원본 배열명,
		//                  원본 배열에서 복사를 시작할 위치(인덱스),
		//                  복사 배열명(arrCopy),
		//                  복사 배열에서 복사가 시작될 위치(인덱스),
		//                  원본 배열에서 복사할 길이);
		
		int[] origin = {1,2,3,4,5};
		
		int[] arrCopy = new int[10];
		
		System.arraycopy(origin, 0, arrCopy, 0, origin.length);
		System.out.println("System.arraycopy(origin, 0, arrCopy, 0, origin.length);");
		for(int i=0; i<arrCopy.length; i++) {
			System.out.print(arrCopy[i]+" ");
		}
		System.out.println();
		
		// 0 0 2 3 4 0 0 0 0 0
		int[] arrCopy2 = new int[10];
		
		System.arraycopy(origin, 1, arrCopy2, 2, 3);
		System.out.println("System.arraycopy(origin, 1, arrCopy2, 2, 3);");
		
		for(int i=0; i<arrCopy2.length; i++) {
			System.out.print(arrCopy2[i]+" ");
		}
	}
	
	public void method4() {
		// Arrays.copyof()
		// * Arrays 클래스 : 배열을 유용하게 사용 할 수 있도록
		//                  기능을 제공해 주는 클래스
		
		int[] origin = {1, 2, 3, 4, 5};
		
		int[] arrCopy = Arrays.copyOf(origin, origin.length);
		
		System.out.println(Arrays.toString(arrCopy));
		
		int[] arrCopy2 = Arrays.copyOf(origin, 10);
		System.out.println(Arrays.toString(arrCopy2));
	}
	 public void method5() {
	    	Scanner sc = new Scanner(System.in);
	    	
	    	System.out.print("주민등록번호(-포함):");
	    	String pId = sc.nextLine();
	    	
	    	char[] origin = new char[pId.length()];
	    	
	    	for(int i=0; i<origin.length; i++) {
	    		origin[i] = pId.charAt(i);
	    	}
	    	
	    	char[] copyArr = new char[origin.length];
	    	
	    	// 5. 원본배열 복사 시 성별자리 이후 부터 '*' 담기
	    	for(int i=0; i<copyArr.length; i++) {
	    		if(i<=7) {// 성별자리 이전까지는 원복 복사
	    			copyArr[i] = origin[i];
	    		}else {
	    			copyArr[i] = '*';
	    		}
	    		
	    		// 복사후 바로 출력
	    		System.out.print(copyArr[i]);
    		}

   	}
  
	
}
