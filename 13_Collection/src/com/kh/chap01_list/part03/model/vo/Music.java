package com.kh.chap01_list.part03.model.vo;

public class Music implements Comparable<Music>{
	
	private String title;
	private String artist;
	
	
	public Music() {
		super();
	}
	public Music(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	@Override
	public String toString() {
		return "Music [title=" + title + ", artist=" + artist + "]";
	}

	@Override
	public int compareTo(Music o) {
		//기본 정렬 기준 작성
		// -> 가수명 오름차순
		//트와이스,헤이즈,폴킴
		// - > 트와이스, 폴킴, 헤이즈
		
		//"문자열1".compareTo("문자열2")
		//문자열1과 문자열2를 비교해서
		//두 문자열을 오름차순으로 정렬
		//"bbb".comparTo("aaa");
		// aaa,bbb
		
		return this.artist.compareTo(o.getArtist());
		
	}
	
	

}
