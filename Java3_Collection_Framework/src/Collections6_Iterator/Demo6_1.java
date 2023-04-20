package Collections6_Iterator;

import java.util.ArrayList;
import java.util.Iterator;

//Iterator is an Object that can be used to loop through collections
//like ArraayList & HashSet

public class Demo6_1
{
	public static void main(String[] args)
	{
		ArrayList<Integer> score = new ArrayList<>();
		score.add(10);
		score.add(20);
		score.add(30);
		score.add(40);
		score.add(50);
		
		Iterator<Integer> result = score.iterator();
		
		while (result.hasNext())
		{
			System.out.println(result.next());
		}
	}
}