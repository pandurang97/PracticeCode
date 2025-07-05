package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet1 {

	public static void main(String[] args) {

		Set<String> linkedhs = new LinkedHashSet<>();
		linkedhs.add("Obj1");
		linkedhs.add("Obj2");
		linkedhs.add("Obj1");
		
		System.out.println("1. Linked Hash Set is:"+linkedhs);
		System.out.println("2. Linked Hash Set is"+linkedhs);
		
		Iterator<String> it = linkedhs.iterator();
		while(it.hasNext())
		{
			System.out.println("Inside the iterator loop:"+it.next());
		}
	}

}
