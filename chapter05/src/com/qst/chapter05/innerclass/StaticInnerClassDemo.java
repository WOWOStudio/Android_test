package com.qst.chapter05.innerclass;

public class StaticInnerClassDemo {
	private int prop1 = 5;
	private static int prop2 = 9;

	static class StaticInnerClass {
		// ��̬�ڲ�������԰�����̬��Ա
		private static int age;

		public void accessOuterProp() {
			// ���������ִ���
			// ��̬�ڲ����޷������ⲿ���ʵ������
			System.out.println(prop1);
			// �����������
			System.out.println(prop2);
		}
	}
}