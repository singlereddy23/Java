package Feature1_Lambda_Expressions;

//λ Expression: is Anonymous function
//Not having name, modifiers, any return type
//( ) -> sopln("Hello");
//(a,b) -> sopln(a+b);
//s -> s.length();

public class Demo1_1
{
	public static void main(String[] args)
	{
		/*public void m1()	//code in Java
		{
			System.out.println("Hello"); 
		}*/
		//( ) -> {System.out.println("Hello")};	//code in λ Expression
		//( ) -> System.out.println("Hello");
		
		
		
		/*public void add(int a, int b)	//code in Java
		{
			System.out.println(a+b); 
		}*/
		//(int a, int b) -> System.out.println(a+b);	//code in λ Expression
		//(a,b) -> System.out.println(a+b);
		
		
		
		/*public int getlength(string s)	//code in Java
		{
			return s.length(); 
		}*/
		//(string s) -> {return s.length()};	//code in λ Expression
		//(s) -> return s.length();
		//(s) -> s.length();
		//s -> s.length();
	}
}