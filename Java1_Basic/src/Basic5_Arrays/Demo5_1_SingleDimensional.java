package Basic5_Arrays;

public class Demo5_1_SingleDimensional
{
	public static void main(String[] args)
	{
		int score[]= {10,20,30};
		System.out.println(score[2]);
		System.out.println(score[0] +" "+ score[1] +" "+ score[2]);
		
		System.out.println("--------------------");
		
		int[] a=new int[5];
		a[0]=10;
		a[1]=20;  
		a[2]=30;  
		a[3]=40;  
		a[0]=100;
		for(int i=0;i<a.length;i++)//length is the property of array  
		{
			System.out.println(a[i]);
		}
	}
}