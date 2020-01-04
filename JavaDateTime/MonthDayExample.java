package JavaDateTime;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;
public class MonthDayExample 
{
	public static void main(String[] args) 
	{
		MonthDay month = MonthDay.now();        //current month
		LocalDate date=month.atYear(2000);
		System.out.println(date);
		boolean a=month.isValidYear(2019);      //checking year is valid or not
		System.out.println(a);
		long b=month.get(ChronoField.MONTH_OF_YEAR);
		System.out.println(b);
		ValueRange r1=month.range(ChronoField.MONTH_OF_YEAR);    //number of months in year
		System.out.println(r1);
		ValueRange r2=month.range(ChronoField.DAY_OF_MONTH);     //number of days in January
		System.out.println(r2);
	}
}