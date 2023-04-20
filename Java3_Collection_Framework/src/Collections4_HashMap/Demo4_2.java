package Collections4_HashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class Demo4_2
{
	public static void main(String[] args)
	{
		HashMap<String, Integer> Employee = new HashMap<>();
		Employee.put("Kamal", 23);
		Employee.put("Vishnu", 30);
		Employee.put("Manju", 15);

		for (Entry<String, Integer> emp : Employee.entrySet())
		{
			System.out.println("Key: " + emp.getKey() + "Value: " + emp.getValue());
		}
	}
}