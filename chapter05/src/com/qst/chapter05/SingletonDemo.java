package com.qst.chapter05;

//����ģʽ
class Singleton {
	private static Singleton instance = null;

	public static Singleton getInstance() {
		// �ڵ�һ��ʹ��ʱ����ʵ���������Ч�ʣ�
		if (instance == null)
			instance = new Singleton();
		return instance;
	}
}

public class SingletonDemo {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		if (s1 == s2) {
			System.out.println("s1��s2��ͬһ������");
		}
	}

}
