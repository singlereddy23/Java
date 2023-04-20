package Collections4_HashMap;

import java.util.HashMap;

public class Demo4_3
{
	public static void main(String[] args)
	{
		HashMap<String, Integer> Employee = new HashMap<>();
		Employee.put("Kamal", 23);
		Employee.put("Vishnu", 30);
		Employee.put("Manju", 15);

		for (String names : Employee.keySet())
		{
			System.out.println(names);
		}
		
		for (Integer Dob : Employee.values())
		{
			System.out.println(Dob);
		}
		
	}
}