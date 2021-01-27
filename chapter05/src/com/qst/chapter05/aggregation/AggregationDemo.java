package com.qst.chapter05.aggregation;

//聚合关系,Department由Employee聚合而成
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
		// 循环遍历
		for (Employee emp : emps) {
			System.out.println(emp.name);
		}
	}
}

public class AggregationDemo {

	public static void main(String[] args) {
		
		Employee[] emps = { new Employee("张三"), 
				new Employee("李四"),
				new Employee("王五"),
				new Employee("马六")};
		
		Department dept = new Department(emps);
		dept.show();
		
	}

}
