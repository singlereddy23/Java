package Feature3_Collections_Using_Lambda_Expressions;

import java.util.ArrayList;
import java.util.Collections;

public class Employees
{
	String Name;
	Integer Empid;
	String Address;
	public Employees(String name, Integer empid, String address)
	{	super();
		Name = name;
		Empid = empid;
		Address = address;
	}
	public String toString()
	{	return "Employees [Name=" + Name + ", Empid=" + Empid + ", Address=" + Address + "]";
	}

	public static void main(String[] args)
	{
		ArrayList<Employees> e = new ArrayList<Employees>();
		e.add(new Employees("Kamal", 2, "Tirupati"));
		e.add(new Employees("Vishnu", 4, "Nellor"));
		e.add(new Employees("Manju", 3, "Bangalore"));
		e.add(new Employees("Sai", 1, "Gadval"));
		System.out.println("Before Sorting:" + e);
		
		Collections.sort(e,(e1,e2)->(e1.Empid>e2.Empid)?-1:(e1.Empid<e2.Empid)?1:0);
		System.out.println("After Sorting:" + e);
	}
}