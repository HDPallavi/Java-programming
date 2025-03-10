package programs;

public class RemoveWhitespacefromString 
{

	public static void main(String[] args) 
	{
		String s1="hello  wor ld  ";
		String s2=s1.replaceAll("\\s", "");
		System.out.println(s2);		
	}

}
