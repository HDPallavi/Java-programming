package programs;

public class EvenAndOddNumbers 
{

	public static void main(String[] args) 
	{
		int num=12345;
		int even=0;
		int odd=0;
		
		while(num>0) 
		{
			int rnum=num%10;
			
			if(rnum%2==0)
			{
				even++;
				
			}
			else 
			{
				odd++;
			}
			
			num=num/10;
		}
		
		System.out.println(even);
		System.out.println(odd);
	}

}
