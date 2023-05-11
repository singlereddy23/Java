package Feature3_Collections_Using_Lambda_Expressions;

import java.util.TreeMap;

public class Demo3_3	//TreeMap using compare method
{
	public static void main(String[] args)
	{
		TreeMap<Integer, String> t = new TreeMap<>();
		t.put(101, "Kamal");
		t.put(104, "Vishnu");
		t.put(105, "Manju");
		t.put(102, "Sai");
		t.put(103, "Ammu");
		System.out.println("Before Sorting	: " + t);
		
		TreeMap<Integer, String> s = new TreeMap<>((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
		s.put(101, "Kamal");
		s.put(104, "Vishnu");
		s.put(105, "Manju");
		s.put(102, "Sai");
		s.put(103, "Ammu");
		System.out.println("After Sorting	: " + s);
	}
}