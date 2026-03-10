package java_interviews.streamsCurrentDay;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q_2_Sort_List_Asc_Desc {
    public static void main(String args[]){
        List<Integer>list=Arrays.asList(1,6,3,4,8,9,5,6,2,0);
         System.out.println("Original List:\n"+list);
        List<Integer> ascList=list.stream()
        .sorted(Comparator.naturalOrder())
        .collect(Collectors.toList());
        System.out.println("ASC List:\n"+ascList);

        List<Integer>descList=list.stream()
        .sorted(Comparator.reverseOrder())
        .collect(Collectors.toList());
        System.out.println("Desc List:\n"+descList);
    }
    
}
