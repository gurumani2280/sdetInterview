package Stringprograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class P3charactercount2 {
	public static void main(String[] args) {
		String str = "Hello";
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
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
		String output = "";
		Set <Character> keys = map.keySet(); //set will not have any index
		for(Character k : keys)
		{
			output = output+k+map.get(k);
		}
		System.out.println(output);
	}

}
