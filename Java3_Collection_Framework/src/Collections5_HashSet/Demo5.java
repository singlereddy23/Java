package Collections5_HashSet;

import java.util.HashSet;

//HashSet Collection, Helps to store only unique elements
//Never allows to store or doesn't Print duplicate values
//It doesn't follow Order

public class Demo5
{
	public static void main(String[] args)
	{
		
		HashSet<String> EmpNames = new HashSet<>();
		EmpNames.add("Kamal");
		EmpNames.add("Vishnu");
		EmpNames.add("Sai");
		EmpNames.add("Manju");
		EmpNames.add("Sai");
		
		System.out.println(EmpNames);
		
	}
}