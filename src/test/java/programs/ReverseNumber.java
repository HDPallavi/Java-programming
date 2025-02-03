package programs;

import java.util.Scanner;

public class ReverseNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int rev_num=0;
		
		while(num!=0)
		{
			rev_num=rev_num*10+num%10;
			num=num/10;
		}
		
		System.out.println(rev_num);

	}

}
