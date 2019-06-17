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
    
    // ��� �Ӽ� ������ ��Ÿ���� ���ڿ��� ��ȯ�ϴ� �޼���
    public String information() {
    	return id + " / " + pwd + " / " + name + " / " +
    			" / " + age + " / " + gender + " / " +
    			phone + " / " + email;
    }
}
