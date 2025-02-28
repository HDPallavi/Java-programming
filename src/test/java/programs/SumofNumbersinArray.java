package programs;

public class SumofNumbersinArray 
{

	public static void main(String[] args) 
	{
		int a[]= {3,5,10,88};
		int sum=0;
		
		for (int i=0 ; i<=a.length-1; i++) 
		{
			sum=sum+a[i];
		}
		
		System.out.println(sum);

	}

}
