package programs;

public class RemoveSpecialcharacterfromString 
{

	public static void main(String[] args) 
	{
		String s1="hello@# wo$%rld";
		
		String s2=s1.replaceAll("[^a-zA-Z0-9 ]","");
		
		System.out.println(s2);

	}

}
