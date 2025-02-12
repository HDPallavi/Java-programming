package programs;

public class FindLargestNumber 
{

	public static void main(String[] args) 
	{
		int n1=23;
		int n2=55;
		int n3=2;
		
		if(n1>n2 && n1>n3) 
		{
			System.out.println(n1);
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.println(n2);
		}
		else
		{
			System.out.println(n3);
		}

	}

}
