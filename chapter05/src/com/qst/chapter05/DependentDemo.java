package com.qst.chapter05;

//������ϵ��Person����Car
class Car {
	void run(String city) {
		System.out.println("��������" + city);
	}
}

class Person {
	// Car��Ķ�����Ϊ�����Ĳ���
	void travel(Car car) {
		car.run("�ൺ");
	}
}

public class DependentDemo {

	public static void main(String[] args) {
		Car car=new Car();
		Person p=new Person();
		p.travel(car);
		//new Person().travel(new Car());
	}

}
