package Feature4_Default_And_Static_Methods_in_Interface;

//Default Methods Inside Interfaces

interface interf
{
	default void m1()
	{	System.out.println("default Method");
	}
}

public class Demo4_1 implements interf
{	public void m1()
	{	System.out.println("My Own Implementation");
	}

	public static void main(String[] args)
	{	Demo4_1 k = new Demo4_1();
		k.m1();
	}
}