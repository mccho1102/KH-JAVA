package com.kh.chap03.branch;

public class B_Continue {

	public void method1() {
		// while���� �̿��ؼ� 1 ~ 100���� ���
		// ��, 4�� ����� ����
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
		// 2~9�ܱ��� ¦���� ����ϱ�
		// (��, continue ����ϱ�)
	    for(int dan = 2; dan < 10; dan++){

		    if(dan % 2 != 0) {
		    	continue;
		    }
		    System.out.println("======"+dan+ "��======");		    
		    for(int num =1; num < 10; num++) {
	    	   System.out.println(dan + "x" + num + "=" + dan*num);
	    }
		    System.out.println();
	  }
	}
}
