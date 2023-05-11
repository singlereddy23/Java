package Feature2_Functional_Interface;

interface Interfac
{
	public int Getlength(String s);
}

public class Demo2_5_Pg2
{
	public static void main(String[] args)
	{
		Interfac i = s -> s.length();
		System.out.println(i.Getlength("Kamal"));
		System.out.println(i.Getlength("SINGLEREDDY"));
	}
}