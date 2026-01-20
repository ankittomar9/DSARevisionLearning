package java_interviews.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q_1_Find_Even_Odd_numbers_List {
    public static void main(String args[]){

        List <Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> evenList=numbers.stream()
        .filter(n->n%2==0)
        .collect(Collectors.toList());

        System.out.println("Even Number from is List \n"+evenList);

        List<Integer> oddList=numbers.stream()
        .filter(n->n%2!=0)
        .collect(Collectors.toList());
        System.out.println("Odd Number from is List \n"+oddList);

    }
    
}
