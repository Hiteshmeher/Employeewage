package com.bridgelabz.Empwage;

/**
 * 
 * @author LENOVO
 *
 */
public class Empwage {
	/**
	 * initializing five final variables
	 */
	static final int WagePerHour = 20;
	static final int FullDayHour = 8;
	static final int PartTimeHour = 4;
	static final int IsPartTime = 0;
	static final int IsFulltime = 1;

	public void dailywages() {
		/**
		 * initializing values
		 * generating random number 0, 1, 2
		 * if o the part time job
		 * if 1 then present for the job
		 * if 2 then absent
		 * using switch case statement printing employee is present or not or part time
		 * then calculating its daily wages
		 */
		int dailyWages = 0;
		int attendance = (int) Math.floor(Math.random() * 10) % 3;
		switch (attendance) {
		case IsPartTime:
			System.out.println("Employee is doing Half day");
			dailyWages = WagePerHour * PartTimeHour;
			System.out.println("Wages for the day is " + dailyWages);
			break;
		case IsFulltime:
			System.out.println("Employee is present");
			dailyWages = WagePerHour * FullDayHour;
			System.out.println("Wages for the day is " + dailyWages);
			break;
		default:
			System.out.println("oops !!! Employee is Absent today. ");
			break;
		}
	}
}
