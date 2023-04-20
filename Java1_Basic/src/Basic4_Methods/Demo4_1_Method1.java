package Basic4_Methods;

public class Demo4_1_Method1
{
  //Do not use Static Method in non-Static method
	
  //public void Addition()	//non-Static method
	public static void Addition()	//Static Method
	{
		System.out.println("Addition Value");
	}

	public static void main(String[] args)	//Static Method
	{
		Addition();
	}
}