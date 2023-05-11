package Feature7_Streams;

import java.util.stream.Stream;

public class Demo7_3	//Stream.of() method
{
	public static void main(String[] args)
	{
		Stream<Integer> s = Stream.of(9,99,999,9999,99999);
		s.forEach(System.out::println);//for Group of Values
		
		Double[] d = {10.1,20.2,30.3,40.4,50.5};
		Stream<Double> s1 = Stream.of(d);
		s1.forEach(System.out::println);//for Arrays
	}
}