package javaprograms;

public class swappingusingthirdvariable 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		System.out.println("values of a and b before swapping are " + a + " and "+ b);
		int t = a;
		a=b;
		b=t;
		System.out.println("values of a and b after swapping are " + a + " and " + b);
	}
}
