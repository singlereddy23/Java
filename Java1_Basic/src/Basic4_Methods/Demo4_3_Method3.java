package Basic4_Methods;

public class Demo4_3_Method3
{
	//Method should return the value & store in a result & print the value
	//when you return the value do not use VOID instead use DataType of the value
	
	public int Addition(int a, int b)
	{
		return a+b;
	}

	public static void main(String[] args)
	{
		Demo4_3_Method3 add = new Demo4_3_Method3();
		int result = add.Addition(25, 25);
		System.out.println(result);
	}
}