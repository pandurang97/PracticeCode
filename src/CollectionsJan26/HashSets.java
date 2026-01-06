package CollectionsJan26;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSets {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(15);
		set.add(4);
		set.add(7);
		set.add(4);
		System.out.println(set);
		set.add(7);
		set.remove(1);
		
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
//Hashset: Unordered collection, no duplicate