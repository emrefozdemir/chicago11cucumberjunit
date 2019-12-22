package interviewQuestions;

import java.util.ArrayList;
import java.util.List;


public class OccuranceOfArray {
    public static void main(String[] args) {

        int[] numbers = {10, 9, 0, 10, 19, 9, 20, 34};

        List empty = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            int count = 0;

            if(!empty.contains(numbers[i])){
                for (int j = 0; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        count++;
                    }
                }
                empty.add(numbers[i]);
                System.out.println(numbers[i] + ": " + count);
            }
        }

    }
}

