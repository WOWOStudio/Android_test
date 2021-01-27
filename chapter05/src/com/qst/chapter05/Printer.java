package com.qst.chapter05;

public class Printer extends Product {
	private String color;
	private String paperSize;

	public Printer() {

	}

	public Printer(String type, String manufacture, double price, String color,
			String paperSize) {
//		// 给父类中的基础属性赋值
//		this.setType(type);
//		this.setManufacture(manufacture);
//		this.setPrice(price);
		//调用父类的构造方法初始化父类中的基础属性
		super(type,manufacture,price);
		// 给子类自己的属性赋值
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
    //重写父类的方法
	public void display() {
//		System.out.println("类型：" + this.getType());
//		System.out.println("厂商：" + this.getManufacture());
//		System.out.println("价格：" + this.getPrice());
		//调用父类的display()输出前三个属性值
		super.display();
		System.out.println("打印色彩：" + this.getColor());
		System.out.println("打印纸张大小：" + this.getPaperSize());
	}
}
