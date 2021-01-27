package com.qst.chapter05.composition;

//组成关系,汽车由各设备组成
//发动机
class Engine {
}

// 底盘
class Chassis {
}

// 车身
class Bodywork {
}

// 电路设备
class Circuitry {
}

// 汽车
class Car {
	Engine engine;
	Chassis chassis;
	Bodywork bodywork;
	Circuitry circuitry;

	Car(Engine engine, Chassis chassis, Bodywork bodywork, Circuitry circuitry) {
		this.engine = engine;
		this.chassis = chassis;
		this.bodywork = bodywork;
		this.circuitry = circuitry;
	}
}

public class CompositionDemo {

	public static void main(String[] args) {
		Engine engine = new Engine();
		Chassis chassis = new Chassis();
		Bodywork bodywork = new Bodywork();
		Circuitry circuitry = new Circuitry();
		Car car = new Car(engine, chassis, bodywork, circuitry);
	}

}
