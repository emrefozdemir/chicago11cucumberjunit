package collections;

import java.util.ArrayList;

public class CollectionDemo {
    public static void main(String[] args) {

        int [] num = {4,5,5,5,4,6,6,6,6,6,9,9,20,10};

        // Empty arraylist -
        ArrayList<Integer> a1 = new ArrayList<>();
        int counter = 0;
        for(int i = 0; i < num.length; i++){
            counter = 0;
            if(!a1.contains(num[i])){
                a1.add(num[i]);
                for(int j = i; j < num.length; j++){
                    if(num[i] == num[j]) {
                        counter++;
                    }
                }
                System.out.println(num[i] + ": "+ counter);
                if(counter == 1){
                    System.out.println(num[i] + " is unique number");
                }
            }
        }
    }
}
