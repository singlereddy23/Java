package Feature3_Collections_Using_Lambda_Expressions;

import java.util.ArrayList;
import java.util.Collections;

public class Employee
{
	Integer eno;
	String ename;
	public Employee(Integer eno, String ename)
	{	super();
		this.eno = eno;
		this.ename = ename;
	}
	public String toString()
	{	return "Employee [eno=" + eno + ", ename=" + ename + "]";
	}
	
	public static void main(String[] args)
	{
		//Employee e1 = new Employee(100, "Kamal");
		//System.out.println(e1);
		
		ArrayList<Employee> a = new ArrayList<Employee>();
		a.add(new Employee(30, "Sai"));
		a.add(new Employee(10, "Kamal"));
		a.add(new Employee(40, "Ashwin"));
		a.add(new Employee(20, "Ammu"));
		System.out.println("Before Sorting	:" + a);
		
		Collections.sort(a,(e1,e2)->(e1.eno>e2.eno)?-1:(e1.eno<e2.eno)?1:0);
		System.out.println("After Sorting	:" + a);
	}
}