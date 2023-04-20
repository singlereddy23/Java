package Adv5_Polymorphism;

//Polymorphism in java is a concept by which we can perform a single action in different ways
//Same Method reusing Multiple times
public class Demo5
{
	class StudentOne{
		public void GetStudentName(){	//Method
			System.out.println("Kamal");
		}
	}
	class StudentTwo extends StudentOne{	
		public void GetStudentName(){	//Same Method
			System.out.println("Reddy");
		}
	}
	class StudentThree extends StudentTwo{	
		public void GetStudentName(){	//Same Method
			System.out.println("SingleReddy");
		}
	}
	
	public static void main(String[] args)
	{
		
	}
}