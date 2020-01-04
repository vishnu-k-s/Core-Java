package JavaDateTime;

import java.time.Clock;
import java.time.Duration;
public class JavaClockExample 
{
	public static void main(String[] args) 
	{
		Clock c1=Clock.systemDefaultZone();
		System.out.println(c1.getZone());       //to print time zone
		Clock c2=Clock.systemUTC();             //UTC standard time
		System.out.println(c1.instant());
		Duration d=Duration.ofHours(5);
		Clock clock=Clock.offset(c2,d);         //adding 5 to UTC standard time
		System.out.println(clock.instant());
	}
}