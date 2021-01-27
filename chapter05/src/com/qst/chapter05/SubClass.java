package com.qst.chapter05;

//子类
public class SubClass extends SuperClass {

	int b;

	public SubClass() {
		System.out.println("调用子类构造方法...");
		b = 20;
	}

	public static void main(String[] args) {
		// 实例化一个子类对象
		SubClass obj = new SubClass();
		// 输出子类中的属性值
		System.out.println("a=" + obj.a + ",b=" + obj.b);
	}

}
