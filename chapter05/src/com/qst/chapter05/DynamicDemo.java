package com.qst.chapter05;

//��̬����
public class DynamicDemo {

	public static void main(String[] args) {
		// ����һ����Ʒ����p
		Product p = new Product("��ƷA", "����A", 100);
		p.display();
		System.out.println("-----------------");
		// pָ��һ��Printer����ʵ��
		p = new Printer("��ī��ӡ��", "����", 600, "6ɫ���", "A4ֽ");
		p.display();
		System.out.println("-----------------");
		// pָ��һ��Mobile����ʵ��
		p = new Mobile("iPhone 6", "ƻ��", 5288, "4.7Ӣ��", "˫��");
		p.display();

	}

}
