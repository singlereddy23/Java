package Adv3_Encapsulation;

public class Demo3
{
	//Encapsulation is a concept of bundling of fields & Methods inside a single class
	//It is a Approach of restricting direct access to the some of the elements(Fields, Methods etc.,) 
	
	//declare class variables as private
	//provide public get and set methods to access & update the value of a private variable
	
	String Name;
	
	public String getName()
	{	return Name;
	}
	public void setName(String name)
	{	Name = name;
	}
	
	public Demo3()
	{	super();
	}
	
	public Demo3(String name)
	{	super();
		Name = name;
	}
	
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	}
}