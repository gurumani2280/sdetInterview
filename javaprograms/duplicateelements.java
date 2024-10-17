package javaprograms;

public class duplicateelements 
{
	public static void main(String[] args) 
	{
		String names[] = {"java","C", "javascript" , "java" , "C" , "python"};
		for(int i = 0; i < names.length; i++)
		{
			for(int j = i+1; j <names.length; j++)
			{
				if(names[i]==(names[j]))
				{
					System.out.println("duplicate number is " + names[i]);
				}
			}
		}
	}

}
