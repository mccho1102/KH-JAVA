package com.kh.chap02_ab_in.example.model.vo;

public abstract class AllInOnePrinter implements Printer, Scanner, Fax{
	// �߻� Ŭ����
	// �Ϲ� ��� + �̿ϼ� �޼ҵ尡 ���Ե� ����
	// �̿ϼ��� Ŭ�����ν� ��ü ���� �Ұ���
	// -> ��, �θ�Ÿ���� ������ �����δ� ��� ����
	
	// * Ŭ������ ���߻���� �Ұ��� ������
	//   �������̽��� ���� ����� ����!
	
	private String brand;     // ������
	private String name;      // ��ǰ��
	
	// �����ڵ� ���� ����
	// --> ��� ���� �ڽ��� ��ü ���� ��
	//     �߻�Ŭ������ �θ��� �κ� �ʱ�ȭ �� �� �ʿ�
	// ��, �����ڰ� �ִٰ� �ؼ� ���� ��ü ������ �Ұ���.
	
	public AllInOnePrinter() { }
	
	

	public AllInOnePrinter(String brand, String name) {
		super();
		this.brand = brand;
		this.name = name;
	}



	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// �̿ϼ� �޼ҵ�
	public abstract int paperSize();
}
