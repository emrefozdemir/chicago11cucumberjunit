package collections;

import java.util.*;

public class hashMapExample {

    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap();
        hm.put(0, "hello");
        hm.put(2, "Good Bye");
        hm.put(12, "Morning");
        hm.put(3, "Evening");
        hm.put(3, "Evening");
        hm.put(10, null);


//        System.out.println(hm.get(2));
//        hm.remove(12);
//        System.out.println(hm.get(2));

        Set sn = hm.entrySet();
        Iterator it = sn.iterator();

        while(it.hasNext()){
            Map.Entry mp = (Map.Entry)it.next();
            System.out.println(mp.getKey());
            System.out.println(mp.getValue());
        }

        Hashtable<Integer, String> hmtable = new Hashtable<Integer, String>();



    }
}
