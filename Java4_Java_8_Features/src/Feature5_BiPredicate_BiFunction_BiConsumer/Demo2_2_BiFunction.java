package Feature5_BiPredicate_BiFunction_BiConsumer;

import java.util.function.BiFunction;

//To calculate monthly salary with EMPLOYEE & TIMESHEET objects as input by using BiFunction

class Employee
{
	Integer eno;
	String name;
	Double dailywages;
	public Employee(Integer eno, String name, Double dailywages)
	{
		this.eno = eno;
		this.name = name;
		this.dailywages = dailywages;
	}
}

class TimeSheet
{
	Integer eno;
	Integer days;
	public TimeSheet(Integer eno, Integer days)
	{
		this.eno = eno;
		this.days = days;
	}
}

public class Demo2_2_BiFunction
{
	public static void main(String[] args)
	{
		BiFunction<Employee, TimeSheet, Double> f = (e, t) -> e.dailywages * t.days;
		Employee e = new Employee(101, "Kamal", 3000.0);
		TimeSheet t = new TimeSheet(101, 25);
		System.out.println("Employee Monthly Salary: " + f.apply(e, t));
	}
}