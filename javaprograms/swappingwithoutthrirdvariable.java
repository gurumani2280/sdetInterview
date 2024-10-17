package javaprograms;

public class swappingwithoutthrirdvariable 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		System.out.println("values before swapping are " + a + " " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("values after swapping are " + a + " " + b);
	}

}
