package Feature5_BiPredicate_BiFunction_BiConsumer;

import java.util.function.BiFunction;

public class Demo2_1_BiFunction
{
	public static void main(String[] args)
	{
		BiFunction<Integer, Integer, Integer> f = (a, b) -> (a * b);
		System.out.println(f.apply(10, 10));
		System.out.println(f.apply(10, 20));
	}
}