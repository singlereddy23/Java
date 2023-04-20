package Basic4_Methods;

public class Demo4_4_Method4	
{
	//Method Overloading - same method name with different functionality
	
	public int Addition(int a, int b)
	{
		return a+b;
	}
	public double Addition(double a, double b)
	{
		return a+b;
	}
	
	
	public static void main(String[] args)
	{
		Demo4_4_Method4 add = new Demo4_4_Method4();
		
		int result = add.Addition(25, 25);
		System.out.println(result);
		
		double result2 = add.Addition(2.5, 2.5);
		System.out.println(result2);
	}
}