package com.kh.chap06_constructor.model.vo;

public class Book {
	// 加己(鞘靛)
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	
	// 积己磊
	public Book() {
		
	}
	
	public Book(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	
	public Book(String title, String publisher, String author,
			int price,double discountRate) {
		this(title, publisher,author);
		this.price = price;
		this.discountRate = discountRate;
	}

	
	// 皋家靛
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	public void information() {
		System.out.println(
				"title : " + title  + "/" + 
		        "publisher : " + publisher + "/" +  
			    "author : " + author + "/" + 
				"price : " + price + "/" +  
			    "discountRate : " + discountRate) ;
	}
	
	
}
