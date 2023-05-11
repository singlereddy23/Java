package Feature8_Date_and_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class Demo8_1
{
	public static void main(String[] args)
	{
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		LocalDateTime dt1 = LocalDateTime.of(1997, Month.SEPTEMBER,23,12,45);
		System.out.println(dt1);
		System.out.println("After Six Months: " + dt1.plusMonths(3));
		System.out.println("Before Six Months: " + dt1.minusMonths(3));
		
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
	}
}