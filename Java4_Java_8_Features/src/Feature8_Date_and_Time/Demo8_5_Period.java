package Feature8_Date_and_Time;

import java.time.LocalDate;
import java.time.Period;

public class Demo8_5_Period
{
	public static void main(String[] args)
	{
		LocalDate birthday = LocalDate.of(1997, 9, 23);
		LocalDate today = LocalDate.now();
		Period p = Period.between(birthday, today);
		System.out.printf("Age is %d Years %d Months %d Days", 
				p.getYears(),p.getMonths(),p.getDays());
		
		LocalDate deathday = LocalDate.of(1997+60, 9, 23);
		Period p1 = Period.between(deathday, today);
		int d = p1.getYears()*365+p1.getMonths()*30+p1.getDays();
		System.out.printf("\n You will be on the Earth only %d Days.., "
				+ "Hurry up to do More Important Things",d);	
	}
}