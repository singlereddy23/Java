package Feature2_Functional_Interface;

interface Interface
{
	public int SquareIt(int x);
}

public class Demo2_6_Pg3
{
	public static void main(String[] args)
	{
		Interface i = x -> x*x;
		System.out.println(i.SquareIt(5));
		System.out.println(i.SquareIt(3));
	}
}