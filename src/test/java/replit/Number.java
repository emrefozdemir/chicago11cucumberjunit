package replit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Number {
//    * Given a m * n matrix of distinct numbers, return all lucky number in the matrix in any order.
//        * A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.
//            * Array needs to be sorted to be able to find the lucky number.
//            * Input: matrix = [[7,3,8],[9,13,11],[17,16,15]]
//             * Output: [15]
//            * Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column
//            * Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
//            *
//            * Output: [12]
//            * Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.
//            * Input: matrix = [[7,8],[1,2]]
//            * Output: [7]

    //            * All elements in the matrix are distinct.
    public static void main(String[] args) {
        int [][] matrix = {{15,10,4,21},{9,3,8,7},{15,16,17,12}};
        Number number = new Number();
        System.out.println(number.luckyNumbers(matrix));
    }

    public int luckyNumbers(int[][] matrix) {
        List<Integer> minNums = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++){
            int min = Integer.MAX_VALUE;
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                }
            }
            minNums.add(min);
        }
        Collections.sort(minNums);
        int luckyNum = minNums.get(minNums.size()-1);
        return luckyNum;
    }

}
