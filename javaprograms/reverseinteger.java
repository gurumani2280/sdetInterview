package javaprograms;

public class reverseinteger 
{
	public static void main(String[] args) 
	{
		 
		long num = 12345;
		//System.out.println(new StringBuffer(String.valueOf(num)).reverse());
		
		long rev = 0;
		while(num != 0)
		{
			rev = rev * 10 + num % 10;
			num = num/10;
		}
		System.out.println(rev);
	}

}
