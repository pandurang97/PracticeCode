package Collections;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		System.out.println("al is"+al);
		al.add(0,"Obj0");
		System.out.println("al is"+al);
		al.add("Obj1");
		System.out.println("al is"+al);
		al.add(0,"Obj2");
		System.out.println("al is"+al);
		al.add(0,"Obj3");
		System.out.println("al is"+al);
		al.remove("Obj3");
		System.out.println("al is"+al);
		
		Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.println("Next object"+it.next());
		}
		
		
	}

}
