package JavaDateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class TimeExample1 
{
	public static void main(String[] args) 
	{
		//current time
		LocalTime localtime =LocalTime.now();
		
		//ISO format
		DateTimeFormatter timeformatter=DateTimeFormatter.ISO_LOCAL_TIME;
		System.out.println(localtime.format(timeformatter));
		
		//hour-of-day(1-24)
		DateTimeFormatter timeformatter1=DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println(localtime.format(timeformatter1));
		
		//clock-hour-of-am-pm(1-24)
		DateTimeFormatter timeformatter2=DateTimeFormatter.ofPattern("kk:mm:ss");
		System.out.println(localtime.format(timeformatter2));
				
		//clock-hour-of-am-pm(1-12)
		DateTimeFormatter timeformatter3=DateTimeFormatter.ofPattern("hh:mm:ss a");
		System.out.println(localtime.format(timeformatter3));
							
		//hour-of-am-pm(0-11)
		DateTimeFormatter timeformatter4=DateTimeFormatter.ofPattern("kk:mm:ss a");
		System.out.println(localtime.format(timeformatter4));
				
		ZoneId zone1= ZoneId.of("Asia/Kolkata");
		ZoneId zone2= ZoneId.of("Asia/Tokyo");
		
		LocalTime time =LocalTime.now(zone1);
		System.out.println("India's Time : "+time);

		LocalTime time1 =LocalTime.now(zone2);
		System.out.println("Japan's Time : "+time1);
		
		long hours=ChronoUnit.HOURS.between(time,time1);
		System.out.println("Hours between two time zones :"+hours);
		long minuts=ChronoUnit.MINUTES.between(time,time1);
		System.out.println("Minutes between two time zones :"+minuts);
	}
}