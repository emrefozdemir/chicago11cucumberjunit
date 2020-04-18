import io.cucumber.java.sl.In;

import java.util.HashMap;
import java.util.Map;

public class update {
    public static void main(String[] args) {
        Map<Integer, String> flowmap = new HashMap<>();
        flowmap.put(1,"abc");
        flowmap.put(2,"hello");
        System.out.println(flowmap);

        for(Map.Entry<Integer, String> entry: flowmap.entrySet()){
            System.out.println(entry.getValue());
            System.out.println(flowmap.size());
        }



    }
}
