package Collections6_Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo6_2
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
			if (result.next() >= 30) {
				System.out.println("Great work");
			}
			else {
				System.out.println("Work Well");
			}
		}
	}
}