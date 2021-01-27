package com.qst.chapter05.association;
//������ϵ��Person����Car
class Car {
	void run(String city) {
		System.out.println("��������" + city);
	}
}

class Person {
	// Car������Ϊ��Ա����
	Car car;

	Person(Car car) {
		this.car = car;
	}

	void travel() {
		car.run("�ൺ");
	}
}

public class AssociationDemo {

	public static void main(String[] args) {
		Car car = new Car();
		Person p = new Person(car);
		p.travel();
		// new Person(new Car()).travel();
	}

}
