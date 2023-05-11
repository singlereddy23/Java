package Feature3_Collections_Using_Lambda_Expressions;

//Comparator: is a interface will contain only one Abstract Method, that is "Compare()" Method
//to define our own sorting(Customized Sorting) we need Compare method

import java.util.ArrayList;
import java.util.Collections;

public class Demo3_1	//ArrayList using compare method
{
	public static void main(String[] args)
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(0);
		a.add(20);
		a.add(40);
		a.add(30);
		System.out.println("Default Sorting			: " + a);
		
		Collections.sort(a);	//Ascending
		System.out.println("Sorting using Sort method	: " + a);
		
		Collections.sort(a, (I1, I2) -> (I1 > I2) ? -1 : (I1 < I2) ? 1 : 0);	//descending
		System.out.println("Sorting using compare method	: " + a);
	}
}