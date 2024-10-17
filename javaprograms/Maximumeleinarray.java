package javaprograms;

public class Maximumeleinarray 
{
	public static void main(String[] args) 
	{
		int a[] = {1,3,4,7,0,3};
		int max = a[0];
		for( int i = 1; i <a.length ; i++)
		{
			if(a[i] > max)
			{
				max = a[i];
			}
		}
		System.out.println("maximum number is " + max);
	}
}
