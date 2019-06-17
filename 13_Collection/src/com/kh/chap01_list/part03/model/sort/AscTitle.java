package com.kh.chap01_list.part03.model.sort;

import java.util.Comparator;

import com.kh.chap01_list.part03.model.vo.Music;

public class AscTitle implements Comparator<Music>{

	@Override
	public int compare(Music o1, Music o2) {
		// TODO Auto-generated method stub
		return o1.getTitle().compareTo(o2.getTitle());
	}

}
