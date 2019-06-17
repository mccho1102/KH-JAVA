package com.kh.chap01_list.part03.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.chap01_list.part03.model.sort.AscTitle;
import com.kh.chap01_list.part03.model.sort.DescArtist;
import com.kh.chap01_list.part03.model.sort.DescTitle;
import com.kh.chap01_list.part03.model.vo.Music;

public class MusicController {
	
	//Music ��ü�� ������ ArrayList ����
	private ArrayList<Music> list = new ArrayList<Music>();
	
	{
		//�ʱ�ȭ ���� �̿��Ͽ� ���õ����� �߰�
		list.add(new Music("���� 12��","û��"));
		list.add(new Music("fancy","twice"));
		list.add(new Music("��糯,������","��Ŵ"));
		list.add(new Music("Good Bye","��ȿ��"));
		
		
		
	}
	
	
	//view���� ���� ���� Ÿ��Ʋ ��Ƽ��Ʈ�� �̿��Ͽ� Music��ü�� ���� �ϰ� list�� ����
	public int addMusic(String title,String artist) {
		
		Music m = new Music(title, artist);
		
		if(m == null) {
			//Music��ü�� ���������� �������� ���� ���
			return -1;
		}else {
			
			//���� ó���� �� ���
			list.add(m);
		
		
			return 1;
		}
		
	}

	//ȣ��� ������ list ��ȯ
	public ArrayList<Music> selectMusic() {
		
		return list;
		
	}
	
	//ȣ�� �� ���޹��� ������ ��� ���� �� ���� ��� ��ȯ
	public int removeMusic(String title) {
		
		//list.remove(index);
		
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				//���� ������ ����Ʈ ���� Music ��ü�� ������
				//���޹��� title ���� ���� ���
				// --> �Է��� ���� ����Ʈ ���ο� �����ϴ� ���
				list.remove(i);
				return 1;
			}
		}
		return -1;
	}
	

	//���� ���� Ű���� �˻� �� ��� �˻� ��� ��ȯ
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
						//�⺻ ���� ������ ������ ������������ ����
		case 2 : Collections.sort(list, new DescArtist()); break;
		case 3 : Collections.sort(list, new AscTitle()); break;
		case 4 : Collections.sort(list, new DescTitle()); break;
		default : return null;
		}
		
		return list;
	}
	
	
}
