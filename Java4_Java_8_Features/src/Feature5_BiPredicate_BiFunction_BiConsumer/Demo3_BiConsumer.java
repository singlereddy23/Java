package Feature5_BiPredicate_BiFunction_BiConsumer;

import java.util.function.BiConsumer;

public class Demo3_BiConsumer
{
	public static void main(String[] args)
	{
		BiConsumer<String, String> c = (s1, s2) -> System.out.println(s1 + s2);
		c.accept("Single", "Reddy");
	}
}