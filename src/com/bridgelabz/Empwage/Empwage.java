package com.bridgelabz.Empwage;

/**
 * 
 * @author HITESH
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
	static final int WorkingHourPerMonth = 100;

	public void monthlywages() {
		/**
		 * initializing values 
		 * putting condition of total 100 hours or 20 days
		 * generating random number 0, 1, 2 
		 * if o the part time job
		 * if 1 then present for the job 
		 * if 2 then absent 
		 * using switch case statement printing employee is present or not or part time
		 * calculating wages for total 100 hours or 20 days
		 */
		int dailyWages = 0;
		int MonthlyWages = 0;
		int workingDay = 1;
		int day = 1;
		int totalWorkingHoursInMonth = 0;
		while (workingDay <= WorkingDayInMonth && totalWorkingHoursInMonth <= WorkingHourPerMonth) {
			int attendance = (int) Math.floor(Math.random() * 10) % 3;
			switch (attendance) {
			case IsPartTime:
				System.out.println("Day " + day + " Half day");
				dailyWages = WagePerHour * PartTimeHour;
				System.out.println("Wages of the day " + day + " is " + dailyWages);
				MonthlyWages = dailyWages + MonthlyWages;
				totalWorkingHoursInMonth = totalWorkingHoursInMonth + PartTimeHour;
				break;
			case IsFulltime:
				System.out.println("Day " + day + " present");
				dailyWages = WagePerHour * FullDayHour;
				System.out.println("Wages of the day " + day + " is " + dailyWages);
				MonthlyWages = dailyWages + MonthlyWages;
				totalWorkingHoursInMonth = totalWorkingHoursInMonth + FullDayHour;
				break;
			default:
				System.out.println("Day " + day + " Absent");
				System.out.println("Wages of the day " + day + " is 0 ");

				break;
			}
			day++;
			workingDay++;
		}
		System.out.println("Total Working Hours of the month: " + totalWorkingHoursInMonth);
		System.out.println("Wages of the month: " + MonthlyWages);
	}
}