package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	/* �޼ҵ� �� : public void practice1(){}
		�Ʒ� ���ÿ� ���� �޴��� ����ϰ� �޴� ��ȣ�� ������ ��OO�޴��Դϴ١���,
		���� ��ȣ�� ������ �����α׷��� ����˴ϴ�.���� ����ϼ���.
		ex.
		1. �Է�
		2. ����
		3. ��ȸ
		4. ����
		7. ����
		�޴� ��ȣ�� �Է��ϼ��� : 3
		��ȸ �޴��Դϴ�.
	 */
	public void practice1() {
		
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("7. ����");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�޴� ��ȣ�� �Է��ϼ���.");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : System.out.println("�Է� �޴��Դϴ�."); break;
		case 2 : System.out.println("���� �޴��Դϴ�."); break;
		case 3 : System.out.println("��ȸ �޴��Դϴ�."); break;
		case 4 : System.out.println("���� �޴��Դϴ�."); break;
		case 7 : System.out.println("���α׷��� ����˴ϴ�."); break;
		default : System.out.println("��! �� �߸��������ϴ�.");
		}
	}
	/*
	�޼ҵ� �� : public void practice2(){}
	Ű����� ������ �Է� ���� ������ ����̸鼭 ¦���� ���� ��¦���١��� ����ϰ�
	¦���� �ƴϸ� ��Ȧ���١��� ����ϼ���.
	����� �ƴϸ� ������� �Է����ּ���.���� ����ϼ���.
	ex.
	���ڸ� �� �� �Է��ϼ���
    */
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �� �� �Է��ϼ���");
		int num = sc.nextInt();
		
		if(num > 0) {
			if(num % 2 == 0) {
			   System.out.print("¦����");
			}else {
				    System.out.print("Ȧ����");
				   }
		}else {
			    System.out.print("����� �Է����ּ���");
		}

	}
	/*
	 * �޼ҵ� �� : public void practice3(){}
		����, ����, ���� �� ������ ������ Ű����� �Է� �ް� �հ�� ����� ����ϰ�
		�հ�� ����� �̿��Ͽ� �հ� / ���հ� ó���ϴ� ����� �����ϼ���.
		(�հ� ���� : �� ������ ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��� ���)
		�հ� ���� ��� ���� �� ������ �հ�, ���, �������մϴ�, �հ��Դϴ�!���� ����ϰ�
		���հ��� ��쿡�� �����հ��Դϴ�.���� ����ϼ���.
		[��� ���ô� ���� �忡]
		���� : 88
		���� : 50
		���� : 45
		�հ� : 183
		��� : 61.0
		�����մϴ�, �հ��Դϴ�!
	 */
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���������� �Է����ּ��� : ");
		int kor = sc.nextInt();
		System.out.print("���������� �Է����ּ��� : ");
		int math = sc.nextInt();
		System.out.print("���������� �Է����ּ��� : ");
		int eng = sc.nextInt();
		int tot = kor + eng + math;
		double avr = tot / 3;
		
		if(avr > 60 && kor > 40 && eng > 40 && math > 40) {
			System.out.println("���� : " + kor);
			System.out.println("���� : " + math);
			System.out.println("���� : " + eng);
			System.out.println("�հ� : " + tot);
			System.out.println("��� : " + avr);
			System.out.println("�����մϴ�, �հ��Դϴ�!");
		}else {
			System.out.println("�̾��մϴ�, ���հ��Դϴ�!");
		}
		
	}
	/*
	 * �޼ҵ� �� : public void practice4(){}
		���� �ڷ�(7page)���� if������ �Ǿ��ִ� ��, ����, ����, �ܿ� ������ switch������ �ٲ㼭 ����ϼ���.
		ex 1.
		1~12 ������ ���� �Է� : 8
		8���� �����Դϴ�.
		ex 2.
		1~12 ������ ���� �Է� : 99
		99���� �߸� �Էµ� ���Դϴ�.
	 */
    public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϴ� ���� �־� �ּ���");
		int month = sc.nextInt();
		String season = "";
		
		switch(month) {
		case 1 : System.out.println("�ܿ�"); break;
		case 2 : System.out.println("�ܿ�"); break;
		case 3 : System.out.println("��"); break;
		case 4 : System.out.println("��"); break;
		case 5 : System.out.println("��"); break;
		case 6 : System.out.println("����"); break;
		case 7 : System.out.println("����"); break;
		case 8 : System.out.println("����"); break;
		case 9 : System.out.println("����"); break;
		case 10 : System.out.println("����"); break;
		case 11 : System.out.println("����"); break;
		case 12 : System.out.println("�ܿ�"); break;
		default : System.out.println("�߸� �Էµ� ���Դϴ�..");
		}
		
	}
	/*
	 * �޼ҵ� �� : public void practice5(){}
		���̵�, ��й�ȣ�� ���صΰ� �α��� ����� �ۼ��ϼ���.
		�α��� ���� �� ���α��� ������,
		���̵� Ʋ���� �� �����̵� Ʋ�Ƚ��ϴ�.��,
		��й�ȣ�� Ʋ���� �� ����й�ȣ�� Ʋ�Ƚ��ϴ�.���� ����ϼ���.
		ex 1. ex 2. ex 3.
		���̵� : myId ���̵� : myId ���̵� : my
		��й�ȣ : myPassword12 ��й�ȣ : myPassword ��й�ȣ : myPassword12
		�α��� ���� ��й�ȣ�� Ʋ�Ƚ��ϴ�. ���̵� Ʋ�Ƚ��ϴ�.
	 */
	public void practice5() {
        String sid = "myId";
        String spw = "myPassword12";
        
		Scanner sc = new Scanner(System.in);
		System.out.print("ID�� �Է����ּ���");
		String id = sc.nextLine();
		
		System.out.print("PW�� �Է����ּ���");
		String pw = sc.nextLine();
		
		if(id.equals(sid)) {
			if(pw.equals(spw)) {
			   System.out.println("�α��� ���� !!");
			}else if(!pw.equals(spw)){
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			}
		}else {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}
	}
	/*�޼ҵ� �� : public void practice6(){}
	����ڿ��� ������, ȸ��, ��ȸ�� �� �ϳ��� �Է� �޾� �� ����� ���� �� �ִ� ������ ����ϼ���.
	��, �����ڴ� ȸ������, �Խñ� ����, �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ��� �����ϰ�
	ȸ���� �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ��� �����ϰ�
	��ȸ���� �Խñ� ��ȸ�� �����մϴ�.
	ex.
	������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ������
	ȸ������, �Խñ� ���� �Խñ� �ۼ�, ��� �ۼ� �Խñ� ��ȸ
	*/
	public void practice6() {
		// ��޺� ���� �ο��ϱ�
		
				Scanner sc = new Scanner(System.in);
				
				System.out.print("��� ���ڷ� �Է��ϼ���(������1,ȸ��2,��ȸ��3): ");
				int level = sc.nextInt();
				
				// level 1 : ����, ����, �б�
				// level 2 :       ����, �б�
				// level 3 :            �б�
				
				switch(level) {
				case 1 : System.out.print("ȸ������, �Խñ� ����, �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�"); break;
				case 2 : System.out.print("�Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�"); break;
				case 3 : System.out.print("�Խñ� ��ȸ"); break;
				default : System.out.print("�߸� �Է��ϼ̽��ϴ�.");
				}
			
	}
	/*
	�޼ҵ� �� : public void practice7(){}
	Ű, �����Ը� double�� �Է� �ް� BMI������ ����Ͽ� ��� ����� ����
	��ü��/����ü��/��ü��/���� ����ϼ���.
	BMI = ������ / (Ű(m) * Ű(m))
	BMI�� 18.5�̸��� ��� ��ü�� / 18.5�̻� 23�̸��� ��� ����ü��
	BMI�� 23�̻� 25�̸��� ��� ��ü�� / 25�̻� 30�̸��� ��� ��
	BMI�� 30�̻��� ��� �� ��
	ex.
	Ű(m)�� �Է��� �ּ��� : 1.65
	������(kg)�� �Է��� �ּ��� : 58.4
	BMI ���� : 21.45087235996327
	����ü�� */
	public void practice7(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Ű�� �Է��ϼ��� (ex)172->1.72): ");
		double het = sc.nextDouble();
		System.out.print("�����Ը� �Է��ϼ��� : ");
		double wet = sc.nextDouble();
		double bmi = wet / (het *het);
		
		if(bmi > 30) {
			System.out.print("����");
		}else if(bmi >= 25 && bmi < 30) {
			System.out.print("��");
		}else if(bmi >= 23 && bmi < 25) {
			System.out.print("��");
		}else if(bmi >= 18.5 && bmi < 23) {
			System.out.print("��");
		}else if(bmi < 18.5) {
			System.out.print("��");
		}		
		
	}
	/*
	 * �޼ҵ� �� : public void practice8(){}
		Ű����� �� ���� ������ ���� ��ȣ�� �Է� �޾� ���� ��ȣ�� ���� ���� ����� ����ϼ���.
		(��, �� ���� ���� ��� ����� ���� �۵��ϸ� ���� ���� ��ȣ�� �Է� ���� ��
		���߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.�� ���)
		ex.
		�ǿ�����1 �Է� : 15
		�ǿ�����2 �Է� : 4
		�����ڸ� �Է�(+,-,*,/,%) : /
		15 / 4 = 3.750000
	 */
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����1�� �Է��ϼ���: ");
		int num1 = sc.nextInt();
		System.out.print("����2�� �Է��ϼ��� : ");
		int num2 = sc.nextInt();
	    sc.nextLine();
	    if(num1<0 || num2<0) {
	    	System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
	    	
	    }else {
	    
	    		System.out.print("�����ڸ� �Է�(+,-,*,/,%) �Է��ϼ���: ");
	    		char op = sc.nextLine().charAt(0);
		        			
	    		switch(op) {
	    		case('+'):System.out.println(num1 + "+" + num2 + "=" + (num1+num2));break;
	    		case('-'):System.out.println(num1 + "-" + num2 + "=" + (num1-num2));break;
	    		case('*'):System.out.println(num1 + "*" + num2 + "=" + (num1*num2));break;
	    		case('/'):System.out.println(num1 + "/" + num2 + "=" + ((double)num1/num2));break;
	    		case('%'):System.out.println(num1 + "%" + num2 + "=" + (num1%num2));break;
	    		default:System.out.println("�߸��� �����ڸ� �Է��Ͽ����ϴ�.���α׷��� �����մϴ�.");break;
	    		} 
	    		/* �ٸ� ��� : 
	    		     double result = 0; //�������� ������ ���� 
	    		     boolean check = true; // �ùٸ� ���������� �Ǵ��� ����
	    		     switch(op) {
	    		     case('+'): result = num1 + num2; break;
	    		     ....
	    		     default:System.out.println("�߸��� �����ڸ� �Է��Ͽ����ϴ�.���α׷��� �����մϴ�.");
	    		             check = false;
	    		     }
	    		     if(check){  
	    		     System.out.printf("%d %s %d = %f\n", num1, op, num2, result);
	    		     } 
	    	   */
	    }		

	}
	/*
	 * �޼ҵ� �� : public void practice9(){}
		�߰����, �⸻���, ��������, �⼮ȸ���� �Է��ϰ�
		Pass �Ǵ� Fail�� ����ϼ���.
		�� ������ �߰���� 20%, �⸻��� 30%, ���� 30%, �⼮ 20%�� �̷���� �ְ�
		�� ��, �⼮ ������ �⼮ ȸ���� �� ���� ȸ�� 20ȸ �߿��� �⼮�� ���� ���� ������ ����ϼ���.
		70�� �̻��� ��� Pass, 70�� �̸��̰ų� ��ü ���ǿ� 30% �̻� �Ἦ �� Fail�� ����ϼ���.
[��� ���ô� ���� 3�� ����]
	 */
	public void practice9(){
		Scanner sc = new Scanner(System.in);
		System.out.print("�߰���縦 �Է��ϼ���: ");
		int mid = sc.nextInt();
		System.out.print("�⸻��縦 �Է��ϼ��� : ");
		int fin = sc.nextInt();
		System.out.print("������ �Է��ϼ���: ");
		int hw = sc.nextInt();
		System.out.print("�⼮ȸ���� �Է��ϼ��� : ");
		int att = sc.nextInt();
		
	    sc.nextLine();
	    
	    double mid_rt = mid * 0.2;
	    double fin_rt = fin * 0.3;
	    double hw_rt = hw * 0.3;
	    double att_rt = att * 5 * 0.2;
	    
	    double sum = mid_rt + fin_rt + hw_rt + att_rt; // ����
	    
	    System.out.println("===============���=============");
	    if(att > 20 * 0.7) { // �⼮ pass�� ���
	    	System.out.println("�߰��������(20) : " + mid_rt);
	    	System.out.println("�⸻�������(30) : " + fin_rt);
	    	System.out.println("��������      (30) : " + hw_rt);
	    	System.out.println("�⼮����      (20) : " + att_rt);
	    	System.out.println("���� : " + sum);
	    	
	    	if(sum >= 70) { // ����pass --> ���� pass �ο�
	    		System.out.println("PASS");
	    	}else { // �����̴޷� Fail
	    		System.out.println("Fail[�����̴�]");
	    	}
	    	
	    	
	    	
	    }else { // �⼮ fail�� ���
	        System.out.println("Fail[�⼮Ƚ�� ����("+ att + "/20]");
	    }
	    
	    
	  
	}
	
}
