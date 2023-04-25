package Feature2_Functional_Interface;

//Runnable -> run()
//Implement Thread using Thread using Runnable

public class Demo2_7
{
	public static void main(String[] args)
	{
		Runnable r = ()->
		{
			for (int i = 0; i < 10; i++)
			{
				System.out.println("Child Thread");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Main Thread");
		}
	}
}