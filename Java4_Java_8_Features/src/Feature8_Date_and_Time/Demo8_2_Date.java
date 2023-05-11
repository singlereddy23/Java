package Feature8_Date_and_Time;

import java.time.LocalDate;

public class Demo8_2_Date
{
	public static void main(String[] args)
	{
		LocalDate date = LocalDate.now();
		System.out.println(date);

		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yy = date.getYear();
		
		System.out.println(dd+" "+mm+" "+yy);
		System.out.printf("%d:%d:%d", dd,mm,yy);
	}
}