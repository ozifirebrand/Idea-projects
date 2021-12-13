package algoExpertQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidateSubsequence {
    public static boolean validateSequence(List<Integer> array, List<Integer> subSequence){
        int arrayIndex=0;
        int sequenceIndex=0;
        boolean response = false;
        while (arrayIndex<array.size() && sequenceIndex< subSequence.size()){
            if ( array.get(arrayIndex).equals(subSequence.get(sequenceIndex) )){
                sequenceIndex++;
            }
            arrayIndex++;
        }
        if ( sequenceIndex == subSequence.size() ){
            response=true;
        }
        return response;
    }

    public static void main(String[] args) {
        List<Integer>  array = new ArrayList<>();
        array.add(5);
        array.add(3);
        array.add(2);
        array.add(6);
        array.add(7);
        array.add(0);
        List<Integer>sub =new ArrayList<>();
        sub.add(3);
        sub.add(2);
        sub.add(7);
        List<Integer> fakeSub= new ArrayList<>();
        fakeSub.add(7);
        fakeSub.add(3);
        fakeSub.add(6);
        System.out.println(validateSequence(array, sub));
        System.out.println(validateSequence(array, fakeSub));
    }
}
