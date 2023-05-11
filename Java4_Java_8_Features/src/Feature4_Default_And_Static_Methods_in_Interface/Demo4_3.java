package Feature4_Default_And_Static_Methods_in_Interface;

//Static Methods inside Interfaces

interface Inter
{
	public static void m2()	//Static Method is to define General utility Method
	{	System.out.println("Interface Static Method");
	}
}
public class Demo4_3 implements Inter
{
	public static void main(String[] args)
	{
		Demo4_3 t = new Demo4_3();
		//t.m1();
		//Demo5_3.m1();
		Inter.m2();
	}
}