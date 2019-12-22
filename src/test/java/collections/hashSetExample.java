package collections;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetExample {
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();
        hs.add("USA");
        hs.add("Turkey");
        hs.add("India");
        hs.add("Spain");
        hs.add("Canada");

        System.out.println(hs);
        System.out.println(hs.remove("Turkey"));
        System.out.println(hs.isEmpty());
        System.out.println(hs.size());
        System.out.println(hs);

        // Iterator

        Iterator<String> it = hs.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
