package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HighestNumbers {
    public static void main(String[] args) {
        int [] inp = {8, 9, 2, 90, 5};
//        System.out.println(Arrays.toString(highest(inp)));
        System.out.println(isPalindrome("denmol"));
        System.out.println(spreadArray(inp));
    }
    public static boolean isPalindrome(String word){
        /*
        Iterate through each letter
        If at any point, the two letters are not equal, return false. If it returns true till the middle, then return through
         */
        int firstPointer=0;
        int secondPointer=word.length()-1;
        while (firstPointer < word.length()/2 && secondPointer > word.length()/2){
            if ( word.charAt(firstPointer)!= word.charAt(secondPointer) ){
                return false;
            }
            firstPointer++;
            secondPointer--;
        }
        return true;
    }

    //    public static int[] highest(int [] input){
//        /*
//        We have an array
//        In that array, there are numbers
//        I am expected to return the two highest numbers in the array
//        How will that work?
//        Get the element in the given array
//        check if it has a lower member in another 1x2 array
//        one each
//        if it is lower than any member of the 1x2 array, discard it
//        else, add it to the first index if it is lower and second index if it is higher
//        */
//        int[] array = new int[2];
//        int highestNumber = 0;
//        int lowestNumber = 0;
//        int currentValue= 0;
//        for (int i : input){
//            if ( currentValue > lowestNumber ){
//                array[0]=currentValue;
////                System.out.println("Current value is "+ currentValue);
//            }
//            if ( i > highestNumber ){
//                currentValue = array[1];
//                array[1]=i;
//                highestNumber= array[1];
//                System.out.println("Current value is "+ currentValue);
//                System.out.println(Arrays.toString(array));
//            }if ( i < highestNumber && i > lowestNumber ){
//                array[0] =i;
//                lowestNumber = array[0];
//                System.out.println(Arrays.toString(array));
//            }
//        }
//        return array;
//    }
    public static List<Integer> spreadArray(int [] intInput){
        /*
        Given the input array
        I want to take individual digit in the number and add to an array. How do I achieve that?
        One number
        Check if it is < 10
        if yes, add to the array list
        else,
            get its modulus of 10
            add the modulus to a smaller list
            turn the number to string
            remove its last digit
            check the length of the new string if it is greater than 1
        if yes convert to int
        recycle from line 69
        else, use line 68
         */
        List<Integer> integerList = new ArrayList<>();
        List<Integer> smallList = new ArrayList<>();
        int modulo = 10;
        for (int i : intInput){
            if ( i < 10 ){
                integerList.add(i);
            }
            else {
                smallList.add(i%modulo);
                String iNumber = "" + i;
                String newNumber = iNumber.substring(0, iNumber.length() - 2);
                if ( newNumber.length()>1 ){
                    int newNumberConversion = Integer.parseInt(newNumber);
                    smallList.add(i%modulo);
                }
                else integerList.add(Integer.parseInt(newNumber));
            }
        }

        return integerList;
    }
}
