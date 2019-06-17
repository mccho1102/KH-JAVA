package com.kh.chap01_poly.example1.controller;

import com.kh.chap01_poly.example1.model.vo.Child1;
import com.kh.chap01_poly.example1.model.vo.Child2;
import com.kh.chap01_poly.example1.model.vo.Parent;

public class PolyController {

	// ������
	// �θ�Ÿ���� ������ ������
	// �θ𿡰Լ� �Ļ��� ���� �ڽ� Ÿ���� ��ü�� ������ �� �ִ� ���
	
	public void method() {
		// 1. �θ� Ÿ�� ������ ����(���۷���)�� �θ� ��ü�� �ٷ궧
		System.out.println("1. �θ� Ÿ�� ����������(���۷���)�� �θ�ü�� �ٷ궧");
		
		Parent p1 = new Parent();
		// �θ� ���� ���� = �θ� ��ü
		p1.printParent();
		
		System.out.println();
		
		// 2. �ڽ� Ÿ�� ������ ����(���۷���)�� �θ� ��ü�� �ٷ궧
		System.out.println("2. �ڽ� Ÿ�� ����������(���۷���)�� �θ�ü�� �ٷ궧");
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		
		c1.printParent();
		c1.printChild1();
		
		c2.printParent();
		c2.printChild2();
		
		// 3. �θ� Ÿ�� ������ ������ �ڽ� ��ü�� �ٷ궧
		System.out.println("3. �θ� Ÿ�� ������ ������ �ڽ� ��ü�� �ٷ궧");
		Parent p2 = new Child1();
		Parent p3 = new Child2(); // �������� ����� ����
		// �θ� ���� ���� = �ڽ� ��ü
		
		// �� ĳ����(Up-Casting)
		// - �θ� Ÿ���� ������ ������ ��� �ڽ� ��ü�� ������ �� �ִ� ��
		// - ����ȯ ���� ����(�ڵ� ����ȯ)
		// - ��, �θ� ���������� ���� ������  �ڽ� ��ü �����
		//   ��ӹ��� �θ��� ����� ����
		
		p2.printParent();
		//p2.printChild1(); // �θ� ���� �����δ� �ڽ� ��� ���� �Ұ�
		
		p3.printParent();
		//p3.printChild2(); // �θ� ���� �����δ� �ڽ� ��� ���� �Ұ�
		
		// �ٿ� ĳ����(Down-Casting)
		// - �θ� Ÿ���� ������ ������ �ڽ� Ÿ������ ���� ����ȯ
		// - �ٿ� ĳ���ý� �θ� Ÿ�� ���� ������ �ڽ� ��� ���� ����
		
		System.out.println("�ٿ� ĳ���� ����");
		((Child1)p2).printChild1();
		((Child2)p3).printChild2();
		
		// 4. �ڽ� Ÿ�� ������ ������ �θ� Ÿ�� ��ü�� �ٷ궧
		// Child1 c3 = new Parent();
		// �ڽ� ���� ������ �θ� ��ü�� ���� �� ����
		
		// �θ� ��ü�� �ڽ� ��ü�� ���� ����ȯ(�ٿ� ĳ����) �Ѵٸ�?
		Child1 c3 = (Child1)(new Parent());
		c3.printChild1();
		// ��Ÿ�� ���� : ������ ������ ������ ���α׷� ������ �߻��� ����
		// ClassCastException : �ڷ����� ��ġ���� �ʴ� ��� �߻��ϴ� ��Ÿ�� ����
	}
}
