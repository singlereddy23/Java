package Feature3_Collections_Using_Lambda_Expressions;

import java.util.TreeSet;

public class Demo3_2	//TreeSet using compare method
{
	public static void main(String[] args)
	{
		TreeSet<Integer> a = new TreeSet<Integer>();
		a.add(10);
		a.add(0);
		a.add(20);
		a.add(40);
		a.add(30);
		System.out.println("Before Sorting	: " + a);
		
		TreeSet<Integer> b = new TreeSet<Integer>((I1, I2) -> (I1 > I2) ? -1 : (I1 < I2) ? 1 : 0);
		b.add(10);
		b.add(0);
		b.add(20);
		b.add(40);
		b.add(30);
		System.out.println("After Sorting	: " + b);
	}
}