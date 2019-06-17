package com.kh.arry;

import java.util.Scanner;

public class A_Array {
    public void method1() {
    	// �迭 ���� �� �Ҵ�
    	int[] arr; // �迭����
        int arr2[]; // �ݴ�ε� ����
        
        arr = new int[4]; // �迭 �Ҵ�
        arr2 = new int[100];
        
        // �迭 �ʱ�ȭ
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        
        // �迭��.length  --> �迭�� ����(ĭ��)
        for(int i=0; i<arr.length; i++) {
        	arr[i] = i+4;
        	System.out.println(arr[i]);
        }
       // 4, 5, 6, 7
        
       // ����� ���ÿ� �ʱ�ȭ
        
        int[] arr3 = {1,2,3,4,5};
    }
    public void method2() {
    	// �迭�̶�?
    	// �������� ������ ������ �����Ǿ� �ִ� ����
    	
    	// �迭�� ����ϱ� ���� ����
    	// �迭 ���� -> �迭�Ҵ� -> �迭 �ʱ�ȭ
    	//
    	//    Stack       Heap      Staitic
    	//  ---------------------------------
    	//  |         |            |        |
    	//  | arr[]   |   ���� �ּ�  |        |                         
    	//  | heap�ּ� |   stack�ּ� |        |
    	//  |  ����      |   �� ��ġ     |        |
    	//  |         |            |        |
        //  ---------------------------------
    	// �迭 ���� ���([]) : stack ������ ����� ���� �ּҰ��� �����
    	// int�� ���� arr[] stack ������ �����Ͽ� �������    
    	int[] arr;
    	int arr2[];
    	
    	// �迭 �Ҵ� : heap ������ �Ҵ� 
    	// ������ = new �ڷ���[�迭�� ũ��];
    	arr = new int[4];
    	
    	// ��¥ int �⺻������ �ʱ�ȭ �Ǿ����� Ȯ��
    	System.out.println(arr[0]);
    	System.out.println(arr[1]);
    	System.out.println(arr[2]);
    	System.out.println(arr[3]);
    	
    	// �迭 �ʱ�ȭ
    	// 1) �� �ε��� ���� �ʱ�ȭ
    	arr[0] = 100;
    	arr[1] = 200;
    	arr[2] = 300;
    	arr[3] = 400;
 
    	System.out.println("1) �� �ε������� �ʱ�ȭ");
    	System.out.println(arr[0]);
    	System.out.println(arr[1]);
    	System.out.println(arr[2]);
    	System.out.println(arr[3]); 
    	
    	// 2) �ݺ����� �̿��� �ʱ�ȭ
    	System.out.println();
    	System.out.println("2) �ݺ����� �̿��� �ʱ�ȭ");
    	for(int i=0; i<arr.length; i++) {
    		// �迭��.length --> �迭�� ����(ĭ) ��ȯ
    		
        	arr[i] = 1000 * i;
        	System.out.println("arr[" + i + "] = " + arr[i]);
        }
    	
    	// 3){} ���� �ʱ�ȭ
    	int[] arr3 = {5,4,3,2,1};
    	
    	System.out.println();
    	System.out.println("{} �ʱ�ȭ");
    	for(int i=0; i<arr3.length; i++) {
    		System.out.println(arr3[i]);
    	}
    }
    
    public void method3() {
    	// �л� 5���� ���� �հ�, ��ձ��ϱ�
    	// �迭�� ���������� ��� �ʿ�
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
    	
    	System.out.println("�հ� : " + sum);
    	System.out.println("��� : " + sum/sArr.length);
    }
    
    public void method4() {
    	// 5���� ������ ������ �߻� ���� ���� �� �հ�, ��� ���
    	// (��, ������ ������ 0~100);
    	
    	double sum = 0;
    	double[] sArr = new double[5];
    	for(int i=0; i<sArr.length; i++) {
    		double random = Math.random() * 101;
    		                // 0.0 <= random < 101.0
    		                // 100.999999999
    		if(random > 100) {
    			random = 100;
    			random = Math.floor(random); //����  cf) ceil �ø�
    		}
    		
    		sArr[i] = random;
    		
    		sum += sArr[i];
    	}
    	
    	System.out.println("�հ� : " + sum);
    	System.out.println("�հ� : " + sum/sArr.length);
    }
    
    public void method5() {
    	// 5���� ������ ���� �Է¹޾� �迭�� ������
    	// �հ�, ����� ���
    	
    	Scanner sc = new Scanner(System.in);
    	
    	// Stack����       Heap����
    	double[] sArr = new double[5];
    	double sum = 0.0;
    	
    	for(int i=0; i<sArr.length; i++) {
    		System.out.println(i+ "�� ���� �Է� :");
    		sArr[i] = sc.nextDouble();
    		sum += sArr[i];
    	}
    	System.out.println("�հ� : " + sum);
    	System.out.println("�հ� : " + sum/sArr.length);
    	
    }
    
    public void method6() {
    	// �Է� ���� �� ��ŭ ������ �Ҵ��� �迭�� �����Ͽ�
    	// �� �ε����� ���� ������ 
    	// �հ� ��� ���ϱ�
    	
        Scanner sc = new Scanner(System.in);
    	
        System.out.println("�迭 ũ�� ����: ");
        int size = sc.nextInt();
        
    	// Stack����       Heap����
    	double[] sArr = new double[size];
    	double sum = 0.0;
    	
    	for(int i=0; i<sArr.length; i++) {
    		System.out.println(i+ "�� ���� �Է� :");
    		sArr[i] = sc.nextDouble();
    		sum += sArr[i];
    	}
    	System.out.println("�հ� : " + sum);
    	System.out.println("�հ� : " + sum/sArr.length);
    }
    
    public void method7() {
    	// �޴� 5���� �Է¹޾� �����ϴ� �迭 ���� ��
    	// ������ �߻� ���� �ϳ��� �����ϱ�
    	
    	Scanner sc = new Scanner(System.in);
    	
    	String[] mArr = new String[5];
    	
    	for(int i=0; i<mArr.length; i++) {
    		System.out.print("�Է�" + (i+1)+":");
    		mArr[i] = sc.nextLine();
    	}
    	
    	int random = (int)(Math.random() * mArr.length);
    	
    	System.out.println("������ �޴�: "+ mArr[random]);
    	// null : ���� �������� �ʰ� �ִٶ�� ���� ������ ����
    	
    }
    
    public void method8() {
    	// �޴� 5���� �Է¹޾� �����ϴ� �迭 ���� ��
    	// ������ �߻� ���� �ϳ��� �����ϱ�
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("� �Է�? :");
    	int size = sc.nextInt();
    	sc.nextLine();
    	
    	String[] mArr = new String[size];
    	
    	for(int i=0; i<mArr.length; i++) {
    		System.out.print("�Է�" + (i+1)+":");
    		mArr[i] = sc.nextLine();
    	}
    	
    	int random = (int)(Math.random() * mArr.length);
    	
    	System.out.println("������ �޴�: "+ mArr[random]);
    	// null : ���� �������� �ʰ� �ִٶ�� ���� ������ ����
    	
    }
    public void method9() {

    	String[] mArr = {"�����̳�", "���õ��", "�ٴ�����",
    			         "��ġ����", "����Ϲ���","�������",
    			         "ȫ�����", "�����߾���", "�ູ��Ź"};
    	    	
    	  	
    	int random = (int)(Math.random() * mArr.length);
    	
    	System.out.println("������ �Ĵ�: "+ mArr[random]);
    	// null : ���� �������� �ʰ� �ִٶ�� ���� ������ ����
    	
    }
    
}
