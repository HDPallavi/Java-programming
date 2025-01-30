package programs;

public class SwapNumber 
{

	public static void main(String[] args) 
	{
		int a=10,b=20;
		
		//using another variable
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
		
		//without using another variable
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		
	}

}
