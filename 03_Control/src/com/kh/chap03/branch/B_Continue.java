package com.kh.chap03.branch;

public class B_Continue {

	public void method1() {
		// while문을 이용해서 1 ~ 100까지 출력
		// 단, 4의 배수는 제외
		int i = 0;
		
		while(i<100) {
	    	i++;
			
			if(i % 4 == 0) {
				continue;
			}
			
  			System.out.println(i);

		}
	}
	
	public void method2() {
		// 2~9단까지 짝수만 출력하기
		// (단, continue 사용하기)
	    for(int dan = 2; dan < 10; dan++){

		    if(dan % 2 != 0) {
		    	continue;
		    }
		    System.out.println("======"+dan+ "단======");		    
		    for(int num =1; num < 10; num++) {
	    	   System.out.println(dan + "x" + num + "=" + dan*num);
	    }
		    System.out.println();
	  }
	}
}
