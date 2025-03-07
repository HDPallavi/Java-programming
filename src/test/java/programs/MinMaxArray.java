package programs;

public class MinMaxArray 
{

	public static void main(String[] args) 
	{
		int[] numbers= {23, 89, 12, 45, 67, 90, 3, 78};
		
		int min=numbers[0];
		int max=numbers[0];
		
		for (int num:numbers) 
		{
			if(num<min) 
			{
				min=num;
			}
			
			if(num>max) 
			{
				max=num;
			}
		}
		
		System.out.println(min);
		System.out.println(max);

	}

}
