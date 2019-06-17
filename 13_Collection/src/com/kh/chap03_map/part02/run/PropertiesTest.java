package com.kh.chap03_map.part02.run;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {
	
	public static void main(String[] args) {
		
		//Properties : Key, Value�� ��� String�� Map
		//���� ���α׷��� �ɼ�, ȯ�漳�� ���� ������ �����ϴ�
		//������ �������ų� �о���� �뵵�� ����.
		
		Properties prop = new Properties();
		
		//1. setProperty(key,value) : Properties�� �� ����
		prop.setProperty("ID", "admin");
		prop.setProperty("PASSWORD", "1q2w3e4r");
		prop.setProperty("SIZE", "1920X1820");
		
		//key =value ���·� ����
		System.out.println(prop);
		
		//2. getProperty(key) : key�� ������ �̷�����ִ�
		//									value�� ����
		System.out.println(prop.get("ID"));
		System.out.println(prop.get("PASSWORD"));
		System.out.println(prop.get("SIZE"));
		
		//3. keySet()
		Set<Object> ks = prop.keySet();
		//Properties �� HashTable�� ��� ����
		//HashTable���� ��ӵ� keySet�� ��ȯ���� Object������ ���ѵ�.
		//-->Properties.keySet() ���� �����ϴ� ����������
		//Set<Object> �� ����Ǿ����.
		
		Iterator<Object> it = ks.iterator();
		while(it.hasNext()) {
			String key = (String)it.next();
			System.out.println("key : " + key + " / value : " + prop.getProperty(key));
		}
		
		
		//4. store(OuputStream os,String comments)
		//Properties�� ����� �����͸� �ܺη� ����ϴ� �޼ҵ�
		
		try {
			prop.store(new FileOutputStream("test.properties"), "property test");
			
			// 5. storeToXML
			// XML������ ��� ���α׷��� ���� �������� ��� ����
			prop.storeToXML(new FileOutputStream("test.xml"), "xml test");
			
			//6. load(FileInputStream fis)
			//.properties ���Ͽ� ������ �о�鿩 properties ��ü�� ����
			
			Properties prop2 = new Properties();
			/*
			prop2.load(new FileInputStream("test.properties"));
			System.out.println(prop2);
			*/
			//7. loadFromXML
			
			prop2.loadFromXML(new FileInputStream("test.xml"));
			System.out.println(prop2);
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
