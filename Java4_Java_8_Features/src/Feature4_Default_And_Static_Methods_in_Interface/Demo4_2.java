package Feature4_Default_And_Static_Methods_in_Interface;

//Differences between Interface with Default Methods and Abstract classes
//Default Methods can be access in Abstract Method by using super keyword

interface Right
{	default void m1()	//Default Method
	{	System.out.println("Right Default Method");
	}
}
interface Left
{	default void m1()	//Default Method
	{	System.out.println("Left Default Method");
	}
}

public class Demo4_2 implements Right, Left
{
	public void m1()	//Abstract Method
	{	System.out.println("My Own Implementation");
		Right.super.m1();
		Left.super.m1();
	}
	public static void main(String[] args)
	{	Demo4_2 t = new Demo4_2();
		t.m1();
	}
}