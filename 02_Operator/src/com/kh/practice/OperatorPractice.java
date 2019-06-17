package com.kh.practice;

import java.util.Scanner;

public class OperatorPractice {
	// �޼ҵ� �� : public void practice1(){}
	public void practice1() {
		// Ű����� �Է� ���� �ϳ��� ������ ����̸� ������١�, ����� �ƴϸ� ������� �ƴϴ١��� ����ϼ���.
		// ex.
	    //   ���� : -9
	    //   ����� �ƴϴ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��� �ּ��� : ");
		int num = sc.nextInt();
		
		String result = (num > 0 ? "�����" : "����� �ƴϴ�");
		

		System.out.println(result);
	
	}
	
	public void practice2() {
		//Ű����� �Է� ���� �ϳ��� ������ ����̸� ������١�,
		//����� �ƴ� ��� �߿��� 0�̸� ��0�̴١�, 0�� �ƴϸ� �������١��� ����ϼ���.
        Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��� �ּ��� : ");
		int num = sc.nextInt();
		
		String result = (num > 0 ? "�����" : (num == 0 ? "0�̴�" : "������"));
		

		System.out.println(result);
		
	}
	
	public void practice3() {
		// Ű����� �Է� ���� �ϳ��� ������ ¦���̸� ��¦���١�, ¦���� �ƴϸ� ��Ȧ���١��� ����ϼ���.
		
        Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��� �ּ��� : ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0 ? "¦����" : "Ȧ����");
		

		System.out.println(result);

	}
	
	public void practice4() {
		/* ��� ����� ������ ���� ������������ �Ѵ�. �ο� ���� ���� ������ Ű����� �Է� �ް�
	       1�δ� �����ϰ� �������� ���� ������ �����ְ� ���� ������ ������ ����ϼ���.
	       ex.
	             �ο� �� : 29
			���� ���� : 100
			1�δ� ���� ���� : 3
			���� ���� ���� : 13
		*/
        Scanner sc = new Scanner(System.in);
		
		System.out.print("�ο����� �Է��� �ּ��� : ");
		int num1 = sc.nextInt();
		
		System.out.print("���������� �Է��� �ּ��� : ");
		int num2 = sc.nextInt();
		int result1 = (num2 / num1);
		int result2 = (num2 % num1);
		
		System.out.println("1�δ� ���� ���� :" + result1);
		System.out.println("���� ���� ���� :"  + result2);
	}	
	
	public void practice5() {
		/* Ű����� �Է� ���� ������ ������ ����ϰ� ����� ���� ���� ȭ�鿡 ����Ͽ� Ȯ���ϼ���.
			�� �� ������ ��M���̸� ���л�, ��M���� �ƴϸ� ���л����� ��� ó�� �ϼ���.
			ex.
			�̸� : �ڽſ�
			�г�(���ڸ�) : 3
			��(���ڸ�) : 4
			��ȣ(���ڸ�) : 15
			����(M/F) : F
			����(�Ҽ��� �Ʒ� ��°�ڸ�����) : 85.75
			3�г� 4�� 15�� �ڽſ� ���л��� ������ 85.75�̴�.
		 */
        Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��� �ּ��� : ");
		String name = sc.nextLine();
		
		System.out.print("�г��� �Է��� �ּ��� : ");
		int grade = sc.nextInt();
		sc.nextLine();
		System.out.print("���� �Է��� �ּ��� : ");
		int ban = sc.nextInt();
		sc.nextLine();
		System.out.print("��ȣ�� �Է��� �ּ��� : ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.print("������ �Է��� �ּ��� : ");
		char sex = sc.nextLine().charAt(0);
	
		System.out.print("������ �Է��� �ּ��� : ");
		double jumsu = sc.nextDouble();
		sc.nextLine();
		// 3�г� 4�� 15�� �ڽſ� ���л��� ������ 85.75�̴�.
		System.out.println(grade + "�г�" + ban + "��" + num + "��" + name + 
				(sex == 'F' ? "���л�" : "���л�") + "�� ������" + jumsu + "�̴�" );
		// 
	}
	public void practice6() {
		/* ���̸� Ű����� �Է� �޾� ���(13�� ����)����, û�ҳ�(13�� �ʰ� ~ 19�� ����)����,
			����(19�� �ʰ�)���� ����ϼ���.
			ex.
			���� : 19
			û�ҳ�         */
        Scanner sc = new Scanner(System.in);
		
		System.out.print("���̸� �Է��� �ּ��� : ");
		int age = sc.nextInt();
		String str = (age <= 13 ? "���" : (age > 19 ? "����" : "û�ҳ�"));
		System.out.println("���� :" + age);
		System.out.println(str);
	}
	
	public void practice7() {
	/* ����, ����, ���п� ���� ������ Ű���带 �̿��� ������ �Է� �ް�,
		�� ���� ���� �հ�(����+����+����)�� ���(�հ�/3.0)�� ���ϼ���.
		�� ������ ������ ����� ������ �հ� ���θ� ó���ϴµ�
		�� ���� ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��� �� �հ�, �ƴ϶�� ���հ��� ����ϼ���.
		ex.
		���� : 60
		���� : 80
		���� : 40
		�հ� : 180
		��� : 60.0
		�հ� */
        Scanner sc = new Scanner(System.in);
		
		System.out.print("���������� �Է��� �ּ��� : ");
		int kor = sc.nextInt();
		System.out.print("���������� �Է��� �ּ��� : ");
		int eng = sc.nextInt();
		System.out.print("���� ������ �Է��� �ּ��� : ");
		int math = sc.nextInt();
		
		int tot = kor + eng + math;
		int avg = tot / 3;
		
	    String str = (((kor > 40 && eng > 40 && math > 40) && avg >= 60) ? "�հ�" : "���հ�");
		System.out.println("���� :" + kor);
		System.out.println("���� :" + eng);
		System.out.println("���� :" + math);
		System.out.println("�հ� :" + tot);
		System.out.println("��� :" + avg);
		System.out.println(str);
	}
	public void practice8() {
		/* �ֹι�ȣ�� �̿��Ͽ� �������� �������� �����Ͽ� ����ϼ���.
			ex.
			�ֹι�ȣ�� �Է��ϼ���(- ����) : 132456-2123456
			����    */
        Scanner sc = new Scanner(System.in);
		
		System.out.print("�ֹι�ȣ�� �Է��� �ּ���(- ����) : ");
		String jumin_no = sc.nextLine();
		char sex = jumin_no.charAt(7);
		String str = (sex == '1' || sex == '3' ? "����" :
                      sex == '2' || sex == '4' ? "����" : "�߸��Է��Ͽ����ϴ�.");
		System.out.println(str);
	}
	public void practice9() {
		/* Ű����� ���� �� ���� �Է� �޾� ���� ����(num1, num2)�� �����ϼ���.
			�׸��� �� �ٸ� ������ �Է� �޾� �� ���� num1 ���ϰų� num2 �ʰ��̸� true�� ����ϰ�
			�ƴϸ� false�� ����ϼ���.
            (��, num1�� num2���� �۾ƾ� ��)
		 */
        Scanner sc = new Scanner(System.in);

        System.out.print("����1�� �Է��� �ּ��� : ");
		int num1 = sc.nextInt();
		
		System.out.print("����2�� �Է��� �ּ��� : ");
		int num2 = sc.nextInt();

		System.out.print("����3�� �Է��� �ּ��� : ");
		int num3 = sc.nextInt();
		
		String str = (num2 > num1 ? (num3 <= num1 || num3 > num2 ? "true" : "false"):
			       "num1�� num2���� Ů�ϴ�");
		System.out.println(str);
	}

	public void practice10() {
	/*
	 * 3���� ���� Ű����� �Է� �޾� �Է� ���� ���� ��� ������ true, �ƴϸ� false�� ����ϼ���.
		ex.
		�Է�1 : 5
		�Է�2 : -8
		�Է�3 : 5
		false
	 */
        Scanner sc = new Scanner(System.in);

        System.out.print("����1�� �Է��� �ּ��� : ");
		int num1 = sc.nextInt();
		
		System.out.print("����2�� �Է��� �ּ��� : ");
		int num2 = sc.nextInt();

		System.out.print("����3�� �Է��� �ּ��� : ");
		int num3 = sc.nextInt();
		
		String str = (num1 == num2 && num1 == num3 && num2 == num3 ? "true" : "false");
		System.out.println(str);	
	}
	public void practice11() {
		/*A, B, C ����� ������ �Է� �ް� �� ����� ������ �μ�Ƽ�긦 ������ ������ ����Ͽ� ����ϰ�
		�μ�Ƽ�� ���� �޿��� 3000���� �̻��̸� ��3000 �̻�, �̸��̸� ��3000 �̸����� ����ϼ���.
		(A ����� �μ�Ƽ��� 0.4, B ����� �μ�Ƽ��� ������, C ����� �μ�Ƽ��� 0.15)
		ex.
		A����� ���� : 2500
		B����� ���� : 2900
		C����� ���� : 2600
		A��� ����/����+a : 2500/3500.0
		3000 �̻�
		B��� ����/����+a : 2900/2900.0
		3000 �̸�
		C��� ����/����+a : 2600/2989.9999999999995
		3000 �̸� */
        Scanner sc = new Scanner(System.in);

        System.out.print("���A�� ������ �Է��� �ּ��� : ");
		int num1 = sc.nextInt();
		double a = num1 * 0.4;
		double sum1 = num1 + a;
		
		System.out.print("���B�� ������ �Է��� �ּ��� : ");
		int num2 = sc.nextInt();
		double b = num2 * 0;
		double sum2 = num2 + b;
	
		System.out.print("���C�� �������Է��� �ּ��� : ");
		int num3 = sc.nextInt();
		//double c = num3 * 0.15;
		//double sum3 = num3 + c;
		double sum3 = num3 * 1.15; // 150%�� ���ָ� �Ҽ��� �Ʒ��� ����
				
		System.out.println("���A�� ���� : " + num1);
		System.out.println("���B�� ���� : " + num2);
		System.out.println("���C�� ���� : " + num3);		
		System.out.println("���A�� ����/����+a : " + num1 + "/"+ sum1);
		System.out.println(sum1 >= 3000 ? "3000�̻�" : "3000�̸�");
		System.out.println("���B�� ����/����+a : " + num2 + "/"+ sum2);
		System.out.println(sum2 >= 3000 ? "3000�̻�" : "3000�̸�");
		System.out.println("���C�� ����/����+a : " + num3 + "/"+ sum3);
		System.out.println(sum3 >= 3000 ? "3000�̻�" : "3000�̸�");
		
	}
}
