package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	/* 메소드 명 : public void practice1(){}
		아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를,
		종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요.
		ex.
		1. 입력
		2. 수정
		3. 조회
		4. 삭제
		7. 종료
		메뉴 번호를 입력하세요 : 3
		조회 메뉴입니다.
	 */
	public void practice1() {
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴 번호를 입력하세요.");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : System.out.println("입력 메뉴입니다."); break;
		case 2 : System.out.println("수정 메뉴입니다."); break;
		case 3 : System.out.println("조회 메뉴입니다."); break;
		case 4 : System.out.println("삭제 메뉴입니다."); break;
		case 7 : System.out.println("프로그램이 종료됩니다."); break;
		default : System.out.println("오! 노 잘못눌렀습니다.");
		}
	}
	/*
	메소드 명 : public void practice2(){}
	키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고
	짝수가 아니면 “홀수다“를 출력하세요.
	양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
	ex.
	숫자를 한 개 입력하세요
    */
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요");
		int num = sc.nextInt();
		
		if(num > 0) {
			if(num % 2 == 0) {
			   System.out.print("짝수다");
			}else {
				    System.out.print("홀수다");
				   }
		}else {
			    System.out.print("양수만 입력해주세요");
		}

	}
	/*
	 * 메소드 명 : public void practice3(){}
		국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
		합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
		(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
		합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
		불합격인 경우에는 “불합격입니다.”를 출력하세요.
		[출력 예시는 다음 장에]
		국어 : 88
		수학 : 50
		영어 : 45
		합계 : 183
		평균 : 61.0
		축하합니다, 합격입니다!
	 */
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수를 입력해주세요 : ");
		int kor = sc.nextInt();
		System.out.print("수학점수를 입력해주세요 : ");
		int math = sc.nextInt();
		System.out.print("영어점수를 입력해주세요 : ");
		int eng = sc.nextInt();
		int tot = kor + eng + math;
		double avr = tot / 3;
		
		if(avr > 60 && kor > 40 && eng > 40 && math > 40) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + tot);
			System.out.println("평균 : " + avr);
			System.out.println("축하합니다, 합격입니다!");
		}else {
			System.out.println("미안합니다, 불합격입니다!");
		}
		
	}
	/*
	 * 메소드 명 : public void practice4(){}
		수업 자료(7page)에서 if문으로 되어있는 봄, 여름, 가을, 겨울 예제를 switch문으로 바꿔서 출력하세요.
		ex 1.
		1~12 사이의 정수 입력 : 8
		8월은 여름입니다.
		ex 2.
		1~12 사이의 정수 입력 : 99
		99월은 잘못 입력된 달입니다.
	 */
    public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 월을 넣어 주세요");
		int month = sc.nextInt();
		String season = "";
		
		switch(month) {
		case 1 : System.out.println("겨울"); break;
		case 2 : System.out.println("겨울"); break;
		case 3 : System.out.println("봄"); break;
		case 4 : System.out.println("봄"); break;
		case 5 : System.out.println("봄"); break;
		case 6 : System.out.println("여름"); break;
		case 7 : System.out.println("여름"); break;
		case 8 : System.out.println("여름"); break;
		case 9 : System.out.println("가을"); break;
		case 10 : System.out.println("가을"); break;
		case 11 : System.out.println("가을"); break;
		case 12 : System.out.println("겨울"); break;
		default : System.out.println("잘못 입력된 달입니다..");
		}
		
	}
	/*
	 * 메소드 명 : public void practice5(){}
		아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
		로그인 성공 시 “로그인 성공”,
		아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
		비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요.
		ex 1. ex 2. ex 3.
		아이디 : myId 아이디 : myId 아이디 : my
		비밀번호 : myPassword12 비밀번호 : myPassword 비밀번호 : myPassword12
		로그인 성공 비밀번호가 틀렸습니다. 아이디가 틀렸습니다.
	 */
	public void practice5() {
        String sid = "myId";
        String spw = "myPassword12";
        
		Scanner sc = new Scanner(System.in);
		System.out.print("ID를 입력해주세요");
		String id = sc.nextLine();
		
		System.out.print("PW를 입력해주세요");
		String pw = sc.nextLine();
		
		if(id.equals(sid)) {
			if(pw.equals(spw)) {
			   System.out.println("로그인 성공 !!");
			}else if(!pw.equals(spw)){
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}else {
			System.out.println("아이디가 틀렸습니다.");
		}
	}
	/*메소드 명 : public void practice6(){}
	사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요.
	단, 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
	회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
	비회원은 게시글 조회만 가능합니다.
	ex.
	권한을 확인하고자 하는 회원 등급 : 관리자
	회원관리, 게시글 관리 게시글 작성, 댓글 작성 게시글 조회
	*/
	public void practice6() {
		// 등급별 권한 부여하기
		
				Scanner sc = new Scanner(System.in);
				
				System.out.print("등급 숫자로 입력하세요(관리자1,회원2,비회원3): ");
				int level = sc.nextInt();
				
				// level 1 : 관리, 쓰기, 읽기
				// level 2 :       쓰기, 읽기
				// level 3 :            읽기
				
				switch(level) {
				case 1 : System.out.print("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성"); break;
				case 2 : System.out.print("게시글 작성, 게시글 조회, 댓글 작성"); break;
				case 3 : System.out.print("게시글 조회"); break;
				default : System.out.print("잘못 입력하셨습니다.");
				}
			
	}
	/*
	메소드 명 : public void practice7(){}
	키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
	저체중/정상체중/과체중/비만을 출력하세요.
	BMI = 몸무게 / (키(m) * 키(m))
	BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
	BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
	BMI가 30이상일 경우 고도 비만
	ex.
	키(m)를 입력해 주세요 : 1.65
	몸무게(kg)를 입력해 주세요 : 58.4
	BMI 지수 : 21.45087235996327
	정상체중 */
	public void practice7(){
		Scanner sc = new Scanner(System.in);
		System.out.print("키를 입력하세요 (ex)172->1.72): ");
		double het = sc.nextDouble();
		System.out.print("몸무게를 입력하세요 : ");
		double wet = sc.nextDouble();
		double bmi = wet / (het *het);
		
		if(bmi > 30) {
			System.out.print("고도비만");
		}else if(bmi >= 25 && bmi < 30) {
			System.out.print("비만");
		}else if(bmi >= 23 && bmi < 25) {
			System.out.print("비만");
		}else if(bmi >= 18.5 && bmi < 23) {
			System.out.print("비만");
		}else if(bmi < 18.5) {
			System.out.print("비만");
		}		
		
	}
	/*
	 * 메소드 명 : public void practice8(){}
		키보드로 두 개의 정수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요.
		(단, 두 개의 정수 모두 양수일 때만 작동하며 없는 연산 기호를 입력 했을 시
		“잘못 입력하셨습니다. 프로그램을 종료합니다.” 출력)
		ex.
		피연산자1 입력 : 15
		피연산자2 입력 : 4
		연산자를 입력(+,-,*,/,%) : /
		15 / 4 = 3.750000
	 */
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1을 입력하세요: ");
		int num1 = sc.nextInt();
		System.out.print("정수2를 입력하세요 : ");
		int num2 = sc.nextInt();
	    sc.nextLine();
	    if(num1<0 || num2<0) {
	    	System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
	    	
	    }else {
	    
	    		System.out.print("연산자를 입력(+,-,*,/,%) 입력하세요: ");
	    		char op = sc.nextLine().charAt(0);
		        			
	    		switch(op) {
	    		case('+'):System.out.println(num1 + "+" + num2 + "=" + (num1+num2));break;
	    		case('-'):System.out.println(num1 + "-" + num2 + "=" + (num1-num2));break;
	    		case('*'):System.out.println(num1 + "*" + num2 + "=" + (num1*num2));break;
	    		case('/'):System.out.println(num1 + "/" + num2 + "=" + ((double)num1/num2));break;
	    		case('%'):System.out.println(num1 + "%" + num2 + "=" + (num1%num2));break;
	    		default:System.out.println("잘못된 연산자를 입력하였습니다.프로그램을 종료합니다.");break;
	    		} 
	    		/* 다른 방법 : 
	    		     double result = 0; //연산결과를 저장할 변수 
	    		     boolean check = true; // 올바른 연산자인지 판단할 변수
	    		     switch(op) {
	    		     case('+'): result = num1 + num2; break;
	    		     ....
	    		     default:System.out.println("잘못된 연산자를 입력하였습니다.프로그램을 종료합니다.");
	    		             check = false;
	    		     }
	    		     if(check){  
	    		     System.out.printf("%d %s %d = %f\n", num1, op, num2, result);
	    		     } 
	    	   */
	    }		

	}
	/*
	 * 메소드 명 : public void practice9(){}
		중간고사, 기말고사, 과제점수, 출석회수를 입력하고
		Pass 또는 Fail을 출력하세요.
		평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
		이 때, 출석 비율은 출석 회수는 총 강의 회수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
		70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.
[출력 예시는 다음 3장 참고]
	 */
	public void practice9(){
		Scanner sc = new Scanner(System.in);
		System.out.print("중간고사를 입력하세요: ");
		int mid = sc.nextInt();
		System.out.print("기말고사를 입력하세요 : ");
		int fin = sc.nextInt();
		System.out.print("과제를 입력하세요: ");
		int hw = sc.nextInt();
		System.out.print("출석회수를 입력하세요 : ");
		int att = sc.nextInt();
		
	    sc.nextLine();
	    
	    double mid_rt = mid * 0.2;
	    double fin_rt = fin * 0.3;
	    double hw_rt = hw * 0.3;
	    double att_rt = att * 5 * 0.2;
	    
	    double sum = mid_rt + fin_rt + hw_rt + att_rt; // 총점
	    
	    System.out.println("===============결과=============");
	    if(att > 20 * 0.7) { // 출석 pass인 경우
	    	System.out.println("중간고사점수(20) : " + mid_rt);
	    	System.out.println("기말고사점수(30) : " + fin_rt);
	    	System.out.println("과제점수      (30) : " + hw_rt);
	    	System.out.println("출석점수      (20) : " + att_rt);
	    	System.out.println("총점 : " + sum);
	    	
	    	if(sum >= 70) { // 점수pass --> 학점 pass 부여
	    		System.out.println("PASS");
	    	}else { // 점수미달로 Fail
	    		System.out.println("Fail[점수미달]");
	    	}
	    	
	    	
	    	
	    }else { // 출석 fail인 경우
	        System.out.println("Fail[출석횟수 부족("+ att + "/20]");
	    }
	    
	    
	  
	}
	
}
