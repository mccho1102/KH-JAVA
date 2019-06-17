package com.kh.chap01_list.part02.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part02.model.vo.Music;

public class Run {
	public static void main(String[] args) {
		//Arraylist 사용법
		//컬렉션은 어떤 타입의 객체도 저장 가능
		ArrayList exList = new ArrayList();
		
		
		exList.add(new Music());
		exList.add("asd");
		exList.add(1);  //int-> Integer :  Auto boxing 
		
		//어떤 타입이든 저장시 
		//꺼내 쓸 때 타입검사를 해야된다는 문제점이 발생
		
		//이를 해결하기 위해서
		//컬렉션에 저장하는 객체의 타입을 애초에 제한하는 기술이 생김
		
		/* 제네릭스(Generics) (<>)
		 * - 클래스, 메소드, 컬렉션 내부에서 사용되는 타입을
		 *   한 종류의 타입으로 제한하는 기능.
		 *   
		 * - 컬렉션에 여러 타입이 저장될 경우
		 *   -> 내부 데이터 사용 시 마다 타입체크, 형변환 필요
		 *   
		 * - 제네릭스로 타입 제한 시 
		 * 	-> 내부 데이터가 한 가지 타입이므로
		 * 		별도의 타입체크, 형변환이 필요 없음. -> 편안~ 
		 * 
		 *  * 제네릭스 사용 이점 :  타입체크
		 *  									-> 컴파일 단계에서 강력하게 체크함
		 *  
		 *  --> 이클립스는 코드 작성 시 그 자리에서 간단히 컴파일을 진행함
		 *    --> 제네릭스가 적용된 컬렉션에 다른 타입 저장 시 
		 *          바로 에러 출력!
		 * 
		 * 
		 */
		
		//다형성
		List<Music> list = new ArrayList<Music>(3);
		//Music 객체만 저장할 수 있는 ArrayList 3칸짜리 생성
		
		
		
		//리스트 내부 내용 조회
		System.out.println(list.toString());
		
		//1. add(E e) : 리스트의 끝부분에 인스턴스 데이터를 추가
		
		list.add(new Music("정류장","장범준"));
		list.add(new Music("소주한잔","임창정"));
		list.add(new Music("봄비","하현우"));
		//초기설정 크기 3초과시 알아서 ArrayList 크기 증가됨
		
		//add 결과 출력
		
		//2. add(int index, E e)
		
		list.add(2, new Music("노래방에서","장범준"));
		
		System.out.println(list);
		
		//3. set(int index , E e)
		//해당 인덱스의 객체를 변경
		
		list.set(1, new Music("술이 달다","에픽하이"));
		
		System.out.println(list);
		
		//4. remove(int index, E e)
		
		list.remove(1);
		
		System.out.println(list);
		
		//5. size() :  리스트 내부에 저장되어있는 객체 개수 반환
		System.out.println(list.size());
		
		//6. get(int index) : 해당 인덱스의 객체를 얻어옴
		System.out.println(list.get(2));
		
		//7. subList(int index1,int index2) : 리스트 부분 추출
		System.out.println(list.subList(0,2));
		
		//기존 리스트 잘라서 별도 리스트 사용가능
		List<Music> sub = list.subList(0,2);
		
		//8.addAll(Collection c) : 컬렉션을 뒤쪽에 통째로 추가
		list.addAll(sub);
		System.out.println(list);
		
		//9.isEmpty() :  컬렉션이 비어있는지 확인하는 메소드
		//비어있음 true 비어있지 않으면 false
		System.out.println(list.isEmpty());
		
		//10. clear() : 컬렉션을 깨끗히 비워버림
		list.clear();
		System.out.println(list.isEmpty());
		System.out.println(list);

	}

}
