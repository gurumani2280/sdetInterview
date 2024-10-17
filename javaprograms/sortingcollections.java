package javaprograms;
import java.util.ArrayList;
import java.util.Collections;

public class sortingcollections {
	public static void main(String[] args) {
		
	ArrayList<String> fruits = new ArrayList<>();
	fruits.add("Orange");
	fruits.add("Apple");
	fruits.add("Banana");
	Collections.sort(fruits);
	System.out.println(fruits);
	}
}
