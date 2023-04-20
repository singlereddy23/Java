package Adv6_InnerClass;

//InnerClass/NestedClass: It is to group the classes that belong together
//which makes your code more readable & maintainable

public class Mobile
{
	String MobileName = "Poco";

	class Processor
	{
		String ProcessorName = "Snapdragon_845";
	}
	class Display
	{
		String DisplayName = "Super_Amoled";
	}
	class Battery
	{
		int BatteryCapacity = 5000;
	}

	public static void main(String[] args)
	{
		Mobile MobileDetails = new Mobile();
		System.out.println(MobileDetails.MobileName);

		Mobile.Processor ProcessorDetails = MobileDetails.new Processor();
		System.out.println(ProcessorDetails.ProcessorName);

		Mobile.Display DisplayDetails = MobileDetails.new Display();
		System.out.println(DisplayDetails.DisplayName);

		Mobile.Battery BatteryDetails = MobileDetails.new Battery();
		System.out.println(BatteryDetails.BatteryCapacity);
	}
}