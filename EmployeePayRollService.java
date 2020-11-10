package com.blz.employeepayroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayRollService {

	public enum IOService {
		CONSOLE_IO, FILE_IO, DB_IO, REST_IO
	};

	private List<EmployeePayRoll> employeePayrollList;

	public EmployeePayRollService() {
	}

	public EmployeePayRollService(List<EmployeePayRoll> employeePayrollList) {
		super();
		this.employeePayrollList = employeePayrollList;
	}

	private void readEmpPayRollData(Scanner consoleInputReader) {
		System.out.println("Enter Employee ID: ");
		int id = consoleInputReader.nextInt();
		System.out.println("Enter Employee Name: ");
		String name = consoleInputReader.next();
		System.out.println("Enter Employee Salary: ");
		double salary = consoleInputReader.nextDouble();

		EmployeePayRoll employee = new EmployeePayRoll(id, name, salary);
		employeePayrollList.add(employee);
		System.out.println("Employee details added!!");
	}

	private void writeEmpPayRollData() {
		System.out.println("\nWriting Employee Payroll Roaster to Console\n" + employeePayrollList);
	}

	public static void main(String[] args) {
		ArrayList<EmployeePayRoll> employeePayrollList = new ArrayList<>();
		EmployeePayRollService employeePayRollService = new EmployeePayRollService(employeePayrollList);
		Scanner consoleInputReader = new Scanner(System.in);
		employeePayRollService.readEmpPayRollData(consoleInputReader);
		employeePayRollService.writeEmpPayRollData();
	}
}