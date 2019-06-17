package com.kh.chap01_list.part03.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01_list.part03.controller.MusicController;
import com.kh.chap01_list.part03.model.vo.Music;



//Collection
//List,Set,Map 3개의 인터페이스로 이루어짐.
//List,set 공통점이 존재
// - > 공통점을 추상화 통해서 Collection 인터페이스를 만들어 상속
//Map도 컬렉션의 일종이지만 구조적 차이로 인해 별도로 선언됨.

//List,Set vs Map
//차이점 :  데이터 보관 방식에 차이가 있음.
//List,set : 객체(인스턴스) 저장
//Map : Key, value  쌍 형태로 저장
//          (key는 별도의 객체를 생성해서 지정
//				Value는 실제 저장할 객체를 지정)

//List 특징
// 순서를 유지함. (index를 부여하여 순서 유지)
// --> index를 이용하여 데이터 접근 가능
// 중복값이 허용됨.
// --> 중복값이 저장되어도 index로 구분이 되기 때문에 가능


// MVC(Model - View  - Controller) 구조
/*
 * 	소프트웨어 디자인 패턴 
 * 
 * 
 * Model : 데이터 처리 부분 (비즈니스 로직),
 * 				데이터의 구조(vo),데이터 입/출력(dao)등의 클래스 포함.
 * 
 * View : 	사용자(클라이언트)에게 표시되어지는 화면 부분.
 * 			사용자에게 기능을 요청받고, Back-End에서 처리된 응답 결과를 보여줌.
 * 
 * Controller : 클라이언트 요청을 실제 수행할  Model을 호출하고
 * 					처리 결과에 따라 알맞은 view에 전달 하는 부분.
 * 					Model 호출 시 전달할 데이터가 존재하면
 * 					요청에 알맞는 형태로 가공해서 Model에 전달.
 * 
 * MVC의 장점
 * 
 * 	화면(View)과 로직 처리부분(Model,View)이 분리되어
 * 	서로 영향없이 수정이 가능함.
 * 	--> 디자이너,퍼블리셔,개발자들의 협업이 편리해짐
 */


public class MusicMenu {
	
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	
	// 메인 메뉴 : 프로그램 실행 시 처음 보여지는 화면
	public void mainMenu() {
		
		while(true) {
			System.out.println("== Welcome 별밤 ==");
			System.out.println("1. 곡 추가");
			System.out.println("2. 곡 전체 조회");
			System.out.println("3. 특정 곡 검색");
			System.out.println("4. 특정 곡 삭제");
			System.out.println("5. 특정 곡 수정");
			System.out.println("6. 곡 정렬하기");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: addMusic(); break;
			case 2: selectMusic(); break;
			case 3: searchMusic(); break;
			case 4: removeMusic(); break;
			case 5: updateMusic(); break;
			case 6: sortMusic(); break;
			case 0: System.out.println("프로그램 종료하기"); return;
			default: System.out.println("잘못 입력하였습니다.");
			}
		}
		
		
	}


	
	/**
	 * 1. 곡 추가용 view 메소드
	 *  - 제목 입력
	 *  - 가수 입력
	 */
	private void addMusic() {
		
		System.out.println("==== 곡 추가 ====");
		System.out.print("제목 입력 : ");
		String title = sc.nextLine();
		System.out.print("가수 입력 : ");
		String artist = sc.nextLine();
		
		//입력받은 제목, 가수를 MusicController에 전달 후 
		//ArrayList에 저장
		if(mc.addMusic(title,artist) == 1) {
			//정상 처리된 경우
			System.out.println("곡 정보가 추가되었습니다.");
		}
		
	}
	
	/**
	 * 2. 곡 전체 조회용 view 메소드
	 */
	private void selectMusic() {
		
		
		ArrayList<Music> list= mc.selectMusic();
		
		if(list.isEmpty()) {
			System.out.println("저장된 곡이 없습니다");
		}else {
				/*
				for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));
				*/
			
				
			//향상된 for문 (for-each)문
				for(Music m : list) {
					
					System.out.println(m);
			}
	
		}

	}


	
	/**
	 * 3. 곡 제거용 view 메소드
	 *    - 삭제할 곡명 입력 시 삭제 
	 */
	private void removeMusic() {
		
		System.out.println("=== 곡 삭제 ===");
		System.out.print("삭제할 곡명 : ");
		String title = sc.nextLine();
		
		//MusicController에 removeMusic 메소드 호출하여
		//삭제할 곡명을 전달 후 정상 처리된 경우 삭제성공, 아닌경우 곡 없음 출력
		
		int result = mc.removeMusic(title);
		
		if(result==-1) {
			System.out.println("삭제할 곡을 찾을 수 없습니다.");
		}else {
			System.out.println(title +"을(를) 성공적으로 삭제 했습니다.");
		}
		
		
	
	}

	
	/**
	 * 4. 곡 검색용 view 메소드
	 *  - 검색할 곡 제목과 관련된 키워드 입력
	 */
	private void searchMusic() {
		
		System.out.println("=== 곡 검색 ===");
		System.out.print("검색할 곡 키워드 : ");
		String keyword = sc.nextLine();
		
		//MusicController에 searchMusic 메소드를 호출하여
		//Keyword 전달 후 해당 keyword를 포함하는 
		//모든 곡명 반환
		ArrayList<Music> searchList= mc.searchMusic(keyword);
		
		if(searchList.isEmpty()) {
			System.out.println("검색한 곡이 없습니다.");
		}else {
			for(Music m : searchList) {
				System.out.println(m);
			}
				
		}
		
	}

	/**
	 * 5. 곡 수정용 view 메소드
	 * - 수정 할 곡명을 입력 후 곡명, 가수명 수정
	 */
	private void updateMusic() {
		
		System.out.println("==== 곡 수정 ====");
		System.out.print("수정할 곡명 : ");
		String title = sc.nextLine();
		
		System.out.print("수정 내용(곡명) : ");
		String updateTitle = sc.nextLine();
		System.out.print("수정 내용(가수) : ");
		String updateArtist = sc.nextLine();
		
		//MusicController에  updateMusic 메소드 호출시
		//수정할 곡명, 수정내용을 updateMusic 메소드에 전달하여
		//결과를 반환받음.
		int result = mc.updateMusic(title,updateTitle,updateArtist);
		if( result==1) {
			System.out.println("곡이 수정되었습니다");
		}else {
			System.out.println("곡이 없습니다.");
		}
		
	}
	
	
	
	/**
	 * 6. 저장된 곡 정렬용 view 메소드
	 *  - 곡이 저장된 리스트를 선택한 정렬모양으로 정렬 
	 *  - 가수명 오름/내림차순 , 곡명 오름/내림차순
	 */
	public void sortMusic() {
		
		// Collections.sort();  : 컬렉션 객체 정렬에 사용
		
		/* 컬렉션 객체 정렬 시
		 * 해당 컬렉션에 사용되는 객체에 정렬기준이 선언되어 있어야 함.
		 * 
		 * Comparable 인터페이스
		 *  :  기본 정렬 기준을 구현하는데 사용
		 * 1)정렬 하려는 vo클래스에 Comparable 인터페이스 상속
		 * 2)public int compareTo(Object o) 메소드 오버라이딩
		 * 	--> 내부에 정렬 기준 작성
		 * 3)Collection.sort(List명);  호출
		 * 	--> 해당 List가 기준에 맞춰 정렬됨
		 * 
		 * 
		 * Comparator 인터페이스
		 * :  기본 정렬 기준 이외의 정렬을 구현하고자 할 때 사용
		 * 1)별도의 vo클래스를 생성하여
		 * 	Comparator 인터페이스 상속
		 * 2)public int compare(Object o1,Object o2) 오버라이딩
		 * --> 내부에 정렬 기준 작성
		 * 3)Collections.sort(List명, 정렬기준클래스); 호출
		 * 
		 *  
		 *  
		 */
		
		System.out.println("== 곡 정렬 ==");
		System.out.println("1. 가수명 오름차순");
		System.out.println("2. 가수명 내림차순");
		System.out.println("3. 곡명 오름차순");
		System.out.println("4. 곡명 내림차순");
		System.out.print("메뉴 : ");
		int menu = sc.nextInt();
		
		ArrayList<Music> sortList = mc.sortMusic(menu);
		
		
		if(sortList == null) {
			System.out.println("번호를 잘못 입력하셨습니다.");
		}else {
			for(Music m : sortList) {
				System.out.println(m);
			}
		}
		
		
		
	
	}

}
