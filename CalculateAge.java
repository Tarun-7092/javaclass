// Develop a program for calculating age of person and display the age of the person in year month and days

import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
class CalculateAge
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		LocalDate dt = LocalDate.now();
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.print("Enter birthdate(dd-MM-yyyy): ");
		String dob = sc.nextLine();
		LocalDate bd = LocalDate.parse(dob,f);
		Period p = Period.between(bd,dt);
		int y = p.getYears();
		int m = p.getMonths();
		int d = p.getDays();
		System.out.print(y+"year"+m+"month"+d+"day");
	}
}