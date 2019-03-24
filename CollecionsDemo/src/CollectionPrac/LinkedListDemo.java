package CollectionPrac;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {
	
	
	
	public static void main(String[] args) {
		
		
		
		
		LinkedList<String> ll=new LinkedList<>();
		ll.add("aa");
		ll.add("bb");
		ll.add("cc");
		ll.add(1,"b");
		
		ll.addFirst("addFirst entry");
		ll.addLast("addLast entry");
		
		System.out.println(ll);
		
		//[addFirst entry, aa, b, bb, cc, addLast entry]		
		ll.removeFirst();
		ll.removeLast();
	System.out.println(ll);
	
	//[aa, b, bb, cc]
		
	
	
	}
	
	
	
	
	
	

	
}
