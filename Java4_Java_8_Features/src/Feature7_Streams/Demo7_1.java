package Feature7_Streams;

//Collections: Group of Individual Objects in Single Entity
//Streams: is "to process Objects from the collection"
//Stream s = c,stream();
//Configuration---	1)Filtering		2)Mapping
//1)Filter mechanism: Based on some Boolean Conditions Filter Objects From Collections
//Result in Filter: the no of Objects lessthen Original Objects
//2)Map mechanism: For Every Object Double/add/Sub(Manipulate) The Value
//Result in Map: Original Objects and Maped Objects should be objects

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo7_1
{
	public static void main(String[] args)
	{
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(0);	l.add(10);	l.add(20);
		l.add(5);	l.add(15);	l.add(25);
		System.out.println(l);
		
		List<Integer> l1 = l.stream().filter(I->I%2==0).collect(Collectors.toList());
		System.out.println(l1);//Out by filter
		
		List<Integer> l2 = l.stream().map(I->I*2).collect(Collectors.toList());
		System.out.println(l2);//Out by map
		
		List<Integer> l3 = l.stream().sorted().collect(Collectors.toList());
		System.out.println(l3);//Out by sorted Ascending Order
		
		List<Integer> l4 = l.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(l4);//Out by sorted Descending Order
		
		Integer min = l.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(min);//Out by Min & Get
		Integer max = l.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(max);//Out by Max & Get
		
		Integer[] array = l.stream().toArray(Integer[]::new);
		for (Integer x : array)
		{
			System.out.println(x);//Out by toArray
		}
	}
}