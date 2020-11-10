package com.blz.employeepayroll;

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
}
