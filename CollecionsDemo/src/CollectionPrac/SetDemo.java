package CollectionPrac;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo {

	public static void main(String[] args) {
		//

	
		HashSet<Integer> hs = new HashSet<>();

		for (int i = 1; i < 10; i++) {

			hs.add(i);

		}

		System.out.println(hs);
	
			
		
		LinkedHashSet<String> lhs=new LinkedHashSet<>();
		lhs.add("lhs1");
		lhs.add("lhs2");
		lhs.add("lhs3");
		lhs.add("lhs1");
		
		System.out.println(lhs);
		}

		

	}


