package com.kh.chap03_class.model.vo;

public class Person {
    private String id;
    private String pwd;
    private String name;
    private int age;
    private char gender;
    private String phone;
    private String email;
    
    public Person() { }
    
    public void setId(String id) {
    	this.id = id;
    }
    
    public String getId() {
    	return id;
    }
    
    // 모든 속성 정보를 나타내는 문자열을 반환하는 메서드
    public String information() {
    	return id + " / " + pwd + " / " + name + " / " +
    			" / " + age + " / " + gender + " / " +
    			phone + " / " + email;
    }
}
