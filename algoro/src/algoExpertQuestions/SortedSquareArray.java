package algoExpertQuestions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortedSquareArray {
    public static int[] sortAndSquare(int [] array){
        int [] squaredArray = new int[array.length];
        int indexOfSquaredArray = 0;
        for (int value: array){
            squaredArray[indexOfSquaredArray] = value * value;
            indexOfSquaredArray ++;
        }
        Arrays.sort(squaredArray);
        return squaredArray;
    }

    public static int[] sortAndSquare2(int [] anArray){
        int smallestValueIndex =0;
        int largestValueIndex = anArray.length-1;
        int [] sortedArray = new int[anArray.length];
        for (int index = anArray.length-1; index>=0; index--){
            int smallestValue = anArray[smallestValueIndex];
            int largestValue = anArray[largestValueIndex];
            //this is because we assume that the array 'anArray' is sorted

            if ( Math.abs(smallestValue)> Math.abs(largestValue)) {
                sortedArray[index] = smallestValue * smallestValue;
                smallestValueIndex++;
            }
            else {
                sortedArray[index] = largestValue* largestValue;
                largestValueIndex--;
            }
        }
        return sortedArray;
    }

    public static void main(String[] args) {
        int [] array = {-2, -1};

        System.out.println(Arrays.toString(sortAndSquare(array)));
        System.out.println(Arrays.toString(sortAndSquare2(array)));
    }
}
