package com.qst.chapter05;
//����
class Base {
	public void print() {
		System.out.println("����...");
	}
}
//����
class Son extends Base {
	// ��д�����print()����
	public void print() {
		System.out.println("����...");
	}
}

class Son2 extends Base {
	public void print() {
		System.out.println("����2...");
	}
}

public class OverrideDemo {

	public static void main(String[] args) {
		//��̬
		//objָ���Լ�
		Base obj=new Base();
		obj.print();
		//objָ������Son����
		 obj = new Son();
		obj.print();
		//objָ������Son2����
		obj= new Son2();
		obj.print();
	}

}
