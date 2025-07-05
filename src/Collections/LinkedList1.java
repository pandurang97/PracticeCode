package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedList1 {

	public static void main(String[] args) {

int x =9;
		
		List<Integer> a= new LinkedList();
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		System.out.println(a);
		
		
		a.add(6);
		a.add(8);
		a.add(7);
		a.add(6);
		a.add(0);
		a.add(6);
		System.out.println(a.size());
		System.out.println(a);
		
//		a.remove(6.34f);
//		System.out.println(a);
		
		a.add(1, 55);
		System.out.println(a);
		
		ListIterator<Integer> i = a.listIterator();
		while(i.hasNext())
		{
			System.out.println(i.next().toString());
		}
		
		while(i.hasPrevious())
		{
			System.out.println(i.previous().toString());
		}
		
	}

	

}
