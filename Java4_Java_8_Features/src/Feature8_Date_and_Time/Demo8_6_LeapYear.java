package Feature8_Date_and_Time;

import java.time.Year;
import java.util.Scanner;

public class Demo8_6_LeapYear
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number: ");
		int n = sc.nextInt();
		Year y = Year.of(n);
		if (y.isLeap())
		{
			System.out.printf("%d Year is a Leap Year",n);	//1980, 2020
		}
		else
		{
			System.out.printf("%d Year is Not Leap Year",n);
		}
	}
}