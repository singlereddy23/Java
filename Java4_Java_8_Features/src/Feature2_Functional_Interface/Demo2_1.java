package Feature2_Functional_Interface;

//Functional_Interface: a Interface which contains "Single Abstract Method(SAM)"
//Only One Abstract Method should contain in Functional Interface

//we can use Functional_Interface to invoke LAMBDA expressions using below 4 methods Eg:
//1) Runnable run(),						2) Callable call(),
//3) Action Listener actionperformed(), 	4) Comparable compareTo()

//@FunctionalInterface: this can be used only after Java1.8 version
//this Annatation to indicate it as Functional Interface (or) to specify expectily

@FunctionalInterface
interface Demo2_1
{
	public void m1();	//Abstract Method
	
	default void m2()	//default Method
	{
	}
	public static void main(String[] args)	//static Method
	{
	}
}