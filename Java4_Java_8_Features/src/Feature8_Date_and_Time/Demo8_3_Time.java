package Feature8_Date_and_Time;

import java.time.LocalTime;

public class Demo8_3_Time
{
	public static void main(String[] args)
	{
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		int h = time.getHour();
		int m = time.getMinute();
		int s = time.getSecond();
		int n = time.getNano();
		
		System.out.printf("%d:%d:%d:%d", h,m,s,n);
	}
}