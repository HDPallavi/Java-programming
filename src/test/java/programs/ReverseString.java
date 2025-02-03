package programs;

public class ReverseString 
{

	public static void main(String[] args) 
	{
		String str="welcome";
		int length=str.length();
		String rev_string="";
		
		for( int i=length-1; i>0; i--) 
		{
			rev_string=rev_string+str.charAt(i);
			
		}
		System.out.println(rev_string);

	}

}
