package Adv1_Objects_and_Constructors;

public class Demo1_2
{
	public static void main(String[] args)
	{
		Demo1_1 f1 = new Demo1_1();	//Creating Object
		f1.setName("kamal");	//Initialize values using Setters
		f1.setRollno(23);
		f1.setAddress("Tirupati");
		System.out.println(f1.getName() +" "+ f1.getRollno() +" "+ f1.getAddress());	//Getters to Display Output
		
		System.out.println("-------------------");
		
		Demo1_1 f2 = new Demo1_1();	//Creating Object
		f2.Name="Sai";	//Initialize values to Default Constructor
		f2.rollno=01;
		f2.Address="Bangalore";
		f2.Display();	//Method to Display Output
		
		System.out.println("-------------------");
		
		Demo1_1 f3 = new Demo1_1("Lonvitha", 25, "Hyderabad");	//Creating Object & Initialize values to Constructor with Fields
		System.out.println(f3.toString());	//ToString to Display Output
	}
}