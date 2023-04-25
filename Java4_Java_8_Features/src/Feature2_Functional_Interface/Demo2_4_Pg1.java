package Feature2_Functional_Interface;

interface Interfa
{
	public void add(int a, int b);
}

public class Demo2_4_Pg1
{
	public static void main(String[] args)
	{
		Interfa i = (a,b) -> System.out.println("Addition: " + (a+b) );
		i.add(100, 200);
		i.add(200, 300);
	}
}