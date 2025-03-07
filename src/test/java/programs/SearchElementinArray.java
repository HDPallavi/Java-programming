package programs;

import java.util.Scanner;

public class SearchElementinArray 
{

	public static void main(String[] args) 
	{
		int[] numbers= {10, 25, 32, 47, 55, 63, 89};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		
		for(int num1:numbers)
		{
			if (num==num1) 
			{
				System.out.println("element found"+" "+num1);
			}
			
		}
		

	}

}
