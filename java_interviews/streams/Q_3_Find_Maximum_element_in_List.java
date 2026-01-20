package java_interviews.streams;

import java.util.Arrays;
import java.util.List;

public class Q_3_Find_Maximum_element_in_List {
    public static void main(String args[]){
        List<Integer> numbers=Arrays.asList(1,44,58,99,60,70,1,3,6);

        int maxNumber=numbers.stream()
        .max(Integer::compare)
        .orElseThrow();

        System.out.println("maximum Number in the list is : "+maxNumber);

        int minNumber=numbers.stream()
        .min(Integer::compare)
        .orElseThrow();

        System.out.println("minimum Number in the list is : "+minNumber);
    }
    
}
