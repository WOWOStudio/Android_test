package com.qst.chapter05.association;
//关联关系，Person关联Car
class Car {
	void run(String city) {
		System.out.println("汽车开到" + city);
	}
}

class Person {
	// Car对象作为成员变量
	Car car;

	Person(Car car) {
		this.car = car;
	}

	void travel() {
		car.run("青岛");
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
