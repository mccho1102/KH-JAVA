package com.kh.chap01_poly.example2.controllor;

import com.kh.chap01_poly.example2.model.vo.Desktop;
import com.kh.chap01_poly.example2.model.vo.Electronics;
import com.kh.chap01_poly.example2.model.vo.Notebook;
import com.kh.chap01_poly.example2.model.vo.Tablet;

public class ElectronisController2 {
	// ====== ������ ���� �� =====
	
	// 1. �θ� Ÿ�� ��ü�迭�� ���� �� �Ҵ��Ͽ� �ڽİ�ü�� �ѹ��� ����
	private Electronics[] elecs = new Electronics[3];
	
	public static int elecsIndex = 0;
	// ��ü�迭�� ������ �߰� �� �ε��� ��ġ�� �������� ���� ����
	// Controller �� View ���� �������� ����� �� �ֵ��� static ����
	
	// 2. �ܺο��� ������ ��ü�� �ּҸ� ���޹޾� �ʵ忡 �����ϴ� insert() �޼ҵ� ����
	public void insert(Electronics el) {
		elecs[elecsIndex]= el;
		// ���� ���� ��ü�� elecsIndex �ε����� ����
		
		elecsIndex++; // �����Ͱ� �߰��Ǹ� �ε��� �� 1 ����
	}
	
	// 3. ������ ��ü�� ������ ��ȯ�ϴ� �޼ҵ� select()����
	// - ��ü�迭�� ���� �����͸� �����ϹǷ�
	//   ��ȸ�Ϸ��� �ε����� �Ű������� ���޹ޱ�
	public Electronics select(int i) {
		return elecs[i];
		// �̷��� elecs[i] ��ȯ�ϸ� ����� ����?
		// elecs[i]�� Ÿ���� Electronics�� �θ� Ÿ��
		// 1���������� �����ϸ� ��ȯ �޴� ��������
		// Electronics�� ����� ������ ������ �� ������,
		// (���� ���ε�)
		
		// ���� ���α׷� ����� 
		// �ڽ��� �������̵��� toString()�� ������ ��µ�
		// --> �̰��� ���� ���ε�!
	}
	
	// 4. ��� ��ü�� ������ �ϳ��� ���ڿ��� ����� ��ȯ�ϴ� �޼ҵ�
	// selectAll()����
	// -���� ���ε����� ���� �������̵���
	// toString()�� �̿��Ͽ� �ϳ��� ���ڿ��� ������
	public String selectAll() {
		String str = "\n*****��� ��ǰ ���� *****\n";
		for(int i=0; i<elecs.length; i++) {
			str += elecs[i].toString() + "\n";
		}
		return str;
	}
	
	// 5. ���޹��� ��ü�� Ÿ�Կ� ���� �Ǹ� ���� ���θ�
	// ���ڿ��� ��ȯ�ϴ� sell() �޼ҵ� ����
	// - ���޹��� ���������� Ÿ���� �˻��ϴ�
	// instanceof �����ڸ� �̿��ϸ�
	// �޼ҵ� �����ε����� �ۼ� ����
	
	public String sell(Electronics el) {
		if(el instanceof Desktop) {
			return "�Ǹ� ����";
		}else if(el instanceof Notebook) {
			return "�Ǹ� ����";
		}else if(el instanceof Tablet) {
			return "�Ǹ� �Ұ�[ǰ��]";
		}
		
		return null;
	}
	
}
