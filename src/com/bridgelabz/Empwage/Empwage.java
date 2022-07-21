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
	static final int WorkingDayInMonth = 20;


	public void monthlywages() {
		/**
		 * initializing values 
		 * assuming 20 working days in a month
		 * generating random number 0, 1, 2 
		 * if o the part time job
		 * if 1 then present for the job 
		 * if 2 then absent 
		 * using switch case statement printing employee is present or not or part time
		 * calculating wages for 20 days
		 */
		int dailyWages = 0;
		int Monthlywages = 0;
		int workingDay = 1;
		int day = 1;
		while (workingDay <= WorkingDayInMonth) {
			int attendance = (int) Math.floor(Math.random() * 10) % 3;
			switch (attendance) {
			case IsPartTime:
				System.out.println("Day " + day + " Half day");
				dailyWages = WagePerHour * PartTimeHour;
				System.out.println("Wages of the day " + day + " is " + dailyWages);
				Monthlywages = dailyWages + Monthlywages;
				break;
			case IsFulltime:
				System.out.println("Day " + day + " present");
				dailyWages = WagePerHour * FullDayHour;
				System.out.println("Wages of the day " + day + " is " + dailyWages);
				Monthlywages = dailyWages + Monthlywages;
				break;
			default:
				System.out.println("Day " + day + " Absent");
				System.out.println("Wages of the day " + day + " is 0 ");
				break;
			}
			day++;
			workingDay++;
		}
		System.out.println("\nWages for the month is " + Monthlywages);
	}
}