package com.bridgelabz.Empwage;

/**
 * 
 * @author LENOVO
 *
 */
public class Empwage {
	/**
	 * initializing two final variables
	 */
	static final int WagePerHour = 20;
	static final int FullDayHours = 8;
	
	public void dailywages() {
		/**
		 * initializing attendance as a random function that will generate 0 & 1
		 * if it will 0 then Absent 
		 * if 1 then Present 
		 */
		int dailyWages = 0;
		int attendance = (int) Math.floor(Math.random() * 10) % 2;
		if (attendance == 0)
			System.out.println("Emloyee is absent");
		else if (attendance == 1) {
			System.out.println("Employee is present");
			dailyWages = WagePerHour * FullDayHours;
			System.out.println("Daily Wages of Employee: " + dailyWages);
		}
	}
}
