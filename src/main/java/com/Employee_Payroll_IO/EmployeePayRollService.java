package com.Employee_Payroll_IO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayRollService {
	public enum IOService {
		CONSOLE_IO, FILE_IO, DB_IO, REST_IO
	}

	private List<EmployeePayRollData> employeePayRollList;

	/**
	 * Default Constructor
	 */
	public EmployeePayRollService() {
	}

	/**
	 * Parameterized Constructor for Initializing List
	 */
	public EmployeePayRollService(List<EmployeePayRollData> employeePayRollList) {
		this.employeePayRollList = employeePayRollList;
	}

	private void readEmployeePayRollData(Scanner consoleInputReader) {
		System.out.println("Please Enter Employee Name");
		String name = consoleInputReader.nextLine();
		System.out.println("Please Enter Employee ID");
		int id = consoleInputReader.nextInt();
		System.out.println("Please Enter Employee Salary");
		double salary = consoleInputReader.nextDouble();

		employeePayRollList.add(new EmployeePayRollData(id, name, salary));
	}

	private void writeEmployeePayRollData() {
		System.out.println("\n Writing Employee Payroll Roster to Console\n" + employeePayRollList);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Payroll service program!");
		ArrayList<EmployeePayRollData> employeePayRollList = new ArrayList<EmployeePayRollData>();
		EmployeePayRollService employeePayRollService = new EmployeePayRollService(employeePayRollList);
		Scanner consoleInputReader = new Scanner(System.in);
		employeePayRollService.readEmployeePayRollData(consoleInputReader);
		employeePayRollService.writeEmployeePayRollData();
	}

}
