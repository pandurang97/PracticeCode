package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {

		int x =9;
		
		List a = new ArrayList();
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		System.out.println(a);
		
		
		a.add(6);
		a.add("aaa");
		a.add(true);
		a.add(6);
		a.add(null);
		a.add(6.34f);
		System.out.println(a.size());
		System.out.println(a);
		
		a.remove(6.34f);
		System.out.println(a);
		
		a.add(1, 55);
		System.out.println(a);
		
		Iterator i = a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
