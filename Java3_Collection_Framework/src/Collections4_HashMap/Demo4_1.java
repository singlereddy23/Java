package Collections4_HashMap;

//HashMap used to store data in "Key/value" pair

import java.util.HashMap;

public class Demo4_1
{
	public static void main(String[] args)
	{
		HashMap<String, Integer> Employee = new HashMap<>();
		Employee.put("Kamal", 23);
		Employee.put("Vishnu", 30);
		Employee.put("Manju", 15);
		
		System.out.println(Employee);
		
		System.out.println(Employee.get("Vishnu"));
	}
}