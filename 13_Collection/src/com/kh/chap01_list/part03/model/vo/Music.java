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
		//�⺻ ���� ���� �ۼ�
		// -> ������ ��������
		//Ʈ���̽�,������,��Ŵ
		// - > Ʈ���̽�, ��Ŵ, ������
		
		//"���ڿ�1".compareTo("���ڿ�2")
		//���ڿ�1�� ���ڿ�2�� ���ؼ�
		//�� ���ڿ��� ������������ ����
		//"bbb".comparTo("aaa");
		// aaa,bbb
		
		return this.artist.compareTo(o.getArtist());
		
	}
	
	

}
