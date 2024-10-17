package javaprograms;

import java.util.Arrays;

public class ReverseWord 
{
	public static void main(String[] args) 
	{
		String str = "Hello World";
		String splitArray[] = str.split("");
		System.out.println(Arrays.toString(splitArray));
		for(int i = splitArray.length-1; i >= 0 ; i--)
		{
			System.out.print(splitArray[i]);
		}
	}

}
