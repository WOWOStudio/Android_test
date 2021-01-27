package com.qst.chapter05.aggregation;

//�ۺϹ�ϵ,Department��Employee�ۺ϶���
class Employee {
	String name;

	Employee(String name) {
		this.name = name;
	}
}

class Department {
	Employee[] emps;

	Department(Employee[] emps) {
		this.emps = emps;
	}

	void show() {
		// ѭ������
		for (Employee emp : emps) {
			System.out.println(emp.name);
		}
	}
}

public class AggregationDemo {

	public static void main(String[] args) {
		
		Employee[] emps = { new Employee("����"), 
				new Employee("����"),
				new Employee("����"),
				new Employee("����")};
		
		Department dept = new Department(emps);
		dept.show();
		
	}

}
