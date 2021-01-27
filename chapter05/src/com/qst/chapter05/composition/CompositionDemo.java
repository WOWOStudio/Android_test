package com.qst.chapter05.composition;

//��ɹ�ϵ,�����ɸ��豸���
//������
class Engine {
}

// ����
class Chassis {
}

// ����
class Bodywork {
}

// ��·�豸
class Circuitry {
}

// ����
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
