package programs;

import java.util.Scanner;

public class PalindromString 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value");
		String s1=sc.next();
		String os=s1;
		String rs="";
		
		System.out.println(os);
		
		int length=s1.length();
		
		for(int i=length-1;i>=0;i--) 
		{
			rs=rs+s1.charAt(i);
		}
		
		System.out.println(rs);
		
		if(os.equals(rs)) 
		{
			System.out.println("palindrom");
		}
		else
		{
			System.out.println("not palindrom");
		}

		
	}

}
