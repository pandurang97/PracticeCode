package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet1 {

    public static void main(String[] args) {

        Set<String> hashset = new HashSet<>();
        hashset.add("Obj1");
        hashset.add("Obj2");
        hashset.add("Obj1");

        System.out.println("1. HashSet is " + hashset);
        System.out.println("2. HashSet is " + hashset);

        Iterator<String> itr = hashset.iterator();
        while (itr.hasNext()) {
            System.out.println("Inside the looping " + itr.next());
        }
    }
}
