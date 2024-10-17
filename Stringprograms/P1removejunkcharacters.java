package Stringprograms;

public class P1removejunkcharacters {
	public static void main(String[] args) 
	{
		String s = "@#$%%^^^& seleNIUM1234 !@#$%%";
		s= s.replaceAll("[^a-zA-Z0-9]" , " ");
		System.out.println(s);
		System.out.println(s.trim());
		System.out.println(s.replaceAll(" ",""));
	}

}
