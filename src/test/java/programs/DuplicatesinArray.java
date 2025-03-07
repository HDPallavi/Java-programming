package programs;

public class DuplicatesinArray 
{

	public static void main(String[] args) 
	{
		int[] numbers= {4, 5, 7, 2, 5, 8, 7, 9, 1, 4};
		
		for (int i=0;i<=numbers.length-1;i++) 
		{
			for(int j=i+1;j<=numbers.length-1;j++) 
			{
				if(numbers[i]==numbers[j])
				{
					System.out.println(numbers[i]);
					break;
				}
				
			}
		}

	}

}
