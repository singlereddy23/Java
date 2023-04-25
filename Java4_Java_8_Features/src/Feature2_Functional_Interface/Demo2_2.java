package Feature2_Functional_Interface;

//Functional Interface with Inheritance

public class Demo2_2
{
	/*
	Case1 Valid:	If an interface extends Functional Interface & child Interface doesn't contain any 
					abstract method then child Interface is also called Functional Interface
		@FunctionalInterface
		interface a
		{
			public void m1();
		}
		@FunctionalInterface
		interface b extends a
		{
		}
	
	Case2 Valid:	In child interface, we can define exactly same parent interface abstract method
		@FunctionalInterface
		interface a
		{
			public void m1();
		}
		@FunctionalInterface
		interface b extends a
		{
			public void m1();
		}
	
	Case3 Valid:	without declaring @FunctionalInterface In child interface, we can define abstract method 
					apart from the parent interface abstract method
		@FunctionalInterface
		interface a
		{
			public void m1();
		}
		interface b extends a
		{
			public void m2();
		}
	
	Case4 In-Valid:	In child interface, we can't define any new abstract methods, otherwise we will get CompileTime Error
		@FunctionalInterface
		interface a
		{
			public void m1();
		}
		@FunctionalInterface
		interface b extends a
		{
			public void m2();
		}
	*/
	
	public static void main(String[] args)
	{
	}
}