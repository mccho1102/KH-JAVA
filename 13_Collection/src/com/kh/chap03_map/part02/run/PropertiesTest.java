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
		
		//Properties : Key, Value가 모두 String인 Map
		//보통 프로그램의 옵션, 환경설정 등의 정보를 저장하는
		//파일을 내보내거나 읽어오는 용도로 사용됨.
		
		Properties prop = new Properties();
		
		//1. setProperty(key,value) : Properties에 값 삽입
		prop.setProperty("ID", "admin");
		prop.setProperty("PASSWORD", "1q2w3e4r");
		prop.setProperty("SIZE", "1920X1820");
		
		//key =value 형태로 저장
		System.out.println(prop);
		
		//2. getProperty(key) : key와 쌍으로 이루어져있는
		//									value를 얻어옴
		System.out.println(prop.get("ID"));
		System.out.println(prop.get("PASSWORD"));
		System.out.println(prop.get("SIZE"));
		
		//3. keySet()
		Set<Object> ks = prop.keySet();
		//Properties 는 HashTable을 상속 받음
		//HashTable에서 상속된 keySet의 반환값이 Object형으로 제한됨.
		//-->Properties.keySet() 사용시 저장하는 참조변수는
		//Set<Object> 로 선언되어야함.
		
		Iterator<Object> it = ks.iterator();
		while(it.hasNext()) {
			String key = (String)it.next();
			System.out.println("key : " + key + " / value : " + prop.getProperty(key));
		}
		
		
		//4. store(OuputStream os,String comments)
		//Properties의 담겨진 데이터를 외부로 출력하는 메소드
		
		try {
			prop.store(new FileOutputStream("test.properties"), "property test");
			
			// 5. storeToXML
			// XML문서는 모든 프로그래밍 언어에서 공용으로 사용 가능
			prop.storeToXML(new FileOutputStream("test.xml"), "xml test");
			
			//6. load(FileInputStream fis)
			//.properties 파일에 정보를 읽어들여 properties 객체에 저장
			
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
