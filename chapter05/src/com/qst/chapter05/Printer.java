package com.qst.chapter05;

public class Printer extends Product {
	private String color;
	private String paperSize;

	public Printer() {

	}

	public Printer(String type, String manufacture, double price, String color,
			String paperSize) {
//		// �������еĻ������Ը�ֵ
//		this.setType(type);
//		this.setManufacture(manufacture);
//		this.setPrice(price);
		//���ø���Ĺ��췽����ʼ�������еĻ�������
		super(type,manufacture,price);
		// �������Լ������Ը�ֵ
		this.color = color;
		this.paperSize = paperSize;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPaperSize() {
		return paperSize;
	}

	public void setPaperSize(String paperSize) {
		this.paperSize = paperSize;
	}
    //��д����ķ���
	public void display() {
//		System.out.println("���ͣ�" + this.getType());
//		System.out.println("���̣�" + this.getManufacture());
//		System.out.println("�۸�" + this.getPrice());
		//���ø����display()���ǰ��������ֵ
		super.display();
		System.out.println("��ӡɫ�ʣ�" + this.getColor());
		System.out.println("��ӡֽ�Ŵ�С��" + this.getPaperSize());
	}
}
