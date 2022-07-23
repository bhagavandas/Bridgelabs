package com.EmployeeWage;

public class EmpWageCalculationUC2 {
	public static void main(String[] args) {
		int wage_per_Hour = 20;
		int fullday_Hours = 8;
		int total_working_days = 20;
		int total = wage_per_Hour * fullday_Hours;
		int total_wage_per_month = total * total_working_days;
		System.out.println("Daily Employee Wage : " + total);
	}

}
