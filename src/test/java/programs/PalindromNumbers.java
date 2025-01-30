package programs;

import java.util.Scanner;

public class PalindromNumbers 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int org_num=num;
		int rev_num=0;
		
		while(num!=0) 
		{
			rev_num= rev_num*10+num%10;
			System.out.println(rev_num);
			num=num/10;
			System.out.println(num);
		}
		if(rev_num==org_num) 
		{
			System.out.println("number is a palindrom");
		}
		else
		{
			System.out.println("number not a palindrom");
		}

	}

}
