package com.qst.chapter05;

public class ClassExtendsDemo {

	public static void main(String[] args) {
		// 创建一个Printer子类实例
		Printer p = new Printer("喷墨打印机", "惠普", 600, "6色真彩", "A4纸");
		p.display();
		System.out.println("-----------------");
		// 创建一个Mobile子类实例
		Mobile m = new Mobile("iPhone 6", "苹果", 5288, "4.7英寸", "双核");
		m.display();
	}
}
