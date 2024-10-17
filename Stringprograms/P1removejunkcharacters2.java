package Stringprograms;

public class P1removejunkcharacters2 {
	public static void main(String[] args) 
	{
		String s = "@#$%%^^^& seleNIUM1234 !@#$%%";
		s= s.replaceAll("[^\\w]" , " ");
		System.out.println(s);
		System.out.println(s.trim());
		System.out.println(s.replaceAll(" ",""));
	}

}
