package java_interviews_revision.streams1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q_2_Sort_List_Ascending_Decending {
    public static void main(String args[]){
        List<Integer> list=Arrays.asList(3,1,5,7,4,50,9,12,15,1,10);

        List<Integer> ascList=list.stream()
        .sorted(Comparator.naturalOrder())
        .collect(Collectors.toList());

        System.out.println("Ascending Sorted List : \n" +ascList);

         List<Integer> descList=list.stream()
        .sorted(Comparator.reverseOrder())
        .collect(Collectors.toList());

        System.out.println("Descending Sorted List : \n" +descList);

    }
}
