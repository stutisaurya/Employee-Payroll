package com.Employee_Payroll_IO;

public class EmployeePayRollData {

	int id;
	String name;
	Double salary;

	public EmployeePayRollData(int id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return " name=+'" + name + '\'' + "id=" + id + ",salary=" + salary;
	}

}
