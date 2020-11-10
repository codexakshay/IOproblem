package com.blz.employeepayroll;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class EmployeePayRollFileIOService {
	public static String PAYROLL_FILE_NAME = "payroll-file.txt";

	public void writeData(List<EmployeePayRoll> empPayrollList) {
		StringBuffer buffer = new StringBuffer();
		empPayrollList.forEach(emp -> {
			String empDataString = emp.toString().concat("\n");
			buffer.append(empDataString);
		});

		try {
			Files.write(Paths.get(PAYROLL_FILE_NAME), buffer.toString().getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void printData() {
		try {
			Files.lines(new File(PAYROLL_FILE_NAME).toPath()).forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public long countEntries() {
		long entries = 0;
		try {
			entries = Files.lines(new File(PAYROLL_FILE_NAME).toPath()).count();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return entries;
	}
}
