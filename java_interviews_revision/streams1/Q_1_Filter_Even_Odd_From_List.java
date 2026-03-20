package java_interviews_revision.streams1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q_1_Filter_Even_Odd_From_List {
    public static void main(String args[]){
        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> evenList=list.stream()
        .filter(n->n%2==0)
        .sorted(Comparator.reverseOrder())
        .collect(Collectors.toList());

        System.out.println("Even List \n "+evenList);

        List<Integer> oddList= list.stream()
        .filter(n->n%2!=0)
        .sorted(Comparator.reverseOrder())
        .collect(Collectors.toList());

         System.out.println("Odd List \n "+oddList);

    }   

}
