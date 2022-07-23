package com.EmployeeWage;

public class EmployeeAttendanceUC1 {
	static int wage_per_Hour = 20;
	static int fullday_Hours = 8;
	static int total_working_days = 20;
	static int total = wage_per_Hour * fullday_Hours;
	static int totalhours = 100;
	static int totaldays = 20;
	static int total_hours_wage = totalhours * wage_per_Hour;
	static int total_days_wage = ((totaldays * fullday_Hours)* wage_per_Hour);
	static int total_wage_per_month = (total_hours_wage + total_days_wage);
	

	public static void main(String[] args) {

		int Present = 1;
		double AttendCheck = Math.floor(Math.random() * 10 % 2);
		if (AttendCheck == Present) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Absent");
		}
		//EmpWageUC2();
		AddPartTimeUC3();
		CalcWageofMonthUC5();
		CalcWagesUC6();
		SwitchCaseUC4();

	}

	public static void EmpWageUC2() {

		System.out.println("Daily Employee Wage : " + total);
	}

	public static void AddPartTimeUC3() {
		int parttimehours = 8;
		if (parttimehours < 8) {
			System.out.println("Employee is Fulltime");
		} else {
			System.out.println("Employee is Parttime");
		}
		
		int parttimewage = ((total_wage_per_month)/2);
		System.out.println("Part time Employee Wages : " + parttimewage);
	}

	public static void CalcWageofMonthUC5() {
		EmpWageUC2();
		int total_wage_per_month = total * total_working_days;
		System.out.println("Total wages per Month : " + total_wage_per_month);

	}
	
	public static void CalcWagesUC6() {
		
		int total_hours_wage = totalhours * wage_per_Hour;
		System.out.println("Wage for 100 hours : " + total_hours_wage);
		int total_days_wage = ((totaldays * fullday_Hours)* wage_per_Hour);
		System.out.println("Wage for 20 days : " + total_days_wage);
		int total_wage_per_month = (total_hours_wage + total_days_wage);
		System.out.println("Total wages per Month of employee : " + total_wage_per_month);
	}
	

		public static void SwitchCaseUC4() {
			String employee = "Fulltime";
			 
			switch(employee){
			case "Fulltime":
			       System.out.println(" Full time employee ");
			       break;
	}
		}
}

