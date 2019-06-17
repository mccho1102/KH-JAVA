package com.kh.arry;

import java.util.Arrays;
import java.util.Scanner;

public class B_ArrayCopy {
    // �������� : �迭 �ּҸ� ����
	// �������� : ���ο�迭�� �����Ͽ�
	//           �����迭 ������ ���� �״�� ����
	
	public void method1() {
		// �������� ����
		int[] origin = {1, 1, 1, 1, 1};
		
		System.out.println("origin ���");
		for(int i=0; i<origin.length; i++) {
			System.out.println(origin[i] + " ");
		}
		System.out.println();
		
		// arrCopy�� origin�� �����ϰ� �ִ� �ּҰ� ����
		int[] arrCopy = origin;
		System.out.println("arrCopy ���");
		for(int i=0; i<arrCopy.length; i++) {
			System.out.println(arrCopy[i] + " ");
		}
		System.out.println();
		
		// arrCopy[2]�� ���� 99�� ����
		System.out.println("arrCopy[2]�� ���� 99�� ����");
		arrCopy[2] = 99;
		
		// arrCopy �� ���� Ȯ��
		System.out.println("arrCopy ���");
		for(int i=0; i<arrCopy.length; i++) {
			System.out.println(arrCopy[i] + " ");
		}
		System.out.println();
		
		// origin Ȯ��
		System.out.println("origin ���");
		for(int i=0; i<origin.length; i++) {
			System.out.println(origin[i] + " ");
		}
		System.out.println();
		
		System.out.println("origin �ּҰ� :" + origin);
		System.out.println("arrCopy �ּҰ� :" + arrCopy);
	}
	
	public void method2() {
		// ���� ���� ����
		// ���� �迭 ����
		
		int[] origin = {1, 1, 1, 1, 1};
		
		// origin ��ŭ�� �޸� ���� �Ҵ�
		int[] arrCopy = new int[origin.length];
		
		System.out.println("origin �� ��ü�� ����");
		for(int i=0; i<origin.length; i++) {
			arrCopy[i] = origin[i];
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		
		// arrCopy[2]�� ���� 99999�� ����
		System.out.print("arrCopy[2]�� ���� 99999�� ����");
		arrCopy[2] = 99999;
		
		// arrCopy �� ���� Ȯ��
		System.out.println("arrCopy ���");
		for(int i=0; i<arrCopy.length; i++) {
			System.out.print(arrCopy[i] + " ");
		}
		System.out.println();
		
		// origin Ȯ��
		System.out.println("origin ���");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		
		System.out.println("origin �ּҰ� :" + origin);
		System.out.println("arrCopy �ּҰ� :" + arrCopy);
	}
	public void method3() {
		// System.arraycopy() ����ϱ�
		// System.arraycopy(src, srcPos, dest, destPos, length);
		// System.arraycopy(���� �迭��,
		//                  ���� �迭���� ���縦 ������ ��ġ(�ε���),
		//                  ���� �迭��(arrCopy),
		//                  ���� �迭���� ���簡 ���۵� ��ġ(�ε���),
		//                  ���� �迭���� ������ ����);
		
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
		// * Arrays Ŭ���� : �迭�� �����ϰ� ��� �� �� �ֵ���
		//                  ����� ������ �ִ� Ŭ����
		
		int[] origin = {1, 2, 3, 4, 5};
		
		int[] arrCopy = Arrays.copyOf(origin, origin.length);
		
		System.out.println(Arrays.toString(arrCopy));
		
		int[] arrCopy2 = Arrays.copyOf(origin, 10);
		System.out.println(Arrays.toString(arrCopy2));
	}
	 public void method5() {
	    	Scanner sc = new Scanner(System.in);
	    	
	    	System.out.print("�ֹε�Ϲ�ȣ(-����):");
	    	String pId = sc.nextLine();
	    	
	    	char[] origin = new char[pId.length()];
	    	
	    	for(int i=0; i<origin.length; i++) {
	    		origin[i] = pId.charAt(i);
	    	}
	    	
	    	char[] copyArr = new char[origin.length];
	    	
	    	// 5. �����迭 ���� �� �����ڸ� ���� ���� '*' ���
	    	for(int i=0; i<copyArr.length; i++) {
	    		if(i<=7) {// �����ڸ� ���������� ���� ����
	    			copyArr[i] = origin[i];
	    		}else {
	    			copyArr[i] = '*';
	    		}
	    		
	    		// ������ �ٷ� ���
	    		System.out.print(copyArr[i]);
    		}

   	}
  
	
}
