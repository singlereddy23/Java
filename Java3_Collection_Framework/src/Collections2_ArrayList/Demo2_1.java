package Collections2_ArrayList;

//ArrayList is an resizable array

import java.util.ArrayList;

public class Demo2_1
{
	public static void main(String[] args)
	{
		ArrayList<Integer> Score = new ArrayList<Integer>();
		Score.add(10);
		Score.add(90);
		Score.add(20);
		Score.add(300);
		Score.add(40);
		Score.set(3, 30);
		System.out.println(Score);
		Score.remove(1);
		System.out.println(Score);
	}
}