package JavaDateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class DateTimeExample2 
{
	public static void main(String[] args) 
	{
		//ISO date
		LocalDate date=LocalDate.now(); 
		DateTimeFormatter dateformatter=DateTimeFormatter.ISO_LOCAL_DATE;
		System.out.println(date.format(dateformatter));
		
		//yyyy/MM/dd pattern
		DateTimeFormatter dateformatter1=DateTimeFormatter.ofPattern("yyyy/MM/dd");
		System.out.println(date.format(dateformatter1));
		
		//MMM/dd/yyyy pattern
		DateTimeFormatter dateformatter4=DateTimeFormatter.ofPattern("MMM/dd/yyyy");
		System.out.println(date.format(dateformatter4));
		
		//dd/MM/yyyy pattern
		DateTimeFormatter dateformatter2=DateTimeFormatter.ofPattern("dd/MMM/yyyy");
		System.out.println(date.format(dateformatter2));
		
		//dd/LL/yyyy pattern
		DateTimeFormatter dateformatter3=DateTimeFormatter.ofPattern("dd/LL/yyyy");
		System.out.println(date.format(dateformatter3));
	}
}