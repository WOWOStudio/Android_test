package com.qst.chapter05;

//����
public class SubClass extends SuperClass {

	int b;

	public SubClass() {
		System.out.println("�������๹�췽��...");
		b = 20;
	}

	public static void main(String[] args) {
		// ʵ����һ���������
		SubClass obj = new SubClass();
		// ��������е�����ֵ
		System.out.println("a=" + obj.a + ",b=" + obj.b);
	}

}
