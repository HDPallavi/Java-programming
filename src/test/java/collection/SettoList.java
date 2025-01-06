package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SettoList 
{

	public static void main(String[] args) 
	{
		Set<String> s=new HashSet<String>();
		s.add("abc");
		s.add("welcome");
		
		List<String> l=new ArrayList<String>(s);
		for (String b:l)
		{
			System.out.println(b);
		}

	}

}
