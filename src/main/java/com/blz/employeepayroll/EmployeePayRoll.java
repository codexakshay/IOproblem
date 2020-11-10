package com.blz.employeepayroll;

public class EmployeePayRoll {

	private int id;
	private String name;
	private double salary;

	public EmployeePayRoll(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return "Id: " + id + " Name: " + name + " salary: " + salary;
	}
}
