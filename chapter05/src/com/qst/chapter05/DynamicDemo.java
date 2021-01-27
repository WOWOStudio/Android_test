package com.qst.chapter05;

//多态测试
public class DynamicDemo {

	public static void main(String[] args) {
		// 创建一个商品对象p
		Product p = new Product("商品A", "厂家A", 100);
		p.display();
		System.out.println("-----------------");
		// p指向一个Printer子类实例
		p = new Printer("喷墨打印机", "惠普", 600, "6色真彩", "A4纸");
		p.display();
		System.out.println("-----------------");
		// p指向一个Mobile子类实例
		p = new Mobile("iPhone 6", "苹果", 5288, "4.7英寸", "双核");
		p.display();

	}

}
