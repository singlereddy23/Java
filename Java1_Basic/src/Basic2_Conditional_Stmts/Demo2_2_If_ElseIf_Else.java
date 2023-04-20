package Basic2_Conditional_Stmts;

public class Demo2_2_If_ElseIf_Else
{
	public static void main(String[] args)
	{
		int percent = 82;
		if(percent >= 75) {
			System.out.println("First Class");
		}
		else if (percent >= 55) {
			System.out.println("Second Class");
		}
		else if (percent >= 35) {
			System.out.println("Third Class");
		}
		else {
			System.out.println("Failed");
		}
	}
}