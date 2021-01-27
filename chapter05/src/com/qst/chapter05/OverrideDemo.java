package com.qst.chapter05;
//父类
class Base {
	public void print() {
		System.out.println("父类...");
	}
}
//子类
class Son extends Base {
	// 重写父类的print()方法
	public void print() {
		System.out.println("子类...");
	}
}

class Son2 extends Base {
	public void print() {
		System.out.println("子类2...");
	}
}

public class OverrideDemo {

	public static void main(String[] args) {
		//多态
		//obj指向自己
		Base obj=new Base();
		obj.print();
		//obj指向子类Son对象
		 obj = new Son();
		obj.print();
		//obj指向子类Son2对象
		obj= new Son2();
		obj.print();
	}

}
