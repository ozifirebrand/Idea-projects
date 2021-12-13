package algoExpertQuestions;
import java.util.*;

public class TwoSumProgram {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        int [] twoSum = new int[2];
        int number;
        for (int j : array) {
            number = targetSum - j;
            for (int k : array) {
                if ( k == number ) {
                    if ( j != k ) {
                        twoSum[0] = k;
                        break;
                    }
                }
            }
            if ( twoSum[0] != 0 ) {
                twoSum[1] = j;
                return twoSum;
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int [] array = {4,2,7, 5, 3, 1};
        int number = 10;
        System.out.println(Arrays.toString(twoNumberSum(array, number)));
    }
}
