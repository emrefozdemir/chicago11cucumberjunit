package interviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class FindPairWithGivenSumInArray {
    public static void main(String[] args) {
        int nums[] = {20, 9, 49, 30};
        System.out.println(twoSum(nums, 40));
    }

    public static boolean isPair(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            int j = 0;
            j++;
            if (arr[i] + arr[j] == target && i != j) {
                return true;
            }
        }
        return false;
    }

    public static boolean twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            numMap.put(nums[i], i);
        }

        System.out.println(numMap);

        for(int i = 0; i < nums.length; i++){
            int numToFind = target - nums[i]; //10
            if(numMap.containsKey(numToFind) && numMap.get(numToFind) != i){
                return true;
            }
        }
        return false;
    }
}


