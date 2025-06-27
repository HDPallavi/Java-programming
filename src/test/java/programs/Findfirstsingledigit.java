package programs;

public class Findfirstsingledigit 
{

	public static void main(String[] args) 
	{
		int[] numbers= {22, 333, 11, 4, 77, 82};
		
		for(int num: numbers) 
		{
			if(num>=0 && num<=9) 
			{
				System.out.println("single digit number" + num);
				return;
			}
			
		}
		System.out.println("not found single digit number" );

	}

}
