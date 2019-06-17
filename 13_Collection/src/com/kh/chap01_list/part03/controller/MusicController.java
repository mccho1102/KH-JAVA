package com.kh.chap01_list.part03.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.chap01_list.part03.model.sort.AscTitle;
import com.kh.chap01_list.part03.model.sort.DescArtist;
import com.kh.chap01_list.part03.model.sort.DescTitle;
import com.kh.chap01_list.part03.model.vo.Music;

public class MusicController {
	
	//Music 전체를 관리할 ArrayList 생성
	private ArrayList<Music> list = new ArrayList<Music>();
	
	{
		//초기화 블럭을 이용하여 샘플데이터 추가
		list.add(new Music("벌써 12시","청하"));
		list.add(new Music("fancy","twice"));
		list.add(new Music("모든날,모든순간","폴킴"));
		list.add(new Music("Good Bye","박효신"));
		
		
		
	}
	
	
	//view에서 전달 받은 타이틀 아티스트를 이용하여 Music개체를 생성 하고 list에 저장
	public int addMusic(String title,String artist) {
		
		Music m = new Music(title, artist);
		
		if(m == null) {
			//Music개체가 정상적으로 생성되지 않은 경우
			return -1;
		}else {
			
			//정상 처리가 된 경우
			list.add(m);
		
		
			return 1;
		}
		
	}

	//호출시 곡정보 list 반환
	public ArrayList<Music> selectMusic() {
		
		return list;
		
	}
	
	//호출 시 전달받은 제목의 곡명 삭제 후 삭제 결과 반환
	public int removeMusic(String title) {
		
		//list.remove(index);
		
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				//현재 접근한 리스트 내부 Music 객체의 제목이
				//전달받은 title 값과 같은 경우
				// --> 입력한 곡이 리스트 내부에 존재하는 경우
				list.remove(i);
				return 1;
			}
		}
		return -1;
	}
	

	//전달 받은 키워드 검색 후 모든 검색 결과 반환
	public ArrayList<Music> searchMusic(String keyword) {
		
		ArrayList<Music> temp = new ArrayList<Music>();
		for(int i = 0; i<list.size(); i++) {
			
			if(list.get(i).getTitle().contains(keyword)) {
				temp.add(list.get(i));
			}
		}
		
		return temp;
	}

	public int updateMusic(String title, String updateTitle, String updateArtist) {
		
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				/*
				list.set(i, new Music(updateTitle,updateArtist));
				return 1;
				*/
				list.get(i).setTitle(updateTitle);
				list.get(i).setArtist(updateArtist);
				return 1;
			}
		}
		
		return -1;
	}
	
	public ArrayList<Music> sortMusic(int menu) {
	
		switch(menu) {
		case 1 : Collections.sort(list); break;
						//기본 정렬 기준인 가수명 오름차순으로 정렬
		case 2 : Collections.sort(list, new DescArtist()); break;
		case 3 : Collections.sort(list, new AscTitle()); break;
		case 4 : Collections.sort(list, new DescTitle()); break;
		default : return null;
		}
		
		return list;
	}
	
	
}
