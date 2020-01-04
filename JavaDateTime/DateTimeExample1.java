package JavaDateTime;

import java.time.LocalDate;
import java.time.Month;

public class DateTimeExample1 
{
	public static void main(String[] args) 
	{
		LocalDate date1=LocalDate.of(2020, Month.JANUARY, 12);        // date of january 12
		LocalDate date2=LocalDate.of(2022, Month.DECEMBER, 19);       // date of december 19
		
		// Number of days in Month 
		System.out.println("Number of days in "+date1.getMonth()+" : "+date1.lengthOfMonth());   
		System.out.println("Number of days in "+date2.getMonth()+" : "+date2.lengthOfMonth());  
		
		// Number of days in Month
		System.out.println("Number of days in "+date1.getYear()+" is: "+date1.lengthOfYear());   
		System.out.println("Number of days in "+date2.getYear()+" is: "+date2.lengthOfYear());  
		
		//checking for leap year or not
		if(date1.isLeapYear())
		{
			System.out.println(date1.getYear()+" is Leap Year");
		}
		else
		{
			System.out.println(date1.getYear()+" is not Leap Year");
		}
		
		//checking for leap year or not
		if(date2.isLeapYear())
		{
			System.out.println(date2.getYear()+" is Leap Year");
		}
		else
		{
			System.out.println(date2.getYear()+" is not Leap Year");
		}
	}
}