package javaprograms;

public class reverseString 
{
	public static void main(String[] args)
	{
		String s =  "I am not a String";
		String rev = " ";
		
		for( int i = s.length()-1 ; i >= 0 ; i--)
		{
			rev = rev+ s.charAt(i);
		}
		System.out.println(s);
		System.out.println(rev);
	
		
		//StringBuffer sf = new StringBuffer(s);
		//System.out.println(sf.reverse());
	}

}
