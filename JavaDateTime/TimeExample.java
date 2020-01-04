package JavaDateTime;

import java.time.LocalTime;
public class TimeExample 
{
	public static void main(String[] args) 
	{
		//current time
		LocalTime localtime =LocalTime.now();
		System.out.println("current time :"+localtime);
		
		//specific time
		LocalTime localtime1 =LocalTime.of(4,30,45);
		System.out.println(localtime1);
		System.out.println("Hour   : "+localtime.getHour());
		System.out.println("Minute : "+localtime.getMinute());
		System.out.println("Second : "+localtime.getSecond());
		
		//puls methods
		System.out.println("Addition of Hours   : "+localtime.plusHours(12));
		System.out.println("Addition of Minutes : "+localtime.plusMinutes(121));
		System.out.println("Addition of Seconds : "+localtime.plusSeconds(50));
		System.out.println("Addition of Nanos   : "+localtime.plusNanos(52));
		
		//minus methods
		System.out.println("Subtraction of Hours   : "+localtime.minusHours(15));
		System.out.println("Subtraction of Minutes : "+localtime.minusMinutes(120));
		System.out.println("Subtraction of Seconds : "+localtime.minusSeconds(142));
		System.out.println("Subtraction of  Nanos  : "+localtime.minusNanos(18));
		
		LocalTime localtime2 =LocalTime.of(11,45,20);
		
		//compareTo() example
		if(localtime.compareTo( localtime2)==0)
		{
			System.out.println("localtime and localtime1 are equal");			
		}
		else
		{
			System.out.println("localtime and localtime1 are not equal");
		}
		
		//isBefore() example
		if(localtime1.isBefore( localtime2))
		{
			System.out.println("localtime1 comes before localtime2");			
		}
		
		//isAfter() example
		if(localtime2.isAfter( localtime))
		{
			System.out.println("localtime3 comes after localtime");
		}
	}
}