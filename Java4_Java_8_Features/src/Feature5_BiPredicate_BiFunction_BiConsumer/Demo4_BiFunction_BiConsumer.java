package Feature5_BiPredicate_BiFunction_BiConsumer;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

//Demo Program to increment employee Salary by using BiConsumer

class Emp
{
	String name;
	Double salary;
	public Emp(String name, Double salary)
	{	this.name = name;
		this.salary = salary;
	}
	/*public String toString()
	{
		return "Emp [name= " + name + ",	salary=	" + salary + "]";
	}*/
}

public class Demo4_BiFunction_BiConsumer
{
	public static void main(String[] args)
	{
		ArrayList<Emp> a = new ArrayList<Emp>();
		BiFunction<String, Double, Emp> f = (name, salary) -> new Emp(name, salary);
		a.add(f.apply("Kamal", 3000.0));
		a.add(f.apply("Vishnu", 2500.0));
		a.add(f.apply("SaiTeja", 2000.0));
		a.add(f.apply("Manju", 1500.0));
		//System.out.println(a.toString());
		
		BiConsumer<Emp, Double> c = (e, increment) -> e.salary = e.salary + increment;
		for (Emp e : a)
		{
			c.accept(e, 500.0);
		}
		for (Emp e : a)
		{
			//System.out.println(e.toString());
			System.out.println(e.name);
			System.out.println(e.salary);
		}
	}
}