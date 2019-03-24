package CollectionPrac;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arrayListDemo {

	public static void main(String[] args) {
	
		List<String> lar=new ArrayList<>();
		lar.add("Ass");
		lar.add("Boobs");
		lar.add("Cunt");
		lar.add("Dick");
		
		System.out.println(lar.size()); //4
		System.out.println(lar.get(3)); //Dick
		
		lar.set(3, "d replaced below"); //"d replaced below"
		
		//System.out.println(lar.set(3, "d replaced below"));
		System.out.println(lar.get(3)); //d replaced below  #Strangely returns true
		
		System.out.println(lar.remove("Ass"));
		System.out.println(lar.size()); //3
		
		
		System.out.println(lar.contains("Boobs"));
		
		
		
		Iterator<String> il=lar.iterator();
		
		while(il.hasNext()) {
			if(il.equals("Boobs")) {
			il.remove();
		
			}
			System.out.println(il.next());
		
		}
		

	}
	}
