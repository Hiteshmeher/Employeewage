package com.bridgelabz.Empwage;

/**
 * 
 * @author LENOVO
 *
 */
public class Empwage {
	/**
	 * initializing three final variables
	 */
	static final int WagePerHour = 20;
	static final int FullDayHours = 8;
	static final int PartTimeHour = 4;

	public void dailywages() {
		/**
		 * initializing attendance as a random function that will generate 0 ,1 and 2
		 * if 0 then Absent 
		 * if 1 then Present
		 * if 2 then Half day
		 * Calculating daily wages for Present and Half day employee
		 */
		int dailyWages = 0;
		int attendance = (int) Math.floor(Math.random() * 10) % 3;
		if (attendance == 0) {
			System.out.println("Emloyee is absent");
		} else if (attendance == 1) {
			System.out.println("Employee is present");
			dailyWages = WagePerHour * FullDayHours;
			System.out.println("Daily Wages of Employee: " + dailyWages);
		} else {
			System.out.println("Employee is present for the Half day");
			dailyWages = WagePerHour * PartTimeHour;
			System.out.println("Wages of the day for part time " + dailyWages);
		}
	}
}
