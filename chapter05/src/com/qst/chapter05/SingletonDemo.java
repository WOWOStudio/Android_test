package com.qst.chapter05;

//单例模式
class Singleton {
	private static Singleton instance = null;

	public static Singleton getInstance() {
		// 在第一次使用时生成实例，提高了效率！
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
			System.out.println("s1和s2是同一个对象");
		}
	}

}
