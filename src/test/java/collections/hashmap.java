package collections;

import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {

        Map<String, Integer> findInt = new HashMap<>();

        findInt.put("a",1);
        findInt.put("b",2);
        findInt.put("c",3);
        findInt.put("d",4);
        findInt.put("d",5);
        findInt.put("c",20);


        String [] arr = {"emre"};
        for(String str: arr){

        }

        for(Map.Entry<String,Integer> entry: findInt.entrySet()){
            if(entry.getKey().equals("c")){
                System.out.println(entry.getValue());
            }
        }

        System.out.println(findInt);

    }
}
