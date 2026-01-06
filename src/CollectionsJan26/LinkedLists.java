package CollectionsJan26;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists {

	public static void main(String[] args) {

		List<Integer> ll = new LinkedList<>();
		ll.add(4);
		ll.add(5);
		ll.add(4);
		ll.add(0, 3);
		System.out.println(ll);
		ll.add(5);
	}

}
//Linked list: Double linked list, slow for retrival and fast for insertion and deletion