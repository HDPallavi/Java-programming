package programs;

public class OccurrencesofCharacterinString 
{

	public static void main(String[] args) 
	{
		String s1="java programming";
	    String s2=s1.replaceAll("m","");
	    System.out.println(s1);
	    System.out.println(s2);
	    int l=s1.length()-s2.length();
	    System.out.println(l);
	}

}
