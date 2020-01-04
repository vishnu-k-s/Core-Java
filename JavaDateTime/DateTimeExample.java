package JavaDateTime;

import java.time.LocalDate;
import java.time.Month;

public class DateTimeExample 
{
	public static void main(String[] args) 
	{
		LocalDate date=LocalDate.now();       //current date
		System.out.println("Todays date is : "+date);   
		
		LocalDate date2=LocalDate.of(2020, Month.JANUARY, 12);        // date of january 12
		System.out.println(date2);		
		LocalDate date3=LocalDate.of(2020, Month.DECEMBER, 19);       // date of december 19
		System.out.println(date3);
		
		System.out.println("Year : "+date.getYear());                 //only year
		System.out.println("Month : "+date.getMonth().getValue());    //only month
		System.out.println("Day of Month : "+date.getDayOfMonth());   //only day
		
		//plus methods
		System.out.println("Addition of days :"+date.plusDays(10));
		System.out.println("Addition of months :"+date.plusMonths(14));
		System.out.println("Addition of weeks :"+date.plusWeeks(75));
		
		//minus methods
		System.out.println("Subtraction of days :"+date.minusDays(10));
		System.out.println("Subtraction of months :"+date.minusMonths(14));
		System.out.println("Subtraction of weeks :"+date.minusWeeks(75));
		System.out.println("Subtraction of years :"+date.minusYears(22));
		
		if(date.isEqual(date2))     //checking for isEqual()
		{
			System.out.println("Date and Date1 are equal");
		}
		else
		{
			System.out.println("Date and Date1 are not equal");
		}
		
		if(date3.isAfter(date2))    //checking for isAfter()
		{
			System.out.println("Date3 comes after Date2");
		}
		
		if(date.isBefore(date3))    //checking for isBefore()
		{
			System.out.println("Date comes before Date3");
		}		
	}
}