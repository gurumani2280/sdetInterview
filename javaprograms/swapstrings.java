package javaprograms;

public class swapstrings 
{
	public static void main(String[] args) {
		String a = "abc";
		String b = "xyz";
		System.out.println("values before swapping " + a + " and " + b);
		String t = a;
		a = b;
		b = t;
		System.out.println("values after swapping " + a + " and " + b);
	}
}
