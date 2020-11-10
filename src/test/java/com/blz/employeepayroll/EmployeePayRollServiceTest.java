package com.blz.employeepayroll;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class EmployeePayRollServiceTest {

	@Test
	public void givenTwoEmloyeesDetails_WrittenToFile_ShouldMatchWithEntries() {
		EmployeePayRoll[] arrayofEmps = { new EmployeePayRoll(1, "abc", 25000.0),
				new EmployeePayRoll(2, "pqr", 50000.0) };
		EmployeePayRollService empPayrollService;
		empPayrollService = new EmployeePayRollService(Arrays.asList(arrayofEmps));
		empPayrollService.writeEmpPayRollData(com.blz.employeepayroll.EmployeePayRollService.IOService.FILE_IO);
		empPayrollService.printData(com.blz.employeepayroll.EmployeePayRollService.IOService.FILE_IO);
		long entries = empPayrollService.countEntries(com.blz.employeepayroll.EmployeePayRollService.IOService.FILE_IO);
		Assert.assertEquals(2, entries);
	}

}
