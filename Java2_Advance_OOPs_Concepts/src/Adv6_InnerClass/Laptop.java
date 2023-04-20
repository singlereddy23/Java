package Adv6_InnerClass;

public class Laptop
{
	String LaptopName = "HP";

	class Processor
	{
		String ProcessorName = "Intel Core i5 8th Gen";
	}

	public static void main(String[] args)
	{
		Laptop Outer = new Laptop();
		System.out.println(Outer.LaptopName);

		Laptop.Processor Inner = Outer.new Processor();
		System.out.println(Inner.ProcessorName);
	}
}