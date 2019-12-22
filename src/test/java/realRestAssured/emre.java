package realRestAssured;

import org.apache.commons.math3.stat.descriptive.summary.Sum;

import java.util.*;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class emre {
    public static void main(String[] args) {
        Map<Integer, Integer> countMap = new HashMap<>();
        Integer key = 5;
        Integer value = key;
        countMap.put(key++, value);
        countMap.put(300,300);
        int count = 0;
        for (Integer i : countMap.keySet()      ) {
            for(Integer j: countMap.values()){
                count++;
                if(i == countMap.get(i)){
                    break;
                }else
                    continue;
            }
        }
        System.out.println("count" + count);
    }
}

