package javaprograms;

public class swapstringswithoutthirdvariable 
{
	public static void main(String[] args) 
	{
		String a = "abc";
		String b = "xyz";
		System.out.println("values belore swapping are:");
		System.out.println("value of a before swapping is " + a);
		System.out.println("value of b before swapping is " + b);
		a = a + b;
		b = a.substring(0,(a.length()-b.length()));
		a = a.substring(b.length());
		System.out.println("Values after swapping are:");
		System.out.println("value of a after swapping is " + a);
		System.out.println("value of b after swapping is " + b);
	}
}
