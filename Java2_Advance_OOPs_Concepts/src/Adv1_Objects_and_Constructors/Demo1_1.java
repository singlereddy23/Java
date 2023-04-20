package Adv1_Objects_and_Constructors;

public class Demo1_1
{
	String Name;	//Fields
	int rollno;
	String Address;
	
	//If you declare Private the scope will be with in the class only
	//So we need Getters & Setters to access the Private Fields
	//Getters & Setters are used for Private Fields  Eg: Private String Name;
	public String getName()		//Getters
	{	return Name;
	}
	public void setName(String name)	//Setters
	{	Name = name;
	}
	public int getRollno()
	{	return rollno;
	}
	public void setRollno(int rollno)
	{	this.rollno = rollno;
	}
	public String getAddress()
	{	return Address;
	}
	public void setAddress(String address)
	{	Address = address;
	}

	public Demo1_1()	//Default Constructor or Constructor with No-Fields
	{	super();
	}
	
	public Demo1_1(String name, int rollno, String address)	//Constructor with Fields
	{	super();
		Name = name;
		this.rollno = rollno;
		Address = address;
	}
	
	public void Display()	//Method
	{
		System.out.println("Name= " + Name + ", rollno= " + rollno + ", Address= " + Address);
	}
	
	public String toString()	//ToString
	{
		return "Test1 [Name=" + Name + ", rollno=" + rollno + ", Address=" + Address + "]";
	}
}