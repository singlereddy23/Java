package Adv7_AbstractClasses;

//A abstract keyword is used to declare abstract class & methods

//Abstract Class: is a restricted class that cannot be used to create objects 
//(to access it, it must be inherited from another class)

//Abstract Method: can only be used in an abstract class, & it does not have a body
//the body is provided by the child classes

abstract class Student
{
	public abstract void getName();

	public abstract void getAge();
}

class StudentOne extends Student
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

class Studenttwo extends Student
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

public class Demo7
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