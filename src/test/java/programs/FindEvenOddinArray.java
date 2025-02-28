package programs;

public class FindEvenOddinArray 
{

	public static void main(String[] args) 
	{
		int a[]= {2,5,7,8};
		
		for(int i=0; i<=a.length-1;i++) 
		{
			if(a[i]%2==0) 
			{
				System.out.println("even number"+" "+a[i]);
			}
		}
		
		for(int i=0; i<=a.length-1; i++) 
		{
			if(a[i]%2!=0) 
			{
				System.out.println("odd number"+" "+a[i]);
			}
		}

	}

}
