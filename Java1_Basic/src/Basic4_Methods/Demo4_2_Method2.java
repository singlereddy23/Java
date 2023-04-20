package Basic4_Methods;

public class Demo4_2_Method2
{
	//Do not use Static Method in non-Static method
	//If you want to access them, Create an Object for the method
	//Object is a class of an Instance
	
	public void Addition(int a, int b)	//non-Static method
	{
		System.out.println("Addition Value: " + (a+b));
	}

	public static void main(String[] args)	//Static method
	{
		Demo4_2_Method2 add = new Demo4_2_Method2();	//Created a Object for the method
		add.Addition(25, 25);	//accessing the non-Static method using Object
	}
}