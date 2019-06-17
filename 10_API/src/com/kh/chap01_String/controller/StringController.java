package com.kh.chap01_String.controller;

import java.util.Arrays;
import java.util.Scanner;

public class StringController {
	public void method1(){
		// String ���ͷ�
		String str1 = "abc";
		String str2 = "abc";
		
		// �� ��ü�� ������ ��
		System.out.println(str1.contentEquals(str2));
		
		// �����ϰ� �ִ� ��ü�� �ּҰ� ������ ��
		System.out.println(str1 == str2);
		
		System.out.println("hashCode()�� �̿��Ͽ� ��");
		System.out.println("str1.hashCode() : " + str1.hashCode());
		System.out.println("str2.hashCode() : " + str2.hashCode());
		
		// Object.hashCode()
		// ��ü�� �ּҸ� �̿��Ͽ� ������ �ؽ��ڵ�
		
		// String.hashCode()
		// ��ü�� �����ϰ� �ִ� ���� �̿��Ͽ� �ؽ��ڵ� ����
		
		// hashCode()�� equals()�� �Բ� ���� �񱳸� ���� ������� �޼ҵ�
		// HashMap, HashSet, HashTable���� �� �񱳽� ����.
		
		// System.identityHashCode()
		// ��ü�� ���� �ּҰ��� �̿��Ͽ� ���� �ؽ��ڵ�
		// == Object.hashCode()�� ������
		System.out.println("== System.identityHashCode()==");
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		System.out.println();
		String str3 = new String("abc");
		System.out.println(str1 == str3);
		System.out.println(System.identityHashCode(str3));
		
		// ���� ���� �̿��Ͽ� hashCode()�� �����ϱ� ������ ����
		System.out.println(str1.hashCode());
		System.out.println(str3.hashCode());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("str4 �Է�");
		String str4 = sc.nextLine();
		
		System.out.println(str1 == str4);
		System.out.println(str1.equals(str4));
		System.out.println(str4.hashCode());
		System.out.println(System.identityHashCode(str4));
		
		// String Immutable(�Һ���)
		// String �� ����� ���� �������� ���� ����Ǵ� ���� �ƴ�
		// ���ο� ������ ���� �Ҵ�ǰ� 
		// �����Ϥ��� ������ ���ο� ������ �ּҸ� ��ȯ��
		System.out.println("\n==String Immutable ==");
		System.out.println("������ str2 : " + System.identityHashCode(str2));
		
		str2 += "efg";
		System.out.println("������ str2 : " + System.identityHashCode(str2));
		// ���� �ٸ� -> ������ ������ ���� ������ -> �Һ��� Ȯ��
		String s = "";
		for(int i='a'; i<'z'; i++) {
			s += (char)i;
		}
		System.out.println(s);
		
	}
	
	public void method2() {
		// StringBuffer
		// StringBuffer ������ = new StringBuffer(���ڿ�);
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer("java api");
		
		// ����ũ�� Ȯ��
		System.out.println("==���� ũ�� Ȯ�� ==");
		System.out.println("sb1 : " + sb1.capacity());
		System.out.println("sb1 : " + sb2.capacity());
		
		// ������ Ȯ��
		System.out.println("\n== ������Ȯ�� ==");
		System.out.println("������ :"+ System.identityHashCode(sb2));
		
		sb2 = sb2.append(" StringBuffer Class");
		System.out.println("������ :"+ System.identityHashCode(sb2));

	    // ���� ũ�� ���� Ȯ��
		System.out.println("\n== ���� ũ�� ���� Ȯ�� ==");
		System.out.println(sb2.capacity());
		
	}
	
	public void method3() {
		// String.split(������);
		
		String str = "��ҿ�, ������, ���ֿ�, ��â��, ������, ����ȭ";
		
		String[] arr = str.split(",");
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<arr.length; i++) {
			arr[i] = arr[i].trim();
			System.out.println(arr[i]);
		}
	}
	
}
