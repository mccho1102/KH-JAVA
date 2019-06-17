package com.kh.chap01_poly.example2.controllor;

import com.kh.chap01_poly.example2.model.vo.Desktop;
import com.kh.chap01_poly.example2.model.vo.Electronics;
import com.kh.chap01_poly.example2.model.vo.Notebook;
import com.kh.chap01_poly.example2.model.vo.Tablet;

public class ElectronisController2 {
	// ====== 다형성 적용 후 =====
	
	// 1. 부모 타입 객체배열을 선언 및 할당하여 자식객체를 한번에 관리
	private Electronics[] elecs = new Electronics[3];
	
	public static int elecsIndex = 0;
	// 객체배열에 데이터 추가 시 인덱스 위치를 관리해줄 변수 선언
	// Controller 및 View 에서 공용으로 사용할 수 있도록 static 선언
	
	// 2. 외부에서 생성된 객체의 주소를 전달받아 필드에 대입하는 insert() 메소드 선언
	public void insert(Electronics el) {
		elecs[elecsIndex]= el;
		// 전달 받은 객체를 elecsIndex 인덱스에 저장
		
		elecsIndex++; // 데이터가 추가되면 인덱스 값 1 증가
	}
	
	// 3. 생성된 객체의 정보를 반환하는 메소드 select()선언
	// - 객체배열을 통해 데이터를 관리하므로
	//   조회하려는 인덱스를 매개변수로 전달받기
	public Electronics select(int i) {
		return elecs[i];
		// 이렇게 elecs[i] 반환하면 결과는 어떨까요?
		// elecs[i]의 타입은 Electronics로 부모 타입
		// 1차원적으로 생각하면 반환 받는 곳에서도
		// Electronics의 멤버만 접근이 가능할 것 같지만,
		// (정적 바인딩)
		
		// 실제 프로그램 실행시 
		// 자식이 오버라이딩한 toString()의 정보가 출력됨
		// --> 이것이 동적 바인딩!
	}
	
	// 4. 모든 객체의 정보를 하나의 문자열로 만들어 반환하는 메소드
	// selectAll()선언
	// -동적 바인딩으로 인해 오버라이딩된
	// toString()을 이용하여 하나의 문자열로 만들자
	public String selectAll() {
		String str = "\n*****모든 상품 정보 *****\n";
		for(int i=0; i<elecs.length; i++) {
			str += elecs[i].toString() + "\n";
		}
		return str;
	}
	
	// 5. 전달받은 객체의 타입에 따라 판매 가능 여부를
	// 문자열로 반환하는 sell() 메소드 선언
	// - 전달받은 참조변수의 타입을 검사하는
	// instanceof 연산자를 이용하면
	// 메소드 오버로딩없이 작성 가능
	
	public String sell(Electronics el) {
		if(el instanceof Desktop) {
			return "판매 가능";
		}else if(el instanceof Notebook) {
			return "판매 가능";
		}else if(el instanceof Tablet) {
			return "판매 불가[품절]";
		}
		
		return null;
	}
	
}
