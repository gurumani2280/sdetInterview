package javaprograms;

public class Junkcharactersremoval 
{
		public static void main(String[] args) 
		{
			String s = "@#$%%^^^& seleNIUM1234 !@#$%%";
			s= s.replaceAll("[^a-zA-Z0-9]" , " ");
			System.out.println(s);
		}

}
