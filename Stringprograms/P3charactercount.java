package Stringprograms;

import java.util.HashMap;

public class P3charactercount {
	public static void main(String[] args) {
		String str = "Hello";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		//str = str.toLowerCase();
		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if(map.containsKey(ch))
			{
				int value = map.get(ch);
				map.put(ch, value+1);
			}else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	}

}
