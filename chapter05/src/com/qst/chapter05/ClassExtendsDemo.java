package com.qst.chapter05;

public class ClassExtendsDemo {

	public static void main(String[] args) {
		// ����һ��Printer����ʵ��
		Printer p = new Printer("��ī��ӡ��", "����", 600, "6ɫ���", "A4ֽ");
		p.display();
		System.out.println("-----------------");
		// ����һ��Mobile����ʵ��
		Mobile m = new Mobile("iPhone 6", "ƻ��", 5288, "4.7Ӣ��", "˫��");
		m.display();
	}
}
