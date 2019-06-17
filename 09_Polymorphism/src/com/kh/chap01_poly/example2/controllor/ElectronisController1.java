package com.kh.chap01_poly.example2.controllor;

import com.kh.chap01_poly.example2.model.vo.Desktop;
import com.kh.chap01_poly.example2.model.vo.Notebook;
import com.kh.chap01_poly.example2.model.vo.Tablet;

public class ElectronisController1 {
	// =========== �������� ������� �ʾ��� �� ============
	
	// 1. ����Ϸ��� ��ü�� ���������� �ʵ忡 ����
	private Desktop desk = null;
	private Notebook note = null;
	private Tablet tab = null;
	
	// 2. �ܺο��� ������ ��ü�� �ּҸ� ���� �޾� �ʵ忡 �����ϴ� �޼ҵ� insert()����
	// - ���� �޾ƾ� �Ǵ� ��ü�� Ÿ���� Desktop, Notebook, Tablet 3����
	// --> �޼ҵ� �����ε�(Over Loading)�� ���ؼ� �ذ�
	public void insert(Desktop desk) {
		this.desk = desk;
	}
	public void insert(Notebook note) {
		this.note = note;
	}
	public void insert(Tablet tab) {
		this.tab = tab;
	}
	
	// 3. ��ü�� ������ ��ȯ�ϴ� �޼ҵ� select() ����
	// - ��ü�� Ÿ���� ��� �ٸ��Ƿ� �����ϴ� �޼ҵ��� ��ȯ���� ��� �޶�� ��
	// --> �����ε����� �ذ� �Ұ��� --> ���� �޼ҵ带 ���� ������ ��
	public Desktop selectDesktop() {
		return desk;
	}
	public Notebook selectNotebook() {
		return note;
	}
	public Tablet selectTablet() {
		return tab;
	}
	
	// 4. ��� ��ü�� ������ �ϳ��� ���ڿ��� ����� 
	//    ��ȯ�ϴ� �޼ҵ�  selectAll() ����
	public String selectAll() {
		String str = "\n*****��� ��ǰ ���� *****\n";
		str += desk.toString() + "\n";
		str += note + "\n";
		str += tab + "\n";
		
		return str;
		
	}
	
	
	// 5. ���� ���� ��ü�� Ÿ�Կ� ���� �Ǹ� ���ɿ��θ� 
	// ���ڿ��� ��ȯ�ϴ� sell() �޼ҵ� ����
	// ���� ���� �� �ִ� ��ü Ÿ���� 3����
	// --> �޼ҵ� �����ε��� ���ؼ� �ذ�
	public String sell(Desktop desk) {
		return "�Ǹ� ����";
	}
	public String sell(Notebook note) {
		return "�Ǹ� ����";
	}
	public String sell(Tablet tab) {
		return "�Ǹ� �Ұ�[ǰ��]";
	}
	
	
}
