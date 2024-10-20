package Stringprograms;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class P3charactercount4improvedvowelcount {
	
	public static void main(String[] args) {
		String str[]  = {"Apple", "Banana", "Orange"};
		LinkedHashMap<String,Integer> map = new LinkedHashMap<String,Integer> ();
		for(String s :str)
		{
			int vowelcount = getvowelcount(s);
			map.put(s, vowelcount);
		}
		System.out.println(map);
		String wordwithmaxvowel = str[0];
		int maxvowelcount = map.get(wordwithmaxvowel);
		for(String word : map.keySet())
		{
			int vowelcount = map.get(word);
			if(vowelcount > maxvowelcount)
			{
				maxvowelcount = vowelcount;
				wordwithmaxvowel = word;
			}
		}
		System.out.println(maxvowelcount);
		System.out.println(wordwithmaxvowel);
	}
	
	
	
	public static int getvowelcount(String str) {
		//String str = "Hello";
		String vowel = "aeiou";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		str = str.toLowerCase();
		for(int i = 0; i < vowel.length(); i++)
		{
			char ch = vowel.charAt(i);
			if(str.contains(ch+ ""))
			{
				String regex = "[^"+ch+"]";
				String replacestring = str.replaceAll(regex, "");
				map.put(ch, replacestring.length());
			}
		}
		System.out.println(map);
		Collection<Integer> values = map.values();
		System.out.println(values);
		int vowelcount = 0;
		for(Integer in :values)
		{
			vowelcount = vowelcount + in;
		}
		System.out.println(vowelcount);
		return vowelcount;
	}

}
