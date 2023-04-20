package Adv8_Interface;

//Interface: is a completely "abstract class" that is used to group related methods with empty Bodies

//Similar to abstract classes, Interfaces cannot be used to create objects
//"Multiple Inheritance" can be achieved with Interfaces

interface Student
{
	public void getName();

	public void getAge();
}

class StudentOne implements Student
{
	public void getName()
	{
		System.out.println("Kamal");
	}

	public void getAge()
	{
		System.out.println(25);
	}
}

class Studenttwo implements Student
{
	public void getName()
	{
		System.out.println("Reddy");
	}

	public void getAge()
	{
		System.out.println(23);
	}
}

public class Demo8_1_Interface
{
	public static void main(String[] args)
	{
		Student s1 = new StudentOne();
		s1.getName();
		s1.getAge();

		Student s2 = new Studenttwo();
		s2.getName();
		s2.getAge();
	}
}