package Adv4_Inheritance;

public class Demo4_3_StudentThree extends Demo4_1_StudentOne
{
	//Method OVERRIDING: The Parent class Method can be modified in the child class
	//OverRiding the Demo4_1_StudentOne class Method in Demo4_3_StudentThree class
	public void GetStudentName()
	{
		System.out.println("Reddy");
	}
	
	
	public static void main(String[] args)
	{
		Demo4_3_StudentThree obj = new Demo4_3_StudentThree();
		obj.GetStudentName();
	}
}