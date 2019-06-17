package com.kh.chap01_list.part03.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01_list.part03.controller.MusicController;
import com.kh.chap01_list.part03.model.vo.Music;



//Collection
//List,Set,Map 3���� �������̽��� �̷����.
//List,set �������� ����
// - > �������� �߻�ȭ ���ؼ� Collection �������̽��� ����� ���
//Map�� �÷����� ���������� ������ ���̷� ���� ������ �����.

//List,Set vs Map
//������ :  ������ ���� ��Ŀ� ���̰� ����.
//List,set : ��ü(�ν��Ͻ�) ����
//Map : Key, value  �� ���·� ����
//          (key�� ������ ��ü�� �����ؼ� ����
//				Value�� ���� ������ ��ü�� ����)

//List Ư¡
// ������ ������. (index�� �ο��Ͽ� ���� ����)
// --> index�� �̿��Ͽ� ������ ���� ����
// �ߺ����� ����.
// --> �ߺ����� ����Ǿ index�� ������ �Ǳ� ������ ����


// MVC(Model - View  - Controller) ����
/*
 * 	����Ʈ���� ������ ���� 
 * 
 * 
 * Model : ������ ó�� �κ� (����Ͻ� ����),
 * 				�������� ����(vo),������ ��/���(dao)���� Ŭ���� ����.
 * 
 * View : 	�����(Ŭ���̾�Ʈ)���� ǥ�õǾ����� ȭ�� �κ�.
 * 			����ڿ��� ����� ��û�ް�, Back-End���� ó���� ���� ����� ������.
 * 
 * Controller : Ŭ���̾�Ʈ ��û�� ���� ������  Model�� ȣ���ϰ�
 * 					ó�� ����� ���� �˸��� view�� ���� �ϴ� �κ�.
 * 					Model ȣ�� �� ������ �����Ͱ� �����ϸ�
 * 					��û�� �˸´� ���·� �����ؼ� Model�� ����.
 * 
 * MVC�� ����
 * 
 * 	ȭ��(View)�� ���� ó���κ�(Model,View)�� �и��Ǿ�
 * 	���� ������� ������ ������.
 * 	--> �����̳�,�ۺ���,�����ڵ��� ������ ������
 */


public class MusicMenu {
	
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	
	// ���� �޴� : ���α׷� ���� �� ó�� �������� ȭ��
	public void mainMenu() {
		
		while(true) {
			System.out.println("== Welcome ���� ==");
			System.out.println("1. �� �߰�");
			System.out.println("2. �� ��ü ��ȸ");
			System.out.println("3. Ư�� �� �˻�");
			System.out.println("4. Ư�� �� ����");
			System.out.println("5. Ư�� �� ����");
			System.out.println("6. �� �����ϱ�");
			System.out.println("0. ���α׷� ����");
			System.out.print("�޴� ���� : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: addMusic(); break;
			case 2: selectMusic(); break;
			case 3: searchMusic(); break;
			case 4: removeMusic(); break;
			case 5: updateMusic(); break;
			case 6: sortMusic(); break;
			case 0: System.out.println("���α׷� �����ϱ�"); return;
			default: System.out.println("�߸� �Է��Ͽ����ϴ�.");
			}
		}
		
		
	}


	
	/**
	 * 1. �� �߰��� view �޼ҵ�
	 *  - ���� �Է�
	 *  - ���� �Է�
	 */
	private void addMusic() {
		
		System.out.println("==== �� �߰� ====");
		System.out.print("���� �Է� : ");
		String title = sc.nextLine();
		System.out.print("���� �Է� : ");
		String artist = sc.nextLine();
		
		//�Է¹��� ����, ������ MusicController�� ���� �� 
		//ArrayList�� ����
		if(mc.addMusic(title,artist) == 1) {
			//���� ó���� ���
			System.out.println("�� ������ �߰��Ǿ����ϴ�.");
		}
		
	}
	
	/**
	 * 2. �� ��ü ��ȸ�� view �޼ҵ�
	 */
	private void selectMusic() {
		
		
		ArrayList<Music> list= mc.selectMusic();
		
		if(list.isEmpty()) {
			System.out.println("����� ���� �����ϴ�");
		}else {
				/*
				for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));
				*/
			
				
			//���� for�� (for-each)��
				for(Music m : list) {
					
					System.out.println(m);
			}
	
		}

	}


	
	/**
	 * 3. �� ���ſ� view �޼ҵ�
	 *    - ������ ��� �Է� �� ���� 
	 */
	private void removeMusic() {
		
		System.out.println("=== �� ���� ===");
		System.out.print("������ ��� : ");
		String title = sc.nextLine();
		
		//MusicController�� removeMusic �޼ҵ� ȣ���Ͽ�
		//������ ����� ���� �� ���� ó���� ��� ��������, �ƴѰ�� �� ���� ���
		
		int result = mc.removeMusic(title);
		
		if(result==-1) {
			System.out.println("������ ���� ã�� �� �����ϴ�.");
		}else {
			System.out.println(title +"��(��) ���������� ���� �߽��ϴ�.");
		}
		
		
	
	}

	
	/**
	 * 4. �� �˻��� view �޼ҵ�
	 *  - �˻��� �� ����� ���õ� Ű���� �Է�
	 */
	private void searchMusic() {
		
		System.out.println("=== �� �˻� ===");
		System.out.print("�˻��� �� Ű���� : ");
		String keyword = sc.nextLine();
		
		//MusicController�� searchMusic �޼ҵ带 ȣ���Ͽ�
		//Keyword ���� �� �ش� keyword�� �����ϴ� 
		//��� ��� ��ȯ
		ArrayList<Music> searchList= mc.searchMusic(keyword);
		
		if(searchList.isEmpty()) {
			System.out.println("�˻��� ���� �����ϴ�.");
		}else {
			for(Music m : searchList) {
				System.out.println(m);
			}
				
		}
		
	}

	/**
	 * 5. �� ������ view �޼ҵ�
	 * - ���� �� ����� �Է� �� ���, ������ ����
	 */
	private void updateMusic() {
		
		System.out.println("==== �� ���� ====");
		System.out.print("������ ��� : ");
		String title = sc.nextLine();
		
		System.out.print("���� ����(���) : ");
		String updateTitle = sc.nextLine();
		System.out.print("���� ����(����) : ");
		String updateArtist = sc.nextLine();
		
		//MusicController��  updateMusic �޼ҵ� ȣ���
		//������ ���, ���������� updateMusic �޼ҵ忡 �����Ͽ�
		//����� ��ȯ����.
		int result = mc.updateMusic(title,updateTitle,updateArtist);
		if( result==1) {
			System.out.println("���� �����Ǿ����ϴ�");
		}else {
			System.out.println("���� �����ϴ�.");
		}
		
	}
	
	
	
	/**
	 * 6. ����� �� ���Ŀ� view �޼ҵ�
	 *  - ���� ����� ����Ʈ�� ������ ���ĸ������ ���� 
	 *  - ������ ����/�������� , ��� ����/��������
	 */
	public void sortMusic() {
		
		// Collections.sort();  : �÷��� ��ü ���Ŀ� ���
		
		/* �÷��� ��ü ���� ��
		 * �ش� �÷��ǿ� ���Ǵ� ��ü�� ���ı����� ����Ǿ� �־�� ��.
		 * 
		 * Comparable �������̽�
		 *  :  �⺻ ���� ������ �����ϴµ� ���
		 * 1)���� �Ϸ��� voŬ������ Comparable �������̽� ���
		 * 2)public int compareTo(Object o) �޼ҵ� �������̵�
		 * 	--> ���ο� ���� ���� �ۼ�
		 * 3)Collection.sort(List��);  ȣ��
		 * 	--> �ش� List�� ���ؿ� ���� ���ĵ�
		 * 
		 * 
		 * Comparator �������̽�
		 * :  �⺻ ���� ���� �̿��� ������ �����ϰ��� �� �� ���
		 * 1)������ voŬ������ �����Ͽ�
		 * 	Comparator �������̽� ���
		 * 2)public int compare(Object o1,Object o2) �������̵�
		 * --> ���ο� ���� ���� �ۼ�
		 * 3)Collections.sort(List��, ���ı���Ŭ����); ȣ��
		 * 
		 *  
		 *  
		 */
		
		System.out.println("== �� ���� ==");
		System.out.println("1. ������ ��������");
		System.out.println("2. ������ ��������");
		System.out.println("3. ��� ��������");
		System.out.println("4. ��� ��������");
		System.out.print("�޴� : ");
		int menu = sc.nextInt();
		
		ArrayList<Music> sortList = mc.sortMusic(menu);
		
		
		if(sortList == null) {
			System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
		}else {
			for(Music m : sortList) {
				System.out.println(m);
			}
		}
		
		
		
	
	}

}
