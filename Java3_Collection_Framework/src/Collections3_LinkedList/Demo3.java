package Collections3_LinkedList;

//Linkedlist is an same as Arraylist,
//But the way of storing elements is different.

import java.util.LinkedList;

public class Demo3
{
	public static void main(String[] args)
	{
		LinkedList<Integer> Score = new LinkedList<Integer>();
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