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
		//调用父类的构造方法初始化父类中的基础属性
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
    //重写父类的方法
	public void display() {
//		System.out.println("类型：" + this.getType());
//		System.out.println("厂商：" + this.getManufacture());
//		System.out.println("价格：" + this.getPrice());
		//调用父类的display()输出前三个属性值
		super.display();
		System.out.println("屏幕：" + this.getScreenSize());
		System.out.println("cup：" + this.getCpu());
	}

}
