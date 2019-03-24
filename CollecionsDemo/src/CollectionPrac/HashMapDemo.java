package CollectionPrac;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<String, Integer> m = new HashMap<>();

		m.put("One", 1);
		m.put("two", 2);
		m.put("three", 3);

		System.out.println(m); // {One=1, two=2, three=3}
		
		System.out.println(m.put("three", 4));  //Returns Older value
		
		System.out.println(m); // {One=1, two=2, three=4}
		
		
		System.out.println(m.get("u")); //Returns Null when searched non existing key
		
		
		
	Set<String> s=m.keySet();
	
	for(String x:s) {
		
		System.out.println(x);
		
			/*
			 * One two three
			 * 
			 */
	}
	
	Collection<Integer> l=m.values();
	
System.out.println(l);
//[1, 2, 4]
	
	
	}

}
