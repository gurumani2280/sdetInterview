package Stringprograms;

import java.util.Arrays;

public class P2reverseWord {
	public static void main(String[] args) 
	{
		String str = "India is my country";
		String splitArray[] = str.split(" ");
		System.out.println(Arrays.toString(splitArray));
		System.out.println("Number of words in given string " + splitArray.length);
		String output = "";
		for(int i = splitArray.length-1; i >= 0 ; i--)
		{
			output = output + " " + splitArray[i];
		}
		System.out.println(output.trim());
		System.out.println("length of string" + output.length());
	}
}
