package com.qst.chapter05.innerclass;

public class Cow {
	private double weight;

	// �ⲿ����������صĹ�����
	public Cow() {
	}

	public Cow(double weight) {
		this.weight = weight;
	}

	// ����һ����Ա�ڲ���
	private class CowLeg {
		// ��Ա�ڲ��������ʵ������
		private double length;
		private String color;

		// ��Ա�ڲ�����������صĹ��췽��
		public CowLeg() {
		}

		public CowLeg(double length, String color) {
			this.length = length;
			this.color = color;
		}

		// ����ʡ��length��color��setter��getter����
		public void setLength(double length) {
			this.length = length;
		}

		public double getLength() {
			return this.length;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getColor() {
			return this.color;
		}

		// ��Ա�ڲ���ķ���
		public void info() {
			System.out.println("��ǰţ����ɫ�ǣ�" + color + ", �ߣ�" + length);
			// ֱ�ӷ����ⲿ���private���εĳ�Ա����
			System.out.println("��ţ��������ţ�أ�" + weight); 
		}
	}

	public void test() {
		CowLeg cl = new CowLeg(1.12, "�ڰ����");
		cl.info();
	}

	public static void main(String[] args) {
		Cow cow = new Cow(378.9);
		cow.test();
	}
}
