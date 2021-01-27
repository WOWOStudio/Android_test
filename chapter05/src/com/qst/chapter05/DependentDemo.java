package com.qst.chapter05;

//依赖关系，Person依赖Car
class Car {
	void run(String city) {
		System.out.println("汽车开到" + city);
	}
}

class Person {
	// Car类的对象作为方法的参数
	void travel(Car car) {
		car.run("青岛");
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
