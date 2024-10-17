package javaprograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateusingHashset 
{
	public static void main(String[] args)
	{
		String names[] = {"java", "C", "javascript", "java", "python", "C"};
		Set<String> store = new HashSet<String>();
		for(String name : names)
		{
			if(store.add(name)==false)
			{
				System.out.println("duplicate element is " + name);
			}
		}
		System.out.println("Print " + store);
	}

}
