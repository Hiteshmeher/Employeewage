package com.bridgelabz.Empwage;
/**
 * 
 * @author LENOVO
 *
 */
public class Empwage {
	
	public void attendance() {
		/**
		 * initializing attendance as a random function that will generate 0, 1 & 2
		 * if it will 0 then Absent
		 * if 1 then Present
		 * if 2 then HalfDay
		 */
		int attendance = (int) Math.floor(Math.random() * 10) % 3;
		if (attendance == 0)
			System.out.println("Emloyee is absent");
		else if (attendance == 1)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is present for the Half day");
	}
}
