package Feature7_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo7_2
{
	public static void main(String[] args)
	{
		ArrayList<String> l = new ArrayList<>();
		l.add("PavanKalyan");	l.add("RaviTeja");
		l.add("Chiranjeevi");	l.add("Nagarjuna");
		l.add("MaheshBabu");	l.add("JuniorNTR");
		System.out.println(l);

		List<String> l2 = l.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(l2);//Out by Map
		
		List<String> l1 = l.stream().filter(s->s.length()>=10).collect(Collectors.toList());
		System.out.println(l1);//Out by filter
		
		Long count = l.stream().filter(s->s.length()>=10).count();
		System.out.println("The no of String whose length >=10 is: " + count);//Out by Count
		
		l.stream().forEach(s->System.out.println(s));//Out by forEach method using Lambda Expressions
		
		l.stream().forEach(System.out::println);//Out by forEach method using Method Reference
	}
}