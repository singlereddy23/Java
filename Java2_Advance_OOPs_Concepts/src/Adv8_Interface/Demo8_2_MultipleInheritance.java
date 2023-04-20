package Adv8_Interface;

//"Multiple Inheritance" can be achieved with Interfaces

interface Student1
{
	default void getName()
	{
		System.out.println("Reddy");
	}
}

interface Student2
{
	default void getName()
	{
		System.out.println("Kamal");
	}
}

class Student3 implements Student1, Student2
{
	public void getName()
	{
		Student1.super.getName();
		Student2.super.getName();
	}
}

public class Demo8_2_MultipleInheritance
{
	public static void main(String[] args)
	{
		Student3 obj = new Student3();
		obj.getName();
	}
}