package interviewQuestions.mirzatProgrammer;

import java.util.Arrays;
import java.util.List;

public class MaxSum {
    public static int findMaxSum(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        // 5 10 15 15 1 10 9

        for(int i = 0; i<list.size(); i++) {
            secondMax = max;
            if (list.get(i) > max){
                max = list.get(i);
            }

        }

        return max  + secondMax;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,9,11,50,50,10);
        System.out.println(findMaxSum(list));
    }

}
