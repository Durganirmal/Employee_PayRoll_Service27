package com.Emplyee_Payroll;

public class EmployeePayrollMain {

	 public static void main(String[] args) {
		 Employee_Payroll_Service employeePayrollService = new Employee_Payroll_Service();
	        employeePayrollService.readEmployeeDataFromConsole();
	        employeePayrollService.writeEmployeeDataInConsole();
	    }
	}
