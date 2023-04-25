package Feature2_Functional_Interface;

//Just printing message in Abstract Method using Interface & Lambda Expressions

interface Interf
{
	public void m1();
}

public class Demo2_3
{
	public static void main(String[] args)
	{
		Interf i = ( ) -> System.out.println("m1() method Implementation");
		i.m1();
	}
}