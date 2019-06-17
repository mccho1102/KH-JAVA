package com.kh.chap01_list.part03.model.sort;

import java.util.Comparator;

import com.kh.chap01_list.part03.model.vo.Music;

public class DescArtist implements Comparator<Music>{

	@Override
	public int compare(Music o1, Music o2) {
		// ���ϴ� ���� ���� �ۼ�
		//->������ ��������
		
		return o2.getArtist().compareTo(o1.getArtist());
	}

}
