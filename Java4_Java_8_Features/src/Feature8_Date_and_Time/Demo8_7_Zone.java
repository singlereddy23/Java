package Feature8_Date_and_Time;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Demo8_7_Zone
{
	public static void main(String[] args)
	{
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		
		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zt = ZonedDateTime.now(la);
		System.out.println(zt);
	}
}