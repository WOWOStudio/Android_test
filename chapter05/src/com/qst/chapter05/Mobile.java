package com.qst.chapter05;

public class Mobile extends Product {
	private String screenSize;
	private String cpu;

	public Mobile() {

	}

	public Mobile(String type, String manufacture, double price,
			String screenSize, String cpu) {
//		this.setType(type);
//		this.setManufacture(manufacture);
//		this.setPrice(price);
		//���ø���Ĺ��췽����ʼ�������еĻ�������
		super(type,manufacture,price);
		this.screenSize = screenSize;
		this.cpu = cpu;
	}

	public String getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
    //��д����ķ���
	public void display() {
//		System.out.println("���ͣ�" + this.getType());
//		System.out.println("���̣�" + this.getManufacture());
//		System.out.println("�۸�" + this.getPrice());
		//���ø����display()���ǰ��������ֵ
		super.display();
		System.out.println("��Ļ��" + this.getScreenSize());
		System.out.println("cup��" + this.getCpu());
	}

}
