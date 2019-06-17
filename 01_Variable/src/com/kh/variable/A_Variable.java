package com.kh.variable;

public class A_Variable {

	// ������ ������� ���� ���
	public void noVariable() {
		System.out.println("������ ��� ���� ���");
		System.out.println(2 * 3.141592651589793 * 10);
		System.out.println(3.141592653589793 * 10 * 10);
		System.out.println(3.141592653589793 * 10 * 10 * 20);
		System.out.println(4 * 3.141592653589793 * 10 * 10);
	
	}
	
	public void usingVariable() {
		double pi = 3.141592653589793; // ������
	    int r = 20;                    // ������
	    int h = 30;                    // ����
	    
	    System.out.println("������ ����� ���");
	    
	    // ���ǵѷ� : 2*������*������
	    System.out.println(2*pi*r);    
	    
	    // ���� ���� : ������ * ������ * ������
	    System.out.println(pi*r*r);    
	    
	    // ������� ���� : ������ * ������ * ������ * ����
	    System.out.println(pi*r*r*h);    
	    
	    // ���� �ѳ��� : 4*������*������*������
	    System.out.println(4*pi*r*r);
	}
	
	/* ���� ����� ����
	 * 1. ���� �ǹ̸� �ο��� �� �ִ�
	 * 2. �������� ��������
	 * 3. ���뼺�� ��������
	 * 4. ���������� ����
	 */
	
	// ��������
	public void declareVariable() {
		// 1. ����
		// �� : ��(true), ����(false) T/F
		boolean isTrue; // 1byte
		
		// 2. ������
		// 2_1. ������:
		// 1,2,3,0,-1,-2
		byte bNum; // �������� ���� ���� ���� 1byte 
		short sNum;// int ���� ����              2byte
		int iNum;  // ������ ����                  4byte
		long lNum; // int ���� ū                 8byte
		
		// 2_2. �Ǽ���
		// 3.14, 0.123
		float fNum;  // �ε��Ҽ���                4byte
		double dNum; // �Ǽ��� ���� �ι�        8byte
		
		// 3. ������
		// 'A', '��', '��'
		char ch;     // 2byte
		
		// 4. ���ڿ�
		String str; // �ڹٿ��� �������ִ� ��� , ���� �ƴ�, ��������
		
		/**************************************************************/
		
		// ���� ��� ��Ģ
		// 1.��ҹ��� ����
		int number;
		int numBer;
		
		// 2. ����� ��� x
		// int byte;
		// int true;
		
		// 3. ���ڷ� ���� x
	    int age1;
	    // int 1age;
		
		// 4. Ư������ '_', '$'�� ��� ����
	    int number_1;
	    // int number-1;
		
		// 5. ��Ÿ�� ǥ��� ���ʻ� ǥ���� : �ΰ��̻��� ���� ����
	    String userName; // user + name
	    String username;
	    
	    // 6. �ڹٴ� �ѱۺ����� �����ϴ�.
	    byte ����Ʈ����;
	    boolean ����;
	    String �̸�;
	    
	    // �ѱ��� ������� �ʴ� ȯ�濡���� ������ �߻���ų�� ����
	    // --> ����θ� ����
	    
	    /**************************************************************/
	    
	    // ������ ������ �� �����غ���
	    
	    // 1. ���� �� ����
	    isTrue = true;
	    
	    System.out.println("isTrue�� ��:" + isTrue);
	    
	    isTrue = false;
	    
	    System.out.println("isTrue ���� �� :" + isTrue);
	    
	    // 2. ������
	    // byte����
	    bNum = 1;
	    
	    System.out.println("bNum�� �� :" + bNum);
		
        bNum = 100;
	    
	    System.out.println("bNum�� ���� �� :" + bNum);
	    
	    // byte�� ���� : -128 ~ +127
	    // ���� ������ �Ѿ�� ���� �߻�
	    // bNum = 128;
	    
	    // short����
	    sNum = 20000;
	    // sNum = 40000;
	    
	    // int����
	    iNum = 1000000000; // 10��
	    // iNum = 30000000000;
	    
	    // long����
	    lNum = 12345678912345678L;
	    
	    // 3. �Ǽ���
	    // float
	    fNum = 3.141592123456789f;
	    System.out.println("fNum�� ��:" + fNum);
	    
	    // double : �Ǽ��� ���� ��Ȯ���� �ι� 
	    dNum = 3.141592123456789;
	    System.out.println("dNum�� ��:" + dNum);
	    
	    // 4. ������
	    ch = 'A';
	    System.out.println("ch�� �� :" + ch);
	    ch = 66;
	    System.out.println("ch�� ���� �� :" + ch);
	    
	    // 5. ���ڿ�
	    str = "ABCDEF";
	    System.out.println("str�� �� : " + str);
	    
	    str = "A";
	    System.out.println("str�� ���� �� :" + str);
	 
	    
	}
	
	// ���� ����� ���ÿ� �ʱ�ȭ
	public void initVariable() {
		// 1. ����
		boolean isTrue = false;
		
		// 2. ������
		byte   bNum = 1;
		short  sNum = 2;
		int    iNum = 4;
		long   lNum = 8L;
		
		// 3. �Ǽ���
		float fNum = 3.14f;
		double dNum = 2.5612;
		
		// 4. ������
		char ch = '��';
		
		// 5. ���ڿ�
		String str = "A������";
		
		System.out.println(isTrue);
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println(fNum);
		System.out.println(dNum);
		System.out.println(ch);
		System.out.println(str);		
		
		
		
	}
	
}
